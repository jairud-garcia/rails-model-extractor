/**
 */
package universal.oracleforms.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import universal.oracleforms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see universal.oracleforms.OracleformsPackage
 * @generated
 */
public class OracleformsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OracleformsValidator INSTANCE = new OracleformsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "universal.oracleforms";

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
	public OracleformsValidator() {
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
	  return OracleformsPackage.eINSTANCE;
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
			case OracleformsPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case OracleformsPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case OracleformsPackage.MODULE:
				return validateModule((Module)value, diagnostics, context);
			case OracleformsPackage.ORACLE_FORMS_APP:
				return validateOracleFormsApp((OracleFormsApp)value, diagnostics, context);
			case OracleformsPackage.MODULE_RELATIONSHIP:
				return validateModuleRelationship((ModuleRelationship)value, diagnostics, context);
			case OracleformsPackage.FORM_CALL_RELATIONSHIP:
				return validateFormCallRelationship((FormCallRelationship)value, diagnostics, context);
			case OracleformsPackage.MASTER_DETAIL_RELATIONSHIP:
				return validateMasterDetailRelationship((MasterDetailRelationship)value, diagnostics, context);
			case OracleformsPackage.DETAIL_TABLE_RELATIONSHIP:
				return validateDetailTableRelationship((DetailTableRelationship)value, diagnostics, context);
			case OracleformsPackage.SINGLE_TABLE_RELATIONSHIP:
				return validateSingleTableRelationship((SingleTableRelationship)value, diagnostics, context);
			case OracleformsPackage.PLSQL_RELATIONSHIP:
				return validatePLSQLRelationship((PLSQLRelationship)value, diagnostics, context);
			case OracleformsPackage.NUMBER_OF_FORMS_PER_MODULE_MEASURE:
				return validateNumberOfFormsPerModuleMeasure((NumberOfFormsPerModuleMeasure)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(form, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(module, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validateModule_moduleInnerElementsRule(module, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the moduleInnerElementsRule constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE__MODULE_INNER_ELEMENTS_RULE__EEXPRESSION = "self.innerElements->forAll(el |\n" +
		"\t\t\t\t\tel.oclIsTypeOf(Form) = true or el.oclIsTypeOf(Table) = true)";

	/**
	 * Validates the moduleInnerElementsRule constraint of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule_moduleInnerElementsRule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.MODULE,
				 module,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "moduleInnerElementsRule",
				 MODULE__MODULE_INNER_ELEMENTS_RULE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOracleFormsApp(OracleFormsApp oracleFormsApp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oracleFormsApp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oracleFormsApp, diagnostics, context);
		if (result || diagnostics != null) result &= validateOracleFormsApp_oracleAppRule_MustModule(oracleFormsApp, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oracleAppRule_MustModule constraint of '<em>Oracle Forms App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ORACLE_FORMS_APP__ORACLE_APP_RULE_MUST_MODULE__EEXPRESSION = "self.basicElements->forAll(md | md.oclIsTypeOf(Module)=true)";

	/**
	 * Validates the oracleAppRule_MustModule constraint of '<em>Oracle Forms App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOracleFormsApp_oracleAppRule_MustModule(OracleFormsApp oracleFormsApp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.ORACLE_FORMS_APP,
				 oracleFormsApp,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oracleAppRule_MustModule",
				 ORACLE_FORMS_APP__ORACLE_APP_RULE_MUST_MODULE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleRelationship(ModuleRelationship moduleRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(moduleRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateModuleRelationship_moduleRealtionshiRuel_SourceMustBeModule(moduleRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateModuleRelationship_moduleRealtionshiRuel_TargetsMustBeModule(moduleRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the moduleRealtionshiRuel_SourceMustBeModule constraint of '<em>Module Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE_RELATIONSHIP__MODULE_REALTIONSHI_RUEL_SOURCE_MUST_BE_MODULE__EEXPRESSION = "self.source.oclIsTypeOf(Module) = true";

	/**
	 * Validates the moduleRealtionshiRuel_SourceMustBeModule constraint of '<em>Module Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleRelationship_moduleRealtionshiRuel_SourceMustBeModule(ModuleRelationship moduleRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.MODULE_RELATIONSHIP,
				 moduleRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "moduleRealtionshiRuel_SourceMustBeModule",
				 MODULE_RELATIONSHIP__MODULE_REALTIONSHI_RUEL_SOURCE_MUST_BE_MODULE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the moduleRealtionshiRuel_TargetsMustBeModule constraint of '<em>Module Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODULE_RELATIONSHIP__MODULE_REALTIONSHI_RUEL_TARGETS_MUST_BE_MODULE__EEXPRESSION = "self.target.oclIsTypeOf(Module) = true";

	/**
	 * Validates the moduleRealtionshiRuel_TargetsMustBeModule constraint of '<em>Module Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleRelationship_moduleRealtionshiRuel_TargetsMustBeModule(ModuleRelationship moduleRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.MODULE_RELATIONSHIP,
				 moduleRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "moduleRealtionshiRuel_TargetsMustBeModule",
				 MODULE_RELATIONSHIP__MODULE_REALTIONSHI_RUEL_TARGETS_MUST_BE_MODULE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormCallRelationship(FormCallRelationship formCallRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formCallRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormCallRelationship_formCallRelationshipRule_SourceMustBeForm(formCallRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormCallRelationship_formCallRelationshipRule_TargetsMustBeForms(formCallRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the formCallRelationshipRule_SourceMustBeForm constraint of '<em>Form Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_CALL_RELATIONSHIP__FORM_CALL_RELATIONSHIP_RULE_SOURCE_MUST_BE_FORM__EEXPRESSION = "self.source->forAll(mod | mod.oclIsTypeOf(Form) = true)";

	/**
	 * Validates the formCallRelationshipRule_SourceMustBeForm constraint of '<em>Form Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormCallRelationship_formCallRelationshipRule_SourceMustBeForm(FormCallRelationship formCallRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.FORM_CALL_RELATIONSHIP,
				 formCallRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "formCallRelationshipRule_SourceMustBeForm",
				 FORM_CALL_RELATIONSHIP__FORM_CALL_RELATIONSHIP_RULE_SOURCE_MUST_BE_FORM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the formCallRelationshipRule_TargetsMustBeForms constraint of '<em>Form Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_CALL_RELATIONSHIP__FORM_CALL_RELATIONSHIP_RULE_TARGETS_MUST_BE_FORMS__EEXPRESSION = "self.target.oclIsTypeOf(Form) = true";

	/**
	 * Validates the formCallRelationshipRule_TargetsMustBeForms constraint of '<em>Form Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormCallRelationship_formCallRelationshipRule_TargetsMustBeForms(FormCallRelationship formCallRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.FORM_CALL_RELATIONSHIP,
				 formCallRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "formCallRelationshipRule_TargetsMustBeForms",
				 FORM_CALL_RELATIONSHIP__FORM_CALL_RELATIONSHIP_RULE_TARGETS_MUST_BE_FORMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterDetailRelationship(MasterDetailRelationship masterDetailRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(masterDetailRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterDetailRelationship_masterDetailRelationshipRule_LimitRelations(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterDetailRelationship_masterDetailRelationshipRule_FirstMustBeSingleTableRelationship(masterDetailRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterDetailRelationship_masterDetailRelationshipRule_SegundMustBeSingleTableRelationship(masterDetailRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the masterDetailRelationshipRule_LimitRelations constraint of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER_DETAIL_RELATIONSHIP__MASTER_DETAIL_RELATIONSHIP_RULE_LIMIT_RELATIONS__EEXPRESSION = "self.relations->size() = 2";

	/**
	 * Validates the masterDetailRelationshipRule_LimitRelations constraint of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterDetailRelationship_masterDetailRelationshipRule_LimitRelations(MasterDetailRelationship masterDetailRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.MASTER_DETAIL_RELATIONSHIP,
				 masterDetailRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "masterDetailRelationshipRule_LimitRelations",
				 MASTER_DETAIL_RELATIONSHIP__MASTER_DETAIL_RELATIONSHIP_RULE_LIMIT_RELATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the masterDetailRelationshipRule_FirstMustBeSingleTableRelationship constraint of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER_DETAIL_RELATIONSHIP__MASTER_DETAIL_RELATIONSHIP_RULE_FIRST_MUST_BE_SINGLE_TABLE_RELATIONSHIP__EEXPRESSION = "self.relations->first().oclIsTypeOf(SingleTableRelationship) = true";

	/**
	 * Validates the masterDetailRelationshipRule_FirstMustBeSingleTableRelationship constraint of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterDetailRelationship_masterDetailRelationshipRule_FirstMustBeSingleTableRelationship(MasterDetailRelationship masterDetailRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.MASTER_DETAIL_RELATIONSHIP,
				 masterDetailRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "masterDetailRelationshipRule_FirstMustBeSingleTableRelationship",
				 MASTER_DETAIL_RELATIONSHIP__MASTER_DETAIL_RELATIONSHIP_RULE_FIRST_MUST_BE_SINGLE_TABLE_RELATIONSHIP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the masterDetailRelationshipRule_SegundMustBeSingleTableRelationship constraint of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER_DETAIL_RELATIONSHIP__MASTER_DETAIL_RELATIONSHIP_RULE_SEGUND_MUST_BE_SINGLE_TABLE_RELATIONSHIP__EEXPRESSION = "self.relations->last().oclIsTypeOf(DetailTableRelationship) = true";

	/**
	 * Validates the masterDetailRelationshipRule_SegundMustBeSingleTableRelationship constraint of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterDetailRelationship_masterDetailRelationshipRule_SegundMustBeSingleTableRelationship(MasterDetailRelationship masterDetailRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.MASTER_DETAIL_RELATIONSHIP,
				 masterDetailRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "masterDetailRelationshipRule_SegundMustBeSingleTableRelationship",
				 MASTER_DETAIL_RELATIONSHIP__MASTER_DETAIL_RELATIONSHIP_RULE_SEGUND_MUST_BE_SINGLE_TABLE_RELATIONSHIP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailTableRelationship(DetailTableRelationship detailTableRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(detailTableRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailTableRelationship_DetailTableRelationshipRule_SourceMustBeTable(detailTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailTableRelationship_DetailTableRelationshipRule_TargetsMustBeTable(detailTableRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DetailTableRelationshipRule_SourceMustBeTable constraint of '<em>Detail Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAIL_TABLE_RELATIONSHIP__DETAIL_TABLE_RELATIONSHIP_RULE_SOURCE_MUST_BE_TABLE__EEXPRESSION = "self.source.oclIsTypeOf(Table) = true";

	/**
	 * Validates the DetailTableRelationshipRule_SourceMustBeTable constraint of '<em>Detail Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailTableRelationship_DetailTableRelationshipRule_SourceMustBeTable(DetailTableRelationship detailTableRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.DETAIL_TABLE_RELATIONSHIP,
				 detailTableRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DetailTableRelationshipRule_SourceMustBeTable",
				 DETAIL_TABLE_RELATIONSHIP__DETAIL_TABLE_RELATIONSHIP_RULE_SOURCE_MUST_BE_TABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DetailTableRelationshipRule_TargetsMustBeTable constraint of '<em>Detail Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAIL_TABLE_RELATIONSHIP__DETAIL_TABLE_RELATIONSHIP_RULE_TARGETS_MUST_BE_TABLE__EEXPRESSION = "self.target.oclIsTypeOf(Table) = true";

	/**
	 * Validates the DetailTableRelationshipRule_TargetsMustBeTable constraint of '<em>Detail Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailTableRelationship_DetailTableRelationshipRule_TargetsMustBeTable(DetailTableRelationship detailTableRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.DETAIL_TABLE_RELATIONSHIP,
				 detailTableRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DetailTableRelationshipRule_TargetsMustBeTable",
				 DETAIL_TABLE_RELATIONSHIP__DETAIL_TABLE_RELATIONSHIP_RULE_TARGETS_MUST_BE_TABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleTableRelationship(SingleTableRelationship singleTableRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleTableRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleTableRelationship_singleTableRelationshipRule_SourceMustBeForm(singleTableRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleTableRelationship_singleTableRelationshipRule_TargetsMustBeTable(singleTableRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the singleTableRelationshipRule_SourceMustBeForm constraint of '<em>Single Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SINGLE_TABLE_RELATIONSHIP__SINGLE_TABLE_RELATIONSHIP_RULE_SOURCE_MUST_BE_FORM__EEXPRESSION = "self.source.oclIsTypeOf(Form) = true";

	/**
	 * Validates the singleTableRelationshipRule_SourceMustBeForm constraint of '<em>Single Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleTableRelationship_singleTableRelationshipRule_SourceMustBeForm(SingleTableRelationship singleTableRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.SINGLE_TABLE_RELATIONSHIP,
				 singleTableRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "singleTableRelationshipRule_SourceMustBeForm",
				 SINGLE_TABLE_RELATIONSHIP__SINGLE_TABLE_RELATIONSHIP_RULE_SOURCE_MUST_BE_FORM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the singleTableRelationshipRule_TargetsMustBeTable constraint of '<em>Single Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SINGLE_TABLE_RELATIONSHIP__SINGLE_TABLE_RELATIONSHIP_RULE_TARGETS_MUST_BE_TABLE__EEXPRESSION = "self.target.oclIsTypeOf(Table) = true";

	/**
	 * Validates the singleTableRelationshipRule_TargetsMustBeTable constraint of '<em>Single Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleTableRelationship_singleTableRelationshipRule_TargetsMustBeTable(SingleTableRelationship singleTableRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.SINGLE_TABLE_RELATIONSHIP,
				 singleTableRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "singleTableRelationshipRule_TargetsMustBeTable",
				 SINGLE_TABLE_RELATIONSHIP__SINGLE_TABLE_RELATIONSHIP_RULE_TARGETS_MUST_BE_TABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePLSQLRelationship(PLSQLRelationship plsqlRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plsqlRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validatePLSQLRelationship_plsqlRelationshipRule_SourceMustBeForm(plsqlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validatePLSQLRelationship_plsqlRelationshipRule_TargetsMustBeTable(plsqlRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the plsqlRelationshipRule_SourceMustBeForm constraint of '<em>PLSQL Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLSQL_RELATIONSHIP__PLSQL_RELATIONSHIP_RULE_SOURCE_MUST_BE_FORM__EEXPRESSION = "self.source.oclIsTypeOf(Form) = true";

	/**
	 * Validates the plsqlRelationshipRule_SourceMustBeForm constraint of '<em>PLSQL Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePLSQLRelationship_plsqlRelationshipRule_SourceMustBeForm(PLSQLRelationship plsqlRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.PLSQL_RELATIONSHIP,
				 plsqlRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "plsqlRelationshipRule_SourceMustBeForm",
				 PLSQL_RELATIONSHIP__PLSQL_RELATIONSHIP_RULE_SOURCE_MUST_BE_FORM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the plsqlRelationshipRule_TargetsMustBeTable constraint of '<em>PLSQL Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLSQL_RELATIONSHIP__PLSQL_RELATIONSHIP_RULE_TARGETS_MUST_BE_TABLE__EEXPRESSION = "self.target.oclIsTypeOf(Table) = true";

	/**
	 * Validates the plsqlRelationshipRule_TargetsMustBeTable constraint of '<em>PLSQL Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePLSQLRelationship_plsqlRelationshipRule_TargetsMustBeTable(PLSQLRelationship plsqlRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OracleformsPackage.Literals.PLSQL_RELATIONSHIP,
				 plsqlRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "plsqlRelationshipRule_TargetsMustBeTable",
				 PLSQL_RELATIONSHIP__PLSQL_RELATIONSHIP_RULE_TARGETS_MUST_BE_TABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfFormsPerModuleMeasure(NumberOfFormsPerModuleMeasure numberOfFormsPerModuleMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberOfFormsPerModuleMeasure, diagnostics, context);
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

} //OracleformsValidator
