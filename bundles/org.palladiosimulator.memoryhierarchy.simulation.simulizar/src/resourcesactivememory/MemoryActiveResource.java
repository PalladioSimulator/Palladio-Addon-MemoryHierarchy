package resourcesactivememory;

import java.io.Serializable;
import java.util.Map;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.resources.ScheduledResource;

/**
 * Uses the extension point proposed in https://jira.palladio-simulator.com/browse/SIMUCOM-97 to
 * customize simulation behaviour of ProcessingResourceType that do not only use
 * processingRate,schedulingPolicy, or numberOfReplicas but also additional attributes (which might
 * be accessed/provided via stereotypes).
 * 
 * The memory hierarchy ProcessingResourceType does not rely on processingRate,schedulingPolicy, or
 * numberOfReplicas.
 * 
 * It delegates its consumption logic to the MemoryHierarchyConsumeResourceBehaviour, which
 * simulates the passed initial demand through different memory hierarchy links.
 * 
 * @author KTruong
 *
 */
class MemoryActiveResource extends ScheduledResource {
    private final String resourceContainerID;
    private final SimuComModel simuComModel;
    private final MemoryHierarchyConsumeResourceBehaviour consumeBehaviour;

    private final String RESOURCE_TYPE_ID_MEMORY_LINK_COMMUNICATION_RESOURCE = "_kEMDU403EeqdKsmjMd-Eeg";

    public MemoryActiveResource(ProcessingResourceSpecification activeResource, SimuComModel myModel,
            String resourceContainerID, String schedulingStrategyID) {
        super(activeResource, myModel, resourceContainerID, schedulingStrategyID);
        this.resourceContainerID = resourceContainerID;
        this.simuComModel = myModel;
        this.consumeBehaviour = new MemoryHierarchyConsumeResourceBehaviour();
    }

    @Override
    public void consumeResource(SimuComSimProcess process, int resourceServiceID,
            Map<String, Serializable> parameterMap, double abstractDemand) {
        ProcessingResourceType resourceType = this.getActiveResource()
            .getActiveResourceType_ActiveResourceSpecification();
        this.consumeBehaviour.consumeResource(process, this.simuComModel, resourceContainerID, resourceType,
                resourceServiceID, abstractDemand, RESOURCE_TYPE_ID_MEMORY_LINK_COMMUNICATION_RESOURCE);

////    below is the original call
//		super.consumeResource(process, resourceServiceID, parameterMap, abstractDemand);
    }

}
