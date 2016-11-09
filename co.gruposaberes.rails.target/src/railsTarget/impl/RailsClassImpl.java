/**
 */
package railsTarget.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import railsTarget.RailsAttribute;
import railsTarget.RailsClass;
import railsTarget.RailsClassType;
import railsTarget.RailsMethod;
import railsTarget.RailsTargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rails Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railsTarget.impl.RailsClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link railsTarget.impl.RailsClassImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link railsTarget.impl.RailsClassImpl#getClassType <em>Class Type</em>}</li>
 *   <li>{@link railsTarget.impl.RailsClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link railsTarget.impl.RailsClassImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailsClassImpl extends MinimalEObjectImpl.Container implements RailsClass {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected static final RailsClassType CLASS_TYPE_EDEFAULT = RailsClassType.NONE;

	/**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected RailsClassType classType = CLASS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<RailsMethod> methods;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<RailsAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailsClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailsTargetPackage.Literals.RAILS_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_CLASS__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClassType getClassType() {
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassType(RailsClassType newClassType) {
		RailsClassType oldClassType = classType;
		classType = newClassType == null ? CLASS_TYPE_EDEFAULT : newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_CLASS__CLASS_TYPE, oldClassType, classType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailsMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<RailsMethod>(RailsMethod.class, this, RailsTargetPackage.RAILS_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailsAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<RailsAttribute>(RailsAttribute.class, this, RailsTargetPackage.RAILS_CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case RailsTargetPackage.RAILS_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_CLASS__NAME:
				return getName();
			case RailsTargetPackage.RAILS_CLASS__FULL_NAME:
				return getFullName();
			case RailsTargetPackage.RAILS_CLASS__CLASS_TYPE:
				return getClassType();
			case RailsTargetPackage.RAILS_CLASS__METHODS:
				return getMethods();
			case RailsTargetPackage.RAILS_CLASS__ATTRIBUTES:
				return getAttributes();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_CLASS__NAME:
				setName((String)newValue);
				return;
			case RailsTargetPackage.RAILS_CLASS__FULL_NAME:
				setFullName((String)newValue);
				return;
			case RailsTargetPackage.RAILS_CLASS__CLASS_TYPE:
				setClassType((RailsClassType)newValue);
				return;
			case RailsTargetPackage.RAILS_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends RailsMethod>)newValue);
				return;
			case RailsTargetPackage.RAILS_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends RailsAttribute>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_CLASS__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_CLASS__CLASS_TYPE:
				setClassType(CLASS_TYPE_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_CLASS__METHODS:
				getMethods().clear();
				return;
			case RailsTargetPackage.RAILS_CLASS__ATTRIBUTES:
				getAttributes().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RailsTargetPackage.RAILS_CLASS__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case RailsTargetPackage.RAILS_CLASS__CLASS_TYPE:
				return classType != CLASS_TYPE_EDEFAULT;
			case RailsTargetPackage.RAILS_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case RailsTargetPackage.RAILS_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", classType: ");
		result.append(classType);
		result.append(')');
		return result.toString();
	}

} //RailsClassImpl
