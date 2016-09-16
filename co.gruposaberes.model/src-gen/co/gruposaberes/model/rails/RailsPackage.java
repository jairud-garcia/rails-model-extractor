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
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.RelationshipImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = CLASS_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HasManyImpl <em>Has Many</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HasManyImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasMany()
   * @generated
   */
  int HAS_MANY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_MANY__NAME = RELATIONSHIP__NAME;

  /**
   * The number of structural features of the '<em>Has Many</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_MANY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl <em>Has And Belongs To Many</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasAndBelongsToMany()
   * @generated
   */
  int HAS_AND_BELONGS_TO_MANY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_AND_BELONGS_TO_MANY__NAME = RELATIONSHIP__NAME;

  /**
   * The number of structural features of the '<em>Has And Belongs To Many</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_AND_BELONGS_TO_MANY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.EStringImpl <em>EString</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.EStringImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getEString()
   * @generated
   */
  int ESTRING = 5;

  /**
   * The feature id for the '<em><b>Class name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING__CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Dependent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING__DEPENDENT = 1;

  /**
   * The number of structural features of the '<em>EString</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HashKeyValueImpl <em>Hash Key Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.HashKeyValueImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHashKeyValue()
   * @generated
   */
  int HASH_KEY_VALUE = 6;

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
  int BELONGS_TO__NAME = RELATIONSHIP__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO__OPTIONS = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Belongs To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.gruposaberes.model.rails.impl.RubyMethodImpl <em>Ruby Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.gruposaberes.model.rails.impl.RubyMethodImpl
   * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyMethod()
   * @generated
   */
  int RUBY_METHOD = 8;

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
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see co.gruposaberes.model.rails.Relationship
   * @generated
   */
  EClass getRelationship();

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
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.HasAndBelongsToMany <em>Has And Belongs To Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has And Belongs To Many</em>'.
   * @see co.gruposaberes.model.rails.HasAndBelongsToMany
   * @generated
   */
  EClass getHasAndBelongsToMany();

  /**
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.EString <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EString</em>'.
   * @see co.gruposaberes.model.rails.EString
   * @generated
   */
  EClass getEString();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.EString#getClass_name <em>Class name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class name</em>'.
   * @see co.gruposaberes.model.rails.EString#getClass_name()
   * @see #getEString()
   * @generated
   */
  EAttribute getEString_Class_name();

  /**
   * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.EString#getDependent <em>Dependent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dependent</em>'.
   * @see co.gruposaberes.model.rails.EString#getDependent()
   * @see #getEString()
   * @generated
   */
  EAttribute getEString_Dependent();

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
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.BelongsTo <em>Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To</em>'.
   * @see co.gruposaberes.model.rails.BelongsTo
   * @generated
   */
  EClass getBelongsTo();

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
   * Returns the meta object for class '{@link co.gruposaberes.model.rails.RubyMethod <em>Ruby Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ruby Method</em>'.
   * @see co.gruposaberes.model.rails.RubyMethod
   * @generated
   */
  EClass getRubyMethod();

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
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.RelationshipImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

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
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl <em>Has And Belongs To Many</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.HasAndBelongsToManyImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHasAndBelongsToMany()
     * @generated
     */
    EClass HAS_AND_BELONGS_TO_MANY = eINSTANCE.getHasAndBelongsToMany();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.EStringImpl <em>EString</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.EStringImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getEString()
     * @generated
     */
    EClass ESTRING = eINSTANCE.getEString();

    /**
     * The meta object literal for the '<em><b>Class name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTRING__CLASS_NAME = eINSTANCE.getEString_Class_name();

    /**
     * The meta object literal for the '<em><b>Dependent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTRING__DEPENDENT = eINSTANCE.getEString_Dependent();

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
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.BelongsToImpl <em>Belongs To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.BelongsToImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getBelongsTo()
     * @generated
     */
    EClass BELONGS_TO = eINSTANCE.getBelongsTo();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BELONGS_TO__OPTIONS = eINSTANCE.getBelongsTo_Options();

    /**
     * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.RubyMethodImpl <em>Ruby Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.gruposaberes.model.rails.impl.RubyMethodImpl
     * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyMethod()
     * @generated
     */
    EClass RUBY_METHOD = eINSTANCE.getRubyMethod();

  }

} //RailsPackage
