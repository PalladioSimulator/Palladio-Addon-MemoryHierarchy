package resources;

import java.io.Serializable;
import java.util.Map;

import org.apache.log4j.Logger;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;

import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.exceptions.FailureException;
import de.uka.ipd.sdq.simucomframework.exceptions.ThroughputZeroOrNegativeException;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.resources.AbstractScheduledResource;
import de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy;
import de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResource;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter;
import scheduler.SimFCFSMultiQueueResource;
import utills.MemoryHierarchyLinkSchedulingStrategy;

/**
 * Responsible to create the simulation container for a specific MemoryHierarchyLinkingResource
 * element.
 * 
 * We want to use super(...) in our constructor. Therefore, We can not inherit from
 * SimulatedLinkingResource because its constructor expects a LinkingResoure and we have a
 * MemoryHierarchyLinkingResource. Therefore, this sibling class with different constructor
 * parameters is required.
 *
 * Furthermore, SimulatedMemoryHierarchyLinkingResource have different scheduling strategies.
 * Therefore, the createActiveResource() and a additional constructor parameter are differences to
 * SimulatedLinkingResource.
 * 
 * constructor,createActiveResource(),getNextResourceId() are differnt to SimultedLinkingResource
 * @author KTruong
 *
 */
public class SimulatedMemoryHierarchyLinkingResource extends AbstractScheduledResource {
    private static final Logger LOGGER = Logger.getLogger(SimulatedLinkingResource.class.getName());

    private static long resourceId = 1;

    private final MemoryHierarchyLinkingResource linkingResource;
    private String throughput;
    private String latencySpec;

    // For resources that can fail (SimulatedLinkingResources):
    private final boolean canFail;
    private final double failureProbability;

    private boolean utilizationSet = false;

    public SimulatedMemoryHierarchyLinkingResource(MemoryHierarchyLinkingResource linkingResource,
            SimuComModel simuComModel, String resourceContainerID, String schedulingStrategy) {
        super(simuComModel,
                linkingResource.getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
                    .getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
                    .getEntityName(), // typeID
                resourceContainerID, // resourceContainerID
                linkingResource.getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
                    .getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
                    .getId(), // resourceTypeID
                linkingResource.getEntityName() + " ["
                        + linkingResource
                            .getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
                            .getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
                            .getEntityName()
                        + "] <" + linkingResource.getId() + ">", // description
                schedulingStrategy,
                linkingResource.getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
                    .getNumberOfReplicas(),
                false);
        // new attribute
        this.linkingResource = linkingResource;
        this.latencySpec = this.linkingResource
            .getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
            .getLatency_MemoryHierarchyLinkingResourceSpecification()
            .getSpecification();
        this.throughput = this.linkingResource
            .getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
            .getThroughput_MemoryHierarchyLinkingResourceSpecification()
            .getSpecification();

        this.failureProbability = 0;
        this.canFail = simuComModel.getConfiguration()
            .getSimulateFailures() && failureProbability > 0.0;
    }

    public String getId() {
        return this.linkingResource.getId();
    }

    @Override
    protected IActiveResource createActiveResource(final SimuComModel simuComModel) {
        // this.demandedTimeSensor = new SimpleTimeSpanSensor(simuComModel,
        // "Demanded time at " + description);

        IActiveResource aResource = null;
        if (getSchedulingStrategyID().equals(MemoryHierarchyLinkSchedulingStrategy.FCFS_MULTI_QUEUE)) {
            aResource = new SimFCFSMultiQueueResource(simuComModel, "FCFSMultiQueue", getNextResourceId(),
                    this.getNumberOfInstances());
        } else {
            aResource = getModel().getSchedulingFactory()
                .createSimFCFSResource(SchedulingStrategy.FCFS.toString(), getNextResourceId());
        }

        // utilisationSensor = new OverallUtilisationSensor(simuComModel,
        // "Utilisation of " + typeID + " " + description);
        return aResource;
    }

    @Override
    protected double calculateDemand(final double demand) {
        final double calculatedThroughput = NumberConverter.toDouble(StackContext.evaluateStatic(throughput));
        if (calculatedThroughput <= 0) {
            throw new ThroughputZeroOrNegativeException(
                    "Throughput at resource " + getName() + " was less or equal zero");
        }
        final double result = NumberConverter.toDouble(StackContext.evaluateStatic(latencySpec))
                + demand / calculatedThroughput;
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("A network load of " + result + " has been determined.");
        }
        return result;
    }

    /**
     * @param abstractDemand
     *            : may be zero, in that case only the latency is considered.
     */
    @Override
    public void consumeResource(final SimuComSimProcess process, final int resourceServiceID,
            final Map<String, Serializable> parameterMap, final double abstractDemand) {

        // If the resource can fail, simulate a failure with the given
        // probability.
        // This works for communication link resources (LAN), but only if the
        // "simulate linking resources" option is activated. Otherwise, the
        // commlink failure is triggered out of the OAW generated code.

        if (this.canFail) {
            if (Math.random() < this.failureProbability) {
                FailureException.raise(this.getModel(), this.getModel()
                    .getFailureStatistics()
                    .getInternalNetworkFailureType(this.linkingResource.getId(), getResourceTypeId()));
            }
        }

        // registerProcessWindows(process, aResource);
        // LOGGER.info("Demanding " + abstractDemand);

        final double concreteDemand = calculateDemand(abstractDemand);

        if (concreteDemand <= 0) {
            return;
        }

        fireDemand(concreteDemand);
        getUnderlyingResource().process(process, resourceServiceID, parameterMap, concreteDemand);
    }

    @Override
    public double getRemainingDemandForProcess(final SimuComSimProcess thread) {
        return getUnderlyingResource().getRemainingDemand(thread);
    }

    @Override
    public void updateDemand(final SimuComSimProcess thread, final double demand) {
        getUnderlyingResource().updateDemand(thread, demand);
    }

    @Override
    public IActiveResource getScheduledResource() {
        return getUnderlyingResource();
    }

    @Override
    public void activateResource() {
        getUnderlyingResource().start();
    }

    @Override
    public void deactivateResource() {
        if (!utilizationSet) {
            // this.utilisationSensor.setTotalResourceDemand(totalDemandedTime,
            // 1);
            utilizationSet = true;
        }
        getUnderlyingResource().stop();
    }

    public static String getNextResourceId() {
        return "MEMORY_HIERARCHY_NETWORK_" + Long.toString(resourceId++);
    }

    public MemoryHierarchyLinkingResource getLinkingResource() {
        return this.linkingResource;
    }

    /**
     * Change the linking resource throughput after its creation.
     * 
     * @param throughput
     *            the new throughput specification
     */
    public void setThroughput(String throughput) {
        this.throughput = throughput;
    }

    /**
     * Change the linking resource latency after its creation.
     * 
     * @param latency
     *            the new latency specification
     */
    public void setLatency(String latency) {
        this.latencySpec = latency;
    }

}
