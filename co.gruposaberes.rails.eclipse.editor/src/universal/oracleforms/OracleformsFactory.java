/**
 */
package universal.oracleforms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see universal.oracleforms.OracleformsPackage
 * @generated
 */
public interface OracleformsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OracleformsFactory eINSTANCE = universal.oracleforms.impl.OracleformsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Oracle Forms App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle Forms App</em>'.
	 * @generated
	 */
	OracleFormsApp createOracleFormsApp();

	/**
	 * Returns a new object of class '<em>Module Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Relationship</em>'.
	 * @generated
	 */
	ModuleRelationship createModuleRelationship();

	/**
	 * Returns a new object of class '<em>Form Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Call Relationship</em>'.
	 * @generated
	 */
	FormCallRelationship createFormCallRelationship();

	/**
	 * Returns a new object of class '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Detail Relationship</em>'.
	 * @generated
	 */
	MasterDetailRelationship createMasterDetailRelationship();

	/**
	 * Returns a new object of class '<em>Detail Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detail Table Relationship</em>'.
	 * @generated
	 */
	DetailTableRelationship createDetailTableRelationship();

	/**
	 * Returns a new object of class '<em>Single Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Table Relationship</em>'.
	 * @generated
	 */
	SingleTableRelationship createSingleTableRelationship();

	/**
	 * Returns a new object of class '<em>PLSQL Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLSQL Relationship</em>'.
	 * @generated
	 */
	PLSQLRelationship createPLSQLRelationship();

	/**
	 * Returns a new object of class '<em>Number Of Forms Per Module Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Of Forms Per Module Measure</em>'.
	 * @generated
	 */
	NumberOfFormsPerModuleMeasure createNumberOfFormsPerModuleMeasure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OracleformsPackage getOracleformsPackage();

} //OracleformsFactory
