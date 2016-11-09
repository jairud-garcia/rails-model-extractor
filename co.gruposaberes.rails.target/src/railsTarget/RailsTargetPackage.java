/**
 */
package railsTarget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see railsTarget.RailsTargetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface RailsTargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railsTarget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gruposaberes.co/rails_target";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rails";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailsTargetPackage eINSTANCE = railsTarget.impl.RailsTargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link railsTarget.impl.RailsAttributeImpl <em>Rails Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.impl.RailsAttributeImpl
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsAttribute()
	 * @generated
	 */
	int RAILS_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Rails Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rails Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railsTarget.impl.RailsMethodImpl <em>Rails Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.impl.RailsMethodImpl
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsMethod()
	 * @generated
	 */
	int RAILS_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD__METHOD_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Rails Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rails Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railsTarget.impl.RailsClassImpl <em>Rails Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.impl.RailsClassImpl
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsClass()
	 * @generated
	 */
	int RAILS_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__FULL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__CLASS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__METHODS = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS__ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Rails Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rails Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railsTarget.impl.RailsAssociationImpl <em>Rails Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.impl.RailsAssociationImpl
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsAssociation()
	 * @generated
	 */
	int RAILS_ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Source Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__SOURCE_ROLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Target Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__TARGET_ROLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Source Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__SOURCE_CARDINALITY = 5;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__TARGET_CARDINALITY = 6;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION__ASSOCIATION_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Rails Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Rails Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railsTarget.impl.RailsNamespaceImpl <em>Rails Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.impl.RailsNamespaceImpl
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsNamespace()
	 * @generated
	 */
	int RAILS_NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__FULL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE__CLASSES = 2;

	/**
	 * The number of structural features of the '<em>Rails Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rails Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railsTarget.impl.RailsApplicationImpl <em>Rails Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.impl.RailsApplicationImpl
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsApplication()
	 * @generated
	 */
	int RAILS_APPLICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rails Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__RAILS_ASSOCIATIONS = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION__NAMESPACES = 3;

	/**
	 * The number of structural features of the '<em>Rails Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rails Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILS_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railsTarget.RailsDataType <em>Rails Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.RailsDataType
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsDataType()
	 * @generated
	 */
	int RAILS_DATA_TYPE = 6;

	/**
	 * The meta object id for the '{@link railsTarget.RailsMethodType <em>Rails Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.RailsMethodType
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsMethodType()
	 * @generated
	 */
	int RAILS_METHOD_TYPE = 7;

	/**
	 * The meta object id for the '{@link railsTarget.RailsClassType <em>Rails Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.RailsClassType
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsClassType()
	 * @generated
	 */
	int RAILS_CLASS_TYPE = 8;

	/**
	 * The meta object id for the '{@link railsTarget.RailsCardinality <em>Rails Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.RailsCardinality
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsCardinality()
	 * @generated
	 */
	int RAILS_CARDINALITY = 9;

	/**
	 * The meta object id for the '{@link railsTarget.RailsAssociationType <em>Rails Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railsTarget.RailsAssociationType
	 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsAssociationType()
	 * @generated
	 */
	int RAILS_ASSOCIATION_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link railsTarget.RailsAttribute <em>Rails Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rails Attribute</em>'.
	 * @see railsTarget.RailsAttribute
	 * @generated
	 */
	EClass getRailsAttribute();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see railsTarget.RailsAttribute#getDataType()
	 * @see #getRailsAttribute()
	 * @generated
	 */
	EAttribute getRailsAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see railsTarget.RailsAttribute#getName()
	 * @see #getRailsAttribute()
	 * @generated
	 */
	EAttribute getRailsAttribute_Name();

	/**
	 * Returns the meta object for class '{@link railsTarget.RailsMethod <em>Rails Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rails Method</em>'.
	 * @see railsTarget.RailsMethod
	 * @generated
	 */
	EClass getRailsMethod();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see railsTarget.RailsMethod#getName()
	 * @see #getRailsMethod()
	 * @generated
	 */
	EAttribute getRailsMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsMethod#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see railsTarget.RailsMethod#getMethodType()
	 * @see #getRailsMethod()
	 * @generated
	 */
	EAttribute getRailsMethod_MethodType();

	/**
	 * Returns the meta object for class '{@link railsTarget.RailsClass <em>Rails Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rails Class</em>'.
	 * @see railsTarget.RailsClass
	 * @generated
	 */
	EClass getRailsClass();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see railsTarget.RailsClass#getName()
	 * @see #getRailsClass()
	 * @generated
	 */
	EAttribute getRailsClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsClass#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see railsTarget.RailsClass#getFullName()
	 * @see #getRailsClass()
	 * @generated
	 */
	EAttribute getRailsClass_FullName();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsClass#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type</em>'.
	 * @see railsTarget.RailsClass#getClassType()
	 * @see #getRailsClass()
	 * @generated
	 */
	EAttribute getRailsClass_ClassType();

	/**
	 * Returns the meta object for the containment reference list '{@link railsTarget.RailsClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see railsTarget.RailsClass#getMethods()
	 * @see #getRailsClass()
	 * @generated
	 */
	EReference getRailsClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link railsTarget.RailsClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see railsTarget.RailsClass#getAttributes()
	 * @see #getRailsClass()
	 * @generated
	 */
	EReference getRailsClass_Attributes();

	/**
	 * Returns the meta object for class '{@link railsTarget.RailsAssociation <em>Rails Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rails Association</em>'.
	 * @see railsTarget.RailsAssociation
	 * @generated
	 */
	EClass getRailsAssociation();

	/**
	 * Returns the meta object for the reference '{@link railsTarget.RailsAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see railsTarget.RailsAssociation#getSource()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EReference getRailsAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link railsTarget.RailsAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see railsTarget.RailsAssociation#getTarget()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EReference getRailsAssociation_Target();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAssociation#getForeignKeyColumnName <em>Foreign Key Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Column Name</em>'.
	 * @see railsTarget.RailsAssociation#getForeignKeyColumnName()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_ForeignKeyColumnName();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAssociation#getSourceRoleName <em>Source Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role Name</em>'.
	 * @see railsTarget.RailsAssociation#getSourceRoleName()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_SourceRoleName();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAssociation#getTargetRoleName <em>Target Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role Name</em>'.
	 * @see railsTarget.RailsAssociation#getTargetRoleName()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_TargetRoleName();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAssociation#getSourceCardinality <em>Source Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cardinality</em>'.
	 * @see railsTarget.RailsAssociation#getSourceCardinality()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_SourceCardinality();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAssociation#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see railsTarget.RailsAssociation#getTargetCardinality()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_TargetCardinality();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsAssociation#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see railsTarget.RailsAssociation#getAssociationType()
	 * @see #getRailsAssociation()
	 * @generated
	 */
	EAttribute getRailsAssociation_AssociationType();

	/**
	 * Returns the meta object for class '{@link railsTarget.RailsNamespace <em>Rails Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rails Namespace</em>'.
	 * @see railsTarget.RailsNamespace
	 * @generated
	 */
	EClass getRailsNamespace();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsNamespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see railsTarget.RailsNamespace#getName()
	 * @see #getRailsNamespace()
	 * @generated
	 */
	EAttribute getRailsNamespace_Name();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsNamespace#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see railsTarget.RailsNamespace#getFullName()
	 * @see #getRailsNamespace()
	 * @generated
	 */
	EAttribute getRailsNamespace_FullName();

	/**
	 * Returns the meta object for the containment reference list '{@link railsTarget.RailsNamespace#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see railsTarget.RailsNamespace#getClasses()
	 * @see #getRailsNamespace()
	 * @generated
	 */
	EReference getRailsNamespace_Classes();

	/**
	 * Returns the meta object for class '{@link railsTarget.RailsApplication <em>Rails Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rails Application</em>'.
	 * @see railsTarget.RailsApplication
	 * @generated
	 */
	EClass getRailsApplication();

	/**
	 * Returns the meta object for the attribute '{@link railsTarget.RailsApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see railsTarget.RailsApplication#getName()
	 * @see #getRailsApplication()
	 * @generated
	 */
	EAttribute getRailsApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link railsTarget.RailsApplication#getRailsAssociations <em>Rails Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rails Associations</em>'.
	 * @see railsTarget.RailsApplication#getRailsAssociations()
	 * @see #getRailsApplication()
	 * @generated
	 */
	EReference getRailsApplication_RailsAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link railsTarget.RailsApplication#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see railsTarget.RailsApplication#getClasses()
	 * @see #getRailsApplication()
	 * @generated
	 */
	EReference getRailsApplication_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link railsTarget.RailsApplication#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see railsTarget.RailsApplication#getNamespaces()
	 * @see #getRailsApplication()
	 * @generated
	 */
	EReference getRailsApplication_Namespaces();

	/**
	 * Returns the meta object for enum '{@link railsTarget.RailsDataType <em>Rails Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rails Data Type</em>'.
	 * @see railsTarget.RailsDataType
	 * @generated
	 */
	EEnum getRailsDataType();

	/**
	 * Returns the meta object for enum '{@link railsTarget.RailsMethodType <em>Rails Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rails Method Type</em>'.
	 * @see railsTarget.RailsMethodType
	 * @generated
	 */
	EEnum getRailsMethodType();

	/**
	 * Returns the meta object for enum '{@link railsTarget.RailsClassType <em>Rails Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rails Class Type</em>'.
	 * @see railsTarget.RailsClassType
	 * @generated
	 */
	EEnum getRailsClassType();

	/**
	 * Returns the meta object for enum '{@link railsTarget.RailsCardinality <em>Rails Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rails Cardinality</em>'.
	 * @see railsTarget.RailsCardinality
	 * @generated
	 */
	EEnum getRailsCardinality();

	/**
	 * Returns the meta object for enum '{@link railsTarget.RailsAssociationType <em>Rails Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rails Association Type</em>'.
	 * @see railsTarget.RailsAssociationType
	 * @generated
	 */
	EEnum getRailsAssociationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RailsTargetFactory getRailsTargetFactory();

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
		 * The meta object literal for the '{@link railsTarget.impl.RailsAttributeImpl <em>Rails Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.impl.RailsAttributeImpl
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsAttribute()
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

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ATTRIBUTE__NAME = eINSTANCE.getRailsAttribute_Name();

		/**
		 * The meta object literal for the '{@link railsTarget.impl.RailsMethodImpl <em>Rails Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.impl.RailsMethodImpl
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsMethod()
		 * @generated
		 */
		EClass RAILS_METHOD = eINSTANCE.getRailsMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_METHOD__NAME = eINSTANCE.getRailsMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_METHOD__METHOD_TYPE = eINSTANCE.getRailsMethod_MethodType();

		/**
		 * The meta object literal for the '{@link railsTarget.impl.RailsClassImpl <em>Rails Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.impl.RailsClassImpl
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsClass()
		 * @generated
		 */
		EClass RAILS_CLASS = eINSTANCE.getRailsClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_CLASS__NAME = eINSTANCE.getRailsClass_Name();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_CLASS__FULL_NAME = eINSTANCE.getRailsClass_FullName();

		/**
		 * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_CLASS__CLASS_TYPE = eINSTANCE.getRailsClass_ClassType();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_CLASS__METHODS = eINSTANCE.getRailsClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_CLASS__ATTRIBUTES = eINSTANCE.getRailsClass_Attributes();

		/**
		 * The meta object literal for the '{@link railsTarget.impl.RailsAssociationImpl <em>Rails Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.impl.RailsAssociationImpl
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsAssociation()
		 * @generated
		 */
		EClass RAILS_ASSOCIATION = eINSTANCE.getRailsAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_ASSOCIATION__SOURCE = eINSTANCE.getRailsAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_ASSOCIATION__TARGET = eINSTANCE.getRailsAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME = eINSTANCE.getRailsAssociation_ForeignKeyColumnName();

		/**
		 * The meta object literal for the '<em><b>Source Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__SOURCE_ROLE_NAME = eINSTANCE.getRailsAssociation_SourceRoleName();

		/**
		 * The meta object literal for the '<em><b>Target Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__TARGET_ROLE_NAME = eINSTANCE.getRailsAssociation_TargetRoleName();

		/**
		 * The meta object literal for the '<em><b>Source Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__SOURCE_CARDINALITY = eINSTANCE.getRailsAssociation_SourceCardinality();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__TARGET_CARDINALITY = eINSTANCE.getRailsAssociation_TargetCardinality();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_ASSOCIATION__ASSOCIATION_TYPE = eINSTANCE.getRailsAssociation_AssociationType();

		/**
		 * The meta object literal for the '{@link railsTarget.impl.RailsNamespaceImpl <em>Rails Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.impl.RailsNamespaceImpl
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsNamespace()
		 * @generated
		 */
		EClass RAILS_NAMESPACE = eINSTANCE.getRailsNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_NAMESPACE__NAME = eINSTANCE.getRailsNamespace_Name();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_NAMESPACE__FULL_NAME = eINSTANCE.getRailsNamespace_FullName();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_NAMESPACE__CLASSES = eINSTANCE.getRailsNamespace_Classes();

		/**
		 * The meta object literal for the '{@link railsTarget.impl.RailsApplicationImpl <em>Rails Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.impl.RailsApplicationImpl
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsApplication()
		 * @generated
		 */
		EClass RAILS_APPLICATION = eINSTANCE.getRailsApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILS_APPLICATION__NAME = eINSTANCE.getRailsApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Rails Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_APPLICATION__RAILS_ASSOCIATIONS = eINSTANCE.getRailsApplication_RailsAssociations();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_APPLICATION__CLASSES = eINSTANCE.getRailsApplication_Classes();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILS_APPLICATION__NAMESPACES = eINSTANCE.getRailsApplication_Namespaces();

		/**
		 * The meta object literal for the '{@link railsTarget.RailsDataType <em>Rails Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.RailsDataType
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsDataType()
		 * @generated
		 */
		EEnum RAILS_DATA_TYPE = eINSTANCE.getRailsDataType();

		/**
		 * The meta object literal for the '{@link railsTarget.RailsMethodType <em>Rails Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.RailsMethodType
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsMethodType()
		 * @generated
		 */
		EEnum RAILS_METHOD_TYPE = eINSTANCE.getRailsMethodType();

		/**
		 * The meta object literal for the '{@link railsTarget.RailsClassType <em>Rails Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.RailsClassType
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsClassType()
		 * @generated
		 */
		EEnum RAILS_CLASS_TYPE = eINSTANCE.getRailsClassType();

		/**
		 * The meta object literal for the '{@link railsTarget.RailsCardinality <em>Rails Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.RailsCardinality
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsCardinality()
		 * @generated
		 */
		EEnum RAILS_CARDINALITY = eINSTANCE.getRailsCardinality();

		/**
		 * The meta object literal for the '{@link railsTarget.RailsAssociationType <em>Rails Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railsTarget.RailsAssociationType
		 * @see railsTarget.impl.RailsTargetPackageImpl#getRailsAssociationType()
		 * @generated
		 */
		EEnum RAILS_ASSOCIATION_TYPE = eINSTANCE.getRailsAssociationType();

	}

} //RailsTargetPackage
