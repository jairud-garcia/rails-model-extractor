/**
 */
package universal.visualization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import universal.visualization.Alignment;
import universal.visualization.Position;
import universal.visualization.VLabel;
import universal.visualization.VisualizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VLabel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.impl.VLabelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link universal.visualization.impl.VLabelImpl#getFont <em>Font</em>}</li>
 *   <li>{@link universal.visualization.impl.VLabelImpl#isIsBold <em>Is Bold</em>}</li>
 *   <li>{@link universal.visualization.impl.VLabelImpl#isIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link universal.visualization.impl.VLabelImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link universal.visualization.impl.VLabelImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VLabelImpl extends MinimalEObjectImpl.Container implements VLabel {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected boolean isBold = IS_BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean isItalic = IS_ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment ALIGNMENT_EDEFAULT = Alignment.CENTER;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.BORDER;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.VLABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VLABEL__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VLABEL__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBold() {
		return isBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBold(boolean newIsBold) {
		boolean oldIsBold = isBold;
		isBold = newIsBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VLABEL__IS_BOLD, oldIsBold, isBold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsItalic() {
		return isItalic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItalic(boolean newIsItalic) {
		boolean oldIsItalic = isItalic;
		isItalic = newIsItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VLABEL__IS_ITALIC, oldIsItalic, isItalic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(Alignment newAlignment) {
		Alignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VLABEL__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VLABEL__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.VLABEL__SIZE:
				return getSize();
			case VisualizationPackage.VLABEL__FONT:
				return getFont();
			case VisualizationPackage.VLABEL__IS_BOLD:
				return isIsBold();
			case VisualizationPackage.VLABEL__IS_ITALIC:
				return isIsItalic();
			case VisualizationPackage.VLABEL__ALIGNMENT:
				return getAlignment();
			case VisualizationPackage.VLABEL__POSITION:
				return getPosition();
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
			case VisualizationPackage.VLABEL__SIZE:
				setSize((Integer)newValue);
				return;
			case VisualizationPackage.VLABEL__FONT:
				setFont((String)newValue);
				return;
			case VisualizationPackage.VLABEL__IS_BOLD:
				setIsBold((Boolean)newValue);
				return;
			case VisualizationPackage.VLABEL__IS_ITALIC:
				setIsItalic((Boolean)newValue);
				return;
			case VisualizationPackage.VLABEL__ALIGNMENT:
				setAlignment((Alignment)newValue);
				return;
			case VisualizationPackage.VLABEL__POSITION:
				setPosition((Position)newValue);
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
			case VisualizationPackage.VLABEL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case VisualizationPackage.VLABEL__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case VisualizationPackage.VLABEL__IS_BOLD:
				setIsBold(IS_BOLD_EDEFAULT);
				return;
			case VisualizationPackage.VLABEL__IS_ITALIC:
				setIsItalic(IS_ITALIC_EDEFAULT);
				return;
			case VisualizationPackage.VLABEL__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case VisualizationPackage.VLABEL__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case VisualizationPackage.VLABEL__SIZE:
				return size != SIZE_EDEFAULT;
			case VisualizationPackage.VLABEL__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case VisualizationPackage.VLABEL__IS_BOLD:
				return isBold != IS_BOLD_EDEFAULT;
			case VisualizationPackage.VLABEL__IS_ITALIC:
				return isItalic != IS_ITALIC_EDEFAULT;
			case VisualizationPackage.VLABEL__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case VisualizationPackage.VLABEL__POSITION:
				return position != POSITION_EDEFAULT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", font: ");
		result.append(font);
		result.append(", isBold: ");
		result.append(isBold);
		result.append(", isItalic: ");
		result.append(isItalic);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //VLabelImpl
