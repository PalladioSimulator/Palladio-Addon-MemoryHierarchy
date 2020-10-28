/**
 */
package org.palladiosimulator.memoryhierarchy.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyPackage;
import org.palladiosimulator.pcm.core.CoreFactory;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MemoryHierarchyLinkingResourceSpecificationItemProvider extends IdentifierItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public MemoryHierarchyLinkingResourceSpecificationItemProvider(final AdapterFactory adapterFactory) {
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

            this.addCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecificationPropertyDescriptor(
                    object);
            this.addNumberOfReplicasPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Communication Linking Resource Type Memory Hierarchy
     * Linking Resource Specification feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecificationPropertyDescriptor(
            final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_MemoryHierarchyLinkingResourceSpecification_communicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_MemoryHierarchyLinkingResourceSpecification_communicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification_feature",
                        "_UI_MemoryHierarchyLinkingResourceSpecification_type"),
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__COMMUNICATION_LINKING_RESOURCE_TYPE_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Number Of Replicas feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addNumberOfReplicasPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_MemoryHierarchyLinkingResourceSpecification_numberOfReplicas_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_MemoryHierarchyLinkingResourceSpecification_numberOfReplicas_feature",
                        "_UI_MemoryHierarchyLinkingResourceSpecification_type"),
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS,
                true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
                    MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION);
            this.childrenFeatures.add(
                    MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION);
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
     * This returns MemoryHierarchyLinkingResourceSpecification.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/MemoryHierarchyLinkingResourceSpecification"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((MemoryHierarchyLinkingResourceSpecification) object).getId();
        return label == null || label.length() == 0
                ? this.getString("_UI_MemoryHierarchyLinkingResourceSpecification_type")
                : this.getString("_UI_MemoryHierarchyLinkingResourceSpecification_type") + " " + label;
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

        switch (notification.getFeatureID(MemoryHierarchyLinkingResourceSpecification.class)) {
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
        case MemoryHierarchyPackage.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION:
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
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                CoreFactory.eINSTANCE.createPCMRandomVariable()));

        newChildDescriptors.add(this.createChildParameter(
                MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION,
                CoreFactory.eINSTANCE.createPCMRandomVariable()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getCreateChildText(final Object owner, final Object feature, final Object child,
            final Collection<?> selection) {
        final Object childFeature = feature;
        final Object childObject = child;

        final boolean qualify = childFeature == MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__LATENCY_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION
                || childFeature == MemoryHierarchyPackage.Literals.MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION__THROUGHPUT_MEMORY_HIERARCHY_LINKING_RESOURCE_SPECIFICATION;

        if (qualify) {
            return this.getString("_UI_CreateChild_text2", new Object[] { this.getTypeText(childObject),
                    this.getFeatureText(childFeature), this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
    }

}
