/**
 */
package org.palladiosimulator.memoryhierarchy;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Container</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer#getMemoryHierarchyEnvironment_MemoryHierarchyContainer
 * <em>Memory Hierarchy Environment Memory Hierarchy Container</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface MemoryHierarchyContainer extends CDOObject {
    /**
     * Returns the value of the '<em><b>Memory Hierarchy Environment Memory Hierarchy
     * Container</b></em>' containment reference list. The list contents are of type
     * {@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Memory Hierarchy Environment Memory Hierarchy Container</em>'
     *         containment reference list.
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyContainer_MemoryHierarchyEnvironment_MemoryHierarchyContainer()
     * @model containment="true"
     * @generated
     */
    EList<MemoryHierarchyResourceEnvironment> getMemoryHierarchyEnvironment_MemoryHierarchyContainer();

} // MemoryHierarchyContainer
