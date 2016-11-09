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

import railsTarget.RailsApplication;
import railsTarget.RailsAssociation;
import railsTarget.RailsClass;
import railsTarget.RailsNamespace;
import railsTarget.RailsTargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rails Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railsTarget.impl.RailsApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link railsTarget.impl.RailsApplicationImpl#getRailsAssociations <em>Rails Associations</em>}</li>
 *   <li>{@link railsTarget.impl.RailsApplicationImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link railsTarget.impl.RailsApplicationImpl#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailsApplicationImpl extends MinimalEObjectImpl.Container implements RailsApplication {
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
	 * The cached value of the '{@link #getRailsAssociations() <em>Rails Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailsAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<RailsAssociation> railsAssociations;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<RailsClass> classes;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RailsNamespace> namespaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailsApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailsTargetPackage.Literals.RAILS_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailsAssociation> getRailsAssociations() {
		if (railsAssociations == null) {
			railsAssociations = new EObjectContainmentEList<RailsAssociation>(RailsAssociation.class, this, RailsTargetPackage.RAILS_APPLICATION__RAILS_ASSOCIATIONS);
		}
		return railsAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailsClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<RailsClass>(RailsClass.class, this, RailsTargetPackage.RAILS_APPLICATION__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailsNamespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<RailsNamespace>(RailsNamespace.class, this, RailsTargetPackage.RAILS_APPLICATION__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_APPLICATION__RAILS_ASSOCIATIONS:
				return ((InternalEList<?>)getRailsAssociations()).basicRemove(otherEnd, msgs);
			case RailsTargetPackage.RAILS_APPLICATION__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case RailsTargetPackage.RAILS_APPLICATION__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
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
			case RailsTargetPackage.RAILS_APPLICATION__NAME:
				return getName();
			case RailsTargetPackage.RAILS_APPLICATION__RAILS_ASSOCIATIONS:
				return getRailsAssociations();
			case RailsTargetPackage.RAILS_APPLICATION__CLASSES:
				return getClasses();
			case RailsTargetPackage.RAILS_APPLICATION__NAMESPACES:
				return getNamespaces();
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
			case RailsTargetPackage.RAILS_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case RailsTargetPackage.RAILS_APPLICATION__RAILS_ASSOCIATIONS:
				getRailsAssociations().clear();
				getRailsAssociations().addAll((Collection<? extends RailsAssociation>)newValue);
				return;
			case RailsTargetPackage.RAILS_APPLICATION__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends RailsClass>)newValue);
				return;
			case RailsTargetPackage.RAILS_APPLICATION__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends RailsNamespace>)newValue);
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
			case RailsTargetPackage.RAILS_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_APPLICATION__RAILS_ASSOCIATIONS:
				getRailsAssociations().clear();
				return;
			case RailsTargetPackage.RAILS_APPLICATION__CLASSES:
				getClasses().clear();
				return;
			case RailsTargetPackage.RAILS_APPLICATION__NAMESPACES:
				getNamespaces().clear();
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
			case RailsTargetPackage.RAILS_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RailsTargetPackage.RAILS_APPLICATION__RAILS_ASSOCIATIONS:
				return railsAssociations != null && !railsAssociations.isEmpty();
			case RailsTargetPackage.RAILS_APPLICATION__CLASSES:
				return classes != null && !classes.isEmpty();
			case RailsTargetPackage.RAILS_APPLICATION__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
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

} //RailsApplicationImpl
