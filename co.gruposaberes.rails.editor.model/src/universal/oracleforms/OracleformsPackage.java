/**
 */
package universal.oracleforms;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import universal.core.CorePackage;

import universal.metrics.MetricsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see universal.oracleforms.OracleformsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface OracleformsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oracleforms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://universal/oracleforms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unforms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OracleformsPackage eINSTANCE = universal.oracleforms.impl.OracleformsPackageImpl.init();

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.FormImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = CorePackage.SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.TableImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = CorePackage.SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.ModuleImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.OracleFormsAppImpl <em>Oracle Forms App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.OracleFormsAppImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getOracleFormsApp()
	 * @generated
	 */
	int ORACLE_FORMS_APP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FORMS_APP__NAME = CorePackage.APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Basic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FORMS_APP__BASIC_ELEMENTS = CorePackage.APPLICATION__BASIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Complex Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FORMS_APP__COMPLEX_RELATIONSHIPS = CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Simple Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FORMS_APP__SIMPLE_RELATIONSHIPS = CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS;

	/**
	 * The number of structural features of the '<em>Oracle Forms App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FORMS_APP_FEATURE_COUNT = CorePackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oracle Forms App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FORMS_APP_OPERATION_COUNT = CorePackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.ModuleRelationshipImpl <em>Module Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.ModuleRelationshipImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getModuleRelationship()
	 * @generated
	 */
	int MODULE_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The number of structural features of the '<em>Module Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Module Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.FormCallRelationshipImpl <em>Form Call Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.FormCallRelationshipImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getFormCallRelationship()
	 * @generated
	 */
	int FORM_CALL_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CALL_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CALL_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CALL_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The number of structural features of the '<em>Form Call Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CALL_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form Call Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CALL_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.MasterDetailRelationshipImpl <em>Master Detail Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.MasterDetailRelationshipImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getMasterDetailRelationship()
	 * @generated
	 */
	int MASTER_DETAIL_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL_RELATIONSHIP__RELATIONS = CorePackage.RELATION_CONTAINER__RELATIONS;

	/**
	 * The number of structural features of the '<em>Master Detail Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Master Detail Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.DetailTableRelationshipImpl <em>Detail Table Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.DetailTableRelationshipImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getDetailTableRelationship()
	 * @generated
	 */
	int DETAIL_TABLE_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_TABLE_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_TABLE_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_TABLE_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The number of structural features of the '<em>Detail Table Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_TABLE_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Detail Table Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_TABLE_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.SingleTableRelationshipImpl <em>Single Table Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.SingleTableRelationshipImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getSingleTableRelationship()
	 * @generated
	 */
	int SINGLE_TABLE_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TABLE_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TABLE_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TABLE_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The number of structural features of the '<em>Single Table Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TABLE_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Table Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TABLE_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.PLSQLRelationshipImpl <em>PLSQL Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.PLSQLRelationshipImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getPLSQLRelationship()
	 * @generated
	 */
	int PLSQL_RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLSQL_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLSQL_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLSQL_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The number of structural features of the '<em>PLSQL Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLSQL_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PLSQL Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLSQL_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.oracleforms.impl.NumberOfFormsPerModuleMeasureImpl <em>Number Of Forms Per Module Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.oracleforms.impl.NumberOfFormsPerModuleMeasureImpl
	 * @see universal.oracleforms.impl.OracleformsPackageImpl#getNumberOfFormsPerModuleMeasure()
	 * @generated
	 */
	int NUMBER_OF_FORMS_PER_MODULE_MEASURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_FORMS_PER_MODULE_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_FORMS_PER_MODULE_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Forms Per Module Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_FORMS_PER_MODULE_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Forms Per Module Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_FORMS_PER_MODULE_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link universal.oracleforms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see universal.oracleforms.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see universal.oracleforms.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see universal.oracleforms.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.OracleFormsApp <em>Oracle Forms App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oracle Forms App</em>'.
	 * @see universal.oracleforms.OracleFormsApp
	 * @generated
	 */
	EClass getOracleFormsApp();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.ModuleRelationship <em>Module Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Relationship</em>'.
	 * @see universal.oracleforms.ModuleRelationship
	 * @generated
	 */
	EClass getModuleRelationship();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.FormCallRelationship <em>Form Call Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Call Relationship</em>'.
	 * @see universal.oracleforms.FormCallRelationship
	 * @generated
	 */
	EClass getFormCallRelationship();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.MasterDetailRelationship <em>Master Detail Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Detail Relationship</em>'.
	 * @see universal.oracleforms.MasterDetailRelationship
	 * @generated
	 */
	EClass getMasterDetailRelationship();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.DetailTableRelationship <em>Detail Table Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail Table Relationship</em>'.
	 * @see universal.oracleforms.DetailTableRelationship
	 * @generated
	 */
	EClass getDetailTableRelationship();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.SingleTableRelationship <em>Single Table Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Table Relationship</em>'.
	 * @see universal.oracleforms.SingleTableRelationship
	 * @generated
	 */
	EClass getSingleTableRelationship();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.PLSQLRelationship <em>PLSQL Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLSQL Relationship</em>'.
	 * @see universal.oracleforms.PLSQLRelationship
	 * @generated
	 */
	EClass getPLSQLRelationship();

	/**
	 * Returns the meta object for class '{@link universal.oracleforms.NumberOfFormsPerModuleMeasure <em>Number Of Forms Per Module Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Forms Per Module Measure</em>'.
	 * @see universal.oracleforms.NumberOfFormsPerModuleMeasure
	 * @generated
	 */
	EClass getNumberOfFormsPerModuleMeasure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OracleformsFactory getOracleformsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.FormImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.TableImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.ModuleImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.OracleFormsAppImpl <em>Oracle Forms App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.OracleFormsAppImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getOracleFormsApp()
		 * @generated
		 */
		EClass ORACLE_FORMS_APP = eINSTANCE.getOracleFormsApp();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.ModuleRelationshipImpl <em>Module Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.ModuleRelationshipImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getModuleRelationship()
		 * @generated
		 */
		EClass MODULE_RELATIONSHIP = eINSTANCE.getModuleRelationship();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.FormCallRelationshipImpl <em>Form Call Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.FormCallRelationshipImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getFormCallRelationship()
		 * @generated
		 */
		EClass FORM_CALL_RELATIONSHIP = eINSTANCE.getFormCallRelationship();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.MasterDetailRelationshipImpl <em>Master Detail Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.MasterDetailRelationshipImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getMasterDetailRelationship()
		 * @generated
		 */
		EClass MASTER_DETAIL_RELATIONSHIP = eINSTANCE.getMasterDetailRelationship();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.DetailTableRelationshipImpl <em>Detail Table Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.DetailTableRelationshipImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getDetailTableRelationship()
		 * @generated
		 */
		EClass DETAIL_TABLE_RELATIONSHIP = eINSTANCE.getDetailTableRelationship();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.SingleTableRelationshipImpl <em>Single Table Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.SingleTableRelationshipImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getSingleTableRelationship()
		 * @generated
		 */
		EClass SINGLE_TABLE_RELATIONSHIP = eINSTANCE.getSingleTableRelationship();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.PLSQLRelationshipImpl <em>PLSQL Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.PLSQLRelationshipImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getPLSQLRelationship()
		 * @generated
		 */
		EClass PLSQL_RELATIONSHIP = eINSTANCE.getPLSQLRelationship();

		/**
		 * The meta object literal for the '{@link universal.oracleforms.impl.NumberOfFormsPerModuleMeasureImpl <em>Number Of Forms Per Module Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.oracleforms.impl.NumberOfFormsPerModuleMeasureImpl
		 * @see universal.oracleforms.impl.OracleformsPackageImpl#getNumberOfFormsPerModuleMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_FORMS_PER_MODULE_MEASURE = eINSTANCE.getNumberOfFormsPerModuleMeasure();

	}

} //OracleformsPackage
