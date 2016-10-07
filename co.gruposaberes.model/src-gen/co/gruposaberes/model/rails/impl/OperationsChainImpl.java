/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.OperationsChain;
import co.gruposaberes.model.rails.RailsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.impl.OperationsChainImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.impl.OperationsChainImpl#getOperants <em>Operants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsChainImpl extends ClassElementImpl implements OperationsChain
{
  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected EList<String> operators;

  /**
   * The cached value of the '{@link #getOperants() <em>Operants</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperants()
   * @generated
   * @ordered
   */
  protected EList<String> operants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationsChainImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RailsPackage.Literals.OPERATIONS_CHAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperators()
  {
    if (operators == null)
    {
      operators = new EDataTypeEList<String>(String.class, this, RailsPackage.OPERATIONS_CHAIN__OPERATORS);
    }
    return operators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperants()
  {
    if (operants == null)
    {
      operants = new EDataTypeEList<String>(String.class, this, RailsPackage.OPERATIONS_CHAIN__OPERANTS);
    }
    return operants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RailsPackage.OPERATIONS_CHAIN__OPERATORS:
        return getOperators();
      case RailsPackage.OPERATIONS_CHAIN__OPERANTS:
        return getOperants();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RailsPackage.OPERATIONS_CHAIN__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends String>)newValue);
        return;
      case RailsPackage.OPERATIONS_CHAIN__OPERANTS:
        getOperants().clear();
        getOperants().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RailsPackage.OPERATIONS_CHAIN__OPERATORS:
        getOperators().clear();
        return;
      case RailsPackage.OPERATIONS_CHAIN__OPERANTS:
        getOperants().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RailsPackage.OPERATIONS_CHAIN__OPERATORS:
        return operators != null && !operators.isEmpty();
      case RailsPackage.OPERATIONS_CHAIN__OPERANTS:
        return operants != null && !operants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operators: ");
    result.append(operators);
    result.append(", operants: ");
    result.append(operants);
    result.append(')');
    return result.toString();
  }

} //OperationsChainImpl
