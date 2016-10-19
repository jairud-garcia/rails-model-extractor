/**
 */
package universal.microservice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see universal.microservice.MicroservicePackage
 * @generated
 */
public interface MicroserviceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroserviceFactory eINSTANCE = universal.microservice.impl.MicroserviceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Session To Entity Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session To Entity Cluster</em>'.
	 * @generated
	 */
	SessionToEntityCluster createSessionToEntityCluster();

	/**
	 * Returns a new object of class '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice</em>'.
	 * @generated
	 */
	Microservice createMicroservice();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	MicroserviceArchitecture createMicroserviceArchitecture();

	/**
	 * Returns a new object of class '<em>Cluster Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Relationship</em>'.
	 * @generated
	 */
	ClusterRelationship createClusterRelationship();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	MicroserviceRelationship createMicroserviceRelationship();

	/**
	 * Returns a new object of class '<em>Cluster Relation Conflict Percentage Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Relation Conflict Percentage Measure</em>'.
	 * @generated
	 */
	ClusterRelationConflictPercentageMeasure createClusterRelationConflictPercentageMeasure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MicroservicePackage getMicroservicePackage();

} //MicroserviceFactory
