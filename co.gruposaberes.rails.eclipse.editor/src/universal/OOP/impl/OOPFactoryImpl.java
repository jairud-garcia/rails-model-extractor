/**
 */
package universal.OOP.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universal.OOP.CalculatedCouplingMeasure;
import universal.OOP.Composition;
import universal.OOP.CouplingBetweenObjectMeasure;
import universal.OOP.Dependency;
import universal.OOP.Generalization;
import universal.OOP.Interface;
import universal.OOP.Method;
import universal.OOP.NumberOfClassesMeasure;
import universal.OOP.NumberOfContainmentsMeasure;
import universal.OOP.NumberOfUsesMeasure;
import universal.OOP.OOPApplication;
import universal.OOP.OOPFactory;
import universal.OOP.OOPPackage;
import universal.OOP.Realization;
import universal.OOP.Type;
import universal.OOP.TypeRelationship;
import universal.OOP.WeigthedMethodsPerClassMeasure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OOPFactoryImpl extends EFactoryImpl implements OOPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OOPFactory init() {
		try {
			OOPFactory theOOPFactory = (OOPFactory)EPackage.Registry.INSTANCE.getEFactory(OOPPackage.eNS_URI);
			if (theOOPFactory != null) {
				return theOOPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OOPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPFactoryImpl() {
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
			case OOPPackage.METHOD: return createMethod();
			case OOPPackage.TYPE: return createType();
			case OOPPackage.CLASS: return createClass();
			case OOPPackage.INTERFACE: return createInterface();
			case OOPPackage.OOP_APPLICATION: return createOOPApplication();
			case OOPPackage.TYPE_RELATIONSHIP: return createTypeRelationship();
			case OOPPackage.GENERALIZATION: return createGeneralization();
			case OOPPackage.REALIZATION: return createRealization();
			case OOPPackage.COMPOSITION: return createComposition();
			case OOPPackage.DEPENDENCY: return createDependency();
			case OOPPackage.WEIGTHED_METHODS_PER_CLASS_MEASURE: return createWeigthedMethodsPerClassMeasure();
			case OOPPackage.NUMBER_OF_CLASSES_MEASURE: return createNumberOfClassesMeasure();
			case OOPPackage.COUPLING_BETWEEN_OBJECT_MEASURE: return createCouplingBetweenObjectMeasure();
			case OOPPackage.NUMBER_OF_USES_MEASURE: return createNumberOfUsesMeasure();
			case OOPPackage.CALCULATED_COUPLING_MEASURE: return createCalculatedCouplingMeasure();
			case OOPPackage.NUMBER_OF_CONTAINMENTS_MEASURE: return createNumberOfContainmentsMeasure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public universal.OOP.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPApplication createOOPApplication() {
		OOPApplicationImpl oopApplication = new OOPApplicationImpl();
		return oopApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelationship createTypeRelationship() {
		TypeRelationshipImpl typeRelationship = new TypeRelationshipImpl();
		return typeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeigthedMethodsPerClassMeasure createWeigthedMethodsPerClassMeasure() {
		WeigthedMethodsPerClassMeasureImpl weigthedMethodsPerClassMeasure = new WeigthedMethodsPerClassMeasureImpl();
		return weigthedMethodsPerClassMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfClassesMeasure createNumberOfClassesMeasure() {
		NumberOfClassesMeasureImpl numberOfClassesMeasure = new NumberOfClassesMeasureImpl();
		return numberOfClassesMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouplingBetweenObjectMeasure createCouplingBetweenObjectMeasure() {
		CouplingBetweenObjectMeasureImpl couplingBetweenObjectMeasure = new CouplingBetweenObjectMeasureImpl();
		return couplingBetweenObjectMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfUsesMeasure createNumberOfUsesMeasure() {
		NumberOfUsesMeasureImpl numberOfUsesMeasure = new NumberOfUsesMeasureImpl();
		return numberOfUsesMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedCouplingMeasure createCalculatedCouplingMeasure() {
		CalculatedCouplingMeasureImpl calculatedCouplingMeasure = new CalculatedCouplingMeasureImpl();
		return calculatedCouplingMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfContainmentsMeasure createNumberOfContainmentsMeasure() {
		NumberOfContainmentsMeasureImpl numberOfContainmentsMeasure = new NumberOfContainmentsMeasureImpl();
		return numberOfContainmentsMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPPackage getOOPPackage() {
		return (OOPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OOPPackage getPackage() {
		return OOPPackage.eINSTANCE;
	}

} //OOPFactoryImpl
