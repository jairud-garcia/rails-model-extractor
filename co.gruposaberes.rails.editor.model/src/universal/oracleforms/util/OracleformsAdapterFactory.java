/**
 */
package universal.oracleforms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see universal.oracleforms.OracleformsPackage
 * @generated
 */
public class OracleformsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OracleformsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleformsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OracleformsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OracleformsSwitch<Adapter> modelSwitch =
		new OracleformsSwitch<Adapter>() {
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseOracleFormsApp(OracleFormsApp object) {
				return createOracleFormsAppAdapter();
			}
			@Override
			public Adapter caseModuleRelationship(ModuleRelationship object) {
				return createModuleRelationshipAdapter();
			}
			@Override
			public Adapter caseFormCallRelationship(FormCallRelationship object) {
				return createFormCallRelationshipAdapter();
			}
			@Override
			public Adapter caseMasterDetailRelationship(MasterDetailRelationship object) {
				return createMasterDetailRelationshipAdapter();
			}
			@Override
			public Adapter caseDetailTableRelationship(DetailTableRelationship object) {
				return createDetailTableRelationshipAdapter();
			}
			@Override
			public Adapter caseSingleTableRelationship(SingleTableRelationship object) {
				return createSingleTableRelationshipAdapter();
			}
			@Override
			public Adapter casePLSQLRelationship(PLSQLRelationship object) {
				return createPLSQLRelationshipAdapter();
			}
			@Override
			public Adapter caseNumberOfFormsPerModuleMeasure(NumberOfFormsPerModuleMeasure object) {
				return createNumberOfFormsPerModuleMeasureAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseSimpleElement(SimpleElement object) {
				return createSimpleElementAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseRelationContainer(RelationContainer object) {
				return createRelationContainerAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.OracleFormsApp <em>Oracle Forms App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.OracleFormsApp
	 * @generated
	 */
	public Adapter createOracleFormsAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.ModuleRelationship <em>Module Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.ModuleRelationship
	 * @generated
	 */
	public Adapter createModuleRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.FormCallRelationship <em>Form Call Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.FormCallRelationship
	 * @generated
	 */
	public Adapter createFormCallRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.MasterDetailRelationship <em>Master Detail Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.MasterDetailRelationship
	 * @generated
	 */
	public Adapter createMasterDetailRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.DetailTableRelationship <em>Detail Table Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.DetailTableRelationship
	 * @generated
	 */
	public Adapter createDetailTableRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.SingleTableRelationship <em>Single Table Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.SingleTableRelationship
	 * @generated
	 */
	public Adapter createSingleTableRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.PLSQLRelationship <em>PLSQL Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.PLSQLRelationship
	 * @generated
	 */
	public Adapter createPLSQLRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.oracleforms.NumberOfFormsPerModuleMeasure <em>Number Of Forms Per Module Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.oracleforms.NumberOfFormsPerModuleMeasure
	 * @generated
	 */
	public Adapter createNumberOfFormsPerModuleMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.SimpleElement <em>Simple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.SimpleElement
	 * @generated
	 */
	public Adapter createSimpleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.RelationContainer <em>Relation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.RelationContainer
	 * @generated
	 */
	public Adapter createRelationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.metrics.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.metrics.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OracleformsAdapterFactory
