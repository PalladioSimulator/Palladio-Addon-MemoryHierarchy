package resourcesactivememory;

import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import utills.MemoryHierarchyEnvironment;
import utills.MemoryHierarchyRegistry;
import utills.SimulatedMemLinkingResourceContainerWrapper;

/**
 * Responsible to describe logic of memory hierarchy call, e.g., find all
 * SimulatedMemLinkingResourceContainerWrapper and update + simulate each demand through them.
 * 
 * Currently, two versions for simuliza rdseff extension point or SimuCom scheduledResource extension point
 * 
 * @author KTruong
 *
 */
public class MemoryHierarchyConsumeResourceBehaviour {
    private static final Logger LOGGER = Logger.getLogger(MemoryHierarchyConsumeResourceBehaviour.class);

    /**
     * consume behaviour of memory hierarchy, if rdseff extension point with extra
     * MemoryHierarchyCallSwitch is used.
     * 
     * @param resourceContainer
     *            the allocated resource container
     * @param currentResourceType
     *            the memory hierarchy CommunicationProcessingResource defined in
     *            org.palladiosimulators.memoryhierarchy
     * @param resourceServiceId
     *            id of resource type to decide between read, or write, currently not used !!!
     * @param evaluatedDemand
     *            the demand
     * @param idRequiredResourceType
     *            name of resourceType
     */
    public void consumeResourceBySwitch(InterpreterDefaultContext context, final ResourceContainer resourceContainer,
            final ResourceType currentResourceType, final int resourceServiceId, Double evaluatedDemand,
            final String idRequiredResourceType) {

        MemoryHierarchyRegistry memHierarchyRegistry = MemoryHierarchyRegistry.getInstanceFor(context.getModel());
        MemoryHierarchyEnvironment memEnv = memHierarchyRegistry.getMemHierarchyEnvironment(resourceContainer.getId());

        if (memEnv == null) {
            LOGGER.warn("No MemoryHierachyEnvironment found for " + resourceContainer.getEntityName() + ","
                    + resourceContainer.getId()
                    + ". Check if memory hierarchy are applied for the specified resource container.");
            return;
        }

        Double demand = evaluatedDemand;
        logDemandOnDebug(demand);

        // Get first memory hierarchy link and simulate
        SimulatedMemLinkingResourceContainerWrapper startSimContAndHit = memEnv.getStartMemLinkContainer();
        logDemandOnDebug(demand);
        startSimContAndHit.getSimMemLinkingResourceContainer()
            .loadActiveResource(context.getThread(), resourceServiceId, idRequiredResourceType, demand);

        SimulatedMemLinkingResourceContainerWrapper sim = startSimContAndHit;

        while (true) {
            if (memEnv.getSuccessor(sim.getSimMemLinkingResourceContainer()) != null
                    && memEnv.getSuccessor(sim.getSimMemLinkingResourceContainer()) != null) {
                sim = memEnv.getSuccessor(sim.getSimMemLinkingResourceContainer());
                demand = demand * sim.getLocalMissRate();
                logDemandOnDebug(demand);

                sim.getSimMemLinkingResourceContainer()
                    .loadActiveResource(context.getThread(), resourceServiceId, idRequiredResourceType, demand);
            } else {
                return;
            }
        }
    }

    /**
     * consume behaviour of memory hierarchy, if ScheduledResource extension point is used.
     * (https://jira.palladio-simulator.com/browse/SIMUCOM-97)
     * 
     * @param process
     *            the forkedBehaviour thread
     * @param model
     *            the SimuComModel
     * @param resourceContainerId
     *            resourcerContainer id
     * @param currentResourceType
     *            the ProcessecingResourceType is not used !!!!! we use the memory hierarchy
     *            CommunicationLinkResources specified via idRequiredResourceType, which is
     *            currently "_kEMDU403EeqdKsmjMd-Eeg"
     * @param resourceServiceId
     *            id of resource type to decide between read, or write, currently not used !!!
     * @param evaluatedDemand
     *            the demand
     * @param idRequiredResourceType
     *            the he memory hierarchy CommunicationLinkResources specified via
     *            idRequiredResourceType, which is currently "_kEMDU403EeqdKsmjMd-Eeg"
     */
    public void consumeResource(SimuComSimProcess process, SimuComModel model, final String resourceContainerId,
            final ResourceType currentResourceType, final int resourceServiceId, Double evaluatedDemand,
            final String idRequiredResourceType) {

        MemoryHierarchyRegistry memHierarchyRegistry = MemoryHierarchyRegistry.getInstanceFor(model);
        MemoryHierarchyEnvironment memEnv = memHierarchyRegistry.getMemHierarchyEnvironment(resourceContainerId);

        if (memEnv == null) {
            LOGGER.warn("No MemoryHierachyEnvironment found for " + "," + resourceContainerId
                    + ". Check if memory hierarchy stereotype is applied for the specified resource container.");
            return;
        }

        Double demand = evaluatedDemand;
        logDemandOnDebug(demand);

        // Get first memory hierarchy link and simulate
        SimulatedMemLinkingResourceContainerWrapper startSimContAndHit = memEnv.getStartMemLinkContainer();
        logDemandOnDebug(demand);
        startSimContAndHit.getSimMemLinkingResourceContainer()
            .loadActiveResource(process, resourceServiceId, idRequiredResourceType, demand);

        SimulatedMemLinkingResourceContainerWrapper sim = startSimContAndHit;

        // Get successor memory link and simulate
        while (true) {
            if (memEnv.getSuccessor(sim.getSimMemLinkingResourceContainer()) != null
                    && memEnv.getSuccessor(sim.getSimMemLinkingResourceContainer()) != null) {
                sim = memEnv.getSuccessor(sim.getSimMemLinkingResourceContainer());
                demand = demand * sim.getLocalMissRate();
                logDemandOnDebug(demand);

                sim.getSimMemLinkingResourceContainer()
                    .loadActiveResource(process, resourceServiceId, idRequiredResourceType, demand);
            } else {
                return;
            }
        }
    }

    private void logDemandOnDebug(Double demandHack) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("calculated total demand: " + demandHack);
        }
    }
}
