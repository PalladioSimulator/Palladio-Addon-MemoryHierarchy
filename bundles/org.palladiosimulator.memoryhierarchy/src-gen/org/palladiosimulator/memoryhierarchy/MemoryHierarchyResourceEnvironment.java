/**
 */
package org.palladiosimulator.memoryhierarchy;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resource
 * Environment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getMemoryCache_MemoryHierarchyResourceEnvironment
 * <em>Memory Cache Memory Hierarchy Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment
 * <em>Memory Hierarchy Linking Resource Memory Hierarchy Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getCpuStartingPoint_MemoryHierarchyResourceEnvironment
 * <em>Cpu Starting Point Memory Hierarchy Resource Environment</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyResourceEnvironment()
 * @model
 * @generated
 */
public interface MemoryHierarchyResourceEnvironment extends Entity {
    /**
     * Returns the value of the '<em><b>Memory Cache Memory Hierarchy Resource Environment</b></em>'
     * containment reference list. The list contents are of type
     * {@link org.palladiosimulator.memoryhierarchy.MemoryCache}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the value of the '<em>Memory Cache Memory Hierarchy Resource Environment</em>'
     *         containment reference list.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyResourceEnvironment_MemoryCache_MemoryHierarchyResourceEnvironment()
     * @model containment="true"
     * @generated
     */
    EList<MemoryCache> getMemoryCache_MemoryHierarchyResourceEnvironment();

    /**
     * Returns the value of the '<em><b>Memory Hierarchy Linking Resource Memory Hierarchy Resource
     * Environment</b></em>' containment reference list. The list contents are of type
     * {@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Memory Hierarchy Linking Resource Memory Hierarchy Resource
     *         Environment</em>' containment reference list.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyResourceEnvironment_MemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment()
     * @model containment="true"
     * @generated
     */
    EList<MemoryHierarchyLinkingResource> getMemoryHierarchyLinkingResource_MemoryHierarchyResourceEnvironment();

    /**
     * Returns the value of the '<em><b>Cpu Starting Point Memory Hierarchy Resource
     * Environment</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Cpu Starting Point Memory Hierarchy Resource Environment</em>'
     *         containment reference.
     * @see #setCpuStartingPoint_MemoryHierarchyResourceEnvironment(CacheStartingPoint)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyResourceEnvironment_CpuStartingPoint_MemoryHierarchyResourceEnvironment()
     * @model containment="true" required="true"
     * @generated
     */
    CacheStartingPoint getCpuStartingPoint_MemoryHierarchyResourceEnvironment();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment#getCpuStartingPoint_MemoryHierarchyResourceEnvironment
     * <em>Cpu Starting Point Memory Hierarchy Resource Environment</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Cpu Starting Point Memory Hierarchy Resource
     *            Environment</em>' containment reference.
     * @see #getCpuStartingPoint_MemoryHierarchyResourceEnvironment()
     * @generated
     */
    void setCpuStartingPoint_MemoryHierarchyResourceEnvironment(CacheStartingPoint value);

} // MemoryHierarchyResourceEnvironment
