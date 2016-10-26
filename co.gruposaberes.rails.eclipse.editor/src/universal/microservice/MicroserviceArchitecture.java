/**
 */
package universal.microservice;

import universal.core.Application;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.microservice.MicroservicePackage#getMicroserviceArchitecture()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MicroserviceArchitectureRule_MustMicroserviceElements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MicroserviceArchitectureRule_MustMicroserviceElements='self.basicElements->forAll(mc | mc.oclIsTypeOf(Microservice) = true or mc.oclIsKindOf(universal::OOP::Type) = true)'"
 * @generated
 */
public interface MicroserviceArchitecture extends Application {
} // MicroserviceArchitecture
