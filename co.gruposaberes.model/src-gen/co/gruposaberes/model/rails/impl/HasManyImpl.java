/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.HasMany;
import co.gruposaberes.model.rails.RailsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HasManyImpl extends RelationshipImpl implements HasMany
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HasManyImpl()
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
    return RailsPackage.Literals.HAS_MANY;
  }

} //HasManyImpl
