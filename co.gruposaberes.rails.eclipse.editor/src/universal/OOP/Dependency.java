/**
 */
package universal.OOP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.OOP.Dependency#getMethodInvokedFromSourceClass <em>Method Invoked From Source Class</em>}</li>
 *   <li>{@link universal.OOP.Dependency#getMethodInvokerFromTargetClass <em>Method Invoker From Target Class</em>}</li>
 * </ul>
 *
 * @see universal.OOP.OOPPackage#getDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DependencyRule_SourceClassMustBeType DependencyRule_TargetClassMustBeType DependencyRule_MethodInvoked DependencyRule_MethodInvoker'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DependencyRule_SourceClassMustBeType='self.source.oclIsTypeOf(Type) = true' DependencyRule_TargetClassMustBeType='self.target.oclIsTypeOf(Type) = true' DependencyRule_MethodInvoked='self.methodInvokedFromSourceClass.oclIsTypeOf(Method) = true' DependencyRule_MethodInvoker='self.methodInvokerFromTargetClass.oclIsTypeOf(Method) = true'"
 * @generated
 */
public interface Dependency extends TypeRelationship {
	/**
	 * Returns the value of the '<em><b>Method Invoked From Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Invoked From Source Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Invoked From Source Class</em>' reference.
	 * @see #setMethodInvokedFromSourceClass(Method)
	 * @see universal.OOP.OOPPackage#getDependency_MethodInvokedFromSourceClass()
	 * @model required="true"
	 * @generated
	 */
	Method getMethodInvokedFromSourceClass();

	/**
	 * Sets the value of the '{@link universal.OOP.Dependency#getMethodInvokedFromSourceClass <em>Method Invoked From Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Invoked From Source Class</em>' reference.
	 * @see #getMethodInvokedFromSourceClass()
	 * @generated
	 */
	void setMethodInvokedFromSourceClass(Method value);

	/**
	 * Returns the value of the '<em><b>Method Invoker From Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Invoker From Target Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Invoker From Target Class</em>' reference.
	 * @see #setMethodInvokerFromTargetClass(Method)
	 * @see universal.OOP.OOPPackage#getDependency_MethodInvokerFromTargetClass()
	 * @model required="true"
	 * @generated
	 */
	Method getMethodInvokerFromTargetClass();

	/**
	 * Sets the value of the '{@link universal.OOP.Dependency#getMethodInvokerFromTargetClass <em>Method Invoker From Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Invoker From Target Class</em>' reference.
	 * @see #getMethodInvokerFromTargetClass()
	 * @generated
	 */
	void setMethodInvokerFromTargetClass(Method value);

} // Dependency
