/**
 */
package universal.visualization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDrawable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.VDrawable#getColor <em>Color</em>}</li>
 *   <li>{@link universal.visualization.VDrawable#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @see universal.visualization.VisualizationPackage#getVDrawable()
 * @model
 * @generated
 */
public interface VDrawable extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link universal.visualization.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see universal.visualization.Color
	 * @see #setColor(Color)
	 * @see universal.visualization.VisualizationPackage#getVDrawable_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link universal.visualization.VDrawable#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see universal.visualization.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(int)
	 * @see universal.visualization.VisualizationPackage#getVDrawable_Thickness()
	 * @model required="true"
	 * @generated
	 */
	int getThickness();

	/**
	 * Sets the value of the '{@link universal.visualization.VDrawable#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(int value);

} // VDrawable
