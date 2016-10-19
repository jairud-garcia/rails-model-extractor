/**
 */
package universal.OOP.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
import universal.OOP.OOPPackage;
import universal.OOP.Realization;
import universal.OOP.Type;
import universal.OOP.TypeRelationship;
import universal.OOP.WeigthedMethodsPerClassMeasure;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see universal.OOP.OOPPackage
 * @generated
 */
public class OOPValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OOPValidator INSTANCE = new OOPValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "universal.OOP";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OOPPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OOPPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case OOPPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case OOPPackage.CLASS:
				return validateClass((universal.OOP.Class)value, diagnostics, context);
			case OOPPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case OOPPackage.OOP_APPLICATION:
				return validateOOPApplication((OOPApplication)value, diagnostics, context);
			case OOPPackage.TYPE_RELATIONSHIP:
				return validateTypeRelationship((TypeRelationship)value, diagnostics, context);
			case OOPPackage.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case OOPPackage.REALIZATION:
				return validateRealization((Realization)value, diagnostics, context);
			case OOPPackage.COMPOSITION:
				return validateComposition((Composition)value, diagnostics, context);
			case OOPPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case OOPPackage.WEIGTHED_METHODS_PER_CLASS_MEASURE:
				return validateWeigthedMethodsPerClassMeasure((WeigthedMethodsPerClassMeasure)value, diagnostics, context);
			case OOPPackage.NUMBER_OF_CLASSES_MEASURE:
				return validateNumberOfClassesMeasure((NumberOfClassesMeasure)value, diagnostics, context);
			case OOPPackage.COUPLING_BETWEEN_OBJECT_MEASURE:
				return validateCouplingBetweenObjectMeasure((CouplingBetweenObjectMeasure)value, diagnostics, context);
			case OOPPackage.NUMBER_OF_USES_MEASURE:
				return validateNumberOfUsesMeasure((NumberOfUsesMeasure)value, diagnostics, context);
			case OOPPackage.CALCULATED_COUPLING_MEASURE:
				return validateCalculatedCouplingMeasure((CalculatedCouplingMeasure)value, diagnostics, context);
			case OOPPackage.NUMBER_OF_CONTAINMENTS_MEASURE:
				return validateNumberOfContainmentsMeasure((NumberOfContainmentsMeasure)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(method, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_TypeRule_MustContaintMethod(type, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TypeRule_MustContaintMethod constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPE__TYPE_RULE_MUST_CONTAINT_METHOD__EEXPRESSION = "self.innerElements->forAll(mt | mt.oclIsTypeOf(Method) = true)";

	/**
	 * Validates the TypeRule_MustContaintMethod constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_TypeRule_MustContaintMethod(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.TYPE,
				 type,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TypeRule_MustContaintMethod",
				 TYPE__TYPE_RULE_MUST_CONTAINT_METHOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(universal.OOP.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_TypeRule_MustContaintMethod(class_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_TypeRule_MustContaintMethod(interface_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOOPApplication(OOPApplication oopApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oopApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oopApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateOOPApplication_OOPApplication_MustContaintTypes(oopApplication, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OOPApplication_MustContaintTypes constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OOP_APPLICATION__OOP_APPLICATION_MUST_CONTAINT_TYPES__EEXPRESSION = "self.basicElements->forAll(el | el.oclIsTypeOf(Type) = true)";

	/**
	 * Validates the OOPApplication_MustContaintTypes constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOOPApplication_OOPApplication_MustContaintTypes(OOPApplication oopApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.OOP_APPLICATION,
				 oopApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OOPApplication_MustContaintTypes",
				 OOP_APPLICATION__OOP_APPLICATION_MUST_CONTAINT_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRelationship(TypeRelationship typeRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typeRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_SourceMustBeType(typeRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_TargetsMustBeTypes(typeRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeRelationshipRule_SourceMustBeType constraint of '<em>Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPE_RELATIONSHIP__TYPE_RELATIONSHIP_RULE_SOURCE_MUST_BE_TYPE__EEXPRESSION = "self.source.oclIsKindOf(Type) = true";

	/**
	 * Validates the typeRelationshipRule_SourceMustBeType constraint of '<em>Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRelationship_typeRelationshipRule_SourceMustBeType(TypeRelationship typeRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.TYPE_RELATIONSHIP,
				 typeRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "typeRelationshipRule_SourceMustBeType",
				 TYPE_RELATIONSHIP__TYPE_RELATIONSHIP_RULE_SOURCE_MUST_BE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the typeRelationshipRule_TargetsMustBeTypes constraint of '<em>Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPE_RELATIONSHIP__TYPE_RELATIONSHIP_RULE_TARGETS_MUST_BE_TYPES__EEXPRESSION = "self.target.oclIsKindOf(Type) = true";

	/**
	 * Validates the typeRelationshipRule_TargetsMustBeTypes constraint of '<em>Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRelationship_typeRelationshipRule_TargetsMustBeTypes(TypeRelationship typeRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.TYPE_RELATIONSHIP,
				 typeRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "typeRelationshipRule_TargetsMustBeTypes",
				 TYPE_RELATIONSHIP__TYPE_RELATIONSHIP_RULE_TARGETS_MUST_BE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_SourceMustBeType(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_TargetsMustBeTypes(generalization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization(Realization realization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_SourceMustBeType(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_TargetsMustBeTypes(realization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_SourceMustBeType(composition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_TargetsMustBeTypes(composition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_SourceMustBeType(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRelationship_typeRelationshipRule_TargetsMustBeTypes(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_DependencyRule_SourceClassMustBeType(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_DependencyRule_TargetClassMustBeType(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_DependencyRule_MethodInvoked(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_DependencyRule_MethodInvoker(dependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DependencyRule_SourceClassMustBeType constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPENDENCY__DEPENDENCY_RULE_SOURCE_CLASS_MUST_BE_TYPE__EEXPRESSION = "self.source.oclIsTypeOf(Type) = true";

	/**
	 * Validates the DependencyRule_SourceClassMustBeType constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_DependencyRule_SourceClassMustBeType(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.DEPENDENCY,
				 dependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DependencyRule_SourceClassMustBeType",
				 DEPENDENCY__DEPENDENCY_RULE_SOURCE_CLASS_MUST_BE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DependencyRule_TargetClassMustBeType constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPENDENCY__DEPENDENCY_RULE_TARGET_CLASS_MUST_BE_TYPE__EEXPRESSION = "self.target.oclIsTypeOf(Type) = true";

	/**
	 * Validates the DependencyRule_TargetClassMustBeType constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_DependencyRule_TargetClassMustBeType(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.DEPENDENCY,
				 dependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DependencyRule_TargetClassMustBeType",
				 DEPENDENCY__DEPENDENCY_RULE_TARGET_CLASS_MUST_BE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DependencyRule_MethodInvoked constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPENDENCY__DEPENDENCY_RULE_METHOD_INVOKED__EEXPRESSION = "self.methodInvokedFromSourceClass.oclIsTypeOf(Method) = true";

	/**
	 * Validates the DependencyRule_MethodInvoked constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_DependencyRule_MethodInvoked(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.DEPENDENCY,
				 dependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DependencyRule_MethodInvoked",
				 DEPENDENCY__DEPENDENCY_RULE_METHOD_INVOKED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DependencyRule_MethodInvoker constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPENDENCY__DEPENDENCY_RULE_METHOD_INVOKER__EEXPRESSION = "self.methodInvokerFromTargetClass.oclIsTypeOf(Method) = true";

	/**
	 * Validates the DependencyRule_MethodInvoker constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_DependencyRule_MethodInvoker(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OOPPackage.Literals.DEPENDENCY,
				 dependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DependencyRule_MethodInvoker",
				 DEPENDENCY__DEPENDENCY_RULE_METHOD_INVOKER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeigthedMethodsPerClassMeasure(WeigthedMethodsPerClassMeasure weigthedMethodsPerClassMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weigthedMethodsPerClassMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfClassesMeasure(NumberOfClassesMeasure numberOfClassesMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberOfClassesMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCouplingBetweenObjectMeasure(CouplingBetweenObjectMeasure couplingBetweenObjectMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(couplingBetweenObjectMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfUsesMeasure(NumberOfUsesMeasure numberOfUsesMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberOfUsesMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatedCouplingMeasure(CalculatedCouplingMeasure calculatedCouplingMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatedCouplingMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfContainmentsMeasure(NumberOfContainmentsMeasure numberOfContainmentsMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberOfContainmentsMeasure, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OOPValidator
