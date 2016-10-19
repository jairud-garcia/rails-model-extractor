/**
 */
package universal.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.core.Application#getName <em>Name</em>}</li>
 *   <li>{@link universal.core.Application#getBasicElements <em>Basic Elements</em>}</li>
 *   <li>{@link universal.core.Application#getComplexRelationships <em>Complex Relationships</em>}</li>
 *   <li>{@link universal.core.Application#getSimpleRelationships <em>Simple Relationships</em>}</li>
 * </ul>
 *
 * @see universal.core.CorePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universal.core.CorePackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universal.core.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Basic Elements</b></em>' containment reference list.
	 * The list contents are of type {@link universal.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Elements</em>' containment reference list.
	 * @see universal.core.CorePackage#getApplication_BasicElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getBasicElements();

	/**
	 * Returns the value of the '<em><b>Complex Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link universal.core.RelationContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Relationships</em>' containment reference list.
	 * @see universal.core.CorePackage#getApplication_ComplexRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationContainer> getComplexRelationships();

	/**
	 * Returns the value of the '<em><b>Simple Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link universal.core.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Relationships</em>' containment reference list.
	 * @see universal.core.CorePackage#getApplication_SimpleRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getSimpleRelationships();

} // Application
