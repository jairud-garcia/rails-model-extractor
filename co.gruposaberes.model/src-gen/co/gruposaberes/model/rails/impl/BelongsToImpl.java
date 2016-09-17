/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.BelongsTo;
import co.gruposaberes.model.rails.RailsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Belongs To</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BelongsToImpl extends RelationshipImpl implements BelongsTo
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BelongsToImpl()
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
    return RailsPackage.Literals.BELONGS_TO;
  }

} //BelongsToImpl
