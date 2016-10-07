/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.BelongsTo;
import co.gruposaberes.model.rails.ClassElement;
import co.gruposaberes.model.rails.HasAndBelongsToMany;
import co.gruposaberes.model.rails.HasMany;
import co.gruposaberes.model.rails.HasOne;
import co.gruposaberes.model.rails.HashKeyValue;
import co.gruposaberes.model.rails.OperationsChain;
import co.gruposaberes.model.rails.RailsFactory;
import co.gruposaberes.model.rails.RailsPackage;
import co.gruposaberes.model.rails.Relationship;
import co.gruposaberes.model.rails.RubyClass;
import co.gruposaberes.model.rails.RubyMethod;
import co.gruposaberes.model.rails.TableName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsPackageImpl extends EPackageImpl implements RailsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rubyClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasManyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasOneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasAndBelongsToManyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass belongsToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hashKeyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rubyMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationsChainEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see co.gruposaberes.model.rails.RailsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RailsPackageImpl()
  {
    super(eNS_URI, RailsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RailsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RailsPackage init()
  {
    if (isInited) return (RailsPackage)EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI);

    // Obtain or create and register package
    RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RailsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRailsPackage.createPackageContents();

    // Initialize created meta-data
    theRailsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRailsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RailsPackage.eNS_URI, theRailsPackage);
    return theRailsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRubyClass()
  {
    return rubyClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRubyClass_Name()
  {
    return (EAttribute)rubyClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRubyClass_SuperType()
  {
    return (EAttribute)rubyClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRubyClass_ClassElements()
  {
    return (EReference)rubyClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassElement()
  {
    return classElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassElement_Name()
  {
    return (EAttribute)classElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableName()
  {
    return tableNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship()
  {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_RelationType()
  {
    return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_Options()
  {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasMany()
  {
    return hasManyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasMany_Name()
  {
    return (EAttribute)hasManyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasMany_Options()
  {
    return (EReference)hasManyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasOne()
  {
    return hasOneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasOne_Name()
  {
    return (EAttribute)hasOneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasOne_Options()
  {
    return (EReference)hasOneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasAndBelongsToMany()
  {
    return hasAndBelongsToManyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasAndBelongsToMany_Name()
  {
    return (EAttribute)hasAndBelongsToManyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasAndBelongsToMany_Options()
  {
    return (EReference)hasAndBelongsToManyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBelongsTo()
  {
    return belongsToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBelongsTo_Name()
  {
    return (EAttribute)belongsToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBelongsTo_Options()
  {
    return (EReference)belongsToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHashKeyValue()
  {
    return hashKeyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHashKeyValue_Key()
  {
    return (EAttribute)hashKeyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHashKeyValue_Value()
  {
    return (EAttribute)hashKeyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRubyMethod()
  {
    return rubyMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationsChain()
  {
    return operationsChainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationsChain_Operators()
  {
    return (EAttribute)operationsChainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationsChain_Operants()
  {
    return (EAttribute)operationsChainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailsFactory getRailsFactory()
  {
    return (RailsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rubyClassEClass = createEClass(RUBY_CLASS);
    createEAttribute(rubyClassEClass, RUBY_CLASS__NAME);
    createEAttribute(rubyClassEClass, RUBY_CLASS__SUPER_TYPE);
    createEReference(rubyClassEClass, RUBY_CLASS__CLASS_ELEMENTS);

    classElementEClass = createEClass(CLASS_ELEMENT);
    createEAttribute(classElementEClass, CLASS_ELEMENT__NAME);

    tableNameEClass = createEClass(TABLE_NAME);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEAttribute(relationshipEClass, RELATIONSHIP__RELATION_TYPE);
    createEReference(relationshipEClass, RELATIONSHIP__OPTIONS);

    hasManyEClass = createEClass(HAS_MANY);
    createEAttribute(hasManyEClass, HAS_MANY__NAME);
    createEReference(hasManyEClass, HAS_MANY__OPTIONS);

    hasOneEClass = createEClass(HAS_ONE);
    createEAttribute(hasOneEClass, HAS_ONE__NAME);
    createEReference(hasOneEClass, HAS_ONE__OPTIONS);

    hasAndBelongsToManyEClass = createEClass(HAS_AND_BELONGS_TO_MANY);
    createEAttribute(hasAndBelongsToManyEClass, HAS_AND_BELONGS_TO_MANY__NAME);
    createEReference(hasAndBelongsToManyEClass, HAS_AND_BELONGS_TO_MANY__OPTIONS);

    belongsToEClass = createEClass(BELONGS_TO);
    createEAttribute(belongsToEClass, BELONGS_TO__NAME);
    createEReference(belongsToEClass, BELONGS_TO__OPTIONS);

    hashKeyValueEClass = createEClass(HASH_KEY_VALUE);
    createEAttribute(hashKeyValueEClass, HASH_KEY_VALUE__KEY);
    createEAttribute(hashKeyValueEClass, HASH_KEY_VALUE__VALUE);

    rubyMethodEClass = createEClass(RUBY_METHOD);

    operationsChainEClass = createEClass(OPERATIONS_CHAIN);
    createEAttribute(operationsChainEClass, OPERATIONS_CHAIN__OPERATORS);
    createEAttribute(operationsChainEClass, OPERATIONS_CHAIN__OPERANTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    tableNameEClass.getESuperTypes().add(this.getClassElement());
    relationshipEClass.getESuperTypes().add(this.getClassElement());
    rubyMethodEClass.getESuperTypes().add(this.getClassElement());
    operationsChainEClass.getESuperTypes().add(this.getClassElement());

    // Initialize classes and features; add operations and parameters
    initEClass(rubyClassEClass, RubyClass.class, "RubyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRubyClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, RubyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRubyClass_SuperType(), ecorePackage.getEString(), "superType", null, 0, 1, RubyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRubyClass_ClassElements(), this.getClassElement(), null, "classElements", null, 0, -1, RubyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classElementEClass, ClassElement.class, "ClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableNameEClass, TableName.class, "TableName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationship_RelationType(), ecorePackage.getEString(), "relationType", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_Options(), this.getHashKeyValue(), null, "options", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hasManyEClass, HasMany.class, "HasMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHasMany_Name(), ecorePackage.getEString(), "name", null, 0, 1, HasMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHasMany_Options(), this.getHashKeyValue(), null, "options", null, 0, -1, HasMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hasOneEClass, HasOne.class, "HasOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHasOne_Name(), ecorePackage.getEString(), "name", null, 0, 1, HasOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHasOne_Options(), this.getHashKeyValue(), null, "options", null, 0, -1, HasOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hasAndBelongsToManyEClass, HasAndBelongsToMany.class, "HasAndBelongsToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHasAndBelongsToMany_Name(), ecorePackage.getEString(), "name", null, 0, 1, HasAndBelongsToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHasAndBelongsToMany_Options(), this.getHashKeyValue(), null, "options", null, 0, -1, HasAndBelongsToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(belongsToEClass, BelongsTo.class, "BelongsTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBelongsTo_Name(), ecorePackage.getEString(), "name", null, 0, 1, BelongsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBelongsTo_Options(), this.getHashKeyValue(), null, "options", null, 0, -1, BelongsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hashKeyValueEClass, HashKeyValue.class, "HashKeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHashKeyValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, HashKeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHashKeyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, HashKeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rubyMethodEClass, RubyMethod.class, "RubyMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationsChainEClass, OperationsChain.class, "OperationsChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationsChain_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, OperationsChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperationsChain_Operants(), ecorePackage.getEString(), "operants", null, 0, -1, OperationsChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RailsPackageImpl
