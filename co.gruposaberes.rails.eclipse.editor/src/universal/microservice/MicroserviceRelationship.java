/**
 */
package universal.microservice;

import org.eclipse.emf.common.util.EList;

import universal.OOP.Dependency;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.microservice.MicroserviceRelationship#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see universal.microservice.MicroservicePackage#getMicroserviceRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='microserviceRelationshipRule_SourceMustBeMicroservice microserviceRelationshipRule_TargetsMustBeMicroservices'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot microserviceRelationshipRule_SourceMustBeMicroservice='self.source.oclIsTypeOf(Microservice) = true' microserviceRelationshipRule_TargetsMustBeMicroservices='self.target.oclIsTypeOf(Microservice) = true'"
 * @generated
 */
public interface MicroserviceRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link universal.OOP.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see universal.microservice.MicroservicePackage#getMicroserviceRelationship_Dependencies()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dependency> getDependencies();

} // MicroserviceRelationship
