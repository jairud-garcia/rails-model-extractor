/**
 */
package universal.visualization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enums
 * <!-- end-model-doc -->
 * @see universal.visualization.VisualizationPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator {
	/**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(0, "white", "white"),

	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(1, "black", "black"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(2, "blue", "blue"),

	/**
	 * The '<em><b>Chocolate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOCOLATE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOCOLATE(3, "chocolate", "chocolate"),

	/**
	 * The '<em><b>Gray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(4, "gray", "gray"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(5, "green", "green"),

	/**
	 * The '<em><b>Orange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(6, "orange", "orange"),

	/**
	 * The '<em><b>Purple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(7, "purple", "purple"),

	/**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(8, "red", "red"),

	/**
	 * The '<em><b>Yellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(9, "yellow", "yellow");

	/**
	 * The '<em><b>White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>White</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model name="white"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 0;

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model name="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 1;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model name="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 2;

	/**
	 * The '<em><b>Chocolate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chocolate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOCOLATE
	 * @model name="chocolate"
	 * @generated
	 * @ordered
	 */
	public static final int CHOCOLATE_VALUE = 3;

	/**
	 * The '<em><b>Gray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gray</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model name="gray"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 4;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model name="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 5;

	/**
	 * The '<em><b>Orange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orange</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model name="orange"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 6;

	/**
	 * The '<em><b>Purple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Purple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PURPLE
	 * @model name="purple"
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 7;

	/**
	 * The '<em><b>Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Red</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model name="red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 8;

	/**
	 * The '<em><b>Yellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yellow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model name="yellow"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 9;

	/**
	 * An array of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Color[] VALUES_ARRAY =
		new Color[] {
			WHITE,
			BLACK,
			BLUE,
			CHOCOLATE,
			GRAY,
			GREEN,
			ORANGE,
			PURPLE,
			RED,
			YELLOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color get(int value) {
		switch (value) {
			case WHITE_VALUE: return WHITE;
			case BLACK_VALUE: return BLACK;
			case BLUE_VALUE: return BLUE;
			case CHOCOLATE_VALUE: return CHOCOLATE;
			case GRAY_VALUE: return GRAY;
			case GREEN_VALUE: return GREEN;
			case ORANGE_VALUE: return ORANGE;
			case PURPLE_VALUE: return PURPLE;
			case RED_VALUE: return RED;
			case YELLOW_VALUE: return YELLOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Color(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Color
