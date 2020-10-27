/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl#getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource
 * <em>Memory Hierarchy Linking Resource Specification Memory Hierarchy Linking Resource</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl#getHierarchySuccessor_MemoryHierarchyLinkingResource
 * <em>Hierarchy Successor Memory Hierarchy Linking Resource</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceImpl#getHierarchyPredecessor_MemoryHierarchyLinkingResource
 * <em>Hierarchy Predecessor Memory Hierarchy Linking Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryHierarchyLinkingResourceImpl extends EntityImpl implements MemoryHierarchyLinkingResource {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MemoryHierarchyLinkingResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MemoryHierarchyLinkingResourceSpecification getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource() {
        return (MemoryHierarchyLinkingResourceSpecification) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(
            final MemoryHierarchyLinkingResourceSpecification newMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd(
                (InternalEObject) newMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource,
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(
            final MemoryHierarchyLinkingResourceSpecification newMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE,
                newMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LinkableMemoryHierarchyResources getHierarchySuccessor_MemoryHierarchyLinkingResource() {
        return (LinkableMemoryHierarchyResources) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public LinkableMemoryHierarchyResources basicGetHierarchySuccessor_MemoryHierarchyLinkingResource() {
        return (LinkableMemoryHierarchyResources) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setHierarchySuccessor_MemoryHierarchyLinkingResource(
            final LinkableMemoryHierarchyResources newHierarchySuccessor_MemoryHierarchyLinkingResource) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                newHierarchySuccessor_MemoryHierarchyLinkingResource);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LinkableMemoryHierarchyResources getHierarchyPredecessor_MemoryHierarchyLinkingResource() {
        return (LinkableMemoryHierarchyResources) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public LinkableMemoryHierarchyResources basicGetHierarchyPredecessor_MemoryHierarchyLinkingResource() {
        return (LinkableMemoryHierarchyResources) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setHierarchyPredecessor_MemoryHierarchyLinkingResource(
            final LinkableMemoryHierarchyResources newHierarchyPredecessor_MemoryHierarchyLinkingResource) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE,
                newHierarchyPredecessor_MemoryHierarchyLinkingResource);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE:
            return this.basicSetMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE:
            return this.getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            if (resolve) {
                return this.getHierarchySuccessor_MemoryHierarchyLinkingResource();
            }
            return this.basicGetHierarchySuccessor_MemoryHierarchyLinkingResource();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            if (resolve) {
                return this.getHierarchyPredecessor_MemoryHierarchyLinkingResource();
            }
            return this.basicGetHierarchyPredecessor_MemoryHierarchyLinkingResource();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE:
            this.setMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(
                    (MemoryHierarchyLinkingResourceSpecification) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            this.setHierarchySuccessor_MemoryHierarchyLinkingResource((LinkableMemoryHierarchyResources) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            this.setHierarchyPredecessor_MemoryHierarchyLinkingResource((LinkableMemoryHierarchyResources) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE:
            this.setMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(
                    (MemoryHierarchyLinkingResourceSpecification) null);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            this.setHierarchySuccessor_MemoryHierarchyLinkingResource((LinkableMemoryHierarchyResources) null);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            this.setHierarchyPredecessor_MemoryHierarchyLinkingResource((LinkableMemoryHierarchyResources) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION_MEMORY_HIERARCHY_LINKING_RESOURCE:
            return this.getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource() != null;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_SUCCESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            return this.basicGetHierarchySuccessor_MemoryHierarchyLinkingResource() != null;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE__HIERARCHY_PREDECESSOR_MEMORY_HIERARCHY_LINKING_RESOURCE:
            return this.basicGetHierarchyPredecessor_MemoryHierarchyLinkingResource() != null;
        }
        return super.eIsSet(featureID);
    }

} // MemoryHierarchyLinkingResourceImpl
