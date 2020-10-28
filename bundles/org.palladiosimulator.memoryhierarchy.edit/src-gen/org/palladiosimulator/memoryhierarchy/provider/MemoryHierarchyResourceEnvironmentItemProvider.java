/**
 */
package org.palladiosimulator.memoryhierarchy.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyFactory;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MemoryHierarchyResourceEnvironmentItemProvider extends EntityItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public MemoryHierarchyResourceEnvironmentItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(
                    MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);
            this.childrenFeatures.add(
                    MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);
            this.childrenFeatures.add(
                    MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns MemoryHierarchyResourceEnvironment.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/MemoryHierarchyResourceEnvironment"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((MemoryHierarchyResourceEnvironment) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_MemoryHierarchyResourceEnvironment_type")
                : this.getString("_UI_MemoryHierarchyResourceEnvironment_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(MemoryHierarchyResourceEnvironment.class)) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(this.createChildParameter(
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_CACHE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyFactory.eINSTANCE.createMemoryCache()));

        newChildDescriptors.add(this.createChildParameter(
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__MEMORY_HIERARCHY_LINKING_RESOURCE_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyFactory.eINSTANCE.createMemoryHierarchyLinkingResource()));

        newChildDescriptors.add(this.createChildParameter(
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT__CPU_STARTING_POINT_MEMORY_HIERARCHY_RESOURCE_ENVIRONMENT,
                MemoryHierarchyFactory.eINSTANCE.createCacheStartingPoint()));
    }

}
