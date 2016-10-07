/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belongs To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.BelongsTo#getName <em>Name</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.BelongsTo#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getBelongsTo()
 * @model
 * @generated
 */
public interface BelongsTo extends EObject
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
   * @see co.gruposaberes.model.rails.RailsPackage#getBelongsTo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.BelongsTo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link co.gruposaberes.model.rails.HashKeyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see co.gruposaberes.model.rails.RailsPackage#getBelongsTo_Options()
   * @model containment="true"
   * @generated
   */
  EList<HashKeyValue> getOptions();

} // BelongsTo
