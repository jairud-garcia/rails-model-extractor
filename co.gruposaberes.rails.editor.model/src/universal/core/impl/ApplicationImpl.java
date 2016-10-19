/**
 */
package universal.core.impl;

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

import universal.core.Application;
import universal.core.CorePackage;
import universal.core.Element;
import universal.core.Relation;
import universal.core.RelationContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.core.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link universal.core.impl.ApplicationImpl#getBasicElements <em>Basic Elements</em>}</li>
 *   <li>{@link universal.core.impl.ApplicationImpl#getComplexRelationships <em>Complex Relationships</em>}</li>
 *   <li>{@link universal.core.impl.ApplicationImpl#getSimpleRelationships <em>Simple Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
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
	 * The cached value of the '{@link #getBasicElements() <em>Basic Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> basicElements;

	/**
	 * The cached value of the '{@link #getComplexRelationships() <em>Complex Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationContainer> complexRelationships;

	/**
	 * The cached value of the '{@link #getSimpleRelationships() <em>Simple Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> simpleRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getBasicElements() {
		if (basicElements == null) {
			basicElements = new EObjectContainmentEList<Element>(Element.class, this, CorePackage.APPLICATION__BASIC_ELEMENTS);
		}
		return basicElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationContainer> getComplexRelationships() {
		if (complexRelationships == null) {
			complexRelationships = new EObjectContainmentEList<RelationContainer>(RelationContainer.class, this, CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS);
		}
		return complexRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getSimpleRelationships() {
		if (simpleRelationships == null) {
			simpleRelationships = new EObjectContainmentEList<Relation>(Relation.class, this, CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS);
		}
		return simpleRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.APPLICATION__BASIC_ELEMENTS:
				return ((InternalEList<?>)getBasicElements()).basicRemove(otherEnd, msgs);
			case CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS:
				return ((InternalEList<?>)getComplexRelationships()).basicRemove(otherEnd, msgs);
			case CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS:
				return ((InternalEList<?>)getSimpleRelationships()).basicRemove(otherEnd, msgs);
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
			case CorePackage.APPLICATION__NAME:
				return getName();
			case CorePackage.APPLICATION__BASIC_ELEMENTS:
				return getBasicElements();
			case CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS:
				return getComplexRelationships();
			case CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS:
				return getSimpleRelationships();
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
			case CorePackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case CorePackage.APPLICATION__BASIC_ELEMENTS:
				getBasicElements().clear();
				getBasicElements().addAll((Collection<? extends Element>)newValue);
				return;
			case CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS:
				getComplexRelationships().clear();
				getComplexRelationships().addAll((Collection<? extends RelationContainer>)newValue);
				return;
			case CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS:
				getSimpleRelationships().clear();
				getSimpleRelationships().addAll((Collection<? extends Relation>)newValue);
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
			case CorePackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.APPLICATION__BASIC_ELEMENTS:
				getBasicElements().clear();
				return;
			case CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS:
				getComplexRelationships().clear();
				return;
			case CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS:
				getSimpleRelationships().clear();
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
			case CorePackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.APPLICATION__BASIC_ELEMENTS:
				return basicElements != null && !basicElements.isEmpty();
			case CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS:
				return complexRelationships != null && !complexRelationships.isEmpty();
			case CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS:
				return simpleRelationships != null && !simpleRelationships.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
