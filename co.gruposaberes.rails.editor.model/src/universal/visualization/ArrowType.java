/**
 */
package universal.visualization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arrow Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see universal.visualization.VisualizationPackage#getArrowType()
 * @model
 * @generated
 */
public enum ArrowType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>SIMPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(1, "SIMPLE", "SIMPLE"),

	/**
	 * The '<em><b>TRIANGULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGULAR(2, "TRIANGULAR", "TRIANGULAR"),

	/**
	 * The '<em><b>TRIANGULAR FILLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGULAR_FILLED(3, "TRIANGULAR_FILLED", "TRIANGULAR_FILLED"),

	/**
	 * The '<em><b>DIAMOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMOND_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMOND(4, "DIAMOND", "DIAMOND"),

	/**
	 * The '<em><b>DIAMOND FILLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMOND_FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMOND_FILLED(5, "DIAMOND_FILLED", "DIAMOND_FILLED"),

	/**
	 * The '<em><b>ARROW DIAMOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_DIAMOND_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_DIAMOND(6, "ARROW_DIAMOND", "ARROW_DIAMOND"),

	/**
	 * The '<em><b>ARROW DIAMOND FILLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_DIAMOND_FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_DIAMOND_FILLED(7, "ARROW_DIAMOND_FILLED", "ARROW_DIAMOND_FILLED"),

	/**
	 * The '<em><b>MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY(8, "MANY", "MANY"),

	/**
	 * The '<em><b>MANY TRIANGULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TRIANGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_TRIANGULAR(9, "MANY_TRIANGULAR", "MANY_TRIANGULAR"),

	/**
	 * The '<em><b>MANY FILLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_FILLED(10, "MANY_FILLED", "MANY_FILLED");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>SIMPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 1;

	/**
	 * The '<em><b>TRIANGULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIANGULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGULAR_VALUE = 2;

	/**
	 * The '<em><b>TRIANGULAR FILLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIANGULAR FILLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_FILLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGULAR_FILLED_VALUE = 3;

	/**
	 * The '<em><b>DIAMOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAMOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAMOND_VALUE = 4;

	/**
	 * The '<em><b>DIAMOND FILLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAMOND FILLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMOND_FILLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAMOND_FILLED_VALUE = 5;

	/**
	 * The '<em><b>ARROW DIAMOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW DIAMOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_DIAMOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_DIAMOND_VALUE = 6;

	/**
	 * The '<em><b>ARROW DIAMOND FILLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW DIAMOND FILLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_DIAMOND_FILLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_DIAMOND_FILLED_VALUE = 7;

	/**
	 * The '<em><b>MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY_VALUE = 8;

	/**
	 * The '<em><b>MANY TRIANGULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANY TRIANGULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_TRIANGULAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TRIANGULAR_VALUE = 9;

	/**
	 * The '<em><b>MANY FILLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANY FILLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_FILLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY_FILLED_VALUE = 10;

	/**
	 * An array of all the '<em><b>Arrow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArrowType[] VALUES_ARRAY =
		new ArrowType[] {
			NONE,
			SIMPLE,
			TRIANGULAR,
			TRIANGULAR_FILLED,
			DIAMOND,
			DIAMOND_FILLED,
			ARROW_DIAMOND,
			ARROW_DIAMOND_FILLED,
			MANY,
			MANY_TRIANGULAR,
			MANY_FILLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Arrow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArrowType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arrow Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrow Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrow Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SIMPLE_VALUE: return SIMPLE;
			case TRIANGULAR_VALUE: return TRIANGULAR;
			case TRIANGULAR_FILLED_VALUE: return TRIANGULAR_FILLED;
			case DIAMOND_VALUE: return DIAMOND;
			case DIAMOND_FILLED_VALUE: return DIAMOND_FILLED;
			case ARROW_DIAMOND_VALUE: return ARROW_DIAMOND;
			case ARROW_DIAMOND_FILLED_VALUE: return ARROW_DIAMOND_FILLED;
			case MANY_VALUE: return MANY;
			case MANY_TRIANGULAR_VALUE: return MANY_TRIANGULAR;
			case MANY_FILLED_VALUE: return MANY_FILLED;
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
	private ArrowType(int value, String name, String literal) {
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
	
} //ArrowType
