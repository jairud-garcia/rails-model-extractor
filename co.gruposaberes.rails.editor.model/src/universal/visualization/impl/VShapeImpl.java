/**
 */
package universal.visualization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.visualization.Color;
import universal.visualization.VShape;
import universal.visualization.VisualizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VShape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.impl.VShapeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link universal.visualization.impl.VShapeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link universal.visualization.impl.VShapeImpl#getHeigth <em>Heigth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VShapeImpl extends VDiagramElementImpl implements VShape {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected double heigth = HEIGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.VSHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VSHAPE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VSHAPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeigth() {
		return heigth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigth(double newHeigth) {
		double oldHeigth = heigth;
		heigth = newHeigth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VSHAPE__HEIGTH, oldHeigth, heigth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.VSHAPE__COLOR:
				return getColor();
			case VisualizationPackage.VSHAPE__WIDTH:
				return getWidth();
			case VisualizationPackage.VSHAPE__HEIGTH:
				return getHeigth();
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
			case VisualizationPackage.VSHAPE__COLOR:
				setColor((Color)newValue);
				return;
			case VisualizationPackage.VSHAPE__WIDTH:
				setWidth((Double)newValue);
				return;
			case VisualizationPackage.VSHAPE__HEIGTH:
				setHeigth((Double)newValue);
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
			case VisualizationPackage.VSHAPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VisualizationPackage.VSHAPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case VisualizationPackage.VSHAPE__HEIGTH:
				setHeigth(HEIGTH_EDEFAULT);
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
			case VisualizationPackage.VSHAPE__COLOR:
				return color != COLOR_EDEFAULT;
			case VisualizationPackage.VSHAPE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case VisualizationPackage.VSHAPE__HEIGTH:
				return heigth != HEIGTH_EDEFAULT;
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
		result.append(" (color: ");
		result.append(color);
		result.append(", width: ");
		result.append(width);
		result.append(", heigth: ");
		result.append(heigth);
		result.append(')');
		return result.toString();
	}

} //VShapeImpl
