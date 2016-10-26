/**
 */
package universal.rails.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universal.rails.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsFactoryImpl extends EFactoryImpl implements RailsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RailsFactory init() {
		try {
			RailsFactory theRailsFactory = (RailsFactory)EPackage.Registry.INSTANCE.getEFactory(RailsPackage.eNS_URI);
			if (theRailsFactory != null) {
				return theRailsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RailsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RailsPackage.RAILS_APPLICATION: return createRailsApplication();
			case RailsPackage.RAILS_ASSOCIATION: return createRailsAssociation();
			case RailsPackage.RAILS_NAMESPACE: return createRailsNamespace();
			case RailsPackage.RAILS_CLASS: return createRailsClass();
			case RailsPackage.RAILS_METHOD: return createRailsMethod();
			case RailsPackage.RAILS_ATTRIBUTE: return createRailsAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsApplication createRailsApplication() {
		RailsApplicationImpl railsApplication = new RailsApplicationImpl();
		return railsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsAssociation createRailsAssociation() {
		RailsAssociationImpl railsAssociation = new RailsAssociationImpl();
		return railsAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsNamespace createRailsNamespace() {
		RailsNamespaceImpl railsNamespace = new RailsNamespaceImpl();
		return railsNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClass createRailsClass() {
		RailsClassImpl railsClass = new RailsClassImpl();
		return railsClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsMethod createRailsMethod() {
		RailsMethodImpl railsMethod = new RailsMethodImpl();
		return railsMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsAttribute createRailsAttribute() {
		RailsAttributeImpl railsAttribute = new RailsAttributeImpl();
		return railsAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsPackage getRailsPackage() {
		return (RailsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RailsPackage getPackage() {
		return RailsPackage.eINSTANCE;
	}

} //RailsFactoryImpl
