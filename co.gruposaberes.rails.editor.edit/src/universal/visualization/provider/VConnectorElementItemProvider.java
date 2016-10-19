/**
 */
package universal.visualization.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import universal.core.CorePackage;

import universal.visualization.VConnectorElement;
import universal.visualization.VisualizationPackage;

/**
 * This is the item provider adapter for a {@link universal.visualization.VConnectorElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VConnectorElementItemProvider extends VDrawableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConnectorElementItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addMeasurantPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addLineTypePropertyDescriptor(object);
			addRoutingTypePropertyDescriptor(object);
			addArrowTypeForSourcePropertyDescriptor(object);
			addArrowTypeForTargetPropertyDescriptor(object);
			addSourceIDPropertyDescriptor(object);
			addTargetIDPropertyDescriptor(object);
			addInvocationsPropertyDescriptor(object);
			addConnectorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Relation_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Relation_source_feature", "_UI_Relation_type"),
				 CorePackage.Literals.RELATION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Relation_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Relation_target_feature", "_UI_Relation_type"),
				 CorePackage.Literals.RELATION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measurant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasurantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Relation_measurant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Relation_measurant_feature", "_UI_Relation_type"),
				 CorePackage.Literals.RELATION__MEASURANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_name_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_lineType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_lineType_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__LINE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Routing Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_routingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_routingType_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__ROUTING_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arrow Type For Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrowTypeForSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_arrowTypeForSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_arrowTypeForSource_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arrow Type For Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrowTypeForTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_arrowTypeForTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_arrowTypeForTarget_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_sourceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_sourceID_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__SOURCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_targetID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_targetID_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__TARGET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invocations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvocationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_invocations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_invocations_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__INVOCATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VConnectorElement_connectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VConnectorElement_connectors_feature", "_UI_VConnectorElement_type"),
				 VisualizationPackage.Literals.VCONNECTOR_ELEMENT__CONNECTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns VConnectorElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VConnectorElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VConnectorElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VConnectorElement_type") :
			getString("_UI_VConnectorElement_type") + " " + label;
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

		switch (notification.getFeatureID(VConnectorElement.class)) {
			case VisualizationPackage.VCONNECTOR_ELEMENT__NAME:
			case VisualizationPackage.VCONNECTOR_ELEMENT__LINE_TYPE:
			case VisualizationPackage.VCONNECTOR_ELEMENT__ROUTING_TYPE:
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE:
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET:
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE_ID:
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET_ID:
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

}
