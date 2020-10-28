package simulizar;

import java.util.ListIterator;

import org.apache.log4j.Logger;
import org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall;
import org.palladiosimulator.memoryhierarchy.util.MemoryHierarchySwitch;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.ResourceProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ResourceInterface;
import org.palladiosimulator.pcm.resourcetype.ResourceRepository;
import org.palladiosimulator.pcm.resourcetype.ResourceSignature;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcm.seff.seff_performance.ResourceCall;
import org.palladiosimulator.simulizar.exceptions.PCMModelAccessException;
import org.palladiosimulator.simulizar.interpreter.ExplicitDispatchComposedSwitch;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.runtimestate.SimulatedBasicComponentInstance;

import de.uka.ipd.sdq.simucomframework.ResourceRegistry;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter;
import de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe;
import resourcesactivememory.MemoryHierarchyConsumeResourceBehaviour;

/**
 * This class uses the rdseff switch extension point of SimuLizar. It interprets all calls that are
 * not defined in pcm::seff. In this case this calls interprets calls that are defined in the
 * memoryhierarchy meta-model.
 * 
 * It uses the consume behaviour defined in MemoryHierarchyConsumeResourceBehaviour intead of the
 * default behaviour.
 * 
 * Based on the resource call logic in the RDseffSwitch class in
 * org.palladiosimulator.simulizar.interpreter Therefore, many code duplicates.
 * 
 * 
 * @author KTruong
 *
 */
public class MemoryHierarchyCallSwitch extends MemoryHierarchySwitch<Object> {
    private static final Boolean SUCCESS = true;
    private static final Logger LOGGER = Logger.getLogger(MemoryHierarchyCallSwitch.class);
    private final InterpreterDefaultContext context;
    private final Allocation allocation;
    private final MemoryHierarchyConsumeResourceBehaviour consumeBehaviour;

    public MemoryHierarchyCallSwitch(final InterpreterDefaultContext context,
            final SimulatedBasicComponentInstance basicComponentInstance,
            ExplicitDispatchComposedSwitch<Object> parentSwitch) {
        super();
        this.context = context;
        this.allocation = context.getLocalPCMModelAtContextCreation()
            .getAllocation();

        this.consumeBehaviour = new MemoryHierarchyConsumeResourceBehaviour();
    }

    @Override
    public Object caseInternalActionWithMemoryResourceCall(
            final InternalActionWithMemoryResourceCall intenalActionWitMemoryCall) {
        interpretResourceCall(intenalActionWitMemoryCall);
        return SUCCESS;
    }

    private void interpretResourceCall(InternalActionWithMemoryResourceCall intenalActionWitMemoryCall) {
        if (intenalActionWitMemoryCall.getResourceCall__Action()
            .size() > 0) {
            final AllocationContext allocationContext = this.getAllocationContext(this.allocation);
            final ResourceContainer resourceContainer = allocationContext.getResourceContainer_AllocationContext();

            for (final ResourceCall resourceCall : intenalActionWitMemoryCall.getResourceCall__Action()) {

                // find the corresponding resource type which was invoked by the resource call
                final ResourceInterface resourceInterface = resourceCall.getSignature__ResourceCall()
                    .getResourceInterface__ResourceSignature();
                final ResourceRepository resourceRepository = resourceInterface
                    .getResourceRepository__ResourceInterface();
                ResourceType currentResourceType = null;

                for (final ResourceType resourceType : resourceRepository
                    .getAvailableResourceTypes_ResourceRepository()) {
                    for (final ResourceProvidedRole resourceProvidedRole : resourceType
                        .getResourceProvidedRoles__ResourceInterfaceProvidingEntity()) {
                        if (resourceProvidedRole.getProvidedResourceInterface__ResourceProvidedRole()
                            .getId()
                            .equals(resourceInterface.getId())) {
                            currentResourceType = resourceType;
                            break;
                        }
                    }
                }

                final ResourceSignature resourceSignature = resourceCall.getSignature__ResourceCall();
                final int resourceServiceId = resourceSignature.getResourceServiceId();

                final SimulatedStackframe<Object> currentStackFrame = this.context.getStack()
                    .currentStackFrame();
                Double evaluatedDemand = NumberConverter
                    .toDouble(StackContext.evaluateStatic(resourceCall.getNumberOfCalls__ResourceCall()
                        .getSpecification(), Double.class, currentStackFrame));
                final String idRequiredResourceType = currentResourceType.getId();

                final ResourceRegistry resourceRegistry = this.context.getModel()
                    .getResourceRegistry();

//              This is one of the changes in this class    
                this.consumeBehaviour.consumeResourceBySwitch(this.context, resourceContainer, currentResourceType,
                        resourceServiceId, evaluatedDemand, idRequiredResourceType);

////            Original
//                resourceRegistry.getResourceContainer(resourceContainer.getId())
//                    .loadActiveResource(this.context.getThread(), resourceServiceId, idRequiredResourceType,
//                            evaluatedDemand);
            }
        }
    }

    /**
     * Copied from org.palladiosimulator.simulizar.interpreter.RDSeffSwitch.java
     * 
     * Gets the allocation context for the current assembly context stack. The stack is investigated
     * in a FIFO-manner, i.e., first upper elements are checked. This is needed for the case of sub
     * systems.
     *
     * @param allocation
     *            The allocation to find a suitable allocation context in.
     * @return The allocation context.
     * @throws PCMModelAccessException
     *             if no allocation context could be found.
     */
    protected AllocationContext getAllocationContext(final Allocation allocation) {
        // For iterating top-down through a stack see:
        // http://stackoverflow.com/questions/16992758/is-there-a-bug-in-java-util-stacks-iterator
        for (final AllocationContext allocationContext : allocation.getAllocationContexts_Allocation()) {
            for (final ListIterator<AssemblyContext> iterator = this.context.getAssemblyContextStack()
                .listIterator(this.context.getAssemblyContextStack()
                    .size()); iterator.hasPrevious();) {
                if (allocationContext.getAssemblyContext_AllocationContext()
                    .getId()
                    .equals(iterator.previous()
                        .getId())) {
                    return allocationContext;
                }
            }
        }

        throw new PCMModelAccessException("No AllocationContext in Allocation " + allocation + " for AssemblyContext "
                + this.context.getAssemblyContextStack()
                    .peek()
                + " or its parents.");
    }

}
