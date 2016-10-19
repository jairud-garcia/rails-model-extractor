/**
 */
package universal.rails.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import universal.OOP.OOPPackage;

import universal.OOP.impl.OOPPackageImpl;

import universal.core.CorePackage;

import universal.core.impl.CorePackageImpl;

import universal.metrics.MetricsPackage;

import universal.metrics.impl.MetricsPackageImpl;

import universal.microservice.MicroservicePackage;

import universal.microservice.impl.MicroservicePackageImpl;

import universal.oracleforms.OracleformsPackage;

import universal.oracleforms.impl.OracleformsPackageImpl;

import universal.rails.Application;
import universal.rails.Association;
import universal.rails.Attribute;
import universal.rails.Method;
import universal.rails.Namespace;
import universal.rails.RailsFactory;
import universal.rails.RailsPackage;
import universal.rails.RubyClass;

import universal.rails.util.RailsValidator;

import universal.visualization.VisualizationPackage;

import universal.visualization.impl.VisualizationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsPackageImpl extends EPackageImpl implements RailsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

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
	 * @see universal.rails.RailsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RailsPackageImpl() {
		super(eNS_URI, RailsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RailsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RailsPackage init() {
		if (isInited) return (RailsPackage)EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI);

		// Obtain or create and register package
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RailsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) : OracleformsPackage.eINSTANCE);
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) : OOPPackage.eINSTANCE);
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) : MicroservicePackage.eINSTANCE);
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);

		// Create package meta-data objects
		theRailsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theOracleformsPackage.createPackageContents();
		theOOPPackage.createPackageContents();
		theMicroservicePackage.createPackageContents();
		theVisualizationPackage.createPackageContents();

		// Initialize created meta-data
		theRailsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theOracleformsPackage.initializePackageContents();
		theOOPPackage.initializePackageContents();
		theMicroservicePackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRailsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RailsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRailsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RailsPackage.eNS_URI, theRailsPackage);
		return theRailsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AssociationType() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_SourceName() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_TargetName() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_ForeignKey() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyClass() {
		return rubyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyClass_SuperClass() {
		return (EAttribute)rubyClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyClass_FullName() {
		return (EAttribute)rubyClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_MethodType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_DataType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsFactory getRailsFactory() {
		return (RailsFactory)getEFactoryInstance();
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
		applicationEClass = createEClass(APPLICATION);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_TYPE);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_NAME);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_NAME);
		createEAttribute(associationEClass, ASSOCIATION__FOREIGN_KEY);

		namespaceEClass = createEClass(NAMESPACE);

		rubyClassEClass = createEClass(RUBY_CLASS);
		createEAttribute(rubyClassEClass, RUBY_CLASS__SUPER_CLASS);
		createEAttribute(rubyClassEClass, RUBY_CLASS__FULL_NAME);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__METHOD_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__DATA_TYPE);
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

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationEClass.getESuperTypes().add(theCorePackage.getApplication());
		associationEClass.getESuperTypes().add(theCorePackage.getRelation());
		namespaceEClass.getESuperTypes().add(theCorePackage.getContainer());
		rubyClassEClass.getESuperTypes().add(theCorePackage.getContainer());
		methodEClass.getESuperTypes().add(theCorePackage.getSimpleElement());
		attributeEClass.getESuperTypes().add(theCorePackage.getSimpleElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_AssociationType(), ecorePackage.getEString(), "associationType", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SourceName(), ecorePackage.getEString(), "sourceName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetName(), ecorePackage.getEString(), "targetName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_ForeignKey(), ecorePackage.getEString(), "foreignKey", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rubyClassEClass, RubyClass.class, "RubyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRubyClass_SuperClass(), ecorePackage.getEString(), "superClass", null, 0, 1, RubyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyClass_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, RubyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_MethodType(), ecorePackage.getEString(), "methodType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (applicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "simpleRelationShipsInvariant basicElementsInvariant"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "constraints", "associationTypeInvariant sourceInvariant targetInvariant"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "constraints", "innerElementsInvariant"
		   });	
		addAnnotation
		  (rubyClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "innerElementsInvariant"
		   });	
		addAnnotation
		  (methodEClass, 
		   source, 
		   new String[] {
			 "constraints", "methodTypeInvariant"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (applicationEClass, 
		   source, 
		   new String[] {
			 "simpleRelationShipsInvariant", "self.simpleRelationships->forAll(e | e.oclIsTypeOf(Association)=true)",
			 "basicElementsInvariant", "self.basicElements->forAll(\n       \t\t\te | e.oclIsTypeOf(Method)=true or e.oclIsTypeOf(Attribute)=true or e.oclIsTypeOf(RubyClass)=true or e.oclIsTypeOf(Namespace)=true  \t\t\t\n       \t\t)"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "associationTypeInvariant", "self.associationType = null or \n\t\t\t\tself.associationType = \'M2M\' or self.associationType = \'O2M\' or self.associationType = \'O2O\'",
			 "sourceInvariant", "self.source.oclIsTypeOf(RubyClass)=true",
			 "targetInvariant", "self.target.oclIsTypeOf(RubyClass)=true"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "innerElementsInvariant", "self.innerElements->forAll(\n\t\t\t\te|e.oclIsTypeOf(RubyClass)=true or e.oclIsTypeOf(Namespace)=true\n\t\t\t)"
		   });	
		addAnnotation
		  (rubyClassEClass, 
		   source, 
		   new String[] {
			 "innerElementsInvariant", "self.innerElements->forAll(\n\t\t\t\te|e.oclIsTypeOf(Method)=true or e.oclIsTypeOf(Attribute)=true\n\t\t\t)"
		   });	
		addAnnotation
		  (methodEClass, 
		   source, 
		   new String[] {
			 "methodTypeInvariant", "self.methodType = \'instance\' or self.methodType = \'class\'"
		   });
	}

} //RailsPackageImpl
