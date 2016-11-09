/**
 */
package railsTarget.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import railsTarget.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see railsTarget.RailsTargetPackage
 * @generated
 */
public class RailsTargetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RailsTargetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsTargetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RailsTargetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailsTargetSwitch<Adapter> modelSwitch =
		new RailsTargetSwitch<Adapter>() {
			@Override
			public Adapter caseRailsAttribute(RailsAttribute object) {
				return createRailsAttributeAdapter();
			}
			@Override
			public Adapter caseRailsMethod(RailsMethod object) {
				return createRailsMethodAdapter();
			}
			@Override
			public Adapter caseRailsClass(RailsClass object) {
				return createRailsClassAdapter();
			}
			@Override
			public Adapter caseRailsAssociation(RailsAssociation object) {
				return createRailsAssociationAdapter();
			}
			@Override
			public Adapter caseRailsNamespace(RailsNamespace object) {
				return createRailsNamespaceAdapter();
			}
			@Override
			public Adapter caseRailsApplication(RailsApplication object) {
				return createRailsApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link railsTarget.RailsAttribute <em>Rails Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see railsTarget.RailsAttribute
	 * @generated
	 */
	public Adapter createRailsAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link railsTarget.RailsMethod <em>Rails Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see railsTarget.RailsMethod
	 * @generated
	 */
	public Adapter createRailsMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link railsTarget.RailsClass <em>Rails Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see railsTarget.RailsClass
	 * @generated
	 */
	public Adapter createRailsClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link railsTarget.RailsAssociation <em>Rails Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see railsTarget.RailsAssociation
	 * @generated
	 */
	public Adapter createRailsAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link railsTarget.RailsNamespace <em>Rails Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see railsTarget.RailsNamespace
	 * @generated
	 */
	public Adapter createRailsNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link railsTarget.RailsApplication <em>Rails Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see railsTarget.RailsApplication
	 * @generated
	 */
	public Adapter createRailsApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RailsTargetAdapterFactory
