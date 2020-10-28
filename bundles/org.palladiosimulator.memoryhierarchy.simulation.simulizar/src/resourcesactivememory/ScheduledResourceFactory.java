package resourcesactivememory;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.resources.IScheduledResourceFactory;
import de.uka.ipd.sdq.simucomframework.resources.ScheduledResource;

/**
 * Uses the extension point proposed in https://jira.palladio-simulator.com/browse/SIMUCOM-97 to
 * customize simulation behaviour of ProcessingResourceTypes that do not only use
 * processingRate,schedulingPolicy, or numberOfReplicas but also additional attributes (which might be accessed/provided via sterotypes).
 * 
 * @author KTruong
 *
 */
public class ScheduledResourceFactory implements IScheduledResourceFactory {

    @Override
    public ScheduledResource createScheduledResource(ProcessingResourceSpecification activeResource, SimuComModel model,
            String resourceContainerID, String schedulingStrategyID) {
        return new MemoryActiveResource(activeResource, model, resourceContainerID, schedulingStrategyID);
    }

}
