/**
 */
package universal.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VShape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Charts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.VShape#getColor <em>Color</em>}</li>
 *   <li>{@link universal.visualization.VShape#getWidth <em>Width</em>}</li>
 *   <li>{@link universal.visualization.VShape#getHeigth <em>Heigth</em>}</li>
 * </ul>
 *
 * @see universal.visualization.VisualizationPackage#getVShape()
 * @model
 * @generated
 */
public interface VShape extends VDiagramElement {
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
	 * @see universal.visualization.VisualizationPackage#getVShape_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link universal.visualization.VShape#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see universal.visualization.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see universal.visualization.VisualizationPackage#getVShape_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link universal.visualization.VShape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heigth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heigth</em>' attribute.
	 * @see #setHeigth(double)
	 * @see universal.visualization.VisualizationPackage#getVShape_Heigth()
	 * @model required="true"
	 * @generated
	 */
	double getHeigth();

	/**
	 * Sets the value of the '{@link universal.visualization.VShape#getHeigth <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heigth</em>' attribute.
	 * @see #getHeigth()
	 * @generated
	 */
	void setHeigth(double value);

} // VShape
