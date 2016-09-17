/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.gruposaberes.model.rails.RailsPackage
 * @generated
 */
public interface RailsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RailsFactory eINSTANCE = co.gruposaberes.model.rails.impl.RailsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ruby Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ruby Class</em>'.
   * @generated
   */
  RubyClass createRubyClass();

  /**
   * Returns a new object of class '<em>Class Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Element</em>'.
   * @generated
   */
  ClassElement createClassElement();

  /**
   * Returns a new object of class '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship</em>'.
   * @generated
   */
  Relationship createRelationship();

  /**
   * Returns a new object of class '<em>Has Many</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Many</em>'.
   * @generated
   */
  HasMany createHasMany();

  /**
   * Returns a new object of class '<em>Has And Belongs To Many</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has And Belongs To Many</em>'.
   * @generated
   */
  HasAndBelongsToMany createHasAndBelongsToMany();

  /**
   * Returns a new object of class '<em>Belongs To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belongs To</em>'.
   * @generated
   */
  BelongsTo createBelongsTo();

  /**
   * Returns a new object of class '<em>Hash Key Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hash Key Value</em>'.
   * @generated
   */
  HashKeyValue createHashKeyValue();

  /**
   * Returns a new object of class '<em>Ruby Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ruby Method</em>'.
   * @generated
   */
  RubyMethod createRubyMethod();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RailsPackage getRailsPackage();

} //RailsFactory