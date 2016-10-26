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
	 * The meta object id for the '{@link universal.rails.impl.RailsApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RailsApplicationImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRailsApplication()
	 * @generated
	 */
	int RAILS_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__NAME = CorePackage.APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Basic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__BASIC_ELEMENTS = CorePackage.APPLICATION__BASIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Complex Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__COMPLEX_RELATIONSHIPS = CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Simple Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__SIMPLE_RELATIONSHIPS = CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION_FEATURE_COUNT = CorePackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.RailsAssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RailsAssociationImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRailsAssociation()
	 * @generated
	 */
	int RAILS_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__ASSOCIATION_TYPE = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__SOURCE_NAME = CorePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__TARGET_NAME = CorePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__FOREIGN_KEY = CorePackage.RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link universal.rails.impl.RailsNamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RailsNamespaceImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRailsNamespace()
	 * @generated
	 */
	int RAILS_NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.rails.impl.RailsClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RailsClassImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRailsClass()
	 * @generated
	 */
	int RAILS_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__SUPER_CLASS = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__FULL_NAME = CorePackage.CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link universal.rails.impl.RailsMethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RailsMethodImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRailsMethod()
	 * @generated
	 */
	int RAILS_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD__METHOD_TYPE = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link universal.rails.impl.RailsAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.rails.impl.RailsAttributeImpl
	 * @see universal.rails.impl.RailsPackageImpl#getRailsAttribute()
	 * @generated
	 */
	int RAILS_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE__DATA_TYPE = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link universal.rails.RailsApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see universal.rails.RailsApplication
	 * @generated
	 */
	EClass getRailsApplication();

	/**
	 * Returns the meta object for class '{@link universal.rails.RailsAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see universal.rails.RailsAssociation
	 * @generated
	 */
	EClass getRailsAssociation();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsAssociation#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see universal.rails.RailsAssociation#getAssociationType()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_AssociationType();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsAssociation#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see universal.rails.RailsAssociation#getSourceName()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsAssociation#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see universal.rails.RailsAssociation#getTargetName()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsAssociation#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see universal.rails.RailsAssociation#getForeignKey()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_ForeignKey();

	/**
	 * Returns the meta object for class '{@link universal.rails.RailsNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see universal.rails.RailsNamespace
	 * @generated
	 */
	EClass getRailsNamespace();

	/**
	 * Returns the meta object for class '{@link universal.rails.RailsClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see universal.rails.RailsClass
	 * @generated
	 */
	EClass getRailsClass();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Class</em>'.
	 * @see universal.rails.RailsClass#getSuperClass()
	 * @see #getRailsClass()
	 * @generated
	 */
	EAttribute getRailsClass_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsClass#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see universal.rails.RailsClass#getFullName()
	 * @see #getRailsClass()
	 * @generated
	 */
	EAttribute getRailsClass_FullName();

	/**
	 * Returns the meta object for class '{@link universal.rails.RailsMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see universal.rails.RailsMethod
	 * @generated
	 */
	EClass getRailsMethod();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsMethod#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see universal.rails.RailsMethod#getMethodType()
	 * @see #getRailsMethod()
	 * @generated
	 */
	EAttribute getRailsMethod_MethodType();

	/**
	 * Returns the meta object for class '{@link universal.rails.RailsAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see universal.rails.RailsAttribute
	 * @generated
	 */
	EClass getRailsAttribute();

	/**
	 * Returns the meta object for the attribute '{@link universal.rails.RailsAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see universal.rails.RailsAttribute#getDataType()
	 * @see #getRailsAttribute()
	 * @generated
	 */
	EAttribute getRailsAttribute_DataType();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link universal.rails.impl.RailsApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RailsApplicationImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRailsApplication()
		 * @generated
		 */
		EClass RAILS_APPLICATION = eINSTANCE.getRailsApplication();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.RailsAssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RailsAssociationImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRailsAssociation()
		 * @generated
		 */
		EClass RAILS_ASSOCIATION = eINSTANCE.getRailsAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__ASSOCIATION_TYPE = eINSTANCE.getRailsAssociation_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__SOURCE_NAME = eINSTANCE.getRailsAssociation_SourceName();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__TARGET_NAME = eINSTANCE.getRailsAssociation_TargetName();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__FOREIGN_KEY = eINSTANCE.getRailsAssociation_ForeignKey();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.RailsNamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RailsNamespaceImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRailsNamespace()
		 * @generated
		 */
		EClass RAILS_NAMESPACE = eINSTANCE.getRailsNamespace();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.RailsClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RailsClassImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRailsClass()
		 * @generated
		 */
		EClass RAILS_CLASS = eINSTANCE.getRailsClass();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_CLASS__SUPER_CLASS = eINSTANCE.getRailsClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_CLASS__FULL_NAME = eINSTANCE.getRailsClass_FullName();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.RailsMethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RailsMethodImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRailsMethod()
		 * @generated
		 */
		EClass RAILS_METHOD = eINSTANCE.getRailsMethod();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_METHOD__METHOD_TYPE = eINSTANCE.getRailsMethod_MethodType();

		/**
		 * The meta object literal for the '{@link universal.rails.impl.RailsAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.rails.impl.RailsAttributeImpl
		 * @see universal.rails.impl.RailsPackageImpl#getRailsAttribute()
		 * @generated
		 */
		EClass RAILS_ATTRIBUTE = eINSTANCE.getRailsAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ATTRIBUTE__DATA_TYPE = eINSTANCE.getRailsAttribute_DataType();

	}

} //RailsPackage
