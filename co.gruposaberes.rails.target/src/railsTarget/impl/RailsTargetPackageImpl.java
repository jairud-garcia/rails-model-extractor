/**
 */
package railsTarget.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import railsTarget.RailsApplication;
import railsTarget.RailsAssociation;
import railsTarget.RailsAssociationType;
import railsTarget.RailsAttribute;
import railsTarget.RailsCardinality;
import railsTarget.RailsClass;
import railsTarget.RailsClassType;
import railsTarget.RailsDataType;
import railsTarget.RailsMethod;
import railsTarget.RailsMethodType;
import railsTarget.RailsNamespace;
import railsTarget.RailsTargetFactory;
import railsTarget.RailsTargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsTargetPackageImpl extends EPackageImpl implements RailsTargetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum railsDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum railsMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum railsClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum railsCardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum railsAssociationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see railsTarget.RailsTargetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RailsTargetPackageImpl() {
		super(eNS_URI, RailsTargetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RailsTargetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RailsTargetPackage init() {
		if (isInited) return (RailsTargetPackage)EPackage.Registry.INSTANCE.getEPackage(RailsTargetPackage.eNS_URI);

		// Obtain or create and register package
		RailsTargetPackageImpl theRailsTargetPackage = (RailsTargetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RailsTargetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RailsTargetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRailsTargetPackage.createPackageContents();

		// Initialize created meta-data
		theRailsTargetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRailsTargetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RailsTargetPackage.eNS_URI, theRailsTargetPackage);
		return theRailsTargetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsAttribute() {
		return railsAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAttribute_DataType() {
		return (EAttribute)railsAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAttribute_Name() {
		return (EAttribute)railsAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsMethod() {
		return railsMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsMethod_Name() {
		return (EAttribute)railsMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsMethod_MethodType() {
		return (EAttribute)railsMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsClass() {
		return railsClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsClass_Name() {
		return (EAttribute)railsClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsClass_FullName() {
		return (EAttribute)railsClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsClass_ClassType() {
		return (EAttribute)railsClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsClass_Methods() {
		return (EReference)railsClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsClass_Attributes() {
		return (EReference)railsClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsAssociation() {
		return railsAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsAssociation_Source() {
		return (EReference)railsAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsAssociation_Target() {
		return (EReference)railsAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_ForeignKeyColumnName() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_SourceRoleName() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_TargetRoleName() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_SourceCardinality() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_TargetCardinality() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_AssociationType() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsNamespace() {
		return railsNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsNamespace_Name() {
		return (EAttribute)railsNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsNamespace_FullName() {
		return (EAttribute)railsNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsNamespace_Classes() {
		return (EReference)railsNamespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsApplication() {
		return railsApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsApplication_Name() {
		return (EAttribute)railsApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsApplication_RailsAssociations() {
		return (EReference)railsApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsApplication_Classes() {
		return (EReference)railsApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailsApplication_Namespaces() {
		return (EReference)railsApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRailsDataType() {
		return railsDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRailsMethodType() {
		return railsMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRailsClassType() {
		return railsClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRailsCardinality() {
		return railsCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRailsAssociationType() {
		return railsAssociationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsTargetFactory getRailsTargetFactory() {
		return (RailsTargetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		railsAttributeEClass = createEClass(RAILS_ATTRIBUTE);
		createEAttribute(railsAttributeEClass, RAILS_ATTRIBUTE__DATA_TYPE);
		createEAttribute(railsAttributeEClass, RAILS_ATTRIBUTE__NAME);

		railsMethodEClass = createEClass(RAILS_METHOD);
		createEAttribute(railsMethodEClass, RAILS_METHOD__NAME);
		createEAttribute(railsMethodEClass, RAILS_METHOD__METHOD_TYPE);

		railsClassEClass = createEClass(RAILS_CLASS);
		createEAttribute(railsClassEClass, RAILS_CLASS__NAME);
		createEAttribute(railsClassEClass, RAILS_CLASS__FULL_NAME);
		createEAttribute(railsClassEClass, RAILS_CLASS__CLASS_TYPE);
		createEReference(railsClassEClass, RAILS_CLASS__METHODS);
		createEReference(railsClassEClass, RAILS_CLASS__ATTRIBUTES);

		railsAssociationEClass = createEClass(RAILS_ASSOCIATION);
		createEReference(railsAssociationEClass, RAILS_ASSOCIATION__SOURCE);
		createEReference(railsAssociationEClass, RAILS_ASSOCIATION__TARGET);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__FOREIGN_KEY_COLUMN_NAME);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__SOURCE_ROLE_NAME);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__TARGET_ROLE_NAME);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__SOURCE_CARDINALITY);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__TARGET_CARDINALITY);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__ASSOCIATION_TYPE);

		railsNamespaceEClass = createEClass(RAILS_NAMESPACE);
		createEAttribute(railsNamespaceEClass, RAILS_NAMESPACE__NAME);
		createEAttribute(railsNamespaceEClass, RAILS_NAMESPACE__FULL_NAME);
		createEReference(railsNamespaceEClass, RAILS_NAMESPACE__CLASSES);

		railsApplicationEClass = createEClass(RAILS_APPLICATION);
		createEAttribute(railsApplicationEClass, RAILS_APPLICATION__NAME);
		createEReference(railsApplicationEClass, RAILS_APPLICATION__RAILS_ASSOCIATIONS);
		createEReference(railsApplicationEClass, RAILS_APPLICATION__CLASSES);
		createEReference(railsApplicationEClass, RAILS_APPLICATION__NAMESPACES);

		// Create enums
		railsDataTypeEEnum = createEEnum(RAILS_DATA_TYPE);
		railsMethodTypeEEnum = createEEnum(RAILS_METHOD_TYPE);
		railsClassTypeEEnum = createEEnum(RAILS_CLASS_TYPE);
		railsCardinalityEEnum = createEEnum(RAILS_CARDINALITY);
		railsAssociationTypeEEnum = createEEnum(RAILS_ASSOCIATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(railsAttributeEClass, RailsAttribute.class, "RailsAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsAttribute_DataType(), this.getRailsDataType(), "dataType", null, 1, 1, RailsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, RailsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsMethodEClass, RailsMethod.class, "RailsMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, RailsMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsMethod_MethodType(), this.getRailsMethodType(), "methodType", null, 1, 1, RailsMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsClassEClass, RailsClass.class, "RailsClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsClass_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsClass_ClassType(), this.getRailsClassType(), "classType", null, 1, 1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsClass_Methods(), this.getRailsMethod(), null, "methods", null, 0, -1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsClass_Attributes(), this.getRailsAttribute(), null, "attributes", null, 0, -1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsAssociationEClass, RailsAssociation.class, "RailsAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailsAssociation_Source(), this.getRailsClass(), null, "source", null, 1, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsAssociation_Target(), this.getRailsClass(), null, "target", null, 1, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_ForeignKeyColumnName(), ecorePackage.getEString(), "foreignKeyColumnName", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_SourceRoleName(), ecorePackage.getEString(), "sourceRoleName", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_TargetRoleName(), ecorePackage.getEString(), "targetRoleName", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_SourceCardinality(), this.getRailsCardinality(), "sourceCardinality", null, 1, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_TargetCardinality(), this.getRailsCardinality(), "targetCardinality", null, 1, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_AssociationType(), this.getRailsAssociationType(), "associationType", null, 1, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsNamespaceEClass, RailsNamespace.class, "RailsNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, RailsNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsNamespace_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, RailsNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsNamespace_Classes(), this.getRailsClass(), null, "classes", null, 0, -1, RailsNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsApplicationEClass, RailsApplication.class, "RailsApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, RailsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsApplication_RailsAssociations(), this.getRailsAssociation(), null, "railsAssociations", null, 0, -1, RailsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsApplication_Classes(), this.getRailsClass(), null, "classes", null, 0, -1, RailsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailsApplication_Namespaces(), this.getRailsNamespace(), null, "namespaces", null, 0, -1, RailsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(railsDataTypeEEnum, RailsDataType.class, "RailsDataType");
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.NONE);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.BINARY);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.BOOLEAN);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.DATE);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.DATETIME);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.DECIMAL);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.FLOAT);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.INTEGER);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.BIGINT);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.PRIMARY_KEY);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.REFERENCES);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.STRING);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.TEXT);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.TIME);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.TIMESTAMP);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.HSTORE);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.JSON);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.ARRAY);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.CIDR_ADDRESS);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.IP_ADDRESS);
		addEEnumLiteral(railsDataTypeEEnum, RailsDataType.MAC_ADDRESS);

		initEEnum(railsMethodTypeEEnum, RailsMethodType.class, "RailsMethodType");
		addEEnumLiteral(railsMethodTypeEEnum, RailsMethodType.INSTANCE_METHOD);
		addEEnumLiteral(railsMethodTypeEEnum, RailsMethodType.CLASS_METHOD);

		initEEnum(railsClassTypeEEnum, RailsClassType.class, "RailsClassType");
		addEEnumLiteral(railsClassTypeEEnum, RailsClassType.NONE);
		addEEnumLiteral(railsClassTypeEEnum, RailsClassType.ACTIVE_RECORD);
		addEEnumLiteral(railsClassTypeEEnum, RailsClassType.ACTIVE_RESOURCE);

		initEEnum(railsCardinalityEEnum, RailsCardinality.class, "RailsCardinality");
		addEEnumLiteral(railsCardinalityEEnum, RailsCardinality.NONE);
		addEEnumLiteral(railsCardinalityEEnum, RailsCardinality.ONE);
		addEEnumLiteral(railsCardinalityEEnum, RailsCardinality.MANY);

		initEEnum(railsAssociationTypeEEnum, RailsAssociationType.class, "RailsAssociationType");
		addEEnumLiteral(railsAssociationTypeEEnum, RailsAssociationType.AGGREGATION);
		addEEnumLiteral(railsAssociationTypeEEnum, RailsAssociationType.COMPOSITION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getRailsClass_Methods(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getRailsClass_Attributes(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getRailsNamespace_Classes(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getRailsApplication_RailsAssociations(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getRailsApplication_Classes(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getRailsApplication_Namespaces(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

} //RailsTargetPackageImpl
