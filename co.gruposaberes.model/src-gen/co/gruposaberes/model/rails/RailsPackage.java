/**
 */
package co.gruposaberes.model.rails;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.gruposaberes.model.rails.RailsFactory
 * @model kind="package"
 * @generated
 */
public interface RailsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rails";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gruposaberes.co/model/Rails";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rails";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RailsPackage eINSTANCE = co.gruposaberes.model.rails.impl.RailsPackageImpl.init();

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.RubyClassImpl <em>Ruby Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.RubyClassImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyClass()
   * @generated
   */
  int RUBY_CLASS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBY_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBY_CLASS__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Class Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBY_CLASS__CLASS_ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Ruby Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBY_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.ClassElementImpl <em>Class Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.ClassElementImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getClassElement()
   * @generated
   */
  int CLASS_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Class Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.TableNameImpl <em>Table Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.TableNameImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getTableName()
   * @generated
   */
  int TABLE_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_NAME__NAME = CLASS_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Table Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_NAME_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.RelationshipImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = CLASS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Relation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__RELATION_TYPE = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__OPTIONS = CLASS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HasManyImpl <em>Has Many</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HasManyImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasMany()
   * @generated
   */
  int HAS_MANY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_MANY__NAME = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_MANY__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Has Many</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_MANY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HasOneImpl <em>Has One</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HasOneImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasOne()
   * @generated
   */
  int HAS_ONE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_ONE__NAME = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_ONE__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Has One</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_ONE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl <em>Has And Belongs To Many</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasAndBelongsToMany()
   * @generated
   */
  int HAS_AND_BELONGS_TO_MANY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_AND_BELONGS_TO_MANY__NAME = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_AND_BELONGS_TO_MANY__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Has And Belongs To Many</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_AND_BELONGS_TO_MANY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.BelongsToImpl <em>Belongs To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.BelongsToImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getBelongsTo()
   * @generated
   */
  int BELONGS_TO = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO__NAME = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Belongs To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HashKeyValueImpl <em>Hash Key Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HashKeyValueImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHashKeyValue()
   * @generated
   */
  int HASH_KEY_VALUE = 8;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASH_KEY_VALUE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASH_KEY_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Hash Key Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASH_KEY_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.RubyMethodImpl <em>Ruby Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.RubyMethodImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyMethod()
   * @generated
   */
  int RUBY_METHOD = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBY_METHOD__NAME = CLASS_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Ruby Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUBY_METHOD_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.OperationsChainImpl <em>Operations Chain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.OperationsChainImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getOperationsChain()
   * @generated
   */
  int OPERATIONS_CHAIN = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_CHAIN__NAME = CLASS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_CHAIN__OPERATORS = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operants</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_CHAIN__OPERANTS = CLASS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operations Chain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_CHAIN_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.RubyClass <em>Ruby Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ruby Class</em>'.
   * @see co.gruposaberes.model.rails.RubyClass
   * @generated
   */
  EClass getRubyClass();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.RubyClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.gruposaberes.model.rails.RubyClass#getName()
   * @see #getRubyClass()
   * @generated
   */
  EAttribute getRubyClass_Name();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.RubyClass#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Type</em>'.
   * @see co.gruposaberes.model.rails.RubyClass#getSuperType()
   * @see #getRubyClass()
   * @generated
   */
  EAttribute getRubyClass_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.RubyClass#getClassElements <em>Class Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Elements</em>'.
   * @see co.gruposaberes.model.rails.RubyClass#getClassElements()
   * @see #getRubyClass()
   * @generated
   */
  EReference getRubyClass_ClassElements();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.ClassElement <em>Class Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Element</em>'.
   * @see co.gruposaberes.model.rails.ClassElement
   * @generated
   */
  EClass getClassElement();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.ClassElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.gruposaberes.model.rails.ClassElement#getName()
   * @see #getClassElement()
   * @generated
   */
  EAttribute getClassElement_Name();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.TableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Name</em>'.
   * @see co.gruposaberes.model.rails.TableName
   * @generated
   */
  EClass getTableName();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see co.gruposaberes.model.rails.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.Relationship#getRelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation Type</em>'.
   * @see co.gruposaberes.model.rails.Relationship#getRelationType()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_RelationType();

  /**
   * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.Relationship#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see co.gruposaberes.model.rails.Relationship#getOptions()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Options();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.HasMany <em>Has Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Many</em>'.
   * @see co.gruposaberes.model.rails.HasMany
   * @generated
   */
  EClass getHasMany();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.HasMany#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.gruposaberes.model.rails.HasMany#getName()
   * @see #getHasMany()
   * @generated
   */
  EAttribute getHasMany_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.HasMany#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see co.gruposaberes.model.rails.HasMany#getOptions()
   * @see #getHasMany()
   * @generated
   */
  EReference getHasMany_Options();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.HasOne <em>Has One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has One</em>'.
   * @see co.gruposaberes.model.rails.HasOne
   * @generated
   */
  EClass getHasOne();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.HasOne#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.gruposaberes.model.rails.HasOne#getName()
   * @see #getHasOne()
   * @generated
   */
  EAttribute getHasOne_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.HasOne#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see co.gruposaberes.model.rails.HasOne#getOptions()
   * @see #getHasOne()
   * @generated
   */
  EReference getHasOne_Options();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.HasAndBelongsToMany <em>Has And Belongs To Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has And Belongs To Many</em>'.
   * @see co.gruposaberes.model.rails.HasAndBelongsToMany
   * @generated
   */
  EClass getHasAndBelongsToMany();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.HasAndBelongsToMany#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.gruposaberes.model.rails.HasAndBelongsToMany#getName()
   * @see #getHasAndBelongsToMany()
   * @generated
   */
  EAttribute getHasAndBelongsToMany_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.HasAndBelongsToMany#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see co.gruposaberes.model.rails.HasAndBelongsToMany#getOptions()
   * @see #getHasAndBelongsToMany()
   * @generated
   */
  EReference getHasAndBelongsToMany_Options();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.BelongsTo <em>Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To</em>'.
   * @see co.gruposaberes.model.rails.BelongsTo
   * @generated
   */
  EClass getBelongsTo();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.BelongsTo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.gruposaberes.model.rails.BelongsTo#getName()
   * @see #getBelongsTo()
   * @generated
   */
  EAttribute getBelongsTo_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.BelongsTo#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see co.gruposaberes.model.rails.BelongsTo#getOptions()
   * @see #getBelongsTo()
   * @generated
   */
  EReference getBelongsTo_Options();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.HashKeyValue <em>Hash Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hash Key Value</em>'.
   * @see co.gruposaberes.model.rails.HashKeyValue
   * @generated
   */
  EClass getHashKeyValue();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.HashKeyValue#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see co.gruposaberes.model.rails.HashKeyValue#getKey()
   * @see #getHashKeyValue()
   * @generated
   */
  EAttribute getHashKeyValue_Key();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.HashKeyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see co.gruposaberes.model.rails.HashKeyValue#getValue()
   * @see #getHashKeyValue()
   * @generated
   */
  EAttribute getHashKeyValue_Value();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.RubyMethod <em>Ruby Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ruby Method</em>'.
   * @see co.gruposaberes.model.rails.RubyMethod
   * @generated
   */
  EClass getRubyMethod();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.OperationsChain <em>Operations Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operations Chain</em>'.
   * @see co.gruposaberes.model.rails.OperationsChain
   * @generated
   */
  EClass getOperationsChain();

  /**
   * Returns the meta object for the attribute list '{@link co.gruposaberes.model.rails.OperationsChain#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see co.gruposaberes.model.rails.OperationsChain#getOperators()
   * @see #getOperationsChain()
   * @generated
   */
  EAttribute getOperationsChain_Operators();

  /**
   * Returns the meta object for the attribute list '{@link co.gruposaberes.model.rails.OperationsChain#getOperants <em>Operants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operants</em>'.
   * @see co.gruposaberes.model.rails.OperationsChain#getOperants()
   * @see #getOperationsChain()
   * @generated
   */
  EAttribute getOperationsChain_Operants();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RailsFactory getRailsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.RubyClassImpl <em>Ruby Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.RubyClassImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyClass()
     * @generated
     */
    EClass RUBY_CLASS = eINSTANCE.getRubyClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUBY_CLASS__NAME = eINSTANCE.getRubyClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUBY_CLASS__SUPER_TYPE = eINSTANCE.getRubyClass_SuperType();

    /**
     * The meta object literal for the '<em><b>Class Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUBY_CLASS__CLASS_ELEMENTS = eINSTANCE.getRubyClass_ClassElements();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.ClassElementImpl <em>Class Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.ClassElementImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getClassElement()
     * @generated
     */
    EClass CLASS_ELEMENT = eINSTANCE.getClassElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_ELEMENT__NAME = eINSTANCE.getClassElement_Name();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.TableNameImpl <em>Table Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.TableNameImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getTableName()
     * @generated
     */
    EClass TABLE_NAME = eINSTANCE.getTableName();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.RelationshipImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__RELATION_TYPE = eINSTANCE.getRelationship_RelationType();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__OPTIONS = eINSTANCE.getRelationship_Options();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.HasManyImpl <em>Has Many</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.HasManyImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasMany()
     * @generated
     */
    EClass HAS_MANY = eINSTANCE.getHasMany();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAS_MANY__NAME = eINSTANCE.getHasMany_Name();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_MANY__OPTIONS = eINSTANCE.getHasMany_Options();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.HasOneImpl <em>Has One</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.HasOneImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasOne()
     * @generated
     */
    EClass HAS_ONE = eINSTANCE.getHasOne();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAS_ONE__NAME = eINSTANCE.getHasOne_Name();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_ONE__OPTIONS = eINSTANCE.getHasOne_Options();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl <em>Has And Belongs To Many</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasAndBelongsToMany()
     * @generated
     */
    EClass HAS_AND_BELONGS_TO_MANY = eINSTANCE.getHasAndBelongsToMany();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAS_AND_BELONGS_TO_MANY__NAME = eINSTANCE.getHasAndBelongsToMany_Name();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_AND_BELONGS_TO_MANY__OPTIONS = eINSTANCE.getHasAndBelongsToMany_Options();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.BelongsToImpl <em>Belongs To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.BelongsToImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getBelongsTo()
     * @generated
     */
    EClass BELONGS_TO = eINSTANCE.getBelongsTo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BELONGS_TO__NAME = eINSTANCE.getBelongsTo_Name();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BELONGS_TO__OPTIONS = eINSTANCE.getBelongsTo_Options();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.HashKeyValueImpl <em>Hash Key Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.HashKeyValueImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHashKeyValue()
     * @generated
     */
    EClass HASH_KEY_VALUE = eINSTANCE.getHashKeyValue();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HASH_KEY_VALUE__KEY = eINSTANCE.getHashKeyValue_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HASH_KEY_VALUE__VALUE = eINSTANCE.getHashKeyValue_Value();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.RubyMethodImpl <em>Ruby Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.RubyMethodImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyMethod()
     * @generated
     */
    EClass RUBY_METHOD = eINSTANCE.getRubyMethod();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.OperationsChainImpl <em>Operations Chain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.OperationsChainImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getOperationsChain()
     * @generated
     */
    EClass OPERATIONS_CHAIN = eINSTANCE.getOperationsChain();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATIONS_CHAIN__OPERATORS = eINSTANCE.getOperationsChain_Operators();

    /**
     * The meta object literal for the '<em><b>Operants</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATIONS_CHAIN__OPERANTS = eINSTANCE.getOperationsChain_Operants();

  }

} //RailsPackage
