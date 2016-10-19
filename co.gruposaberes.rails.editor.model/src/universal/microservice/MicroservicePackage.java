/**
 */
package universal.microservice;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see universal.microservice.MicroserviceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MicroservicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "microservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://universal/microservice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unmicro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroservicePackage eINSTANCE = universal.microservice.impl.MicroservicePackageImpl.init();

	/**
	 * The meta object id for the '{@link universal.microservice.impl.SessionToEntityClusterImpl <em>Session To Entity Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.microservice.impl.SessionToEntityClusterImpl
	 * @see universal.microservice.impl.MicroservicePackageImpl#getSessionToEntityCluster()
	 * @generated
	 */
	int SESSION_TO_ENTITY_CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER__NAME = CorePackage.SIMPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER__DESCRIPTION = CorePackage.SIMPLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER__MEASURANT = CorePackage.SIMPLE_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Number Of Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Session To Entity Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER_FEATURE_COUNT = CorePackage.SIMPLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Session To Entity Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TO_ENTITY_CLUSTER_OPERATION_COUNT = CorePackage.SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.microservice.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.microservice.impl.MicroserviceImpl
	 * @see universal.microservice.impl.MicroservicePackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DESCRIPTION = CorePackage.CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__MEASURANT = CorePackage.CONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Inner Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__INNER_ELEMENTS = CorePackage.CONTAINER__INNER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.microservice.impl.MicroserviceArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.microservice.impl.MicroserviceArchitectureImpl
	 * @see universal.microservice.impl.MicroservicePackageImpl#getMicroserviceArchitecture()
	 * @generated
	 */
	int MICROSERVICE_ARCHITECTURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__NAME = CorePackage.APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Basic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__BASIC_ELEMENTS = CorePackage.APPLICATION__BASIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Complex Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__COMPLEX_RELATIONSHIPS = CorePackage.APPLICATION__COMPLEX_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Simple Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE__SIMPLE_RELATIONSHIPS = CorePackage.APPLICATION__SIMPLE_RELATIONSHIPS;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE_FEATURE_COUNT = CorePackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ARCHITECTURE_OPERATION_COUNT = CorePackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.microservice.impl.ClusterRelationshipImpl <em>Cluster Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.microservice.impl.ClusterRelationshipImpl
	 * @see universal.microservice.impl.MicroservicePackageImpl#getClusterRelationship()
	 * @generated
	 */
	int CLUSTER_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The feature id for the '<em><b>Types Contained Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types Contained Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT = CorePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cluster Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cluster Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.microservice.impl.MicroserviceRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.microservice.impl.MicroserviceRelationshipImpl
	 * @see universal.microservice.impl.MicroservicePackageImpl#getMicroserviceRelationship()
	 * @generated
	 */
	int MICROSERVICE_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_RELATIONSHIP__SOURCE = CorePackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_RELATIONSHIP__TARGET = CorePackage.RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_RELATIONSHIP__MEASURANT = CorePackage.RELATION__MEASURANT;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_RELATIONSHIP__DEPENDENCIES = CorePackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_RELATIONSHIP_FEATURE_COUNT = CorePackage.RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_RELATIONSHIP_OPERATION_COUNT = CorePackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.microservice.impl.ClusterRelationConflictPercentageMeasureImpl <em>Cluster Relation Conflict Percentage Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.microservice.impl.ClusterRelationConflictPercentageMeasureImpl
	 * @see universal.microservice.impl.MicroservicePackageImpl#getClusterRelationConflictPercentageMeasure()
	 * @generated
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE__NAME = MetricsPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE__DESCRIPTION = MetricsPackage.MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Cluster Relation Conflict Percentage Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_FEATURE_COUNT = MetricsPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cluster Relation Conflict Percentage Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_OPERATION_COUNT = MetricsPackage.MEASURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link universal.microservice.SessionToEntityCluster <em>Session To Entity Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session To Entity Cluster</em>'.
	 * @see universal.microservice.SessionToEntityCluster
	 * @generated
	 */
	EClass getSessionToEntityCluster();

	/**
	 * Returns the meta object for the attribute '{@link universal.microservice.SessionToEntityCluster#getNumberOfTypes <em>Number Of Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Types</em>'.
	 * @see universal.microservice.SessionToEntityCluster#getNumberOfTypes()
	 * @see #getSessionToEntityCluster()
	 * @generated
	 */
	EAttribute getSessionToEntityCluster_NumberOfTypes();

	/**
	 * Returns the meta object for the attribute '{@link universal.microservice.SessionToEntityCluster#getNumberOfLines <em>Number Of Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Lines</em>'.
	 * @see universal.microservice.SessionToEntityCluster#getNumberOfLines()
	 * @see #getSessionToEntityCluster()
	 * @generated
	 */
	EAttribute getSessionToEntityCluster_NumberOfLines();

	/**
	 * Returns the meta object for the reference list '{@link universal.microservice.SessionToEntityCluster#getTypeReferences <em>Type References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type References</em>'.
	 * @see universal.microservice.SessionToEntityCluster#getTypeReferences()
	 * @see #getSessionToEntityCluster()
	 * @generated
	 */
	EReference getSessionToEntityCluster_TypeReferences();

	/**
	 * Returns the meta object for class '{@link universal.microservice.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see universal.microservice.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for class '{@link universal.microservice.MicroserviceArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see universal.microservice.MicroserviceArchitecture
	 * @generated
	 */
	EClass getMicroserviceArchitecture();

	/**
	 * Returns the meta object for class '{@link universal.microservice.ClusterRelationship <em>Cluster Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Relationship</em>'.
	 * @see universal.microservice.ClusterRelationship
	 * @generated
	 */
	EClass getClusterRelationship();

	/**
	 * Returns the meta object for the attribute '{@link universal.microservice.ClusterRelationship#getTypesContainedLeft <em>Types Contained Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Types Contained Left</em>'.
	 * @see universal.microservice.ClusterRelationship#getTypesContainedLeft()
	 * @see #getClusterRelationship()
	 * @generated
	 */
	EAttribute getClusterRelationship_TypesContainedLeft();

	/**
	 * Returns the meta object for the attribute '{@link universal.microservice.ClusterRelationship#getTypesContainedRight <em>Types Contained Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Types Contained Right</em>'.
	 * @see universal.microservice.ClusterRelationship#getTypesContainedRight()
	 * @see #getClusterRelationship()
	 * @generated
	 */
	EAttribute getClusterRelationship_TypesContainedRight();

	/**
	 * Returns the meta object for class '{@link universal.microservice.MicroserviceRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see universal.microservice.MicroserviceRelationship
	 * @generated
	 */
	EClass getMicroserviceRelationship();

	/**
	 * Returns the meta object for the reference list '{@link universal.microservice.MicroserviceRelationship#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see universal.microservice.MicroserviceRelationship#getDependencies()
	 * @see #getMicroserviceRelationship()
	 * @generated
	 */
	EReference getMicroserviceRelationship_Dependencies();

	/**
	 * Returns the meta object for class '{@link universal.microservice.ClusterRelationConflictPercentageMeasure <em>Cluster Relation Conflict Percentage Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Relation Conflict Percentage Measure</em>'.
	 * @see universal.microservice.ClusterRelationConflictPercentageMeasure
	 * @generated
	 */
	EClass getClusterRelationConflictPercentageMeasure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicroserviceFactory getMicroserviceFactory();

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
		 * The meta object literal for the '{@link universal.microservice.impl.SessionToEntityClusterImpl <em>Session To Entity Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.microservice.impl.SessionToEntityClusterImpl
		 * @see universal.microservice.impl.MicroservicePackageImpl#getSessionToEntityCluster()
		 * @generated
		 */
		EClass SESSION_TO_ENTITY_CLUSTER = eINSTANCE.getSessionToEntityCluster();

		/**
		 * The meta object literal for the '<em><b>Number Of Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES = eINSTANCE.getSessionToEntityCluster_NumberOfTypes();

		/**
		 * The meta object literal for the '<em><b>Number Of Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES = eINSTANCE.getSessionToEntityCluster_NumberOfLines();

		/**
		 * The meta object literal for the '<em><b>Type References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES = eINSTANCE.getSessionToEntityCluster_TypeReferences();

		/**
		 * The meta object literal for the '{@link universal.microservice.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.microservice.impl.MicroserviceImpl
		 * @see universal.microservice.impl.MicroservicePackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '{@link universal.microservice.impl.MicroserviceArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.microservice.impl.MicroserviceArchitectureImpl
		 * @see universal.microservice.impl.MicroservicePackageImpl#getMicroserviceArchitecture()
		 * @generated
		 */
		EClass MICROSERVICE_ARCHITECTURE = eINSTANCE.getMicroserviceArchitecture();

		/**
		 * The meta object literal for the '{@link universal.microservice.impl.ClusterRelationshipImpl <em>Cluster Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.microservice.impl.ClusterRelationshipImpl
		 * @see universal.microservice.impl.MicroservicePackageImpl#getClusterRelationship()
		 * @generated
		 */
		EClass CLUSTER_RELATIONSHIP = eINSTANCE.getClusterRelationship();

		/**
		 * The meta object literal for the '<em><b>Types Contained Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT = eINSTANCE.getClusterRelationship_TypesContainedLeft();

		/**
		 * The meta object literal for the '<em><b>Types Contained Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT = eINSTANCE.getClusterRelationship_TypesContainedRight();

		/**
		 * The meta object literal for the '{@link universal.microservice.impl.MicroserviceRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.microservice.impl.MicroserviceRelationshipImpl
		 * @see universal.microservice.impl.MicroservicePackageImpl#getMicroserviceRelationship()
		 * @generated
		 */
		EClass MICROSERVICE_RELATIONSHIP = eINSTANCE.getMicroserviceRelationship();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_RELATIONSHIP__DEPENDENCIES = eINSTANCE.getMicroserviceRelationship_Dependencies();

		/**
		 * The meta object literal for the '{@link universal.microservice.impl.ClusterRelationConflictPercentageMeasureImpl <em>Cluster Relation Conflict Percentage Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.microservice.impl.ClusterRelationConflictPercentageMeasureImpl
		 * @see universal.microservice.impl.MicroservicePackageImpl#getClusterRelationConflictPercentageMeasure()
		 * @generated
		 */
		EClass CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE = eINSTANCE.getClusterRelationConflictPercentageMeasure();

	}

} //MicroservicePackage
