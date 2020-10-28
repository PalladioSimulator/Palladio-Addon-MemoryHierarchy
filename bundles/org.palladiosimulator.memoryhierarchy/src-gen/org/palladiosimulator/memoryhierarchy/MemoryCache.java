/**
 */
package org.palladiosimulator.memoryhierarchy;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Memory Cache</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryCache#getCacheHitRate <em>Cache Hit
 * Rate</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryCache#isIsPrivateCache <em>Is Private
 * Cache</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryCache()
 * @model
 * @generated
 */
public interface MemoryCache extends LinkableMemoryHierarchyResources {
    /**
     * Returns the value of the '<em><b>Cache Hit Rate</b></em>' attribute. The default value is
     * <code>"0.0"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Cache Hit Rate</em>' attribute.
     * @see #setCacheHitRate(double)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryCache_CacheHitRate()
     * @model default="0.0" required="true"
     * @generated
     */
    double getCacheHitRate();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryCache#getCacheHitRate <em>Cache Hit
     * Rate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Cache Hit Rate</em>' attribute.
     * @see #getCacheHitRate()
     * @generated
     */
    void setCacheHitRate(double value);

    /**
     * Returns the value of the '<em><b>Is Private Cache</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Is Private Cache</em>' attribute.
     * @see #setIsPrivateCache(boolean)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryCache_IsPrivateCache()
     * @model required="true"
     * @generated
     */
    boolean isIsPrivateCache();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryCache#isIsPrivateCache <em>Is Private
     * Cache</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Is Private Cache</em>' attribute.
     * @see #isIsPrivateCache()
     * @generated
     */
    void setIsPrivateCache(boolean value);

} // MemoryCache
