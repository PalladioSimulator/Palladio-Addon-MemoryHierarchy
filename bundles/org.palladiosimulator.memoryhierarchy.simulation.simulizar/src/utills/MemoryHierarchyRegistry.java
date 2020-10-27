package utills;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * Each SimuComModel has a own MemoryHiearchyRegistry. Creates and Stores the
 * MemoryHierarchyEnvironment for each resource container.
 * 
 * @author KTruong
 *
 */
public final class MemoryHierarchyRegistry {
    private final HashMap<String, MemoryHierarchyEnvironment> resourceContainerIdToMemEnvironment = new HashMap<>();
    private static Map<SimuComModel, MemoryHierarchyRegistry> memHierarchyRegistries = new HashMap<>();

    private final SimuComModel model;

    public static MemoryHierarchyRegistry getInstanceFor(final SimuComModel simuComModel) {
        memHierarchyRegistries.computeIfAbsent(simuComModel, (model) -> new MemoryHierarchyRegistry(simuComModel));
        return memHierarchyRegistries.get(simuComModel);
    }

    private MemoryHierarchyRegistry(SimuComModel model) {
        this.model = model;
    }

    /**
     * @param resourceContainerId
     *            the id of the resource container
     * @return MemoryHierarchyEnvironment of the passed resourceContainerId
     */
    public MemoryHierarchyEnvironment getMemHierarchyEnvironment(String resourceContainerId) {
        return this.resourceContainerIdToMemEnvironment.get(resourceContainerId);
    }

    /**
     * creates a new MemoryHierarchyEnvrionment, that can be retrieved later by the
     * resourceContainerId
     * 
     * @param resourceContainerId
     *            the id of the resource container
     * @param cacheStart
     *            the parsed cacheStartingPoint model element
     * @param memCacheList
     *            list of parsed MemoryCache elements
     * @param memLinkList
     *            list of parsed MemoryHierarchyLinkingResource elements
     */
    public void addMemHierarchyEnvironment(String resourceContainerId, CacheStartingPoint cacheStart,
            EList<MemoryCache> memCacheList, EList<MemoryHierarchyLinkingResource> memLinkList) {

        this.resourceContainerIdToMemEnvironment.put(resourceContainerId,
                new MemoryHierarchyEnvironment(this.model, cacheStart, memCacheList, memLinkList));
    }

}
