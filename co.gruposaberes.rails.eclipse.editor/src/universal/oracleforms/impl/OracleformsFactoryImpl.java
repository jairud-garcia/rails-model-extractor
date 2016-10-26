/**
 */
package universal.oracleforms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universal.oracleforms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OracleformsFactoryImpl extends EFactoryImpl implements OracleformsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OracleformsFactory init() {
		try {
			OracleformsFactory theOracleformsFactory = (OracleformsFactory)EPackage.Registry.INSTANCE.getEFactory(OracleformsPackage.eNS_URI);
			if (theOracleformsFactory != null) {
				return theOracleformsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OracleformsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleformsFactoryImpl() {
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
			case OracleformsPackage.FORM: return createForm();
			case OracleformsPackage.TABLE: return createTable();
			case OracleformsPackage.MODULE: return createModule();
			case OracleformsPackage.ORACLE_FORMS_APP: return createOracleFormsApp();
			case OracleformsPackage.MODULE_RELATIONSHIP: return createModuleRelationship();
			case OracleformsPackage.FORM_CALL_RELATIONSHIP: return createFormCallRelationship();
			case OracleformsPackage.MASTER_DETAIL_RELATIONSHIP: return createMasterDetailRelationship();
			case OracleformsPackage.DETAIL_TABLE_RELATIONSHIP: return createDetailTableRelationship();
			case OracleformsPackage.SINGLE_TABLE_RELATIONSHIP: return createSingleTableRelationship();
			case OracleformsPackage.PLSQL_RELATIONSHIP: return createPLSQLRelationship();
			case OracleformsPackage.NUMBER_OF_FORMS_PER_MODULE_MEASURE: return createNumberOfFormsPerModuleMeasure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleFormsApp createOracleFormsApp() {
		OracleFormsAppImpl oracleFormsApp = new OracleFormsAppImpl();
		return oracleFormsApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRelationship createModuleRelationship() {
		ModuleRelationshipImpl moduleRelationship = new ModuleRelationshipImpl();
		return moduleRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormCallRelationship createFormCallRelationship() {
		FormCallRelationshipImpl formCallRelationship = new FormCallRelationshipImpl();
		return formCallRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterDetailRelationship createMasterDetailRelationship() {
		MasterDetailRelationshipImpl masterDetailRelationship = new MasterDetailRelationshipImpl();
		return masterDetailRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailTableRelationship createDetailTableRelationship() {
		DetailTableRelationshipImpl detailTableRelationship = new DetailTableRelationshipImpl();
		return detailTableRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTableRelationship createSingleTableRelationship() {
		SingleTableRelationshipImpl singleTableRelationship = new SingleTableRelationshipImpl();
		return singleTableRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLSQLRelationship createPLSQLRelationship() {
		PLSQLRelationshipImpl plsqlRelationship = new PLSQLRelationshipImpl();
		return plsqlRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfFormsPerModuleMeasure createNumberOfFormsPerModuleMeasure() {
		NumberOfFormsPerModuleMeasureImpl numberOfFormsPerModuleMeasure = new NumberOfFormsPerModuleMeasureImpl();
		return numberOfFormsPerModuleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleformsPackage getOracleformsPackage() {
		return (OracleformsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OracleformsPackage getPackage() {
		return OracleformsPackage.eINSTANCE;
	}

} //OracleformsFactoryImpl
