/**
 */
package universal.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import universal.OOP.OOPFactory;

import universal.core.Application;
import universal.core.CoreFactory;
import universal.core.CorePackage;

import universal.microservice.MicroserviceFactory;

import universal.oracleforms.OracleformsFactory;

import universal.rails.RailsFactory;

import universal.visualization.VisualizationFactory;

/**
 * This is the item provider adapter for a {@link universal.core.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Application_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_name_feature", "_UI_Application_type"),
				 CorePackage.Literals.APPLICATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS);
			childrenFeatures.add(CorePackage.Literals.APPLICATION__COMPLEX_RELATIONSHIPS);
			childrenFeatures.add(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Application_type") :
			getString("_UI_Application_type") + " " + label;
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

		switch (notification.getFeatureID(Application.class)) {
			case CorePackage.APPLICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.APPLICATION__BASIC_ELEMENTS:
			case CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS:
			case CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 CoreFactory.eINSTANCE.createSimpleElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 CoreFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OracleformsFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OracleformsFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OracleformsFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OOPFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OOPFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OOPFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 OOPFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 MicroserviceFactory.eINSTANCE.createSessionToEntityCluster()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 MicroserviceFactory.eINSTANCE.createMicroservice()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDiagramElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVShape()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVCircule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVTriangle()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDiamond()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVQuadrangle()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVEllipse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__BASIC_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__COMPLEX_RELATIONSHIPS,
				 CoreFactory.eINSTANCE.createRelationContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__COMPLEX_RELATIONSHIPS,
				 OracleformsFactory.eINSTANCE.createMasterDetailRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 CoreFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OracleformsFactory.eINSTANCE.createModuleRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OracleformsFactory.eINSTANCE.createFormCallRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OracleformsFactory.eINSTANCE.createDetailTableRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OracleformsFactory.eINSTANCE.createSingleTableRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OracleformsFactory.eINSTANCE.createPLSQLRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OOPFactory.eINSTANCE.createTypeRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OOPFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OOPFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OOPFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 OOPFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 MicroserviceFactory.eINSTANCE.createClusterRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 MicroserviceFactory.eINSTANCE.createMicroserviceRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVConnectorElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVImplements()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVDependecy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVAgregation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 VisualizationFactory.eINSTANCE.createVComposition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.APPLICATION__SIMPLE_RELATIONSHIPS,
				 RailsFactory.eINSTANCE.createRailsAssociation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UniversalEditPlugin.INSTANCE;
	}

}
