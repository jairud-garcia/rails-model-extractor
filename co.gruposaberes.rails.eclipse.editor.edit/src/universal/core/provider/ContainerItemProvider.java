/**
 */
package universal.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import universal.OOP.OOPFactory;

import universal.core.Container;
import universal.core.CoreFactory;
import universal.core.CorePackage;

import universal.microservice.MicroserviceFactory;

import universal.oracleforms.OracleformsFactory;

import universal.rails.RailsFactory;

import universal.visualization.VisualizationFactory;

/**
 * This is the item provider adapter for a {@link universal.core.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.CONTAINER__INNER_ELEMENTS);
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
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Container)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;
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

		switch (notification.getFeatureID(Container.class)) {
			case CorePackage.CONTAINER__INNER_ELEMENTS:
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
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 CoreFactory.eINSTANCE.createSimpleElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 CoreFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OracleformsFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OracleformsFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OracleformsFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OOPFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OOPFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OOPFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 OOPFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 MicroserviceFactory.eINSTANCE.createSessionToEntityCluster()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 MicroserviceFactory.eINSTANCE.createMicroservice()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDiagramElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVShape()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVCircule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVTriangle()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDiamond()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVQuadrangle()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVDot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 VisualizationFactory.eINSTANCE.createVEllipse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTAINER__INNER_ELEMENTS,
				 RailsFactory.eINSTANCE.createRailsAttribute()));
	}

}
