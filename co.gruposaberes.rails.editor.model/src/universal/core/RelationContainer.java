/**
 */
package universal.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.core.RelationContainer#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see universal.core.CorePackage#getRelationContainer()
 * @model
 * @generated
 */
public interface RelationContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link universal.core.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see universal.core.CorePackage#getRelationContainer_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // RelationContainer
