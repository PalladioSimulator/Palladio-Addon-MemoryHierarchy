/**
 */
package org.palladiosimulator.memoryhierarchy.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Linking Resource
 * Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl#getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification
 * <em>Communication Linking Resource Type Memory Hierarchy Linking Resource
 * Specification</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl#getLatency_MemoryHierarchyLinkingResourceSpecification
 * <em>Latency Memory Hierarchy Linking Resource Specification</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl#getThroughput_MemoryHierarchyLinkingResourceSpecification
 * <em>Throughput Memory Hierarchy Linking Resource Specification</em>}</li>
 * <li>{@link org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyLinkingResourceSpecificationImpl#getNumberOfReplicas
 * <em>Number Of Replicas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryHierarchyLinkingResourceSpecificationImpl extends IdentifierImpl
        implements MemoryHierarchyLinkingResourceSpecification {
    /**
     * The default value of the '{@link #getNumberOfReplicas() <em>Number Of Replicas</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumberOfReplicas()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_REPLICAS_EDEFAULT = 1;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MemoryHierarchyLinkingResourceSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CommunicationLinkResourceType getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification() {
        return (CommunicationLinkResourceType) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CommunicationLinkResourceType basicGetCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification() {
        return (CommunicationLinkResourceType) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(
            final CommunicationLinkResourceType newCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                newCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRandomVariable getLatency_MemoryHierarchyLinkingResourceSpecification() {
        return (PCMRandomVariable) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLatency_MemoryHierarchyLinkingResourceSpecification(
            final PCMRandomVariable newLatency_MemoryHierarchyLinkingResourceSpecification, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newLatency_MemoryHierarchyLinkingResourceSpecification,
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLatency_MemoryHierarchyLinkingResourceSpecification(
            final PCMRandomVariable newLatency_MemoryHierarchyLinkingResourceSpecification) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                newLatency_MemoryHierarchyLinkingResourceSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRandomVariable getThroughput_MemoryHierarchyLinkingResourceSpecification() {
        return (PCMRandomVariable) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetThroughput_MemoryHierarchyLinkingResourceSpecification(
            final PCMRandomVariable newThroughput_MemoryHierarchyLinkingResourceSpecification, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newThroughput_MemoryHierarchyLinkingResourceSpecification,
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setThroughput_MemoryHierarchyLinkingResourceSpecification(
            final PCMRandomVariable newThroughput_MemoryHierarchyLinkingResourceSpecification) {
        this.eDynamicSet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                newThroughput_MemoryHierarchyLinkingResourceSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getNumberOfReplicas() {
        return (Integer) this.eDynamicGet(
                MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumberOfReplicas(final int newNumberOfReplicas) {
        this.eDynamicSet(MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS,
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS,
                newNumberOfReplicas);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.basicSetLatency_MemoryHierarchyLinkingResourceSpecification(null, msgs);
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.basicSetThroughput_MemoryHierarchyLinkingResourceSpecification(null, msgs);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            if (resolve) {
                return this.getCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification();
            }
            return this.basicGetCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.getLatency_MemoryHierarchyLinkingResourceSpecification();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.getThroughput_MemoryHierarchyLinkingResourceSpecification();
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS:
            return this.getNumberOfReplicas();
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            this.setCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(
                    (CommunicationLinkResourceType) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            this.setLatency_MemoryHierarchyLinkingResourceSpecification((PCMRandomVariable) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            this.setThroughput_MemoryHierarchyLinkingResourceSpecification((PCMRandomVariable) newValue);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS:
            this.setNumberOfReplicas((Integer) newValue);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            this.setCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(
                    (CommunicationLinkResourceType) null);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            this.setLatency_MemoryHierarchyLinkingResourceSpecification((PCMRandomVariable) null);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            this.setThroughput_MemoryHierarchyLinkingResourceSpecification((PCMRandomVariable) null);
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS:
            this.setNumberOfReplicas(NUMBER_OF_REPLICAS_EDEFAULT);
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
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.basicGetCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification() != null;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.getLatency_MemoryHierarchyLinkingResourceSpecification() != null;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
            return this.getThroughput_MemoryHierarchyLinkingResourceSpecification() != null;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS:
            return this.getNumberOfReplicas() != NUMBER_OF_REPLICAS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // MemoryHierarchyLinkingResourceSpecificationImpl
