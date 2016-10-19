/**
 */
package universal.rails;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import universal.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see universal.rails.RailsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RailsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rails";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://universal/rails";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unmet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailsPackage eINSTANCE = universal.rails.impl.RailsPackageImpl.init();

	/**
	 * The meta object id for the '{@link universal.rails.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.ApplicationImpl
	 * @see universal.rails.impl.RailsPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = CorePackage.APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Basic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASIC_ELEMENTS = CorePackage.APPLICATION__BASIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Complex Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPLEX_RELATIONSHIPS = CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Simple Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SIMPLE_RELATIONSHIPS = CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = CorePackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = CorePackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.AssociationImpl
	 * @see universal.rails.impl.RailsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_TYPE = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_NAME = CorePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_NAME = CorePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FOREIGN_KEY = CorePackage.RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.NamespaceImpl
	 * @see universal.rails.impl.RailsPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.RubyClassImpl <em>Ruby Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RubyClassImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRubyClass()
	 * @generated
	 */
	int RUBY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS__SUPER_CLASS = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS__FULL_NAME = CorePackage.CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ruby Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ruby Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_CLASS_OPERATION_COUNT = CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.MethodImpl
	 * @see universal.rails.impl.RailsPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_TYPE = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = CorePackage.SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.AttributeImpl
	 * @see universal.rails.impl.RailsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = CorePackage.SIMPLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link universal.rails.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see universal.rails.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for class '{@link universal.rails.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see universal.rails.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.Association#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see universal.rails.Association#getAssociationType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AssociationType();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.Association#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see universal.rails.Association#getSourceName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.Association#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see universal.rails.Association#getTargetName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.Association#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see universal.rails.Association#getForeignKey()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_ForeignKey();

	/**
	 * Returns the meta object for class '{@link universal.rails.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see universal.rails.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link universal.rails.RubyClass <em>Ruby Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Class</em>'.
	 * @see universal.rails.RubyClass
	 * @generated
	 */
	EClass getRubyClass();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RubyClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Class</em>'.
	 * @see universal.rails.RubyClass#getSuperClass()
	 * @see #getRubyClass()
	 * @generated
	 */
	EAttribute getRubyClass_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RubyClass#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see universal.rails.RubyClass#getFullName()
	 * @see #getRubyClass()
	 * @generated
	 */
	EAttribute getRubyClass_FullName();

	/**
	 * Returns the meta object for class '{@link universal.rails.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see universal.rails.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.Method#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see universal.rails.Method#getMethodType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodType();

	/**
	 * Returns the meta object for class '{@link universal.rails.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see universal.rails.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see universal.rails.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RailsFactory getRailsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link universal.rails.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.ApplicationImpl
		 * @see universal.rails.impl.RailsPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.AssociationImpl
		 * @see universal.rails.impl.RailsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ASSOCIATION_TYPE = eINSTANCE.getAssociation_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_NAME = eINSTANCE.getAssociation_SourceName();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_NAME = eINSTANCE.getAssociation_TargetName();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__FOREIGN_KEY = eINSTANCE.getAssociation_ForeignKey();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.NamespaceImpl
		 * @see universal.rails.impl.RailsPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.RubyClassImpl <em>Ruby Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RubyClassImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRubyClass()
		 * @generated
		 */
		EClass RUBY_CLASS = eINSTANCE.getRubyClass();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_CLASS__SUPER_CLASS = eINSTANCE.getRubyClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_CLASS__FULL_NAME = eINSTANCE.getRubyClass_FullName();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.MethodImpl
		 * @see universal.rails.impl.RailsPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_TYPE = eINSTANCE.getMethod_MethodType();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.AttributeImpl
		 * @see universal.rails.impl.RailsPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

	}

} //RailsPackage
