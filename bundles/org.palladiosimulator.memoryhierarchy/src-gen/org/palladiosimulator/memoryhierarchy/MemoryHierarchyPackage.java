/**
 */
package org.palladiosimulator.memoryhierarchy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.seff.SeffPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyFactory
 * @model kind="package"
 * @generated
 */
public interface MemoryHierarchyPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "memoryhierarchy";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/MemoryHierarchy/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "org.palladiosimulator.memoryhierarchy";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MemoryHierarchyPackage eINSTANCE = org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl
     * <em>Resource Environment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyResourceEnvironment()
     * @generated
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Memory Cache Memory Hierarchy Resource Environment</b></em>'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = EntityPackage.ENTITY_FEATURE_COUNT
            + 0;

    /**
     * The feature id for the '<em><b>Memory Hierarchy Linking Resource Memory Hierarchy Resource
     * Environment</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = EntityPackage.ENTITY_FEATURE_COUNT
            + 1;

    /**
     * The feature id for the '<em><b>Cpu Starting Point Memory Hierarchy Resource
     * Environment</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = EntityPackage.ENTITY_FEATURE_COUNT
            + 2;

    /**
     * The number of structural features of the '<em>Resource Environment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.LinkableMemoryHierarchyResourcesImpl
     * <em>Linkable Memory Hierarchy Resources</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.LinkableMemoryHierarchyResourcesImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getLinkableMemoryHierarchyResources()
     * @generated
     */
    int LINKABLE_MEMORY_HIERARCHY_RESOURCES = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKABLE_MEMORY_HIERARCHY_RESOURCES__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKABLE_MEMORY_HIERARCHY_RESOURCES__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The number of structural features of the '<em>Linkable Memory Hierarchy Resources</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKABLE_MEMORY_HIERARCHY_RESOURCES_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryCacheImpl
     * <em>Memory Cache</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryCacheImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryCache()
     * @generated
     */
    int MEMORY_CACHE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_CACHE__ID = LINKABLE_MEMORY_HIERARCHY_RESOURCES__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_CACHE__ENTITY_NAME = LINKABLE_MEMORY_HIERARCHY_RESOURCES__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Cache Hit Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_CACHE__CACHE_HIT_RATE = LINKABLE_MEMORY_HIERARCHY_RESOURCES_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Private Cache</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_CACHE__IS_PRIVATE_CACHE = LINKABLE_MEMORY_HIERARCHY_RESOURCES_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Memory Cache</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_CACHE_FEATURE_COUNT = LINKABLE_MEMORY_HIERARCHY_RESOURCES_FEATURE_COUNT + 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl
     * <em>Linking Resource Specification</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Communication Linking Resource Type Memory Hierarchy Linking
     * Resource Specification</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT
            + 0;

    /**
     * The feature id for the '<em><b>Latency Memory Hierarchy Linking Resource
     * Specification</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT
            + 1;

    /**
     * The feature id for the '<em><b>Throughput Memory Hierarchy Linking Resource
     * Specification</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT
            + 2;

    /**
     * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT
            + 3;

    /**
     * The number of structural features of the '<em>Linking Resource Specification</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl
     * <em>Linking Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyLinkingResource()
     * @generated
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Memory Hierarchy Linking Resource Specification Memory
     * Hierarchy Linking Resource</b></em>' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT
            + 0;

    /**
     * The feature id for the '<em><b>Hierarchy Successor Memory Hierarchy Linking
     * Resource</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT
            + 1;

    /**
     * The feature id for the '<em><b>Hierarchy Predecessor Memory Hierarchy Linking
     * Resource</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT
            + 2;

    /**
     * The number of structural features of the '<em>Linking Resource</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_LINKING_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyContainerImpl
     * <em>Container</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyContainerImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyContainer()
     * @generated
     */
    int MEMORY_HIERARCHY_CONTAINER = 4;

    /**
     * The feature id for the '<em><b>Memory Hierarchy Environment Memory Hierarchy
     * Container</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER = 0;

    /**
     * The number of structural features of the '<em>Container</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CONTAINER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.CacheStartingPointImpl <em>Cache Starting
     * Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.CacheStartingPointImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getCacheStartingPoint()
     * @generated
     */
    int CACHE_STARTING_POINT = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CACHE_STARTING_POINT__ID = LINKABLE_MEMORY_HIERARCHY_RESOURCES__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CACHE_STARTING_POINT__ENTITY_NAME = LINKABLE_MEMORY_HIERARCHY_RESOURCES__ENTITY_NAME;

    /**
     * The number of structural features of the '<em>Cache Starting Point</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CACHE_STARTING_POINT_FEATURE_COUNT = LINKABLE_MEMORY_HIERARCHY_RESOURCES_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.InternalActionWithMemoryResourceCallImpl
     * <em>Internal Action With Memory Resource Call</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.InternalActionWithMemoryResourceCallImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getInternalActionWithMemoryResourceCall()
     * @generated
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__ID = SeffPackage.INTERNAL_ACTION__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__ENTITY_NAME = SeffPackage.INTERNAL_ACTION__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.INTERNAL_ACTION__PREDECESSOR_ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.INTERNAL_ACTION__SUCCESSOR_ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>'
     * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.INTERNAL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__RESOURCE_DEMAND_ACTION = SeffPackage.INTERNAL_ACTION__RESOURCE_DEMAND_ACTION;

    /**
     * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__INFRASTRUCTURE_CALL_ACTION = SeffPackage.INTERNAL_ACTION__INFRASTRUCTURE_CALL_ACTION;

    /**
     * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__RESOURCE_CALL_ACTION = SeffPackage.INTERNAL_ACTION__RESOURCE_CALL_ACTION;

    /**
     * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Internal
     * Action</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION = SeffPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION;

    /**
     * The number of structural features of the '<em>Internal Action With Memory Resource Call</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL_FEATURE_COUNT = SeffPackage.INTERNAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyCallActionImpl <em>Call
     * Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyCallActionImpl
     * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyCallAction()
     * @generated
     */
    int MEMORY_HIERARCHY_CALL_ACTION = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__ID = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>'
     * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__RESOURCE_DEMAND_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

    /**
     * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__INFRASTRUCTURE_CALL_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

    /**
     * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION__RESOURCE_CALL_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

    /**
     * The number of structural features of the '<em>Call Action</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMORY_HIERARCHY_CALL_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT
            + 0;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment <em>Resource
     * Environment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Resource Environment</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment
     * @generated
     */
    EClass getMemoryHierarchyResourceEnvironment();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getMemoryCache_MemoryHierarchyResourceEnvironment
     * <em>Memory Cache Memory Hierarchy Resource Environment</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Memory Cache Memory Hierarchy
     *         Resource Environment</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getMemoryCache_MemoryHierarchyResourceEnvironment()
     * @see #getMemoryHierarchyResourceEnvironment()
     * @generated
     */
    EReference getMemoryHierarchyResourceEnvironment_MemoryCache_MemoryHierarchyResourceEnvironment();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment
     * <em>Memory Hierarchy Linking Resource Memory Hierarchy Resource Environment</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Memory Hierarchy Linking
     *         Resource Memory Hierarchy Resource Environment</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment()
     * @see #getMemoryHierarchyResourceEnvironment()
     * @generated
     */
    EReference getMemoryHierarchyResourceEnvironment_MemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getCpuStartingPoint_MemoryHierarchyResourceEnvironment
     * <em>Cpu Starting Point Memory Hierarchy Resource Environment</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Cpu Starting Point Memory
     *         Hierarchy Resource Environment</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getCpuStartingPoint_MemoryHierarchyResourceEnvironment()
     * @see #getMemoryHierarchyResourceEnvironment()
     * @generated
     */
    EReference getMemoryHierarchyResourceEnvironment_CpuStartingPoint_MemoryHierarchyResourceEnvironment();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.memoryhierarchy.MemoryCache
     * <em>Memory Cache</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Memory Cache</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryCache
     * @generated
     */
    EClass getMemoryCache();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryCache#getCacheHitRate <em>Cache Hit
     * Rate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Cache Hit Rate</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryCache#getCacheHitRate()
     * @see #getMemoryCache()
     * @generated
     */
    EAttribute getMemoryCache_CacheHitRate();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryCache#isIsPrivateCache <em>Is Private
     * Cache</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Is Private Cache</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryCache#isIsPrivateCache()
     * @see #getMemoryCache()
     * @generated
     */
    EAttribute getMemoryCache_IsPrivateCache();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification
     * <em>Linking Resource Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Linking Resource Specification</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification
     * @generated
     */
    EClass getMemoryHierarchyLinkingResourceSpecification();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification
     * <em>Communication Linking Resource Type Memory Hierarchy Linking Resource
     * Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Communication Linking Resource Type Memory
     *         Hierarchy Linking Resource Specification</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
     * @see #getMemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    EReference getMemoryHierarchyLinkingResourceSpecification_CommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getLatency_MemoryHierarchyLinkingResourceSpecification
     * <em>Latency Memory Hierarchy Linking Resource Specification</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Latency Memory Hierarchy Linking
     *         Resource Specification</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getLatency_MemoryHierarchyLinkingResourceSpecification()
     * @see #getMemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    EReference getMemoryHierarchyLinkingResourceSpecification_Latency_MemoryHierarchyLinkingResourceSpecification();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getThroughput_MemoryHierarchyLinkingResourceSpecification
     * <em>Throughput Memory Hierarchy Linking Resource Specification</em>}'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Throughput Memory Hierarchy
     *         Linking Resource Specification</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getThroughput_MemoryHierarchyLinkingResourceSpecification()
     * @see #getMemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    EReference getMemoryHierarchyLinkingResourceSpecification_Throughput_MemoryHierarchyLinkingResourceSpecification();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getNumberOfReplicas
     * <em>Number Of Replicas</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Number Of Replicas</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getNumberOfReplicas()
     * @see #getMemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    EAttribute getMemoryHierarchyLinkingResourceSpecification_NumberOfReplicas();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource <em>Linking
     * Resource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Linking Resource</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource
     * @generated
     */
    EClass getMemoryHierarchyLinkingResource();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource
     * <em>Memory Hierarchy Linking Resource Specification Memory Hierarchy Linking Resource</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Memory Hierarchy Linking Resource
     *         Specification Memory Hierarchy Linking Resource</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
     * @see #getMemoryHierarchyLinkingResource()
     * @generated
     */
    EReference getMemoryHierarchyLinkingResource_MemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchySuccessor_MemoryHierarchyLinkingResource
     * <em>Hierarchy Successor Memory Hierarchy Linking Resource</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Hierarchy Successor Memory Hierarchy Linking
     *         Resource</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchySuccessor_MemoryHierarchyLinkingResource()
     * @see #getMemoryHierarchyLinkingResource()
     * @generated
     */
    EReference getMemoryHierarchyLinkingResource_HierarchySuccessor_MemoryHierarchyLinkingResource();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchyPredecessor_MemoryHierarchyLinkingResource
     * <em>Hierarchy Predecessor Memory Hierarchy Linking Resource</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Hierarchy Predecessor Memory Hierarchy Linking
     *         Resource</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchyPredecessor_MemoryHierarchyLinkingResource()
     * @see #getMemoryHierarchyLinkingResource()
     * @generated
     */
    EReference getMemoryHierarchyLinkingResource_HierarchyPredecessor_MemoryHierarchyLinkingResource();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer <em>Container</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Container</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer
     * @generated
     */
    EClass getMemoryHierarchyContainer();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer#getMemoryHierarchyEnvironment_MemoryHierarchyContainer
     * <em>Memory Hierarchy Environment Memory Hierarchy Container</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Memory Hierarchy Environment
     *         Memory Hierarchy Container</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer#getMemoryHierarchyEnvironment_MemoryHierarchyContainer()
     * @see #getMemoryHierarchyContainer()
     * @generated
     */
    EReference getMemoryHierarchyContainer_MemoryHierarchyEnvironment_MemoryHierarchyContainer();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.CacheStartingPoint <em>Cache Starting
     * Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Cache Starting Point</em>'.
     * @see org.palladiosimulator.memoryhierarchy.CacheStartingPoint
     * @generated
     */
    EClass getCacheStartingPoint();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources <em>Linkable
     * Memory Hierarchy Resources</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Linkable Memory Hierarchy Resources</em>'.
     * @see org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources
     * @generated
     */
    EClass getLinkableMemoryHierarchyResources();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall
     * <em>Internal Action With Memory Resource Call</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the meta object for class '<em>Internal Action With Memory Resource Call</em>'.
     * @see org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall
     * @generated
     */
    EClass getInternalActionWithMemoryResourceCall();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction <em>Call
     * Action</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Call Action</em>'.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction
     * @generated
     */
    EClass getMemoryHierarchyCallAction();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MemoryHierarchyFactory getMemoryHierarchyFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl
         * <em>Resource Environment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyResourceEnvironment()
         * @generated
         */
        EClass MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = eINSTANCE.getMemoryHierarchyResourceEnvironment();

        /**
         * The meta object literal for the '<em><b>Memory Cache Memory Hierarchy Resource
         * Environment</b></em>' containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = eINSTANCE
            .getMemoryHierarchyResourceEnvironment_MemoryCache_MemoryHierarchyResourceEnvironment();

        /**
         * The meta object literal for the '<em><b>Memory Hierarchy Linking Resource Memory
         * Hierarchy Resource Environment</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = eINSTANCE
            .getMemoryHierarchyResourceEnvironment_MemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment();

        /**
         * The meta object literal for the '<em><b>Cpu Starting Point Memory Hierarchy Resource
         * Environment</b></em>' containment reference feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT = eINSTANCE
            .getMemoryHierarchyResourceEnvironment_CpuStartingPoint_MemoryHierarchyResourceEnvironment();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryCacheImpl <em>Memory
         * Cache</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryCacheImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryCache()
         * @generated
         */
        EClass MEMORY_CACHE = eINSTANCE.getMemoryCache();

        /**
         * The meta object literal for the '<em><b>Cache Hit Rate</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MEMORY_CACHE__CACHE_HIT_RATE = eINSTANCE.getMemoryCache_CacheHitRate();

        /**
         * The meta object literal for the '<em><b>Is Private Cache</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MEMORY_CACHE__IS_PRIVATE_CACHE = eINSTANCE.getMemoryCache_IsPrivateCache();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl
         * <em>Linking Resource Specification</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyLinkingResourceSpecification()
         * @generated
         */
        EClass MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = eINSTANCE
            .getMemoryHierarchyLinkingResourceSpecification();

        /**
         * The meta object literal for the '<em><b>Communication Linking Resource Type Memory
         * Hierarchy Linking Resource Specification</b></em>' reference feature. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = eINSTANCE
            .getMemoryHierarchyLinkingResourceSpecification_CommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification();

        /**
         * The meta object literal for the '<em><b>Latency Memory Hierarchy Linking Resource
         * Specification</b></em>' containment reference feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = eINSTANCE
            .getMemoryHierarchyLinkingResourceSpecification_Latency_MemoryHierarchyLinkingResourceSpecification();

        /**
         * The meta object literal for the '<em><b>Throughput Memory Hierarchy Linking Resource
         * Specification</b></em>' containment reference feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION = eINSTANCE
            .getMemoryHierarchyLinkingResourceSpecification_Throughput_MemoryHierarchyLinkingResourceSpecification();

        /**
         * The meta object literal for the '<em><b>Number Of Replicas</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = eINSTANCE
            .getMemoryHierarchyLinkingResourceSpecification_NumberOfReplicas();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl
         * <em>Linking Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyLinkingResource()
         * @generated
         */
        EClass MEMORY_HIERARCHY_LINKING_RESOURCE = eINSTANCE.getMemoryHierarchyLinkingResource();

        /**
         * The meta object literal for the '<em><b>Memory Hierarchy Linking Resource Specification
         * Memory Hierarchy Linking Resource</b></em>' containment reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE = eINSTANCE
            .getMemoryHierarchyLinkingResource_MemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource();

        /**
         * The meta object literal for the '<em><b>Hierarchy Successor Memory Hierarchy Linking
         * Resource</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE = eINSTANCE
            .getMemoryHierarchyLinkingResource_HierarchySuccessor_MemoryHierarchyLinkingResource();

        /**
         * The meta object literal for the '<em><b>Hierarchy Predecessor Memory Hierarchy Linking
         * Resource</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE = eINSTANCE
            .getMemoryHierarchyLinkingResource_HierarchyPredecessor_MemoryHierarchyLinkingResource();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyContainerImpl
         * <em>Container</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyContainerImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyContainer()
         * @generated
         */
        EClass MEMORY_HIERARCHY_CONTAINER = eINSTANCE.getMemoryHierarchyContainer();

        /**
         * The meta object literal for the '<em><b>Memory Hierarchy Environment Memory Hierarchy
         * Container</b></em>' containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EReference MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER = eINSTANCE
            .getMemoryHierarchyContainer_MemoryHierarchyEnvironment_MemoryHierarchyContainer();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.CacheStartingPointImpl <em>Cache
         * Starting Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.CacheStartingPointImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getCacheStartingPoint()
         * @generated
         */
        EClass CACHE_STARTING_POINT = eINSTANCE.getCacheStartingPoint();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.LinkableMemoryHierarchyResourcesImpl
         * <em>Linkable Memory Hierarchy Resources</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.LinkableMemoryHierarchyResourcesImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getLinkableMemoryHierarchyResources()
         * @generated
         */
        EClass LINKABLE_MEMORY_HIERARCHY_RESOURCES = eINSTANCE.getLinkableMemoryHierarchyResources();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.InternalActionWithMemoryResourceCallImpl
         * <em>Internal Action With Memory Resource Call</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.InternalActionWithMemoryResourceCallImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getInternalActionWithMemoryResourceCall()
         * @generated
         */
        EClass INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL = eINSTANCE.getInternalActionWithMemoryResourceCall();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyCallActionImpl <em>Call
         * Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyCallActionImpl
         * @see org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyPackageImpl#getMemoryHierarchyCallAction()
         * @generated
         */
        EClass MEMORY_HIERARCHY_CALL_ACTION = eINSTANCE.getMemoryHierarchyCallAction();

    }

} // MemoryHierarchyPackage
