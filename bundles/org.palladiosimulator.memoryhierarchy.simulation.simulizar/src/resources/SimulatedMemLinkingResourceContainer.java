package resources;

import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResourceContainer;
import utills.MemoryHierarchyLinkSchedulingStrategy;

/**
 * Extends SimulatedLinkingResourceContainer and allows adding linking resources with different
 * scheduling strategies.
 * 
 * 
 * @author KTruong
 *
 */
public class SimulatedMemLinkingResourceContainer extends SimulatedLinkingResourceContainer {

    public SimulatedMemLinkingResourceContainer(SimuComModel myModel, String id) {
        super(myModel, id);
    }

    /**
     * add the properties of the MemoryHierarchyLinkingResourceSpecification to the simulated
     * container
     * 
     * @param linkingResource
     *            the MemoryHierarchyLinkingResource
     * @param resourceContainerID
     *            the id of the container
     * @param isFCFSMultiQueue
     *            determines if FCFS or FCFSMultiQueue, which can hand X request concurrently, is
     *            used
     * @return
     */
    public SimulatedMemoryHierarchyLinkingResource addActiveResourceWithoutCalculators(
            MemoryHierarchyLinkingResource linkingResource, final String resourceContainerID,
            final boolean isFCFSMultiQueue) {

        String schedulingStratgy = isFCFSMultiQueue ? MemoryHierarchyLinkSchedulingStrategy.FCFS_MULTI_QUEUE
                : MemoryHierarchyLinkSchedulingStrategy.FCFS;

        final SimulatedMemoryHierarchyLinkingResource r = new SimulatedMemoryHierarchyLinkingResource(linkingResource,
                myModel, resourceContainerID, schedulingStratgy);

        activeResources
            .put(linkingResource.getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
                .getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
                .getId(), r);
        return r;
    }

}
