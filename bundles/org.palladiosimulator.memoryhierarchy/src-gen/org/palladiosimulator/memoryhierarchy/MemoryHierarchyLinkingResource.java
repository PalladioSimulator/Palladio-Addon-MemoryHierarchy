/**
 */
package org.palladiosimulator.memoryhierarchy;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource
 * <em>Memory Hierarchy Linking Resource Specification Memory Hierarchy Linking Resource</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchySuccessor_MemoryHierarchyLinkingResource
 * <em>Hierarchy Successor Memory Hierarchy Linking Resource</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchyPredecessor_MemoryHierarchyLinkingResource
 * <em>Hierarchy Predecessor Memory Hierarchy Linking Resource</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResource()
 * @model
 * @generated
 */
public interface MemoryHierarchyLinkingResource extends Entity {
    /**
     * Returns the value of the '<em><b>Memory Hierarchy Linking Resource Specification Memory
     * Hierarchy Linking Resource</b></em>' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the value of the '<em>Memory Hierarchy Linking Resource Specification Memory
     *         Hierarchy Linking Resource</em>' containment reference.
     * @see #setMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(MemoryHierarchyLinkingResourceSpecification)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResource_MemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
     * @model containment="true" required="true"
     * @generated
     */
    MemoryHierarchyLinkingResourceSpecification getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource
     * <em>Memory Hierarchy Linking Resource Specification Memory Hierarchy Linking Resource</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Memory Hierarchy Linking Resource Specification Memory
     *            Hierarchy Linking Resource</em>' containment reference.
     * @see #getMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource()
     * @generated
     */
    void setMemoryHierarchyLinkingResourceSpecification_MemoryHierarchyLinkingResource(
            MemoryHierarchyLinkingResourceSpecification value);

    /**
     * Returns the value of the '<em><b>Hierarchy Successor Memory Hierarchy Linking
     * Resource</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Hierarchy Successor Memory Hierarchy Linking Resource</em>'
     *         reference.
     * @see #setHierarchySuccessor_MemoryHierarchyLinkingResource(LinkableMemoryHierarchyResources)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResource_HierarchySuccessor_MemoryHierarchyLinkingResource()
     * @model required="true"
     * @generated
     */
    LinkableMemoryHierarchyResources getHierarchySuccessor_MemoryHierarchyLinkingResource();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchySuccessor_MemoryHierarchyLinkingResource
     * <em>Hierarchy Successor Memory Hierarchy Linking Resource</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Hierarchy Successor Memory Hierarchy Linking
     *            Resource</em>' reference.
     * @see #getHierarchySuccessor_MemoryHierarchyLinkingResource()
     * @generated
     */
    void setHierarchySuccessor_MemoryHierarchyLinkingResource(LinkableMemoryHierarchyResources value);

    /**
     * Returns the value of the '<em><b>Hierarchy Predecessor Memory Hierarchy Linking
     * Resource</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Hierarchy Predecessor Memory Hierarchy Linking Resource</em>'
     *         reference.
     * @see #setHierarchyPredecessor_MemoryHierarchyLinkingResource(LinkableMemoryHierarchyResources)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResource_HierarchyPredecessor_MemoryHierarchyLinkingResource()
     * @model required="true"
     * @generated
     */
    LinkableMemoryHierarchyResources getHierarchyPredecessor_MemoryHierarchyLinkingResource();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource#getHierarchyPredecessor_MemoryHierarchyLinkingResource
     * <em>Hierarchy Predecessor Memory Hierarchy Linking Resource</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Hierarchy Predecessor Memory Hierarchy Linking
     *            Resource</em>' reference.
     * @see #getHierarchyPredecessor_MemoryHierarchyLinkingResource()
     * @generated
     */
    void setHierarchyPredecessor_MemoryHierarchyLinkingResource(LinkableMemoryHierarchyResources value);

} // MemoryHierarchyLinkingResource
