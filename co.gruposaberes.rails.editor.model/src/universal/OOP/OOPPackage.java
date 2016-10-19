/**
 */
package universal.OOP;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import universal.core.CorePackage;

import universal.metrics.MetricsPackage;

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
 * @see universal.OOP.OOPFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface OOPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OOP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://universal/oop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unoop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OOPPackage eINSTANCE = universal.OOP.impl.OOPPackageImpl.init();

	/**
	 * The meta object id for the '{@link universal.OOP.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.MethodImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 0;

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
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = CorePackage.SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.TypeImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.ClassImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEASURANT = TYPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INNER_ELEMENTS = TYPE__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.InterfaceImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MEASURANT = TYPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INNER_ELEMENTS = TYPE__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.OOPApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.OOPApplicationImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getOOPApplication()
	 * @generated
	 */
	int OOP_APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_APPLICATION__NAME = CorePackage.APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Basic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_APPLICATION__BASIC_ELEMENTS = CorePackage.APPLICATION__BASIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Complex Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_APPLICATION__COMPLEX_RELATIONSHIPS = CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Simple Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_APPLICATION__SIMPLE_RELATIONSHIPS = CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_APPLICATION_FEATURE_COUNT = CorePackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_APPLICATION_OPERATION_COUNT = CorePackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.TypeRelationshipImpl <em>Type Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.TypeRelationshipImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getTypeRelationship()
	 * @generated
	 */
	int TYPE_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The number of structural features of the '<em>Type Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.GeneralizationImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = TYPE_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = TYPE_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MEASURANT = TYPE_RELATIONSHIP__MEASURANT;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = TYPE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = TYPE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.RealizationImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SOURCE = TYPE_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__TARGET = TYPE_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__MEASURANT = TYPE_RELATIONSHIP__MEASURANT;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = TYPE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = TYPE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.CompositionImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = TYPE_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = TYPE_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MEASURANT = TYPE_RELATIONSHIP__MEASURANT;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = TYPE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = TYPE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.DependencyImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = TYPE_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = TYPE_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__MEASURANT = TYPE_RELATIONSHIP__MEASURANT;

	/**
	 * The feature id for the '<em><b>Method Invoked From Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS = TYPE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Invoker From Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS = TYPE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = TYPE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = TYPE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.WeigthedMethodsPerClassMeasureImpl <em>Weigthed Methods Per Class Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.WeigthedMethodsPerClassMeasureImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getWeigthedMethodsPerClassMeasure()
	 * @generated
	 */
	int WEIGTHED_METHODS_PER_CLASS_MEASURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGTHED_METHODS_PER_CLASS_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGTHED_METHODS_PER_CLASS_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Weigthed Methods Per Class Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGTHED_METHODS_PER_CLASS_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weigthed Methods Per Class Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGTHED_METHODS_PER_CLASS_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.NumberOfClassesMeasureImpl <em>Number Of Classes Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.NumberOfClassesMeasureImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getNumberOfClassesMeasure()
	 * @generated
	 */
	int NUMBER_OF_CLASSES_MEASURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Classes Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Classes Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.CouplingBetweenObjectMeasureImpl <em>Coupling Between Object Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.CouplingBetweenObjectMeasureImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getCouplingBetweenObjectMeasure()
	 * @generated
	 */
	int COUPLING_BETWEEN_OBJECT_MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECT_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECT_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Coupling Between Object Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECT_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coupling Between Object Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECT_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.NumberOfUsesMeasureImpl <em>Number Of Uses Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.NumberOfUsesMeasureImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getNumberOfUsesMeasure()
	 * @generated
	 */
	int NUMBER_OF_USES_MEASURE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Uses Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Uses Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.CalculatedCouplingMeasureImpl <em>Calculated Coupling Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.CalculatedCouplingMeasureImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getCalculatedCouplingMeasure()
	 * @generated
	 */
	int CALCULATED_COUPLING_MEASURE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Calculated Coupling Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calculated Coupling Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.OOP.impl.NumberOfContainmentsMeasureImpl <em>Number Of Containments Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.OOP.impl.NumberOfContainmentsMeasureImpl
	 * @see universal.OOP.impl.OOPPackageImpl#getNumberOfContainmentsMeasure()
	 * @generated
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Containments Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Containments Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link universal.OOP.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see universal.OOP.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see universal.OOP.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see universal.OOP.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see universal.OOP.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link universal.OOP.OOPApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see universal.OOP.OOPApplication
	 * @generated
	 */
	EClass getOOPApplication();

	/**
	 * Returns the meta object for class '{@link universal.OOP.TypeRelationship <em>Type Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Relationship</em>'.
	 * @see universal.OOP.TypeRelationship
	 * @generated
	 */
	EClass getTypeRelationship();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see universal.OOP.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see universal.OOP.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see universal.OOP.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link universal.OOP.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see universal.OOP.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link universal.OOP.Dependency#getMethodInvokedFromSourceClass <em>Method Invoked From Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method Invoked From Source Class</em>'.
	 * @see universal.OOP.Dependency#getMethodInvokedFromSourceClass()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_MethodInvokedFromSourceClass();

	/**
	 * Returns the meta object for the reference '{@link universal.OOP.Dependency#getMethodInvokerFromTargetClass <em>Method Invoker From Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method Invoker From Target Class</em>'.
	 * @see universal.OOP.Dependency#getMethodInvokerFromTargetClass()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_MethodInvokerFromTargetClass();

	/**
	 * Returns the meta object for class '{@link universal.OOP.WeigthedMethodsPerClassMeasure <em>Weigthed Methods Per Class Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weigthed Methods Per Class Measure</em>'.
	 * @see universal.OOP.WeigthedMethodsPerClassMeasure
	 * @generated
	 */
	EClass getWeigthedMethodsPerClassMeasure();

	/**
	 * Returns the meta object for class '{@link universal.OOP.NumberOfClassesMeasure <em>Number Of Classes Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Classes Measure</em>'.
	 * @see universal.OOP.NumberOfClassesMeasure
	 * @generated
	 */
	EClass getNumberOfClassesMeasure();

	/**
	 * Returns the meta object for class '{@link universal.OOP.CouplingBetweenObjectMeasure <em>Coupling Between Object Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupling Between Object Measure</em>'.
	 * @see universal.OOP.CouplingBetweenObjectMeasure
	 * @generated
	 */
	EClass getCouplingBetweenObjectMeasure();

	/**
	 * Returns the meta object for class '{@link universal.OOP.NumberOfUsesMeasure <em>Number Of Uses Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Uses Measure</em>'.
	 * @see universal.OOP.NumberOfUsesMeasure
	 * @generated
	 */
	EClass getNumberOfUsesMeasure();

	/**
	 * Returns the meta object for class '{@link universal.OOP.CalculatedCouplingMeasure <em>Calculated Coupling Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Coupling Measure</em>'.
	 * @see universal.OOP.CalculatedCouplingMeasure
	 * @generated
	 */
	EClass getCalculatedCouplingMeasure();

	/**
	 * Returns the meta object for class '{@link universal.OOP.NumberOfContainmentsMeasure <em>Number Of Containments Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Containments Measure</em>'.
	 * @see universal.OOP.NumberOfContainmentsMeasure
	 * @generated
	 */
	EClass getNumberOfContainmentsMeasure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OOPFactory getOOPFactory();

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
		 * The meta object literal for the '{@link universal.OOP.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.MethodImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.TypeImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.ClassImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.InterfaceImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.OOPApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.OOPApplicationImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getOOPApplication()
		 * @generated
		 */
		EClass OOP_APPLICATION = eINSTANCE.getOOPApplication();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.TypeRelationshipImpl <em>Type Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.TypeRelationshipImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getTypeRelationship()
		 * @generated
		 */
		EClass TYPE_RELATIONSHIP = eINSTANCE.getTypeRelationship();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.GeneralizationImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.RealizationImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.CompositionImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.DependencyImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Method Invoked From Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS = eINSTANCE.getDependency_MethodInvokedFromSourceClass();

		/**
		 * The meta object literal for the '<em><b>Method Invoker From Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS = eINSTANCE.getDependency_MethodInvokerFromTargetClass();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.WeigthedMethodsPerClassMeasureImpl <em>Weigthed Methods Per Class Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.WeigthedMethodsPerClassMeasureImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getWeigthedMethodsPerClassMeasure()
		 * @generated
		 */
		EClass WEIGTHED_METHODS_PER_CLASS_MEASURE = eINSTANCE.getWeigthedMethodsPerClassMeasure();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.NumberOfClassesMeasureImpl <em>Number Of Classes Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.NumberOfClassesMeasureImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getNumberOfClassesMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_CLASSES_MEASURE = eINSTANCE.getNumberOfClassesMeasure();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.CouplingBetweenObjectMeasureImpl <em>Coupling Between Object Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.CouplingBetweenObjectMeasureImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getCouplingBetweenObjectMeasure()
		 * @generated
		 */
		EClass COUPLING_BETWEEN_OBJECT_MEASURE = eINSTANCE.getCouplingBetweenObjectMeasure();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.NumberOfUsesMeasureImpl <em>Number Of Uses Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.NumberOfUsesMeasureImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getNumberOfUsesMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_USES_MEASURE = eINSTANCE.getNumberOfUsesMeasure();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.CalculatedCouplingMeasureImpl <em>Calculated Coupling Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.CalculatedCouplingMeasureImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getCalculatedCouplingMeasure()
		 * @generated
		 */
		EClass CALCULATED_COUPLING_MEASURE = eINSTANCE.getCalculatedCouplingMeasure();

		/**
		 * The meta object literal for the '{@link universal.OOP.impl.NumberOfContainmentsMeasureImpl <em>Number Of Containments Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.OOP.impl.NumberOfContainmentsMeasureImpl
		 * @see universal.OOP.impl.OOPPackageImpl#getNumberOfContainmentsMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_CONTAINMENTS_MEASURE = eINSTANCE.getNumberOfContainmentsMeasure();

	}

} //OOPPackage
