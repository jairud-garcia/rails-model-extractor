/**
 */
package universal.microservice.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universal.microservice.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceFactoryImpl extends EFactoryImpl implements MicroserviceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicroserviceFactory init() {
		try {
			MicroserviceFactory theMicroserviceFactory = (MicroserviceFactory)EPackage.Registry.INSTANCE.getEFactory(MicroservicePackage.eNS_URI);
			if (theMicroserviceFactory != null) {
				return theMicroserviceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicroserviceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceFactoryImpl() {
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
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER: return createSessionToEntityCluster();
			case MicroservicePackage.MICROSERVICE: return createMicroservice();
			case MicroservicePackage.MICROSERVICE_ARCHITECTURE: return createMicroserviceArchitecture();
			case MicroservicePackage.CLUSTER_RELATIONSHIP: return createClusterRelationship();
			case MicroservicePackage.MICROSERVICE_RELATIONSHIP: return createMicroserviceRelationship();
			case MicroservicePackage.CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE: return createClusterRelationConflictPercentageMeasure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionToEntityCluster createSessionToEntityCluster() {
		SessionToEntityClusterImpl sessionToEntityCluster = new SessionToEntityClusterImpl();
		return sessionToEntityCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceArchitecture createMicroserviceArchitecture() {
		MicroserviceArchitectureImpl microserviceArchitecture = new MicroserviceArchitectureImpl();
		return microserviceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterRelationship createClusterRelationship() {
		ClusterRelationshipImpl clusterRelationship = new ClusterRelationshipImpl();
		return clusterRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceRelationship createMicroserviceRelationship() {
		MicroserviceRelationshipImpl microserviceRelationship = new MicroserviceRelationshipImpl();
		return microserviceRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterRelationConflictPercentageMeasure createClusterRelationConflictPercentageMeasure() {
		ClusterRelationConflictPercentageMeasureImpl clusterRelationConflictPercentageMeasure = new ClusterRelationConflictPercentageMeasureImpl();
		return clusterRelationConflictPercentageMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicePackage getMicroservicePackage() {
		return (MicroservicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicroservicePackage getPackage() {
		return MicroservicePackage.eINSTANCE;
	}

} //MicroserviceFactoryImpl
