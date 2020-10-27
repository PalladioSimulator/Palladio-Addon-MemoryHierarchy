/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Container</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyContainerImpl#getMemoryHierarchyEnvironment_MemoryHierarchyContainer
 * <em>Memory Hierarchy Environment Memory Hierarchy Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryHierarchyContainerImpl extends CDOObjectImpl implements MemoryHierarchyContainer {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MemoryHierarchyContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_CONTAINER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MemoryHierarchyResourceEnvironment> getMemoryHierarchyEnvironment_MemoryHierarchyContainer() {
        return (EList<MemoryHierarchyResourceEnvironment>) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER,
                true, true);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER:
            return ((InternalEList<?>) this.getMemoryHierarchyEnvironment_MemoryHierarchyContainer())
                .basicRemove(otherEnd, msgs);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER:
            return this.getMemoryHierarchyEnvironment_MemoryHierarchyContainer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER:
            this.getMemoryHierarchyEnvironment_MemoryHierarchyContainer()
                .clear();
            this.getMemoryHierarchyEnvironment_MemoryHierarchyContainer()
                .addAll((Collection<? extends MemoryHierarchyResourceEnvironment>) newValue);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER:
            this.getMemoryHierarchyEnvironment_MemoryHierarchyContainer()
                .clear();
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER__MEMORY_HIERARCHY_ENVIRONMENT_MEMORY_HIERARCHY_CONTAINER:
            return !this.getMemoryHierarchyEnvironment_MemoryHierarchyContainer()
                .isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MemoryHierarchyContainerImpl
