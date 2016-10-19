/**
 */
package universal.microservice;

import org.eclipse.emf.common.util.EList;

import universal.OOP.Type;

import universal.core.SimpleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session To Entity Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Core Classes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.microservice.SessionToEntityCluster#getNumberOfTypes <em>Number Of Types</em>}</li>
 *   <li>{@link universal.microservice.SessionToEntityCluster#getNumberOfLines <em>Number Of Lines</em>}</li>
 *   <li>{@link universal.microservice.SessionToEntityCluster#getTypeReferences <em>Type References</em>}</li>
 * </ul>
 *
 * @see universal.microservice.MicroservicePackage#getSessionToEntityCluster()
 * @model
 * @generated
 */
public interface SessionToEntityCluster extends SimpleElement {
	/**
	 * Returns the value of the '<em><b>Number Of Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Types</em>' attribute.
	 * @see #setNumberOfTypes(double)
	 * @see universal.microservice.MicroservicePackage#getSessionToEntityCluster_NumberOfTypes()
	 * @model
	 * @generated
	 */
	double getNumberOfTypes();

	/**
	 * Sets the value of the '{@link universal.microservice.SessionToEntityCluster#getNumberOfTypes <em>Number Of Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Types</em>' attribute.
	 * @see #getNumberOfTypes()
	 * @generated
	 */
	void setNumberOfTypes(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Lines</em>' attribute.
	 * @see #setNumberOfLines(double)
	 * @see universal.microservice.MicroservicePackage#getSessionToEntityCluster_NumberOfLines()
	 * @model
	 * @generated
	 */
	double getNumberOfLines();

	/**
	 * Sets the value of the '{@link universal.microservice.SessionToEntityCluster#getNumberOfLines <em>Number Of Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Lines</em>' attribute.
	 * @see #getNumberOfLines()
	 * @generated
	 */
	void setNumberOfLines(double value);

	/**
	 * Returns the value of the '<em><b>Type References</b></em>' reference list.
	 * The list contents are of type {@link universal.OOP.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type References</em>' reference list.
	 * @see universal.microservice.MicroservicePackage#getSessionToEntityCluster_TypeReferences()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Type> getTypeReferences();

} // SessionToEntityCluster
