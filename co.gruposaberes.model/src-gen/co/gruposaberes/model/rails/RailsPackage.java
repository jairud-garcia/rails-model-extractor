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
	 * The meta object id for the '{@link co.gruposaberes.model.rails.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.gruposaberes.model.rails.impl.ApplicationImpl
	 * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

		/**
	 * The feature id for the '<em><b>Ruby Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RUBY_CLASSES = 1;

		/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

		/**
	 * The meta object id for the '{@link co.gruposaberes.model.rails.impl.RubyClassImpl <em>Ruby Class</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see co.gruposaberes.model.rails.impl.RubyClassImpl
	 * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getRubyClass()
	 * @generated
	 */
  int RUBY_CLASS = 1;

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
  int CLASS_ELEMENT = 2;

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
  int TABLE_NAME = 3;

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
  int RELATIONSHIP = 4;

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
	 * The meta object id for the '{@link co.gruposaberes.model.rails.impl.HashKeyValueImpl <em>Hash Key Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see co.gruposaberes.model.rails.impl.HashKeyValueImpl
	 * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getHashKeyValue()
	 * @generated
	 */
  int HASH_KEY_VALUE = 5;

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
  int RUBY_METHOD = 6;

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
  int OPERATIONS_CHAIN = 7;

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
	 * Returns the meta object for class '{@link co.gruposaberes.model.rails.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see co.gruposaberes.model.rails.Application
	 * @generated
	 */
	EClass getApplication();

		/**
	 * Returns the meta object for the attribute '{@link co.gruposaberes.model.rails.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.gruposaberes.model.rails.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

		/**
	 * Returns the meta object for the containment reference list '{@link co.gruposaberes.model.rails.Application#getRubyClasses <em>Ruby Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruby Classes</em>'.
	 * @see co.gruposaberes.model.rails.Application#getRubyClasses()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_RubyClasses();

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
		 * The meta object literal for the '{@link co.gruposaberes.model.rails.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.gruposaberes.model.rails.impl.ApplicationImpl
		 * @see co.gruposaberes.model.rails.impl.RailsPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

			/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

			/**
		 * The meta object literal for the '<em><b>Ruby Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RUBY_CLASSES = eINSTANCE.getApplication_RubyClasses();

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
