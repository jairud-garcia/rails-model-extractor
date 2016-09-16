/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.EString;
import co.gruposaberes.model.rails.RailsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EString</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.impl.EStringImpl#getClass_name <em>Class name</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.impl.EStringImpl#getDependent <em>Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EStringImpl extends MinimalEObjectImpl.Container implements EString
{
  /**
   * The default value of the '{@link #getClass_name() <em>Class name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_name()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_name() <em>Class name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_name()
   * @generated
   * @ordered
   */
  protected String class_name = CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDependent() <em>Dependent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependent()
   * @generated
   * @ordered
   */
  protected static final String DEPENDENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDependent() <em>Dependent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependent()
   * @generated
   * @ordered
   */
  protected String dependent = DEPENDENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStringImpl()
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
    return RailsPackage.Literals.ESTRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_name()
  {
    return class_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_name(String newClass_name)
  {
    String oldClass_name = class_name;
    class_name = newClass_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailsPackage.ESTRING__CLASS_NAME, oldClass_name, class_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDependent()
  {
    return dependent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependent(String newDependent)
  {
    String oldDependent = dependent;
    dependent = newDependent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailsPackage.ESTRING__DEPENDENT, oldDependent, dependent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RailsPackage.ESTRING__CLASS_NAME:
        return getClass_name();
      case RailsPackage.ESTRING__DEPENDENT:
        return getDependent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RailsPackage.ESTRING__CLASS_NAME:
        setClass_name((String)newValue);
        return;
      case RailsPackage.ESTRING__DEPENDENT:
        setDependent((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RailsPackage.ESTRING__CLASS_NAME:
        setClass_name(CLASS_NAME_EDEFAULT);
        return;
      case RailsPackage.ESTRING__DEPENDENT:
        setDependent(DEPENDENT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RailsPackage.ESTRING__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? class_name != null : !CLASS_NAME_EDEFAULT.equals(class_name);
      case RailsPackage.ESTRING__DEPENDENT:
        return DEPENDENT_EDEFAULT == null ? dependent != null : !DEPENDENT_EDEFAULT.equals(dependent);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (class_name: ");
    result.append(class_name);
    result.append(", dependent: ");
    result.append(dependent);
    result.append(')');
    return result.toString();
  }

} //EStringImpl
