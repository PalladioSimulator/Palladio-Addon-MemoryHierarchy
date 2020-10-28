/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyFactory;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MemoryHierarchyFactoryImpl extends EFactoryImpl implements MemoryHierarchyFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static MemoryHierarchyFactory init() {
        try {
            final MemoryHierarchyFactory theMemoryHierarchyFactory = (MemoryHierarchyFactory) EPackage.Registry.INSTANCE
                .getEFactory(MemoryHierarchyPackage.eNS_URI);
            if (theMemoryHierarchyFactory != null) {
                return theMemoryHierarchyFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MemoryHierarchyFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MemoryHierarchyFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return this.createMemoryHierarchyResourceEnvironment();
        case MemoryHierarchyPackage.MEMORY_CACHE:
            return this.createMemoryCache();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.createMemoryHierarchyLinkingResourceSpecification();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE:
            return this.createMemoryHierarchyLinkingResource();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER:
            return this.createMemoryHierarchyContainer();
        case MemoryHierarchyPackage.CACHE_STARTING_POINT:
            return this.createCacheStartingPoint();
        case MemoryHierarchyPackage.INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL:
            return this.createInternalActionWithMemoryResourceCall();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CALL_ACTION:
            return this.createMemoryHierarchyCallAction();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyResourceEnvironment createMemoryHierarchyResourceEnvironment() {
        final MemoryHierarchyResourceEnvironmentImpl memoryHierarchyResourceEnvironment = new MemoryHierarchyResourceEnvironmentImpl();
        return memoryHierarchyResourceEnvironment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryCache createMemoryCache() {
        final MemoryCacheImpl memoryCache = new MemoryCacheImpl();
        return memoryCache;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyLinkingResourceSpecification createMemoryHierarchyLinkingResourceSpecification() {
        final MemoryHierarchyLinkingResourceSpecificationImpl memoryHierarchyLinkingResourceSpecification = new MemoryHierarchyLinkingResourceSpecificationImpl();
        return memoryHierarchyLinkingResourceSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyLinkingResource createMemoryHierarchyLinkingResource() {
        final MemoryHierarchyLinkingResourceImpl memoryHierarchyLinkingResource = new MemoryHierarchyLinkingResourceImpl();
        return memoryHierarchyLinkingResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyContainer createMemoryHierarchyContainer() {
        final MemoryHierarchyContainerImpl memoryHierarchyContainer = new MemoryHierarchyContainerImpl();
        return memoryHierarchyContainer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CacheStartingPoint createCacheStartingPoint() {
        final CacheStartingPointImpl cacheStartingPoint = new CacheStartingPointImpl();
        return cacheStartingPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public InternalActionWithMemoryResourceCall createInternalActionWithMemoryResourceCall() {
        final InternalActionWithMemoryResourceCallImpl internalActionWithMemoryResourceCall = new InternalActionWithMemoryResourceCallImpl();
        return internalActionWithMemoryResourceCall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyCallAction createMemoryHierarchyCallAction() {
        final MemoryHierarchyCallActionImpl memoryHierarchyCallAction = new MemoryHierarchyCallActionImpl();
        return memoryHierarchyCallAction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyPackage getMemoryHierarchyPackage() {
        return (MemoryHierarchyPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MemoryHierarchyPackage getPackage() {
        return MemoryHierarchyPackage.eINSTANCE;
    }

} // MemoryHierarchyFactoryImpl
