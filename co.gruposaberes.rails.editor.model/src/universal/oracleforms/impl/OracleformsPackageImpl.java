/**
 */
package universal.oracleforms.impl;

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

import universal.oracleforms.DetailTableRelationship;
import universal.oracleforms.Form;
import universal.oracleforms.FormCallRelationship;
import universal.oracleforms.MasterDetailRelationship;
import universal.oracleforms.Module;
import universal.oracleforms.ModuleRelationship;
import universal.oracleforms.NumberOfFormsPerModuleMeasure;
import universal.oracleforms.OracleFormsApp;
import universal.oracleforms.OracleformsFactory;
import universal.oracleforms.OracleformsPackage;
import universal.oracleforms.PLSQLRelationship;
import universal.oracleforms.SingleTableRelationship;
import universal.oracleforms.Table;

import universal.oracleforms.util.OracleformsValidator;

import universal.rails.RailsPackage;

import universal.rails.impl.RailsPackageImpl;

import universal.visualization.VisualizationPackage;

import universal.visualization.impl.VisualizationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OracleformsPackageImpl extends EPackageImpl implements OracleformsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oracleFormsAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formCallRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterDetailRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailTableRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTableRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plsqlRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfFormsPerModuleMeasureEClass = null;

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
	 * @see universal.oracleforms.OracleformsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OracleformsPackageImpl() {
		super(eNS_URI, OracleformsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OracleformsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OracleformsPackage init() {
		if (isInited) return (OracleformsPackage)EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI);

		// Obtain or create and register package
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OracleformsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) : OOPPackage.eINSTANCE);
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) : MicroservicePackage.eINSTANCE);
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) : RailsPackage.eINSTANCE);

		// Create package meta-data objects
		theOracleformsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theOOPPackage.createPackageContents();
		theMicroservicePackage.createPackageContents();
		theVisualizationPackage.createPackageContents();
		theRailsPackage.createPackageContents();

		// Initialize created meta-data
		theOracleformsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theOOPPackage.initializePackageContents();
		theMicroservicePackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();
		theRailsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOracleformsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OracleformsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOracleformsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OracleformsPackage.eNS_URI, theOracleformsPackage);
		return theOracleformsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOracleFormsApp() {
		return oracleFormsAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRelationship() {
		return moduleRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormCallRelationship() {
		return formCallRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterDetailRelationship() {
		return masterDetailRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailTableRelationship() {
		return detailTableRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleTableRelationship() {
		return singleTableRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLSQLRelationship() {
		return plsqlRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOfFormsPerModuleMeasure() {
		return numberOfFormsPerModuleMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleformsFactory getOracleformsFactory() {
		return (OracleformsFactory)getEFactoryInstance();
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
		formEClass = createEClass(FORM);

		tableEClass = createEClass(TABLE);

		moduleEClass = createEClass(MODULE);

		oracleFormsAppEClass = createEClass(ORACLE_FORMS_APP);

		moduleRelationshipEClass = createEClass(MODULE_RELATIONSHIP);

		formCallRelationshipEClass = createEClass(FORM_CALL_RELATIONSHIP);

		masterDetailRelationshipEClass = createEClass(MASTER_DETAIL_RELATIONSHIP);

		detailTableRelationshipEClass = createEClass(DETAIL_TABLE_RELATIONSHIP);

		singleTableRelationshipEClass = createEClass(SINGLE_TABLE_RELATIONSHIP);

		plsqlRelationshipEClass = createEClass(PLSQL_RELATIONSHIP);

		numberOfFormsPerModuleMeasureEClass = createEClass(NUMBER_OF_FORMS_PER_MODULE_MEASURE);
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
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		formEClass.getESuperTypes().add(theCorePackage.getSimpleElement());
		tableEClass.getESuperTypes().add(theCorePackage.getSimpleElement());
		moduleEClass.getESuperTypes().add(theCorePackage.getContainer());
		oracleFormsAppEClass.getESuperTypes().add(theCorePackage.getApplication());
		moduleRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		formCallRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		masterDetailRelationshipEClass.getESuperTypes().add(theCorePackage.getRelationContainer());
		detailTableRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		singleTableRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		plsqlRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		numberOfFormsPerModuleMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());

		// Initialize classes, features, and operations; add parameters
		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oracleFormsAppEClass, OracleFormsApp.class, "OracleFormsApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleRelationshipEClass, ModuleRelationship.class, "ModuleRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formCallRelationshipEClass, FormCallRelationship.class, "FormCallRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterDetailRelationshipEClass, MasterDetailRelationship.class, "MasterDetailRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detailTableRelationshipEClass, DetailTableRelationship.class, "DetailTableRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleTableRelationshipEClass, SingleTableRelationship.class, "SingleTableRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plsqlRelationshipEClass, PLSQLRelationship.class, "PLSQLRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfFormsPerModuleMeasureEClass, NumberOfFormsPerModuleMeasure.class, "NumberOfFormsPerModuleMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "constraints", "moduleInnerElementsRule"
		   });	
		addAnnotation
		  (oracleFormsAppEClass, 
		   source, 
		   new String[] {
			 "constraints", "oracleAppRule_MustModule"
		   });	
		addAnnotation
		  (moduleRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "moduleRealtionshiRuel_SourceMustBeModule moduleRealtionshiRuel_TargetsMustBeModule"
		   });	
		addAnnotation
		  (formCallRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "formCallRelationshipRule_SourceMustBeForm formCallRelationshipRule_TargetsMustBeForms"
		   });	
		addAnnotation
		  (masterDetailRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "masterDetailRelationshipRule_LimitRelations masterDetailRelationshipRule_FirstMustBeSingleTableRelationship masterDetailRelationshipRule_SegundMustBeSingleTableRelationship"
		   });	
		addAnnotation
		  (detailTableRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "DetailTableRelationshipRule_SourceMustBeTable DetailTableRelationshipRule_TargetsMustBeTable"
		   });	
		addAnnotation
		  (singleTableRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "singleTableRelationshipRule_SourceMustBeForm singleTableRelationshipRule_TargetsMustBeTable"
		   });	
		addAnnotation
		  (plsqlRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "plsqlRelationshipRule_SourceMustBeForm plsqlRelationshipRule_TargetsMustBeTable"
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
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "moduleInnerElementsRule", "self.innerElements->forAll(el |\n\t\t\t\t\tel.oclIsTypeOf(Form) = true or el.oclIsTypeOf(Table) = true)"
		   });	
		addAnnotation
		  (oracleFormsAppEClass, 
		   source, 
		   new String[] {
			 "oracleAppRule_MustModule", "self.basicElements->forAll(md | md.oclIsTypeOf(Module)=true)"
		   });	
		addAnnotation
		  (moduleRelationshipEClass, 
		   source, 
		   new String[] {
			 "moduleRealtionshiRuel_SourceMustBeModule", "self.source.oclIsTypeOf(Module) = true",
			 "moduleRealtionshiRuel_TargetsMustBeModule", "self.target.oclIsTypeOf(Module) = true"
		   });	
		addAnnotation
		  (formCallRelationshipEClass, 
		   source, 
		   new String[] {
			 "formCallRelationshipRule_SourceMustBeForm", "self.source->forAll(mod | mod.oclIsTypeOf(Form) = true)",
			 "formCallRelationshipRule_TargetsMustBeForms", "self.target.oclIsTypeOf(Form) = true"
		   });	
		addAnnotation
		  (masterDetailRelationshipEClass, 
		   source, 
		   new String[] {
			 "masterDetailRelationshipRule_LimitRelations", "self.relations->size() = 2",
			 "masterDetailRelationshipRule_FirstMustBeSingleTableRelationship", "self.relations->first().oclIsTypeOf(SingleTableRelationship) = true",
			 "masterDetailRelationshipRule_SegundMustBeSingleTableRelationship", "self.relations->last().oclIsTypeOf(DetailTableRelationship) = true"
		   });	
		addAnnotation
		  (detailTableRelationshipEClass, 
		   source, 
		   new String[] {
			 "DetailTableRelationshipRule_SourceMustBeTable", "self.source.oclIsTypeOf(Table) = true",
			 "DetailTableRelationshipRule_TargetsMustBeTable", "self.target.oclIsTypeOf(Table) = true"
		   });	
		addAnnotation
		  (singleTableRelationshipEClass, 
		   source, 
		   new String[] {
			 "singleTableRelationshipRule_SourceMustBeForm", "self.source.oclIsTypeOf(Form) = true",
			 "singleTableRelationshipRule_TargetsMustBeTable", "self.target.oclIsTypeOf(Table) = true"
		   });	
		addAnnotation
		  (plsqlRelationshipEClass, 
		   source, 
		   new String[] {
			 "plsqlRelationshipRule_SourceMustBeForm", "self.source.oclIsTypeOf(Form) = true",
			 "plsqlRelationshipRule_TargetsMustBeTable", "self.target.oclIsTypeOf(Table) = true"
		   });
	}

} //OracleformsPackageImpl
