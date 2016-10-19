/**
 */
package universal.microservice;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relation Classes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.microservice.ClusterRelationship#getTypesContainedLeft <em>Types Contained Left</em>}</li>
 *   <li>{@link universal.microservice.ClusterRelationship#getTypesContainedRight <em>Types Contained Right</em>}</li>
 * </ul>
 *
 * @see universal.microservice.MicroservicePackage#getClusterRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='clusterRelationshipRule_SourceMustBeCluster clusterRelationshipRule_TargetsMustBeClusters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot clusterRelationshipRule_SourceMustBeCluster='self.source.oclIsTypeOf(SessionToEntityCluster) = true' clusterRelationshipRule_TargetsMustBeClusters='self.target.oclIsTypeOf(SessionToEntityCluster) = true'"
 * @generated
 */
public interface ClusterRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Types Contained Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Contained Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Contained Left</em>' attribute.
	 * @see #setTypesContainedLeft(double)
	 * @see universal.microservice.MicroservicePackage#getClusterRelationship_TypesContainedLeft()
	 * @model
	 * @generated
	 */
	double getTypesContainedLeft();

	/**
	 * Sets the value of the '{@link universal.microservice.ClusterRelationship#getTypesContainedLeft <em>Types Contained Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types Contained Left</em>' attribute.
	 * @see #getTypesContainedLeft()
	 * @generated
	 */
	void setTypesContainedLeft(double value);

	/**
	 * Returns the value of the '<em><b>Types Contained Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Contained Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Contained Right</em>' attribute.
	 * @see #setTypesContainedRight(double)
	 * @see universal.microservice.MicroservicePackage#getClusterRelationship_TypesContainedRight()
	 * @model
	 * @generated
	 */
	double getTypesContainedRight();

	/**
	 * Sets the value of the '{@link universal.microservice.ClusterRelationship#getTypesContainedRight <em>Types Contained Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types Contained Right</em>' attribute.
	 * @see #getTypesContainedRight()
	 * @generated
	 */
	void setTypesContainedRight(double value);

} // ClusterRelationship
