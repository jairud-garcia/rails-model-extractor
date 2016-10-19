/**
 */
package universal.microservice;

import universal.core.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.microservice.MicroservicePackage#getMicroservice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MicroserviceRule_MustContaintClusters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MicroserviceRule_MustContaintClusters='self.innerElements->forAll(cluster | cluster.oclIsTypeOf(SessionToEntityCluster) = true)'"
 * @generated
 */
public interface Microservice extends Container {
} // Microservice
