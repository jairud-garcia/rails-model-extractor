/**
 */
package railsTarget.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import railsTarget.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsTargetFactoryImpl extends EFactoryImpl implements RailsTargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RailsTargetFactory init() {
		try {
			RailsTargetFactory theRailsTargetFactory = (RailsTargetFactory)EPackage.Registry.INSTANCE.getEFactory(RailsTargetPackage.eNS_URI);
			if (theRailsTargetFactory != null) {
				return theRailsTargetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RailsTargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsTargetFactoryImpl() {
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
			case RailsTargetPackage.RAILS_ATTRIBUTE: return createRailsAttribute();
			case RailsTargetPackage.RAILS_METHOD: return createRailsMethod();
			case RailsTargetPackage.RAILS_CLASS: return createRailsClass();
			case RailsTargetPackage.RAILS_ASSOCIATION: return createRailsAssociation();
			case RailsTargetPackage.RAILS_NAMESPACE: return createRailsNamespace();
			case RailsTargetPackage.RAILS_APPLICATION: return createRailsApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RailsTargetPackage.RAILS_DATA_TYPE:
				return createRailsDataTypeFromString(eDataType, initialValue);
			case RailsTargetPackage.RAILS_METHOD_TYPE:
				return createRailsMethodTypeFromString(eDataType, initialValue);
			case RailsTargetPackage.RAILS_CLASS_TYPE:
				return createRailsClassTypeFromString(eDataType, initialValue);
			case RailsTargetPackage.RAILS_CARDINALITY:
				return createRailsCardinalityFromString(eDataType, initialValue);
			case RailsTargetPackage.RAILS_ASSOCIATION_TYPE:
				return createRailsAssociationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RailsTargetPackage.RAILS_DATA_TYPE:
				return convertRailsDataTypeToString(eDataType, instanceValue);
			case RailsTargetPackage.RAILS_METHOD_TYPE:
				return convertRailsMethodTypeToString(eDataType, instanceValue);
			case RailsTargetPackage.RAILS_CLASS_TYPE:
				return convertRailsClassTypeToString(eDataType, instanceValue);
			case RailsTargetPackage.RAILS_CARDINALITY:
				return convertRailsCardinalityToString(eDataType, instanceValue);
			case RailsTargetPackage.RAILS_ASSOCIATION_TYPE:
				return convertRailsAssociationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public RailsMethod createRailsMethod() {
		RailsMethodImpl railsMethod = new RailsMethodImpl();
		return railsMethod;
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
	public RailsApplication createRailsApplication() {
		RailsApplicationImpl railsApplication = new RailsApplicationImpl();
		return railsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsDataType createRailsDataTypeFromString(EDataType eDataType, String initialValue) {
		RailsDataType result = RailsDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailsDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsMethodType createRailsMethodTypeFromString(EDataType eDataType, String initialValue) {
		RailsMethodType result = RailsMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailsMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClassType createRailsClassTypeFromString(EDataType eDataType, String initialValue) {
		RailsClassType result = RailsClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailsClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsCardinality createRailsCardinalityFromString(EDataType eDataType, String initialValue) {
		RailsCardinality result = RailsCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailsCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsAssociationType createRailsAssociationTypeFromString(EDataType eDataType, String initialValue) {
		RailsAssociationType result = RailsAssociationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailsAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsTargetPackage getRailsTargetPackage() {
		return (RailsTargetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RailsTargetPackage getPackage() {
		return RailsTargetPackage.eINSTANCE;
	}

} //RailsTargetFactoryImpl
