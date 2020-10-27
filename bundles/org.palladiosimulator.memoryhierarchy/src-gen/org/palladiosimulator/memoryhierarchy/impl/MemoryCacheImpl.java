/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Memory Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryCacheImpl#getCacheHitRate <em>Cache
 * Hit Rate</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryCacheImpl#isIsPrivateCache <em>Is
 * Private Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryCacheImpl extends LinkableMemoryHierarchyResourcesImpl implements MemoryCache {
    /**
     * The default value of the '{@link #getCacheHitRate() <em>Cache Hit Rate</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCacheHitRate()
     * @generated
     * @ordered
     */
    protected static final double CACHE_HIT_RATE_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #isIsPrivateCache() <em>Is Private Cache</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isIsPrivateCache()
     * @generated
     * @ordered
     */
    protected static final boolean IS_PRIVATE_CACHE_EDEFAULT = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MemoryCacheImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MemoryHierarchyPackage.Literals.MEMORY_CACHE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getCacheHitRate() {
        return (Double) this.eDynamicGet(MemoryHierarchyPackage.MEMORY_CACHE__CACHE_HIT_RATE,
                MemoryHierarchyPackage.Literals.MEMORY_CACHE__CACHE_HIT_RATE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCacheHitRate(final double newCacheHitRate) {
        this.eDynamicSet(MemoryHierarchyPackage.MEMORY_CACHE__CACHE_HIT_RATE,
                MemoryHierarchyPackage.Literals.MEMORY_CACHE__CACHE_HIT_RATE, newCacheHitRate);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isIsPrivateCache() {
        return (Boolean) this.eDynamicGet(MemoryHierarchyPackage.MEMORY_CACHE__IS_PRIVATE_CACHE,
                MemoryHierarchyPackage.Literals.MEMORY_CACHE__IS_PRIVATE_CACHE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIsPrivateCache(final boolean newIsPrivateCache) {
        this.eDynamicSet(MemoryHierarchyPackage.MEMORY_CACHE__IS_PRIVATE_CACHE,
                MemoryHierarchyPackage.Literals.MEMORY_CACHE__IS_PRIVATE_CACHE, newIsPrivateCache);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MemoryHierarchyPackage.MEMORY_CACHE__CACHE_HIT_RATE:
            return this.getCacheHitRate();
        case MemoryHierarchyPackage.MEMORY_CACHE__IS_PRIVATE_CACHE:
            return this.isIsPrivateCache();
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
        case MemoryHierarchyPackage.MEMORY_CACHE__CACHE_HIT_RATE:
            this.setCacheHitRate((Double) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_CACHE__IS_PRIVATE_CACHE:
            this.setIsPrivateCache((Boolean) newValue);
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
        case MemoryHierarchyPackage.MEMORY_CACHE__CACHE_HIT_RATE:
            this.setCacheHitRate(CACHE_HIT_RATE_EDEFAULT);
            return;
        case MemoryHierarchyPackage.MEMORY_CACHE__IS_PRIVATE_CACHE:
            this.setIsPrivateCache(IS_PRIVATE_CACHE_EDEFAULT);
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
        case MemoryHierarchyPackage.MEMORY_CACHE__CACHE_HIT_RATE:
            return this.getCacheHitRate() != CACHE_HIT_RATE_EDEFAULT;
        case MemoryHierarchyPackage.MEMORY_CACHE__IS_PRIVATE_CACHE:
            return this.isIsPrivateCache() != IS_PRIVATE_CACHE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // MemoryCacheImpl
