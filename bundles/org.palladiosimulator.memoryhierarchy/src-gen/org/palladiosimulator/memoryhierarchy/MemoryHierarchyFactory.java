/**
 */
package org.palladiosimulator.memoryhierarchy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage
 * @generated
 */
public interface MemoryHierarchyFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MemoryHierarchyFactory eINSTANCE = org.palladiosimulator.memoryhierarchy.impl.MemoryHierarchyFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Resource Environment</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Resource Environment</em>'.
     * @generated
     */
    MemoryHierarchyResourceEnvironment createMemoryHierarchyResourceEnvironment();

    /**
     * Returns a new object of class '<em>Memory Cache</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Memory Cache</em>'.
     * @generated
     */
    MemoryCache createMemoryCache();

    /**
     * Returns a new object of class '<em>Linking Resource Specification</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Linking Resource Specification</em>'.
     * @generated
     */
    MemoryHierarchyLinkingResourceSpecification createMemoryHierarchyLinkingResourceSpecification();

    /**
     * Returns a new object of class '<em>Linking Resource</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Linking Resource</em>'.
     * @generated
     */
    MemoryHierarchyLinkingResource createMemoryHierarchyLinkingResource();

    /**
     * Returns a new object of class '<em>Container</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Container</em>'.
     * @generated
     */
    MemoryHierarchyContainer createMemoryHierarchyContainer();

    /**
     * Returns a new object of class '<em>Cache Starting Point</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Cache Starting Point</em>'.
     * @generated
     */
    CacheStartingPoint createCacheStartingPoint();

    /**
     * Returns a new object of class '<em>Internal Action With Memory Resource Call</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Internal Action With Memory Resource Call</em>'.
     * @generated
     */
    InternalActionWithMemoryResourceCall createInternalActionWithMemoryResourceCall();

    /**
     * Returns a new object of class '<em>Call Action</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Call Action</em>'.
     * @generated
     */
    MemoryHierarchyCallAction createMemoryHierarchyCallAction();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    MemoryHierarchyPackage getMemoryHierarchyPackage();

} // MemoryHierarchyFactory
