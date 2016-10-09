/**
 */
package co.gruposaberes.model.rails;

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
 *   <li>{@link co.gruposaberes.model.rails.Application#getName <em>Name</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.Application#getRubyClasses <em>Ruby Classes</em>}</li>
 * </ul>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getApplication()
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
	 * @see co.gruposaberes.model.rails.RailsPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.gruposaberes.model.rails.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ruby Classes</b></em>' containment reference list.
	 * The list contents are of type {@link co.gruposaberes.model.rails.RubyClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby Classes</em>' containment reference list.
	 * @see co.gruposaberes.model.rails.RailsPackage#getApplication_RubyClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<RubyClass> getRubyClasses();

} // Application
