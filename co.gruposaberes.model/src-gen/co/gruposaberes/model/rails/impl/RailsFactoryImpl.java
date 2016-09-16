/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsFactoryImpl extends EFactoryImpl implements RailsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RailsFactory init()
  {
    try
    {
      RailsFactory theRailsFactory = (RailsFactory)EPackage.Registry.INSTANCE.getEFactory(RailsPackage.eNS_URI);
      if (theRailsFactory != null)
      {
        return theRailsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RailsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RailsPackage.RUBY_CLASS: return createRubyClass();
      case RailsPackage.CLASS_ELEMENT: return createClassElement();
      case RailsPackage.RELATIONSHIP: return createRelationship();
      case RailsPackage.HAS_MANY: return createHasMany();
      case RailsPackage.HAS_AND_BELONGS_TO_MANY: return createHasAndBelongsToMany();
      case RailsPackage.ESTRING: return createEString();
      case RailsPackage.HASH_KEY_VALUE: return createHashKeyValue();
      case RailsPackage.BELONGS_TO: return createBelongsTo();
      case RailsPackage.RUBY_METHOD: return createRubyMethod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RubyClass createRubyClass()
  {
    RubyClassImpl rubyClass = new RubyClassImpl();
    return rubyClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassElement createClassElement()
  {
    ClassElementImpl classElement = new ClassElementImpl();
    return classElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasMany createHasMany()
  {
    HasManyImpl hasMany = new HasManyImpl();
    return hasMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasAndBelongsToMany createHasAndBelongsToMany()
  {
    HasAndBelongsToManyImpl hasAndBelongsToMany = new HasAndBelongsToManyImpl();
    return hasAndBelongsToMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString createEString()
  {
    EStringImpl eString = new EStringImpl();
    return eString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HashKeyValue createHashKeyValue()
  {
    HashKeyValueImpl hashKeyValue = new HashKeyValueImpl();
    return hashKeyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BelongsTo createBelongsTo()
  {
    BelongsToImpl belongsTo = new BelongsToImpl();
    return belongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RubyMethod createRubyMethod()
  {
    RubyMethodImpl rubyMethod = new RubyMethodImpl();
    return rubyMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailsPackage getRailsPackage()
  {
    return (RailsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RailsPackage getPackage()
  {
    return RailsPackage.eINSTANCE;
  }

} //RailsFactoryImpl
