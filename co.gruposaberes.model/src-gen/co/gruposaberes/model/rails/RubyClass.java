/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruby Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.RubyClass#getName <em>Name</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.RubyClass#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.RubyClass#getClassElements <em>Class Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getRubyClass()
 * @model
 * @generated
 */
public interface RubyClass extends EObject
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
   * @see co.gruposaberes.model.rails.RailsPackage#getRubyClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.RubyClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' attribute.
   * @see #setSuperType(String)
   * @see co.gruposaberes.model.rails.RailsPackage#getRubyClass_SuperType()
   * @model
   * @generated
   */
  String getSuperType();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.RubyClass#getSuperType <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' attribute.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(String value);

  /**
   * Returns the value of the '<em><b>Class Elements</b></em>' containment reference list.
   * The list contents are of type {@link co.gruposaberes.model.rails.ClassElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Elements</em>' containment reference list.
   * @see co.gruposaberes.model.rails.RailsPackage#getRubyClass_ClassElements()
   * @model containment="true"
   * @generated
   */
  EList<ClassElement> getClassElements();

} // RubyClass
