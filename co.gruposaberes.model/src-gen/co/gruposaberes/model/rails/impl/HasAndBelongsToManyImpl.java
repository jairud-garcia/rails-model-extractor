/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.HasAndBelongsToMany;
import co.gruposaberes.model.rails.RailsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has And Belongs To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HasAndBelongsToManyImpl extends RelationshipImpl implements HasAndBelongsToMany
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HasAndBelongsToManyImpl()
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
    return RailsPackage.Literals.HAS_AND_BELONGS_TO_MANY;
  }

} //HasAndBelongsToManyImpl
