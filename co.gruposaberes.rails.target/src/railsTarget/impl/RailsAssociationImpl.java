/**
 */
package railsTarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import railsTarget.RailsAssociation;
import railsTarget.RailsAssociationType;
import railsTarget.RailsCardinality;
import railsTarget.RailsClass;
import railsTarget.RailsTargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rails Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getForeignKeyColumnName <em>Foreign Key Column Name</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link railsTarget.impl.RailsAssociationImpl#getAssociationType <em>Association Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailsAssociationImpl extends MinimalEObjectImpl.Container implements RailsAssociation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected RailsClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RailsClass target;

	/**
	 * The default value of the '{@link #getForeignKeyColumnName() <em>Foreign Key Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKeyColumnName() <em>Foreign Key Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyColumnName()
	 * @generated
	 * @ordered
	 */
	protected String foreignKeyColumnName = FOREIGN_KEY_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleName()
	 * @generated
	 * @ordered
	 */
	protected String sourceRoleName = SOURCE_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoleName()
	 * @generated
	 * @ordered
	 */
	protected String targetRoleName = TARGET_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final RailsCardinality SOURCE_CARDINALITY_EDEFAULT = RailsCardinality.NONE;

	/**
	 * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected RailsCardinality sourceCardinality = SOURCE_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final RailsCardinality TARGET_CARDINALITY_EDEFAULT = RailsCardinality.NONE;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected RailsCardinality targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected static final RailsAssociationType ASSOCIATION_TYPE_EDEFAULT = RailsAssociationType.AGGREGATION;

	/**
	 * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected RailsAssociationType associationType = ASSOCIATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailsAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailsTargetPackage.Literals.RAILS_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (RailsClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailsTargetPackage.RAILS_ASSOCIATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RailsClass newSource) {
		RailsClass oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (RailsClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailsTargetPackage.RAILS_ASSOCIATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RailsClass newTarget) {
		RailsClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKeyColumnName() {
		return foreignKeyColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyColumnName(String newForeignKeyColumnName) {
		String oldForeignKeyColumnName = foreignKeyColumnName;
		foreignKeyColumnName = newForeignKeyColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME, oldForeignKeyColumnName, foreignKeyColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRoleName() {
		return sourceRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRoleName(String newSourceRoleName) {
		String oldSourceRoleName = sourceRoleName;
		sourceRoleName = newSourceRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_ROLE_NAME, oldSourceRoleName, sourceRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRoleName() {
		return targetRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRoleName(String newTargetRoleName) {
		String oldTargetRoleName = targetRoleName;
		targetRoleName = newTargetRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__TARGET_ROLE_NAME, oldTargetRoleName, targetRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsCardinality getSourceCardinality() {
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCardinality(RailsCardinality newSourceCardinality) {
		RailsCardinality oldSourceCardinality = sourceCardinality;
		sourceCardinality = newSourceCardinality == null ? SOURCE_CARDINALITY_EDEFAULT : newSourceCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_CARDINALITY, oldSourceCardinality, sourceCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsCardinality getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCardinality(RailsCardinality newTargetCardinality) {
		RailsCardinality oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsAssociationType getAssociationType() {
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationType(RailsAssociationType newAssociationType) {
		RailsAssociationType oldAssociationType = associationType;
		associationType = newAssociationType == null ? ASSOCIATION_TYPE_EDEFAULT : newAssociationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailsTargetPackage.RAILS_ASSOCIATION__ASSOCIATION_TYPE, oldAssociationType, associationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case RailsTargetPackage.RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME:
				return getForeignKeyColumnName();
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_ROLE_NAME:
				return getSourceRoleName();
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_ROLE_NAME:
				return getTargetRoleName();
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_CARDINALITY:
				return getSourceCardinality();
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_CARDINALITY:
				return getTargetCardinality();
			case RailsTargetPackage.RAILS_ASSOCIATION__ASSOCIATION_TYPE:
				return getAssociationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE:
				setSource((RailsClass)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET:
				setTarget((RailsClass)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME:
				setForeignKeyColumnName((String)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_ROLE_NAME:
				setSourceRoleName((String)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_ROLE_NAME:
				setTargetRoleName((String)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_CARDINALITY:
				setSourceCardinality((RailsCardinality)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_CARDINALITY:
				setTargetCardinality((RailsCardinality)newValue);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__ASSOCIATION_TYPE:
				setAssociationType((RailsAssociationType)newValue);
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
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE:
				setSource((RailsClass)null);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET:
				setTarget((RailsClass)null);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME:
				setForeignKeyColumnName(FOREIGN_KEY_COLUMN_NAME_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_ROLE_NAME:
				setSourceRoleName(SOURCE_ROLE_NAME_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_ROLE_NAME:
				setTargetRoleName(TARGET_ROLE_NAME_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_CARDINALITY:
				setSourceCardinality(SOURCE_CARDINALITY_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
			case RailsTargetPackage.RAILS_ASSOCIATION__ASSOCIATION_TYPE:
				setAssociationType(ASSOCIATION_TYPE_EDEFAULT);
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
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE:
				return source != null;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET:
				return target != null;
			case RailsTargetPackage.RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME:
				return FOREIGN_KEY_COLUMN_NAME_EDEFAULT == null ? foreignKeyColumnName != null : !FOREIGN_KEY_COLUMN_NAME_EDEFAULT.equals(foreignKeyColumnName);
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_ROLE_NAME:
				return SOURCE_ROLE_NAME_EDEFAULT == null ? sourceRoleName != null : !SOURCE_ROLE_NAME_EDEFAULT.equals(sourceRoleName);
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_ROLE_NAME:
				return TARGET_ROLE_NAME_EDEFAULT == null ? targetRoleName != null : !TARGET_ROLE_NAME_EDEFAULT.equals(targetRoleName);
			case RailsTargetPackage.RAILS_ASSOCIATION__SOURCE_CARDINALITY:
				return sourceCardinality != SOURCE_CARDINALITY_EDEFAULT;
			case RailsTargetPackage.RAILS_ASSOCIATION__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
			case RailsTargetPackage.RAILS_ASSOCIATION__ASSOCIATION_TYPE:
				return associationType != ASSOCIATION_TYPE_EDEFAULT;
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
		result.append(" (foreignKeyColumnName: ");
		result.append(foreignKeyColumnName);
		result.append(", sourceRoleName: ");
		result.append(sourceRoleName);
		result.append(", targetRoleName: ");
		result.append(targetRoleName);
		result.append(", sourceCardinality: ");
		result.append(sourceCardinality);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(", associationType: ");
		result.append(associationType);
		result.append(')');
		return result.toString();
	}

} //RailsAssociationImpl
