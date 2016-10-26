/**
 */
package universal.rails.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import universal.rails.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see universal.rails.RailsPackage
 * @generated
 */
public class RailsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RailsValidator INSTANCE = new RailsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "universal.rails";

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
	public RailsValidator() {
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
	  return RailsPackage.eINSTANCE;
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
			case RailsPackage.RAILS_APPLICATION:
				return validateRailsApplication((RailsApplication)value, diagnostics, context);
			case RailsPackage.RAILS_ASSOCIATION:
				return validateRailsAssociation((RailsAssociation)value, diagnostics, context);
			case RailsPackage.RAILS_NAMESPACE:
				return validateRailsNamespace((RailsNamespace)value, diagnostics, context);
			case RailsPackage.RAILS_CLASS:
				return validateRailsClass((RailsClass)value, diagnostics, context);
			case RailsPackage.RAILS_METHOD:
				return validateRailsMethod((RailsMethod)value, diagnostics, context);
			case RailsPackage.RAILS_ATTRIBUTE:
				return validateRailsAttribute((RailsAttribute)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsApplication(RailsApplication railsApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(railsApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsApplication_simpleRelationShipsInvariant(railsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsApplication_basicElementsInvariant(railsApplication, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the simpleRelationShipsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_APPLICATION__SIMPLE_RELATION_SHIPS_INVARIANT__EEXPRESSION = "self.simpleRelationships->forAll(e | e.oclIsTypeOf(RailsAssociation)=true)";

	/**
	 * Validates the simpleRelationShipsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsApplication_simpleRelationShipsInvariant(RailsApplication railsApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_APPLICATION,
				 railsApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "simpleRelationShipsInvariant",
				 RAILS_APPLICATION__SIMPLE_RELATION_SHIPS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the basicElementsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_APPLICATION__BASIC_ELEMENTS_INVARIANT__EEXPRESSION = "self.basicElements->forAll(\n" +
		"       \t\t\te | e.oclIsTypeOf(RailsMethod)=true or e.oclIsTypeOf(RailsAttribute)=true or e.oclIsTypeOf(RailsClass)=true or e.oclIsTypeOf(RailsNamespace)=true  \t\t\t\n" +
		"       \t\t)";

	/**
	 * Validates the basicElementsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsApplication_basicElementsInvariant(RailsApplication railsApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_APPLICATION,
				 railsApplication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "basicElementsInvariant",
				 RAILS_APPLICATION__BASIC_ELEMENTS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsAssociation(RailsAssociation railsAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(railsAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsAssociation_associationTypeInvariant(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsAssociation_sourceInvariant(railsAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsAssociation_targetInvariant(railsAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the associationTypeInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_ASSOCIATION__ASSOCIATION_TYPE_INVARIANT__EEXPRESSION = "self.associationType = null or \n" +
		"\t\t\t\tself.associationType = 'M2M' or self.associationType = 'O2M' or self.associationType = 'O2O'";

	/**
	 * Validates the associationTypeInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsAssociation_associationTypeInvariant(RailsAssociation railsAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_ASSOCIATION,
				 railsAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "associationTypeInvariant",
				 RAILS_ASSOCIATION__ASSOCIATION_TYPE_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the sourceInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_ASSOCIATION__SOURCE_INVARIANT__EEXPRESSION = "self.source.oclIsTypeOf(RailsClass)=true";

	/**
	 * Validates the sourceInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsAssociation_sourceInvariant(RailsAssociation railsAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_ASSOCIATION,
				 railsAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceInvariant",
				 RAILS_ASSOCIATION__SOURCE_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_ASSOCIATION__TARGET_INVARIANT__EEXPRESSION = "self.target.oclIsTypeOf(RailsClass)=true";

	/**
	 * Validates the targetInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsAssociation_targetInvariant(RailsAssociation railsAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_ASSOCIATION,
				 railsAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetInvariant",
				 RAILS_ASSOCIATION__TARGET_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsNamespace(RailsNamespace railsNamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(railsNamespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(railsNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsNamespace_innerElementsInvariant(railsNamespace, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the innerElementsInvariant constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_NAMESPACE__INNER_ELEMENTS_INVARIANT__EEXPRESSION = "self.innerElements->forAll(\n" +
		"\t\t\t\te|e.oclIsTypeOf(RailsClass)=true or e.oclIsTypeOf(RailsNamespace)=true\n" +
		"\t\t\t)";

	/**
	 * Validates the innerElementsInvariant constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsNamespace_innerElementsInvariant(RailsNamespace railsNamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_NAMESPACE,
				 railsNamespace,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "innerElementsInvariant",
				 RAILS_NAMESPACE__INNER_ELEMENTS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsClass(RailsClass railsClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(railsClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(railsClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsClass_innerElementsInvariant(railsClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the innerElementsInvariant constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_CLASS__INNER_ELEMENTS_INVARIANT__EEXPRESSION = "self.innerElements->forAll(\n" +
		"\t\t\t\te|e.oclIsTypeOf(RailsMethod)=true or e.oclIsTypeOf(RailsAttribute)=true\n" +
		"\t\t\t)";

	/**
	 * Validates the innerElementsInvariant constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsClass_innerElementsInvariant(RailsClass railsClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_CLASS,
				 railsClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "innerElementsInvariant",
				 RAILS_CLASS__INNER_ELEMENTS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsMethod(RailsMethod railsMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(railsMethod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(railsMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateRailsMethod_methodTypeInvariant(railsMethod, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the methodTypeInvariant constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAILS_METHOD__METHOD_TYPE_INVARIANT__EEXPRESSION = "self.methodType = 'instance' or self.methodType = 'class'";

	/**
	 * Validates the methodTypeInvariant constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsMethod_methodTypeInvariant(RailsMethod railsMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RAILS_METHOD,
				 railsMethod,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "methodTypeInvariant",
				 RAILS_METHOD__METHOD_TYPE_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRailsAttribute(RailsAttribute railsAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(railsAttribute, diagnostics, context);
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

} //RailsValidator
