/**
 */
package universal.visualization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Routing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see universal.visualization.VisualizationPackage#getRoutingType()
 * @model
 * @generated
 */
public enum RoutingType implements Enumerator {
	/**
	 * The '<em><b>DIRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT(0, "DIRECT", "DIRECT"),

	/**
	 * The '<em><b>RECTILINEAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTILINEAL_VALUE
	 * @generated
	 * @ordered
	 */
	RECTILINEAL(1, "RECTILINEAL", "RECTILINEAL"),

	/**
	 * The '<em><b>TREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREE_VALUE
	 * @generated
	 * @ordered
	 */
	TREE(2, "TREE", "TREE");

	/**
	 * The '<em><b>DIRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIRECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_VALUE = 0;

	/**
	 * The '<em><b>RECTILINEAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECTILINEAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTILINEAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECTILINEAL_VALUE = 1;

	/**
	 * The '<em><b>TREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TREE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TREE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Routing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoutingType[] VALUES_ARRAY =
		new RoutingType[] {
			DIRECT,
			RECTILINEAL,
			TREE,
		};

	/**
	 * A public read-only list of all the '<em><b>Routing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoutingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Routing Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoutingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoutingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Routing Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoutingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoutingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Routing Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoutingType get(int value) {
		switch (value) {
			case DIRECT_VALUE: return DIRECT;
			case RECTILINEAL_VALUE: return RECTILINEAL;
			case TREE_VALUE: return TREE;
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
	private RoutingType(int value, String name, String literal) {
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
	
} //RoutingType
