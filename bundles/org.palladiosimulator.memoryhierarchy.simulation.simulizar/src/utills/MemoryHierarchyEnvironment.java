package utills;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import resources.SimulatedMemLinkingResourceContainer;

/**
 * Contains all Java objects that describe a specific memory hierarchy structure, which are
 * necessary during the simulation, e.g., the SimulatedMemLinkingResourceContainer, which represents
 * MemoryHierarchyLinks
 * 
 * During setup, it creates a new MemoryHierarchyEnvironment has two steps:
 * 
 * 1. initialize/create all SimulatedMemLinkingResourceContainer for each MemoryHierarchyLinking.
 * 
 * 2. create successor map, which is used during simulation to look up the next
 * SimulatedMemLinkingResourceContainer (in our case the wrapper class
 * SimulatedMemLinkingResourceContainerWrapper, which has some additional information, e.g.
 * miss-rate of previous cache level)
 * 
 * 
 * During simulation, it provides:
 * 
 * getStartMemlinkContainer to retrieve first link
 * 
 * getSuccessor to retrieve the following link
 * 
 * https://github.com/PalladioSimulator/Palladio-Analyzer-SimuCom/pull/12/commits
 * 
 * @author KTruong
 *
 */
public class MemoryHierarchyEnvironment {

    private final SimulatedMemLinkingResourceContainerWrapper startingMemLinkContainer;
    private final Map<SimulatedMemLinkingResourceContainer, SimulatedMemLinkingResourceContainerWrapper> successorMemLinkContainer;
    // helper list for the 2.Step in which the successor map for each
    // SimulatedMemLinkingResourceContainer is created.
    private final Map<MemoryHierarchyLinkingResource, SimulatedMemLinkingResourceContainer> linkToContainer;
    private final String HIT_RATE_TO_FIRST_LINK = "1.0";
    

    public MemoryHierarchyEnvironment(final SimuComModel simuComModel, final CacheStartingPoint cacheStart,
            EList<MemoryCache> memCacheList, EList<MemoryHierarchyLinkingResource> memLinkList) {

//        model element -> container
        this.linkToContainer = new HashMap<MemoryHierarchyLinkingResource, SimulatedMemLinkingResourceContainer>();
//        container -> successor wrapper
        this.successorMemLinkContainer = new HashMap<SimulatedMemLinkingResourceContainer, SimulatedMemLinkingResourceContainerWrapper>();

        // step 1 initialize/create
        startingMemLinkContainer = initializeSimMemLinkResourceContainers(simuComModel, cacheStart, memCacheList,
                memLinkList);
        // step 2 create successor
        createSuccessorMemLinkMap(cacheStart, memCacheList, memLinkList);
    }

    /**
     * 
     * initializes all SimMemLinkContainer into the linkToContainer list
     * 
     * @param simuComModel
     * @param cacheStart
     * @param memCacheList
     * @param memLinkList
     * @return
     */
    private SimulatedMemLinkingResourceContainerWrapper initializeSimMemLinkResourceContainers(
            SimuComModel simuComModel, CacheStartingPoint cacheStart, EList<MemoryCache> memCacheList,
            EList<MemoryHierarchyLinkingResource> memLinkList) {
        SimulatedMemLinkingResourceContainerWrapper startSimLinkContainer = null;
        for (MemoryHierarchyLinkingResource memLink : memLinkList) {
            SimulatedMemLinkingResourceContainer simMemLinkRC = new SimulatedMemLinkingResourceContainer(simuComModel,
                    memLink.getId());

            // determines if link have FCFS or FCFSMultiQueue, e.g., FCFSMultiQueue are links that
            // can process N Forkbehaviour requests to a link concurrently
            MemoryCache memCache = (MemoryCache) memLink.getHierarchySuccessor_MemoryHierarchyLinkingResource();
            if (memCache.isIsPrivateCache()) {
                simMemLinkRC.addActiveResourceWithoutCalculators(memLink, memLink.getId(), true);
            } else {
                simMemLinkRC.addActiveResourceWithoutCalculators(memLink, memLink.getId(), false);
            }

            if (memLink.getHierarchyPredecessor_MemoryHierarchyLinkingResource()
                .equals(cacheStart)) {

                startSimLinkContainer = new SimulatedMemLinkingResourceContainerWrapper(simMemLinkRC,
                        Double.parseDouble(HIT_RATE_TO_FIRST_LINK));
            }
            this.linkToContainer.put(memLink, simMemLinkRC);
        }

        return startSimLinkContainer;
    }

    /**
     * Construct the successor map, which can be used during the simulation, to access the successor
     * SimulatedMemLinkingResourceContainer
     * 
     * @param cacheStart 
     * @param memCacheList
     * @param memLinkList
     * @return
     */
    private Map<SimulatedMemLinkingResourceContainer, List<SimulatedMemLinkingResourceContainer>> createSuccessorMemLinkMap(
            CacheStartingPoint cacheStart, EList<MemoryCache> memCacheList,
            EList<MemoryHierarchyLinkingResource> memLinkList) {

        for (MemoryHierarchyLinkingResource memLink : memLinkList) {
            SimulatedMemLinkingResourceContainer ogContainer = this.linkToContainer
                .get(memLink);
            MemoryCache memCache = (MemoryCache) memLink.getHierarchySuccessor_MemoryHierarchyLinkingResource();

            // Search for MemLink which are successor of memory cache
            for (MemoryHierarchyLinkingResource memLinkSuccessor : memLinkList) {
                if (memLinkSuccessor.getHierarchyPredecessor_MemoryHierarchyLinkingResource()
                    .equals(memCache)) {
                    SimulatedMemLinkingResourceContainer simMemLinkResourceContainer = this.linkToContainer
                        .get(memLinkSuccessor);

                    this.successorMemLinkContainer.put(ogContainer, new SimulatedMemLinkingResourceContainerWrapper(
                            simMemLinkResourceContainer, memCache.getCacheHitRate()));
                }
            }
        }
        return null;
    }

    public SimulatedMemLinkingResourceContainerWrapper getStartMemLinkContainer() {
        return this.startingMemLinkContainer;
    }

    public SimulatedMemLinkingResourceContainerWrapper getSuccessor(
            SimulatedMemLinkingResourceContainer simulatedMemLinkingResourceContainer) {
        return this.successorMemLinkContainer.get(simulatedMemLinkingResourceContainer);

    }

}
