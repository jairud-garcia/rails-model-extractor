/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EString</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.EString#getClass_name <em>Class name</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.EString#getDependent <em>Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getEString()
 * @model
 * @generated
 */
public interface EString extends EObject
{
  /**
   * Returns the value of the '<em><b>Class name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class name</em>' attribute.
   * @see #setClass_name(String)
   * @see co.gruposaberes.model.rails.RailsPackage#getEString_Class_name()
   * @model
   * @generated
   */
  String getClass_name();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.EString#getClass_name <em>Class name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class name</em>' attribute.
   * @see #getClass_name()
   * @generated
   */
  void setClass_name(String value);

  /**
   * Returns the value of the '<em><b>Dependent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependent</em>' attribute.
   * @see #setDependent(String)
   * @see co.gruposaberes.model.rails.RailsPackage#getEString_Dependent()
   * @model
   * @generated
   */
  String getDependent();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.EString#getDependent <em>Dependent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependent</em>' attribute.
   * @see #getDependent()
   * @generated
   */
  void setDependent(String value);

} // EString
