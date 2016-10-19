/**
 */
package universal.oracleforms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import universal.core.Application;
import universal.core.Container;
import universal.core.Element;
import universal.core.Relation;
import universal.core.RelationContainer;
import universal.core.SimpleElement;

import universal.metrics.Measure;

import universal.oracleforms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see universal.oracleforms.OracleformsPackage
 * @generated
 */
public class OracleformsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OracleformsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleformsSwitch() {
		if (modelPackage == null) {
			modelPackage = OracleformsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OracleformsPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseSimpleElement(form);
				if (result == null) result = caseElement(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseSimpleElement(table);
				if (result == null) result = caseElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseContainer(module);
				if (result == null) result = caseElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.ORACLE_FORMS_APP: {
				OracleFormsApp oracleFormsApp = (OracleFormsApp)theEObject;
				T result = caseOracleFormsApp(oracleFormsApp);
				if (result == null) result = caseApplication(oracleFormsApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.MODULE_RELATIONSHIP: {
				ModuleRelationship moduleRelationship = (ModuleRelationship)theEObject;
				T result = caseModuleRelationship(moduleRelationship);
				if (result == null) result = caseRelation(moduleRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.FORM_CALL_RELATIONSHIP: {
				FormCallRelationship formCallRelationship = (FormCallRelationship)theEObject;
				T result = caseFormCallRelationship(formCallRelationship);
				if (result == null) result = caseRelation(formCallRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.MASTER_DETAIL_RELATIONSHIP: {
				MasterDetailRelationship masterDetailRelationship = (MasterDetailRelationship)theEObject;
				T result = caseMasterDetailRelationship(masterDetailRelationship);
				if (result == null) result = caseRelationContainer(masterDetailRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.DETAIL_TABLE_RELATIONSHIP: {
				DetailTableRelationship detailTableRelationship = (DetailTableRelationship)theEObject;
				T result = caseDetailTableRelationship(detailTableRelationship);
				if (result == null) result = caseRelation(detailTableRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.SINGLE_TABLE_RELATIONSHIP: {
				SingleTableRelationship singleTableRelationship = (SingleTableRelationship)theEObject;
				T result = caseSingleTableRelationship(singleTableRelationship);
				if (result == null) result = caseRelation(singleTableRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.PLSQL_RELATIONSHIP: {
				PLSQLRelationship plsqlRelationship = (PLSQLRelationship)theEObject;
				T result = casePLSQLRelationship(plsqlRelationship);
				if (result == null) result = caseRelation(plsqlRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleformsPackage.NUMBER_OF_FORMS_PER_MODULE_MEASURE: {
				NumberOfFormsPerModuleMeasure numberOfFormsPerModuleMeasure = (NumberOfFormsPerModuleMeasure)theEObject;
				T result = caseNumberOfFormsPerModuleMeasure(numberOfFormsPerModuleMeasure);
				if (result == null) result = caseMeasure(numberOfFormsPerModuleMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oracle Forms App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oracle Forms App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOracleFormsApp(OracleFormsApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleRelationship(ModuleRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Call Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormCallRelationship(FormCallRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Detail Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Detail Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterDetailRelationship(MasterDetailRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail Table Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailTableRelationship(DetailTableRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Table Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Table Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTableRelationship(SingleTableRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLSQL Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLSQL Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLSQLRelationship(PLSQLRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Forms Per Module Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Forms Per Module Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfFormsPerModuleMeasure(NumberOfFormsPerModuleMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleElement(SimpleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationContainer(RelationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OracleformsSwitch
