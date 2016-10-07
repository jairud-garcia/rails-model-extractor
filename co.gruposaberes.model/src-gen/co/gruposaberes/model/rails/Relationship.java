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
 * </p>
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.Relationship#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.Relationship#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends ClassElement
{
  /**
   * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Type</em>' attribute.
   * @see #setRelationType(String)
   * @see co.gruposaberes.model.rails.RailsPackage#getRelationship_RelationType()
   * @model
   * @generated
   */
  String getRelationType();

  /**
   * Sets the value of the '{@link co.gruposaberes.model.rails.Relationship#getRelationType <em>Relation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation Type</em>' attribute.
   * @see #getRelationType()
   * @generated
   */
  void setRelationType(String value);

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
