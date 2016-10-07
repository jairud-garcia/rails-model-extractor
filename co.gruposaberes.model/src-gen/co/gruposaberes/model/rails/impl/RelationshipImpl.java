/**
 */
package co.gruposaberes.model.rails.impl;

import co.gruposaberes.model.rails.HashKeyValue;
import co.gruposaberes.model.rails.RailsPackage;
import co.gruposaberes.model.rails.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.gruposaberes.model.rails.impl.RelationshipImpl#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link co.gruposaberes.model.rails.impl.RelationshipImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends ClassElementImpl implements Relationship
{
  /**
   * The default value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationType()
   * @generated
   * @ordered
   */
  protected static final String RELATION_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationType()
   * @generated
   * @ordered
   */
  protected String relationType = RELATION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<HashKeyValue> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
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
    return RailsPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationType()
  {
    return relationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationType(String newRelationType)
  {
    String oldRelationType = relationType;
    relationType = newRelationType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailsPackage.RELATIONSHIP__RELATION_TYPE, oldRelationType, relationType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HashKeyValue> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<HashKeyValue>(HashKeyValue.class, this, RailsPackage.RELATIONSHIP__OPTIONS);
    }
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RailsPackage.RELATIONSHIP__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RailsPackage.RELATIONSHIP__RELATION_TYPE:
        return getRelationType();
      case RailsPackage.RELATIONSHIP__OPTIONS:
        return getOptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RailsPackage.RELATIONSHIP__RELATION_TYPE:
        setRelationType((String)newValue);
        return;
      case RailsPackage.RELATIONSHIP__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends HashKeyValue>)newValue);
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
      case RailsPackage.RELATIONSHIP__RELATION_TYPE:
        setRelationType(RELATION_TYPE_EDEFAULT);
        return;
      case RailsPackage.RELATIONSHIP__OPTIONS:
        getOptions().clear();
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
      case RailsPackage.RELATIONSHIP__RELATION_TYPE:
        return RELATION_TYPE_EDEFAULT == null ? relationType != null : !RELATION_TYPE_EDEFAULT.equals(relationType);
      case RailsPackage.RELATIONSHIP__OPTIONS:
        return options != null && !options.isEmpty();
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
    result.append(" (relationType: ");
    result.append(relationType);
    result.append(')');
    return result.toString();
  }

} //RelationshipImpl
