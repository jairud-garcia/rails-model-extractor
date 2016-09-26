/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.HasOne;
import co.gruposaberes.model.rails.RailsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has One</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HasOneImpl extends RelationshipImpl implements HasOne
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HasOneImpl()
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
    return RailsPackage.Literals.HAS_ONE;
  }

} //HasOneImpl
