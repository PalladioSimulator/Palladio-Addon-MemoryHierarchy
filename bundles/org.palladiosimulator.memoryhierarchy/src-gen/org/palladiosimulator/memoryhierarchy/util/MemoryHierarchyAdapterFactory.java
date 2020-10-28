/**
 */
package org.palladiosimulator.memoryhierarchy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall;
import org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractInternalControlFlowAction;
import org.palladiosimulator.pcm.seff.InternalAction;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage
 * @generated
 */
public class MemoryHierarchyAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static MemoryHierarchyPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MemoryHierarchyAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MemoryHierarchyPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected MemoryHierarchySwitch<Adapter> modelSwitch = new MemoryHierarchySwitch<Adapter>() {
        @Override
        public Adapter caseMemoryHierarchyResourceEnvironment(final MemoryHierarchyResourceEnvironment object) {
            return MemoryHierarchyAdapterFactory.this.createMemoryHierarchyResourceEnvironmentAdapter();
        }

        @Override
        public Adapter caseMemoryCache(final MemoryCache object) {
            return MemoryHierarchyAdapterFactory.this.createMemoryCacheAdapter();
        }

        @Override
        public Adapter caseMemoryHierarchyLinkingResourceSpecification(
                final MemoryHierarchyLinkingResourceSpecification object) {
            return MemoryHierarchyAdapterFactory.this.createMemoryHierarchyLinkingResourceSpecificationAdapter();
        }

        @Override
        public Adapter caseMemoryHierarchyLinkingResource(final MemoryHierarchyLinkingResource object) {
            return MemoryHierarchyAdapterFactory.this.createMemoryHierarchyLinkingResourceAdapter();
        }

        @Override
        public Adapter caseMemoryHierarchyContainer(final MemoryHierarchyContainer object) {
            return MemoryHierarchyAdapterFactory.this.createMemoryHierarchyContainerAdapter();
        }

        @Override
        public Adapter caseCacheStartingPoint(final CacheStartingPoint object) {
            return MemoryHierarchyAdapterFactory.this.createCacheStartingPointAdapter();
        }

        @Override
        public Adapter caseLinkableMemoryHierarchyResources(final LinkableMemoryHierarchyResources object) {
            return MemoryHierarchyAdapterFactory.this.createLinkableMemoryHierarchyResourcesAdapter();
        }

        @Override
        public Adapter caseInternalActionWithMemoryResourceCall(final InternalActionWithMemoryResourceCall object) {
            return MemoryHierarchyAdapterFactory.this.createInternalActionWithMemoryResourceCallAdapter();
        }

        @Override
        public Adapter caseMemoryHierarchyCallAction(final MemoryHierarchyCallAction object) {
            return MemoryHierarchyAdapterFactory.this.createMemoryHierarchyCallActionAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return MemoryHierarchyAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object) {
            return MemoryHierarchyAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return MemoryHierarchyAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter caseAbstractAction(final AbstractAction object) {
            return MemoryHierarchyAdapterFactory.this.createAbstractActionAdapter();
        }

        @Override
        public Adapter caseAbstractInternalControlFlowAction(final AbstractInternalControlFlowAction object) {
            return MemoryHierarchyAdapterFactory.this.createAbstractInternalControlFlowActionAdapter();
        }

        @Override
        public Adapter caseInternalAction(final InternalAction object) {
            return MemoryHierarchyAdapterFactory.this.createInternalActionAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return MemoryHierarchyAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment <em>Resource
     * Environment</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment
     * @generated
     */
    public Adapter createMemoryHierarchyResourceEnvironmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryCache <em>Memory Cache</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.MemoryCache
     * @generated
     */
    public Adapter createMemoryCacheAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification
     * <em>Linking Resource Specification</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification
     * @generated
     */
    public Adapter createMemoryHierarchyLinkingResourceSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource <em>Linking
     * Resource</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource
     * @generated
     */
    public Adapter createMemoryHierarchyLinkingResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer <em>Container</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer
     * @generated
     */
    public Adapter createMemoryHierarchyContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.CacheStartingPoint <em>Cache Starting
     * Point</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.CacheStartingPoint
     * @generated
     */
    public Adapter createCacheStartingPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources <em>Linkable
     * Memory Hierarchy Resources</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources
     * @generated
     */
    public Adapter createLinkableMemoryHierarchyResourcesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall
     * <em>Internal Action With Memory Resource Call</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall
     * @generated
     */
    public Adapter createInternalActionWithMemoryResourceCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction <em>Call
     * Action</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction
     * @generated
     */
    public Adapter createMemoryHierarchyCallActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.seff.AbstractAction <em>Abstract Action</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.AbstractAction
     * @generated
     */
    public Adapter createAbstractActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.seff.AbstractInternalControlFlowAction <em>Abstract
     * Internal Control Flow Action</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.AbstractInternalControlFlowAction
     * @generated
     */
    public Adapter createAbstractInternalControlFlowActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.seff.InternalAction <em>Internal Action</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.InternalAction
     * @generated
     */
    public Adapter createInternalActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // MemoryHierarchyAdapterFactory
