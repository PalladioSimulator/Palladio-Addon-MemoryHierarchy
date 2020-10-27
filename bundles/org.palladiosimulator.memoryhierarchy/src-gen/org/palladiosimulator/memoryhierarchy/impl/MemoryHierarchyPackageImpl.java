/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall;
import org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyFactory;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.CorePackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;
import org.palladiosimulator.pcm.seff.SeffPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MemoryHierarchyPackageImpl extends EPackageImpl implements MemoryHierarchyPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass memoryHierarchyResourceEnvironmentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass memoryCacheEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass memoryHierarchyLinkingResourceSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass memoryHierarchyLinkingResourceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass memoryHierarchyContainerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass cacheStartingPointEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass linkableMemoryHierarchyResourcesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass internalActionWithMemoryResourceCallEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass memoryHierarchyCallActionEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MemoryHierarchyPackageImpl() {
        super(eNS_URI, MemoryHierarchyFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link MemoryHierarchyPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MemoryHierarchyPackage init() {
        if (isInited) {
            return (MemoryHierarchyPackage) EPackage.Registry.INSTANCE.getEPackage(MemoryHierarchyPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredMemoryHierarchyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final MemoryHierarchyPackageImpl theMemoryHierarchyPackage = registeredMemoryHierarchyPackage instanceof MemoryHierarchyPackageImpl
                ? (MemoryHierarchyPackageImpl) registeredMemoryHierarchyPackage
                : new MemoryHierarchyPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMemoryHierarchyPackage.createPackageContents();

        // Initialize created meta-data
        theMemoryHierarchyPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMemoryHierarchyPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MemoryHierarchyPackage.eNS_URI, theMemoryHierarchyPackage);
        return theMemoryHierarchyPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMemoryHierarchyResourceEnvironment() {
        return this.memoryHierarchyResourceEnvironmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyResourceEnvironment_MemoryCache_MemoryHierarchyResourceEnvironment() {
        return (EReference) this.memoryHierarchyResourceEnvironmentEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyResourceEnvironment_MemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment() {
        return (EReference) this.memoryHierarchyResourceEnvironmentEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyResourceEnvironment_CpuStartingPoint_MemoryHierarchyResourceEnvironment() {
        return (EReference) this.memoryHierarchyResourceEnvironmentEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMemoryCache() {
        return this.memoryCacheEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getMemoryCache_CacheHitRate() {
        return (EAttribute) this.memoryCacheEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getMemoryCache_IsPrivateCache() {
        return (EAttribute) this.memoryCacheEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMemoryHierarchyLinkingResourceSpecification() {
        return this.memoryHierarchyLinkingResourceSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyLinkingResourceSpecification_CommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification() {
        return (EReference) this.memoryHierarchyLinkingResourceSpecificationEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyLinkingResourceSpecification_Latency_MemoryHierarchyLinkingResourceSpecification() {
        return (EReference) this.memoryHierarchyLinkingResourceSpecificationEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyLinkingResourceSpecification_Throughput_MemoryHierarchyLinkingResourceSpecification() {
        return (EReference) this.memoryHierarchyLinkingResourceSpecificationEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getMemoryHierarchyLinkingResourceSpecification_NumberOfReplicas() {
        return (EAttribute) this.memoryHierarchyLinkingResourceSpecificationEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMemoryHierarchyLinkingResource() {
        return this.memoryHierarchyLinkingResourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyLinkingResource_MemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource() {
        return (EReference) this.memoryHierarchyLinkingResourceEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyLinkingResource_HierarchySuccessor_MemoryHierarchyLinkingResource() {
        return (EReference) this.memoryHierarchyLinkingResourceEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyLinkingResource_HierarchyPredecessor_MemoryHierarchyLinkingResource() {
        return (EReference) this.memoryHierarchyLinkingResourceEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMemoryHierarchyContainer() {
        return this.memoryHierarchyContainerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMemoryHierarchyContainer_MemoryHierarchyEnvironment_MemoryHierarchyContainer() {
        return (EReference) this.memoryHierarchyContainerEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getCacheStartingPoint() {
        return this.cacheStartingPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getLinkableMemoryHierarchyResources() {
        return this.linkableMemoryHierarchyResourcesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getInternalActionWithMemoryResourceCall() {
        return this.internalActionWithMemoryResourceCallEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMemoryHierarchyCallAction() {
        return this.memoryHierarchyCallActionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyFactory getMemoryHierarchyFactory() {
        return (MemoryHierarchyFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.memoryHierarchyResourceEnvironmentEClass = this.createEClass(MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);
        this.createEReference(this.memoryHierarchyResourceEnvironmentEClass,
                MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);
        this.createEReference(this.memoryHierarchyResourceEnvironmentEClass,
                MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);
        this.createEReference(this.memoryHierarchyResourceEnvironmentEClass,
                MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);

        this.memoryCacheEClass = this.createEClass(MEMORY_CACHE);
        this.createEAttribute(this.memoryCacheEClass, MEMORY_CACHE__CACHE_HIT_RATE);
        this.createEAttribute(this.memoryCacheEClass, MEMORY_CACHE__IS_PRIVATE_CACHE);

        this.memoryHierarchyLinkingResourceSpecificationEClass = this
            .createEClass(MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION);
        this.createEReference(this.memoryHierarchyLinkingResourceSpecificationEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION);
        this.createEReference(this.memoryHierarchyLinkingResourceSpecificationEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION);
        this.createEReference(this.memoryHierarchyLinkingResourceSpecificationEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION);
        this.createEAttribute(this.memoryHierarchyLinkingResourceSpecificationEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS);

        this.memoryHierarchyLinkingResourceEClass = this.createEClass(MEMORY_HIERARCHY_LINKING_RESOURCE);
        this.createEReference(this.memoryHierarchyLinkingResourceEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE);
        this.createEReference(this.memoryHierarchyLinkingResourceEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE);
        this.createEReference(this.memoryHierarchyLinkingResourceEClass,
                MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE);

        this.memoryHierarchyContainerEClass = this.createEClass(MEMORY_HIERARCHY_CONTAINER);
        this.createEReference(this.memoryHierarchyContainerEClass,
                MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER);

        this.cacheStartingPointEClass = this.createEClass(CACHE_STARTING_POINT);

        this.linkableMemoryHierarchyResourcesEClass = this.createEClass(LINKABLE_MEMORY_HIERARCHY_RESOURCES);

        this.internalActionWithMemoryResourceCallEClass = this.createEClass(INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL);

        this.memoryHierarchyCallActionEClass = this.createEClass(MEMORY_HIERARCHY_CALL_ACTION);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
            .getEPackage(EntityPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
            .getEPackage(IdentifierPackage.eNS_URI);
        final ResourcetypePackage theResourcetypePackage = (ResourcetypePackage) EPackage.Registry.INSTANCE
            .getEPackage(ResourcetypePackage.eNS_URI);
        final CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        final SeffPackage theSeffPackage = (SeffPackage) EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.memoryHierarchyResourceEnvironmentEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.memoryCacheEClass.getESuperTypes()
            .add(this.getLinkableMemoryHierarchyResources());
        this.memoryHierarchyLinkingResourceSpecificationEClass.getESuperTypes()
            .add(theIdentifierPackage.getIdentifier());
        this.memoryHierarchyLinkingResourceEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.cacheStartingPointEClass.getESuperTypes()
            .add(this.getLinkableMemoryHierarchyResources());
        this.linkableMemoryHierarchyResourcesEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.internalActionWithMemoryResourceCallEClass.getESuperTypes()
            .add(theSeffPackage.getInternalAction());
        this.memoryHierarchyCallActionEClass.getESuperTypes()
            .add(theSeffPackage.getAbstractInternalControlFlowAction());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.memoryHierarchyResourceEnvironmentEClass, MemoryHierarchyResourceEnvironment.class,
                "MemoryHierarchyResourceEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMemoryHierarchyResourceEnvironment_MemoryCache_MemoryHierarchyResourceEnvironment(),
                this.getMemoryCache(), null, "memoryCache_MemoryHierarchyResourceEnvironment", null, 0, -1,
                MemoryHierarchyResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this
            .getMemoryHierarchyResourceEnvironment_MemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment(),
                this.getMemoryHierarchyLinkingResource(), null,
                "memoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment", null, 0, -1,
                MemoryHierarchyResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(
                this.getMemoryHierarchyResourceEnvironment_CpuStartingPoint_MemoryHierarchyResourceEnvironment(),
                this.getCacheStartingPoint(), null, "cpuStartingPoint_MemoryHierarchyResourceEnvironment", null, 1, 1,
                MemoryHierarchyResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.memoryCacheEClass, MemoryCache.class, "MemoryCache", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getMemoryCache_CacheHitRate(), theEcorePackage.getEDouble(), "cacheHitRate", "0.0", 1,
                1, MemoryCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMemoryCache_IsPrivateCache(), theEcorePackage.getEBoolean(), "isPrivateCache", null,
                1, 1, MemoryCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.memoryHierarchyLinkingResourceSpecificationEClass,
                MemoryHierarchyLinkingResourceSpecification.class, "MemoryHierarchyLinkingResourceSpecification",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this
            .getMemoryHierarchyLinkingResourceSpecification_CommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(),
                theResourcetypePackage.getCommunicationLinkResourceType(), null,
                "communicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification", null, 1, 1,
                MemoryHierarchyLinkingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this
            .getMemoryHierarchyLinkingResourceSpecification_Latency_MemoryHierarchyLinkingResourceSpecification(),
                theCorePackage.getPCMRandomVariable(), null, "latency_MemoryHierarchyLinkingResourceSpecification",
                null, 1, 1, MemoryHierarchyLinkingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this
            .getMemoryHierarchyLinkingResourceSpecification_Throughput_MemoryHierarchyLinkingResourceSpecification(),
                theCorePackage.getPCMRandomVariable(), null, "throughput_MemoryHierarchyLinkingResourceSpecification",
                null, 1, 1, MemoryHierarchyLinkingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getMemoryHierarchyLinkingResourceSpecification_NumberOfReplicas(),
                theEcorePackage.getEInt(), "numberOfReplicas", "1", 1, 1,
                MemoryHierarchyLinkingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.memoryHierarchyLinkingResourceEClass, MemoryHierarchyLinkingResource.class,
                "MemoryHierarchyLinkingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this
            .getMemoryHierarchyLinkingResource_MemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(),
                this.getMemoryHierarchyLinkingResourceSpecification(), null,
                "memoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource", null, 1, 1,
                MemoryHierarchyLinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getMemoryHierarchyLinkingResource_HierarchySuccessor_MemoryHierarchyLinkingResource(),
                this.getLinkableMemoryHierarchyResources(), null, "hierarchySuccessor_MemoryHierarchyLinkingResource",
                null, 1, 1, MemoryHierarchyLinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(
                this.getMemoryHierarchyLinkingResource_HierarchyPredecessor_MemoryHierarchyLinkingResource(),
                this.getLinkableMemoryHierarchyResources(), null, "hierarchyPredecessor_MemoryHierarchyLinkingResource",
                null, 1, 1, MemoryHierarchyLinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.memoryHierarchyContainerEClass, MemoryHierarchyContainer.class, "MemoryHierarchyContainer",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMemoryHierarchyContainer_MemoryHierarchyEnvironment_MemoryHierarchyContainer(),
                this.getMemoryHierarchyResourceEnvironment(), null,
                "memoryHierarchyEnvironment_MemoryHierarchyContainer", null, 0, -1, MemoryHierarchyContainer.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.cacheStartingPointEClass, CacheStartingPoint.class, "CacheStartingPoint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.linkableMemoryHierarchyResourcesEClass, LinkableMemoryHierarchyResources.class,
                "LinkableMemoryHierarchyResources", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.internalActionWithMemoryResourceCallEClass, InternalActionWithMemoryResourceCall.class,
                "InternalActionWithMemoryResourceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.memoryHierarchyCallActionEClass, MemoryHierarchyCallAction.class,
                "MemoryHierarchyCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // MemoryHierarchyPackageImpl
