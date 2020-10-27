package simulizar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.simulizar.modelobserver.AbstractResourceEnvironmentObserver;
import org.palladiosimulator.simulizar.modelobserver.IModelObserver;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

import utills.MemoryHierarchyRegistry;

/**
 * Responsible for: Creating MemoryHierarchyEnvironment with all necessary simulation objects of the
 * memory hierarchy structure.
 * 
 * 1.1 looking for applied stereotypes of type "MemoryHierarchyStereotype" -
 * 
 * 1.2.storing referenced MemoryHierarchy structure into the MemoryHierarchyRegistry.class
 * 
 * 1.2.1 the MemoryHierarchy structure is stored as a MemoryHierarchyEnvironment object that can be
 * retrieved form the memory hierarchy registry with the current simuComModel.
 * 
 * 
 * @author KTruong
 */

public class MemoryHierarchyObserver extends AbstractResourceEnvironmentObserver implements IModelObserver {

    public static final String MEMORY_STEREOTYPE_NAME = "ResourceContainerWithMemoryHierarchy";

    public MemoryHierarchyObserver() {
    }

    /**
     * the initialize() method is called during the setup phase of the pcmStartInterpreatation Job
     */
    @Override
    public void initialize(AbstractSimuLizarRuntimeState runtimeState) {
        // super.initialize(runtimeState) so that this.model is set
        // this.model is the model of the resourceEnvrionment
        super.initialize(runtimeState);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Initialization done");
        }

        this.model.getResourceContainer_ResourceEnvironment()
            .forEach(this::checkResourceContainerWithMemoryHierarchyStereotype);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Memroy Hierarchy Initialization done");
        }
    }

    /**
     * searches for resource container with "ResourceContainerWithMemoryHierarchy" stereotype, then
     * extracts its structure and creates the associated Java simulation classes
     * 
     * @param resourceContainer
     */
    private void checkResourceContainerWithMemoryHierarchyStereotype(ResourceContainer resourceContainer) {

        if (!StereotypeAPI.isStereotypeApplied(resourceContainer, MEMORY_STEREOTYPE_NAME)) {
            return;
        }

        EList<StereotypeApplication> list = StereotypeAPI.getStereotypeApplications(resourceContainer,
                MEMORY_STEREOTYPE_NAME);
        for (StereotypeApplication appliedStereotype : list) {
            // Search for the reference that references a MemoryHierarchyResourceEnvironmen element
            for (EReference reference : appliedStereotype.getStereotype()
                .getEReferences()) {

                if (reference.getEType() != MemoryHierarchyPackage.eINSTANCE.getMemoryHierarchyResourceEnvironment()) {
                    continue;
                }

                if (appliedStereotype.eGet(reference) == null) {
                    continue;
                }

                MemoryHierarchyResourceEnvironment memHierarchyEnvModel = ((MemoryHierarchyResourceEnvironment) appliedStereotype
                    .eGet(reference));

                // Get all Links, Caches, and CacheStartingPoint from the referenced
                // MemoryHierarchyResourceEnvironmen element
                EList<MemoryHierarchyLinkingResource> memLinkList = memHierarchyEnvModel
                    .getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment();
                EList<MemoryCache> memCacheList = memHierarchyEnvModel
                    .getMemoryCache_MemoryHierarchyResourceEnvironment();
                CacheStartingPoint coreStart = memHierarchyEnvModel
                    .getCpuStartingPoint_MemoryHierarchyResourceEnvironment();

                // Get MemoryHierarchyResgistry and let it create Java objects of Links, Caches, and
                // CacheStartingPoint
                MemoryHierarchyRegistry memoryHierarchyRegistry = MemoryHierarchyRegistry
                    .getInstanceFor(this.runtimeModel.getModel());
                memoryHierarchyRegistry.addMemHierarchyEnvironment(resourceContainer.getId(), coreStart, memCacheList,
                        memLinkList);

            }
        }
    }

}
