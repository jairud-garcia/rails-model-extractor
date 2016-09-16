/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.Relationship#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends ClassElement
{
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
   * @see co.gruposaberes.model.rails.RailsPackage#getRelationship_Options()
   * @model containment="true"
   * @generated
   */
  EList<HashKeyValue> getOptions();

} // Relationship
