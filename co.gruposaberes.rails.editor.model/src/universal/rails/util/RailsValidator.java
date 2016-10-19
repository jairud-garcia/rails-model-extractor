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
			case RailsPackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case RailsPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case RailsPackage.NAMESPACE:
				return validateNamespace((Namespace)value, diagnostics, context);
			case RailsPackage.RUBY_CLASS:
				return validateRubyClass((RubyClass)value, diagnostics, context);
			case RailsPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case RailsPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_simpleRelationShipsInvariant(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_basicElementsInvariant(application, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the simpleRelationShipsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String APPLICATION__SIMPLE_RELATION_SHIPS_INVARIANT__EEXPRESSION = "self.simpleRelationships->forAll(e | e.oclIsTypeOf(Association)=true)";

	/**
	 * Validates the simpleRelationShipsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_simpleRelationShipsInvariant(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.APPLICATION,
				 application,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "simpleRelationShipsInvariant",
				 APPLICATION__SIMPLE_RELATION_SHIPS_INVARIANT__EEXPRESSION,
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
	protected static final String APPLICATION__BASIC_ELEMENTS_INVARIANT__EEXPRESSION = "self.basicElements->forAll(\n" +
		"       \t\t\te | e.oclIsTypeOf(Method)=true or e.oclIsTypeOf(Attribute)=true or e.oclIsTypeOf(RubyClass)=true or e.oclIsTypeOf(Namespace)=true  \t\t\t\n" +
		"       \t\t)";

	/**
	 * Validates the basicElementsInvariant constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_basicElementsInvariant(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.APPLICATION,
				 application,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "basicElementsInvariant",
				 APPLICATION__BASIC_ELEMENTS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_associationTypeInvariant(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_sourceInvariant(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_targetInvariant(association, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the associationTypeInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__ASSOCIATION_TYPE_INVARIANT__EEXPRESSION = "self.associationType = null or \n" +
		"\t\t\t\tself.associationType = 'M2M' or self.associationType = 'O2M' or self.associationType = 'O2O'";

	/**
	 * Validates the associationTypeInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_associationTypeInvariant(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "associationTypeInvariant",
				 ASSOCIATION__ASSOCIATION_TYPE_INVARIANT__EEXPRESSION,
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
	protected static final String ASSOCIATION__SOURCE_INVARIANT__EEXPRESSION = "self.source.oclIsTypeOf(RubyClass)=true";

	/**
	 * Validates the sourceInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_sourceInvariant(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceInvariant",
				 ASSOCIATION__SOURCE_INVARIANT__EEXPRESSION,
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
	protected static final String ASSOCIATION__TARGET_INVARIANT__EEXPRESSION = "self.target.oclIsTypeOf(RubyClass)=true";

	/**
	 * Validates the targetInvariant constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_targetInvariant(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetInvariant",
				 ASSOCIATION__TARGET_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_innerElementsInvariant(namespace, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the innerElementsInvariant constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMESPACE__INNER_ELEMENTS_INVARIANT__EEXPRESSION = "self.innerElements->forAll(\n" +
		"\t\t\t\te|e.oclIsTypeOf(RubyClass)=true or e.oclIsTypeOf(Namespace)=true\n" +
		"\t\t\t)";

	/**
	 * Validates the innerElementsInvariant constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_innerElementsInvariant(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.NAMESPACE,
				 namespace,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "innerElementsInvariant",
				 NAMESPACE__INNER_ELEMENTS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyClass(RubyClass rubyClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rubyClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rubyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRubyClass_innerElementsInvariant(rubyClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the innerElementsInvariant constraint of '<em>Ruby Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RUBY_CLASS__INNER_ELEMENTS_INVARIANT__EEXPRESSION = "self.innerElements->forAll(\n" +
		"\t\t\t\te|e.oclIsTypeOf(Method)=true or e.oclIsTypeOf(Attribute)=true\n" +
		"\t\t\t)";

	/**
	 * Validates the innerElementsInvariant constraint of '<em>Ruby Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyClass_innerElementsInvariant(RubyClass rubyClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.RUBY_CLASS,
				 rubyClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "innerElementsInvariant",
				 RUBY_CLASS__INNER_ELEMENTS_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(method, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateMethod_methodTypeInvariant(method, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the methodTypeInvariant constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METHOD__METHOD_TYPE_INVARIANT__EEXPRESSION = "self.methodType = 'instance' or self.methodType = 'class'";

	/**
	 * Validates the methodTypeInvariant constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod_methodTypeInvariant(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RailsPackage.Literals.METHOD,
				 method,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "methodTypeInvariant",
				 METHOD__METHOD_TYPE_INVARIANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
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
