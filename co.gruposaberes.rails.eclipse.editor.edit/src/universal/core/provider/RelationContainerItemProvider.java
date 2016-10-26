/**
 */
package universal.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import universal.OOP.OOPFactory;

import universal.core.CoreFactory;
import universal.core.CorePackage;
import universal.core.RelationContainer;

import universal.microservice.MicroserviceFactory;

import universal.oracleforms.OracleformsFactory;

import universal.rails.RailsFactory;

import universal.visualization.VisualizationFactory;

/**
 * This is the item provider adapter for a {@link universal.core.RelationContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationContainerItemProvider 
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
	public RelationContainerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CorePackage.Literals.RELATION_CONTAINER__RELATIONS);
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
	 * This returns RelationContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RelationContainer_type");
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

		switch (notification.getFeatureID(RelationContainer.class)) {
			case CorePackage.RELATION_CONTAINER__RELATIONS:
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
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 CoreFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OracleformsFactory.eINSTANCE.createModuleRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OracleformsFactory.eINSTANCE.createFormCallRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OracleformsFactory.eINSTANCE.createDetailTableRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OracleformsFactory.eINSTANCE.createSingleTableRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OracleformsFactory.eINSTANCE.createPLSQLRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OOPFactory.eINSTANCE.createTypeRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OOPFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OOPFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OOPFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 OOPFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 MicroserviceFactory.eINSTANCE.createClusterRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 MicroserviceFactory.eINSTANCE.createMicroserviceRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVConnectorElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVImplements()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVDependecy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVAgregation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
				 VisualizationFactory.eINSTANCE.createVComposition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RELATION_CONTAINER__RELATIONS,
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
