/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.OperationsChain#getOperators <em>Operators</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.OperationsChain#getOperants <em>Operants</em>}</li>
 * </ul>
 *
 * @see co.gruposaberes.model.rails.RailsPackage#getOperationsChain()
 * @model
 * @generated
 */
public interface OperationsChain extends ClassElement
{
  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see co.gruposaberes.model.rails.RailsPackage#getOperationsChain_Operators()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperators();

  /**
   * Returns the value of the '<em><b>Operants</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operants</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operants</em>' attribute list.
   * @see co.gruposaberes.model.rails.RailsPackage#getOperationsChain_Operants()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperants();

} // OperationsChain
