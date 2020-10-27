/**
 */
package org.palladiosimulator.memoryhierarchy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.memoryhierarchy.CacheStartingPoint;
import org.palladiosimulator.memoryhierarchy.InternalActionWithMemoryResourceCall;
import org.palladiosimulator.memoryhierarchy.LinkableMemoryHierarchyResources;
import org.palladiosimulator.memoryhierarchy.MemoryCache;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyCallAction;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyContainer;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractInternalControlFlowAction;
import org.palladiosimulator.pcm.seff.InternalAction;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage
 * @generated
 */
public class MemoryHierarchySwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static MemoryHierarchyPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MemoryHierarchySwitch() {
        if (modelPackage == null) {
            modelPackage = MemoryHierarchyPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT: {
            final MemoryHierarchyResourceEnvironment memoryHierarchyResourceEnvironment = (MemoryHierarchyResourceEnvironment) theEObject;
            T result = this.caseMemoryHierarchyResourceEnvironment(memoryHierarchyResourceEnvironment);
            if (result == null) {
                result = this.caseEntity(memoryHierarchyResourceEnvironment);
            }
            if (result == null) {
                result = this.caseIdentifier(memoryHierarchyResourceEnvironment);
            }
            if (result == null) {
                result = this.caseNamedElement(memoryHierarchyResourceEnvironment);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.MEMORY_CACHE: {
            final MemoryCache memoryCache = (MemoryCache) theEObject;
            T result = this.caseMemoryCache(memoryCache);
            if (result == null) {
                result = this.caseLinkableMemoryHierarchyResources(memoryCache);
            }
            if (result == null) {
                result = this.caseEntity(memoryCache);
            }
            if (result == null) {
                result = this.caseIdentifier(memoryCache);
            }
            if (result == null) {
                result = this.caseNamedElement(memoryCache);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION: {
            final MemoryHierarchyLinkingResourceSpecification memoryHierarchyLinkingResourceSpecification = (MemoryHierarchyLinkingResourceSpecification) theEObject;
            T result = this
                .caseMemoryHierarchyLinkingResourceSpecification(memoryHierarchyLinkingResourceSpecification);
            if (result == null) {
                result = this.caseIdentifier(memoryHierarchyLinkingResourceSpecification);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE: {
            final MemoryHierarchyLinkingResource memoryHierarchyLinkingResource = (MemoryHierarchyLinkingResource) theEObject;
            T result = this.caseMemoryHierarchyLinkingResource(memoryHierarchyLinkingResource);
            if (result == null) {
                result = this.caseEntity(memoryHierarchyLinkingResource);
            }
            if (result == null) {
                result = this.caseIdentifier(memoryHierarchyLinkingResource);
            }
            if (result == null) {
                result = this.caseNamedElement(memoryHierarchyLinkingResource);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CONTAINER: {
            final MemoryHierarchyContainer memoryHierarchyContainer = (MemoryHierarchyContainer) theEObject;
            T result = this.caseMemoryHierarchyContainer(memoryHierarchyContainer);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.CACHE_STARTING_POINT: {
            final CacheStartingPoint cacheStartingPoint = (CacheStartingPoint) theEObject;
            T result = this.caseCacheStartingPoint(cacheStartingPoint);
            if (result == null) {
                result = this.caseLinkableMemoryHierarchyResources(cacheStartingPoint);
            }
            if (result == null) {
                result = this.caseEntity(cacheStartingPoint);
            }
            if (result == null) {
                result = this.caseIdentifier(cacheStartingPoint);
            }
            if (result == null) {
                result = this.caseNamedElement(cacheStartingPoint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.LINKABLE_MEMORY_HIERARCHY_RESOURCES: {
            final LinkableMemoryHierarchyResources linkableMemoryHierarchyResources = (LinkableMemoryHierarchyResources) theEObject;
            T result = this.caseLinkableMemoryHierarchyResources(linkableMemoryHierarchyResources);
            if (result == null) {
                result = this.caseEntity(linkableMemoryHierarchyResources);
            }
            if (result == null) {
                result = this.caseIdentifier(linkableMemoryHierarchyResources);
            }
            if (result == null) {
                result = this.caseNamedElement(linkableMemoryHierarchyResources);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.INTERNAL_ACTION_WITH_MEMORY_RESOURCE_CALL: {
            final InternalActionWithMemoryResourceCall internalActionWithMemoryResourceCall = (InternalActionWithMemoryResourceCall) theEObject;
            T result = this.caseInternalActionWithMemoryResourceCall(internalActionWithMemoryResourceCall);
            if (result == null) {
                result = this.caseInternalAction(internalActionWithMemoryResourceCall);
            }
            if (result == null) {
                result = this.caseAbstractInternalControlFlowAction(internalActionWithMemoryResourceCall);
            }
            if (result == null) {
                result = this.caseAbstractAction(internalActionWithMemoryResourceCall);
            }
            if (result == null) {
                result = this.caseEntity(internalActionWithMemoryResourceCall);
            }
            if (result == null) {
                result = this.caseIdentifier(internalActionWithMemoryResourceCall);
            }
            if (result == null) {
                result = this.caseNamedElement(internalActionWithMemoryResourceCall);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_CALL_ACTION: {
            final MemoryHierarchyCallAction memoryHierarchyCallAction = (MemoryHierarchyCallAction) theEObject;
            T result = this.caseMemoryHierarchyCallAction(memoryHierarchyCallAction);
            if (result == null) {
                result = this.caseAbstractInternalControlFlowAction(memoryHierarchyCallAction);
            }
            if (result == null) {
                result = this.caseAbstractAction(memoryHierarchyCallAction);
            }
            if (result == null) {
                result = this.caseEntity(memoryHierarchyCallAction);
            }
            if (result == null) {
                result = this.caseIdentifier(memoryHierarchyCallAction);
            }
            if (result == null) {
                result = this.caseNamedElement(memoryHierarchyCallAction);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource
     * Environment</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource
     *         Environment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryHierarchyResourceEnvironment(final MemoryHierarchyResourceEnvironment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Memory Cache</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Memory Cache</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryCache(final MemoryCache object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linking Resource
     * Specification</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linking Resource
     *         Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryHierarchyLinkingResourceSpecification(final MemoryHierarchyLinkingResourceSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linking Resource</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linking Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryHierarchyLinkingResource(final MemoryHierarchyLinkingResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Container</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryHierarchyContainer(final MemoryHierarchyContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cache Starting
     * Point</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cache Starting
     *         Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCacheStartingPoint(final CacheStartingPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linkable Memory
     * Hierarchy Resources</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linkable Memory
     *         Hierarchy Resources</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkableMemoryHierarchyResources(final LinkableMemoryHierarchyResources object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Internal Action With
     * Memory Resource Call</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Internal Action With
     *         Memory Resource Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalActionWithMemoryResourceCall(final InternalActionWithMemoryResourceCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryHierarchyCallAction(final MemoryHierarchyCallAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractAction(final AbstractAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Internal
     * Control Flow Action</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Internal
     *         Control Flow Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractInternalControlFlowAction(final AbstractInternalControlFlowAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Internal Action</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Internal Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalAction(final InternalAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // MemoryHierarchySwitch
