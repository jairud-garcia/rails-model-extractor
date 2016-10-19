/**
 */
package universal.microservice.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import universal.core.provider.SimpleElementItemProvider;
import universal.core.provider.Universal3EditPlugin;

import universal.microservice.MicroservicePackage;
import universal.microservice.SessionToEntityCluster;

/**
 * This is the item provider adapter for a {@link universal.microservice.SessionToEntityCluster} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SessionToEntityClusterItemProvider extends SimpleElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionToEntityClusterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNumberOfTypesPropertyDescriptor(object);
			addNumberOfLinesPropertyDescriptor(object);
			addTypeReferencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Number Of Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionToEntityCluster_numberOfTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionToEntityCluster_numberOfTypes_feature", "_UI_SessionToEntityCluster_type"),
				 MicroservicePackage.Literals.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Lines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfLinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionToEntityCluster_numberOfLines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionToEntityCluster_numberOfLines_feature", "_UI_SessionToEntityCluster_type"),
				 MicroservicePackage.Literals.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SessionToEntityCluster_typeReferences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SessionToEntityCluster_typeReferences_feature", "_UI_SessionToEntityCluster_type"),
				 MicroservicePackage.Literals.SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SessionToEntityCluster.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SessionToEntityCluster"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SessionToEntityCluster)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SessionToEntityCluster_type") :
			getString("_UI_SessionToEntityCluster_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SessionToEntityCluster.class)) {
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES:
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Universal3EditPlugin.INSTANCE;
	}

}
