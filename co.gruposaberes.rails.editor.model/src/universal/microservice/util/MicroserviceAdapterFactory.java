/**
 */
package universal.microservice.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import universal.core.Application;
import universal.core.Container;
import universal.core.Element;
import universal.core.Relation;
import universal.core.SimpleElement;

import universal.metrics.Measure;

import universal.microservice.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see universal.microservice.MicroservicePackage
 * @generated
 */
public class MicroserviceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicroservicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MicroservicePackage.eINSTANCE;
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
	protected MicroserviceSwitch<Adapter> modelSwitch =
		new MicroserviceSwitch<Adapter>() {
			@Override
			public Adapter caseSessionToEntityCluster(SessionToEntityCluster object) {
				return createSessionToEntityClusterAdapter();
			}
			@Override
			public Adapter caseMicroservice(Microservice object) {
				return createMicroserviceAdapter();
			}
			@Override
			public Adapter caseMicroserviceArchitecture(MicroserviceArchitecture object) {
				return createMicroserviceArchitectureAdapter();
			}
			@Override
			public Adapter caseClusterRelationship(ClusterRelationship object) {
				return createClusterRelationshipAdapter();
			}
			@Override
			public Adapter caseMicroserviceRelationship(MicroserviceRelationship object) {
				return createMicroserviceRelationshipAdapter();
			}
			@Override
			public Adapter caseClusterRelationConflictPercentageMeasure(ClusterRelationConflictPercentageMeasure object) {
				return createClusterRelationConflictPercentageMeasureAdapter();
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
	 * Creates a new adapter for an object of class '{@link universal.microservice.SessionToEntityCluster <em>Session To Entity Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.microservice.SessionToEntityCluster
	 * @generated
	 */
	public Adapter createSessionToEntityClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.microservice.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.microservice.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.microservice.MicroserviceArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.microservice.MicroserviceArchitecture
	 * @generated
	 */
	public Adapter createMicroserviceArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.microservice.ClusterRelationship <em>Cluster Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.microservice.ClusterRelationship
	 * @generated
	 */
	public Adapter createClusterRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.microservice.MicroserviceRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.microservice.MicroserviceRelationship
	 * @generated
	 */
	public Adapter createMicroserviceRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.microservice.ClusterRelationConflictPercentageMeasure <em>Cluster Relation Conflict Percentage Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.microservice.ClusterRelationConflictPercentageMeasure
	 * @generated
	 */
	public Adapter createClusterRelationConflictPercentageMeasureAdapter() {
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

} //MicroserviceAdapterFactory
