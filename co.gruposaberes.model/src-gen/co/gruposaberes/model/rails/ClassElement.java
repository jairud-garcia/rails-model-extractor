/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.ClassElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getClassElement()
 * @model
 * @generated
 */
public interface ClassElement extends EObject
{
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
   * @see co.gruposaberes.model.rails.RailsPackage#getClassElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.ClassElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ClassElement
