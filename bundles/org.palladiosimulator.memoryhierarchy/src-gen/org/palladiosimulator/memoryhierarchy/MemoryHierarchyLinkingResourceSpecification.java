/**
 */
package org.palladiosimulator.memoryhierarchy;

import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Linking Resource
 * Specification</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification
 * <em>Communication Linking Resource Type Memory Hierarchy Linking Resource
 * Specification</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getLatency_MemoryHierarchyLinkingResourceSpecification
 * <em>Latency Memory Hierarchy Linking Resource Specification</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getThroughput_MemoryHierarchyLinkingResourceSpecification
 * <em>Throughput Memory Hierarchy Linking Resource Specification</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getNumberOfReplicas
 * <em>Number Of Replicas</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResourceSpecification()
 * @model
 * @generated
 */
public interface MemoryHierarchyLinkingResourceSpecification extends Identifier {
    /**
     * Returns the value of the '<em><b>Communication Linking Resource Type Memory Hierarchy Linking
     * Resource Specification</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Communication Linking Resource Type Memory Hierarchy Linking
     *         Resource Specification</em>' reference.
     * @see #setCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(CommunicationLinkResourceType)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResourceSpecification_CommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
     * @model required="true"
     * @generated
     */
    CommunicationLinkResourceType getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification
     * <em>Communication Linking Resource Type Memory Hierarchy Linking Resource
     * Specification</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Communication Linking Resource Type Memory Hierarchy
     *            Linking Resource Specification</em>' reference.
     * @see #getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    void setCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(
            CommunicationLinkResourceType value);

    /**
     * Returns the value of the '<em><b>Latency Memory Hierarchy Linking Resource
     * Specification</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc --> Specifies the latency of this linking resource in the simulated time
     * unit. The latency is the time that a message on this linking resource takes to receive the
     * receiver. In synchronous communication (call and return), the latency is added twice to the
     * duration, once for the call and once for the response. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Latency Memory Hierarchy Linking Resource Specification</em>'
     *         containment reference.
     * @see #setLatency_MemoryHierarchyLinkingResourceSpecification(PCMRandomVariable)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResourceSpecification_Latency_MemoryHierarchyLinkingResourceSpecification()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    PCMRandomVariable getLatency_MemoryHierarchyLinkingResourceSpecification();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getLatency_MemoryHierarchyLinkingResourceSpecification
     * <em>Latency Memory Hierarchy Linking Resource Specification</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Latency Memory Hierarchy Linking Resource
     *            Specification</em>' containment reference.
     * @see #getLatency_MemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    void setLatency_MemoryHierarchyLinkingResourceSpecification(PCMRandomVariable value);

    /**
     * Returns the value of the '<em><b>Throughput Memory Hierarchy Linking Resource
     * Specification</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc --> Specifies the maximum throughput of this linking resource in byte
     * per simulated time unit. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Throughput Memory Hierarchy Linking Resource
     *         Specification</em>' containment reference.
     * @see #setThroughput_MemoryHierarchyLinkingResourceSpecification(PCMRandomVariable)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResourceSpecification_Throughput_MemoryHierarchyLinkingResourceSpecification()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    PCMRandomVariable getThroughput_MemoryHierarchyLinkingResourceSpecification();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getThroughput_MemoryHierarchyLinkingResourceSpecification
     * <em>Throughput Memory Hierarchy Linking Resource Specification</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Throughput Memory Hierarchy Linking Resource
     *            Specification</em>' containment reference.
     * @see #getThroughput_MemoryHierarchyLinkingResourceSpecification()
     * @generated
     */
    void setThroughput_MemoryHierarchyLinkingResourceSpecification(PCMRandomVariable value);

    /**
     * Returns the value of the '<em><b>Number Of Replicas</b></em>' attribute. The default value is
     * <code>"1"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Number Of Replicas</em>' attribute.
     * @see #setNumberOfReplicas(int)
     * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage#getMemoryHierarchyLinkingResourceSpecification_NumberOfReplicas()
     * @model default="1" required="true" ordered="false"
     * @generated
     */
    int getNumberOfReplicas();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification#getNumberOfReplicas
     * <em>Number Of Replicas</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Number Of Replicas</em>' attribute.
     * @see #getNumberOfReplicas()
     * @generated
     */
    void setNumberOfReplicas(int value);

} // MemoryHierarchyLinkingResourceSpecification
