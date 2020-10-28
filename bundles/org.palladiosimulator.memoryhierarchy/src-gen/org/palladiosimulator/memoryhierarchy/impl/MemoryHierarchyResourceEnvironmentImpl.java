/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resource
 * Environment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl#getMemoryCache_MemoryHierarchyResourceEnvironment
 * <em>Memory Cache Memory Hierarchy Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl#getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment
 * <em>Memory Hierarchy Linking Resource Memory Hierarchy Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyResourceEnvironmentImpl#getCpuStartingPoint_MemoryHierarchyResourceEnvironment
 * <em>Cpu Starting Point Memory Hierarchy Resource Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryHierarchyResourceEnvironmentImpl extends EntityImpl implements MemoryHierarchyResourceEnvironment {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MemoryHierarchyResourceEnvironmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MemoryCache> getMemoryCache_MemoryHierarchyResourceEnvironment() {
        return (EList<MemoryCache>) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MemoryHierarchyLinkingResource> getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment() {
        return (EList<MemoryHierarchyLinkingResource>) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CacheStartingPoint getCpuStartingPoint_MemoryHierarchyResourceEnvironment() {
        return (CacheStartingPoint) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCpuStartingPoint_MemoryHierarchyResourceEnvironment(
            final CacheStartingPoint newCpuStartingPoint_MemoryHierarchyResourceEnvironment, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newCpuStartingPoint_MemoryHierarchyResourceEnvironment,
                MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCpuStartingPoint_MemoryHierarchyResourceEnvironment(
            final CacheStartingPoint newCpuStartingPoint_MemoryHierarchyResourceEnvironment) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                newCpuStartingPoint_MemoryHierarchyResourceEnvironment);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return ((InternalEList<?>) this.getMemoryCache_MemoryHierarchyResourceEnvironment()).basicRemove(otherEnd,
                    msgs);
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return ((InternalEList<?>) this.getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment())
                .basicRemove(otherEnd, msgs);
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return this.basicSetCpuStartingPoint_MemoryHierarchyResourceEnvironment(null, msgs);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return this.getMemoryCache_MemoryHierarchyResourceEnvironment();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return this.getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return this.getCpuStartingPoint_MemoryHierarchyResourceEnvironment();
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.getMemoryCache_MemoryHierarchyResourceEnvironment()
                .clear();
            this.getMemoryCache_MemoryHierarchyResourceEnvironment()
                .addAll((Collection<? extends MemoryCache>) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment()
                .clear();
            this.getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment()
                .addAll((Collection<? extends MemoryHierarchyLinkingResource>) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.setCpuStartingPoint_MemoryHierarchyResourceEnvironment((CacheStartingPoint) newValue);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.getMemoryCache_MemoryHierarchyResourceEnvironment()
                .clear();
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment()
                .clear();
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.setCpuStartingPoint_MemoryHierarchyResourceEnvironment((CacheStartingPoint) null);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return !this.getMemoryCache_MemoryHierarchyResourceEnvironment()
                .isEmpty();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return !this.getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment()
                .isEmpty();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            return this.getCpuStartingPoint_MemoryHierarchyResourceEnvironment() != null;
        }
        return super.eIsSet(featureID);
    }

} // MemoryHierarchyResourceEnvironmentImpl
