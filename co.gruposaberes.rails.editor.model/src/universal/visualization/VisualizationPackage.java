/**
 */
package universal.visualization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see universal.visualization.VisualizationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface VisualizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://universal/visualization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unvi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationPackage eINSTANCE = universal.visualization.impl.VisualizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VDiagramElementImpl <em>VDiagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VDiagramElementImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVDiagramElement()
	 * @generated
	 */
	int VDIAGRAM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT__NAME = CorePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT__DESCRIPTION = CorePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT__MEASURANT = CorePackage.ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT__UUID = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT__LABEL = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT__BORDER = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VDiagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VDiagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_ELEMENT_OPERATION_COUNT = CorePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VLabelImpl <em>VLabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VLabelImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVLabel()
	 * @generated
	 */
	int VLABEL = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL__FONT = 1;

	/**
	 * The feature id for the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL__IS_BOLD = 2;

	/**
	 * The feature id for the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL__IS_ITALIC = 3;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL__ALIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL__POSITION = 5;

	/**
	 * The number of structural features of the '<em>VLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>VLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VDrawableImpl <em>VDrawable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VDrawableImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVDrawable()
	 * @generated
	 */
	int VDRAWABLE = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDRAWABLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDRAWABLE__THICKNESS = 1;

	/**
	 * The number of structural features of the '<em>VDrawable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDRAWABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VDrawable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDRAWABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VBorderImpl <em>VBorder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VBorderImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVBorder()
	 * @generated
	 */
	int VBORDER = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBORDER__COLOR = VDRAWABLE__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBORDER__THICKNESS = VDRAWABLE__THICKNESS;

	/**
	 * The number of structural features of the '<em>VBorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBORDER_FEATURE_COUNT = VDRAWABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VBorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBORDER_OPERATION_COUNT = VDRAWABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VContainerImpl <em>VContainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VContainerImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVContainer()
	 * @generated
	 */
	int VCONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__NAME = VDIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__DESCRIPTION = VDIAGRAM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__MEASURANT = VDIAGRAM_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__UUID = VDIAGRAM_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__LABEL = VDIAGRAM_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__BORDER = VDIAGRAM_ELEMENT__BORDER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER__ELEMENTS = VDIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER_FEATURE_COUNT = VDIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTAINER_OPERATION_COUNT = VDIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VDiagramImpl <em>VDiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VDiagramImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVDiagram()
	 * @generated
	 */
	int VDIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__NAME = VCONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__DESCRIPTION = VCONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__MEASURANT = VCONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__UUID = VCONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__LABEL = VCONTAINER__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__BORDER = VCONTAINER__BORDER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__ELEMENTS = VCONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM__IS_ROOT = VCONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_FEATURE_COUNT = VCONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAGRAM_OPERATION_COUNT = VCONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VClassImpl <em>VClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VClassImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVClass()
	 * @generated
	 */
	int VCLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__NAME = VCONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__DESCRIPTION = VCONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__MEASURANT = VCONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__UUID = VCONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__LABEL = VCONTAINER__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__BORDER = VCONTAINER__BORDER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__ELEMENTS = VCONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS__IS_SHARED = VCONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS_FEATURE_COUNT = VCONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASS_OPERATION_COUNT = VCONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VPackageImpl <em>VPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VPackageImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVPackage()
	 * @generated
	 */
	int VPACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__NAME = VCONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__DESCRIPTION = VCONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__MEASURANT = VCONTAINER__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__UUID = VCONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__LABEL = VCONTAINER__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__BORDER = VCONTAINER__BORDER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__ELEMENTS = VCONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>VPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_FEATURE_COUNT = VCONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_OPERATION_COUNT = VCONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VShapeImpl <em>VShape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VShapeImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVShape()
	 * @generated
	 */
	int VSHAPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__NAME = VDIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__DESCRIPTION = VDIAGRAM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__MEASURANT = VDIAGRAM_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__UUID = VDIAGRAM_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__LABEL = VDIAGRAM_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__BORDER = VDIAGRAM_ELEMENT__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__COLOR = VDIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__WIDTH = VDIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE__HEIGTH = VDIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VShape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE_FEATURE_COUNT = VDIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VShape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSHAPE_OPERATION_COUNT = VDIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VCirculeImpl <em>VCircule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VCirculeImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVCircule()
	 * @generated
	 */
	int VCIRCULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__NAME = VSHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__DESCRIPTION = VSHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__MEASURANT = VSHAPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__UUID = VSHAPE__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__LABEL = VSHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__BORDER = VSHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__COLOR = VSHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__WIDTH = VSHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE__HEIGTH = VSHAPE__HEIGTH;

	/**
	 * The number of structural features of the '<em>VCircule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE_FEATURE_COUNT = VSHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VCircule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCIRCULE_OPERATION_COUNT = VSHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VTriangleImpl <em>VTriangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VTriangleImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVTriangle()
	 * @generated
	 */
	int VTRIANGLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__NAME = VSHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__DESCRIPTION = VSHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__MEASURANT = VSHAPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__UUID = VSHAPE__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__LABEL = VSHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__BORDER = VSHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__COLOR = VSHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__WIDTH = VSHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE__HEIGTH = VSHAPE__HEIGTH;

	/**
	 * The number of structural features of the '<em>VTriangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE_FEATURE_COUNT = VSHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VTriangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRIANGLE_OPERATION_COUNT = VSHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VDiamondImpl <em>VDiamond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VDiamondImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVDiamond()
	 * @generated
	 */
	int VDIAMOND = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__NAME = VSHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__DESCRIPTION = VSHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__MEASURANT = VSHAPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__UUID = VSHAPE__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__LABEL = VSHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__BORDER = VSHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__COLOR = VSHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__WIDTH = VSHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND__HEIGTH = VSHAPE__HEIGTH;

	/**
	 * The number of structural features of the '<em>VDiamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND_FEATURE_COUNT = VSHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VDiamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDIAMOND_OPERATION_COUNT = VSHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VQuadrangleImpl <em>VQuadrangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VQuadrangleImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVQuadrangle()
	 * @generated
	 */
	int VQUADRANGLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__NAME = VSHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__DESCRIPTION = VSHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__MEASURANT = VSHAPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__UUID = VSHAPE__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__LABEL = VSHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__BORDER = VSHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__COLOR = VSHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__WIDTH = VSHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE__HEIGTH = VSHAPE__HEIGTH;

	/**
	 * The number of structural features of the '<em>VQuadrangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE_FEATURE_COUNT = VSHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VQuadrangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VQUADRANGLE_OPERATION_COUNT = VSHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VDotImpl <em>VDot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VDotImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVDot()
	 * @generated
	 */
	int VDOT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__NAME = VSHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__DESCRIPTION = VSHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__MEASURANT = VSHAPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__UUID = VSHAPE__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__LABEL = VSHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__BORDER = VSHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__COLOR = VSHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__WIDTH = VSHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT__HEIGTH = VSHAPE__HEIGTH;

	/**
	 * The number of structural features of the '<em>VDot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT_FEATURE_COUNT = VSHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VDot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDOT_OPERATION_COUNT = VSHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VEllipseImpl <em>VEllipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VEllipseImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVEllipse()
	 * @generated
	 */
	int VELLIPSE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__NAME = VSHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__DESCRIPTION = VSHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__MEASURANT = VSHAPE__MEASURANT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__UUID = VSHAPE__UUID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__LABEL = VSHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__BORDER = VSHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__COLOR = VSHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__WIDTH = VSHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE__HEIGTH = VSHAPE__HEIGTH;

	/**
	 * The number of structural features of the '<em>VEllipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE_FEATURE_COUNT = VSHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VEllipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELLIPSE_OPERATION_COUNT = VSHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VRelationInvocationImpl <em>VRelation Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VRelationInvocationImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVRelationInvocation()
	 * @generated
	 */
	int VRELATION_INVOCATION = 15;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRELATION_INVOCATION__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRELATION_INVOCATION__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>VRelation Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRELATION_INVOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VRelation Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRELATION_INVOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VInvocationImpl <em>VInvocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VInvocationImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVInvocation()
	 * @generated
	 */
	int VINVOCATION = 16;

	/**
	 * The feature id for the '<em><b>From Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINVOCATION__FROM_METHOD = 0;

	/**
	 * The feature id for the '<em><b>To Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINVOCATION__TO_METHOD = 1;

	/**
	 * The number of structural features of the '<em>VInvocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINVOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VInvocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINVOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VConnectorElementImpl <em>VConnector Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VConnectorElementImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVConnectorElement()
	 * @generated
	 */
	int VCONNECTOR_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__COLOR = VDRAWABLE__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__THICKNESS = VDRAWABLE__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__SOURCE = VDRAWABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__TARGET = VDRAWABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__MEASURANT = VDRAWABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__NAME = VDRAWABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__LINE_TYPE = VDRAWABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__ROUTING_TYPE = VDRAWABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE = VDRAWABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET = VDRAWABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__SOURCE_ID = VDRAWABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__TARGET_ID = VDRAWABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__INVOCATIONS = VDRAWABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT__CONNECTORS = VDRAWABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>VConnector Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT_FEATURE_COUNT = VDRAWABLE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>VConnector Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONNECTOR_ELEMENT_OPERATION_COUNT = VDRAWABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VGeneralizationImpl <em>VGeneralization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VGeneralizationImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVGeneralization()
	 * @generated
	 */
	int VGENERALIZATION = 18;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__COLOR = VCONNECTOR_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__THICKNESS = VCONNECTOR_ELEMENT__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__SOURCE = VCONNECTOR_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__TARGET = VCONNECTOR_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__MEASURANT = VCONNECTOR_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__NAME = VCONNECTOR_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__LINE_TYPE = VCONNECTOR_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__ROUTING_TYPE = VCONNECTOR_ELEMENT__ROUTING_TYPE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__ARROW_TYPE_FOR_SOURCE = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__ARROW_TYPE_FOR_TARGET = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__SOURCE_ID = VCONNECTOR_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__TARGET_ID = VCONNECTOR_ELEMENT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__INVOCATIONS = VCONNECTOR_ELEMENT__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION__CONNECTORS = VCONNECTOR_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>VGeneralization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION_FEATURE_COUNT = VCONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VGeneralization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VGENERALIZATION_OPERATION_COUNT = VCONNECTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VImplementsImpl <em>VImplements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VImplementsImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVImplements()
	 * @generated
	 */
	int VIMPLEMENTS = 19;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__COLOR = VCONNECTOR_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__THICKNESS = VCONNECTOR_ELEMENT__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__SOURCE = VCONNECTOR_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__TARGET = VCONNECTOR_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__MEASURANT = VCONNECTOR_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__NAME = VCONNECTOR_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__LINE_TYPE = VCONNECTOR_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__ROUTING_TYPE = VCONNECTOR_ELEMENT__ROUTING_TYPE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__ARROW_TYPE_FOR_SOURCE = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__ARROW_TYPE_FOR_TARGET = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__SOURCE_ID = VCONNECTOR_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__TARGET_ID = VCONNECTOR_ELEMENT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__INVOCATIONS = VCONNECTOR_ELEMENT__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS__CONNECTORS = VCONNECTOR_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>VImplements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS_FEATURE_COUNT = VCONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VImplements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIMPLEMENTS_OPERATION_COUNT = VCONNECTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VDependecyImpl <em>VDependecy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VDependecyImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVDependecy()
	 * @generated
	 */
	int VDEPENDECY = 20;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__COLOR = VCONNECTOR_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__THICKNESS = VCONNECTOR_ELEMENT__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__SOURCE = VCONNECTOR_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__TARGET = VCONNECTOR_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__MEASURANT = VCONNECTOR_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__NAME = VCONNECTOR_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__LINE_TYPE = VCONNECTOR_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__ROUTING_TYPE = VCONNECTOR_ELEMENT__ROUTING_TYPE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__ARROW_TYPE_FOR_SOURCE = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__ARROW_TYPE_FOR_TARGET = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__SOURCE_ID = VCONNECTOR_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__TARGET_ID = VCONNECTOR_ELEMENT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__INVOCATIONS = VCONNECTOR_ELEMENT__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY__CONNECTORS = VCONNECTOR_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>VDependecy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY_FEATURE_COUNT = VCONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VDependecy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDECY_OPERATION_COUNT = VCONNECTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VAssociationImpl <em>VAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VAssociationImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVAssociation()
	 * @generated
	 */
	int VASSOCIATION = 21;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__COLOR = VCONNECTOR_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__THICKNESS = VCONNECTOR_ELEMENT__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__SOURCE = VCONNECTOR_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__TARGET = VCONNECTOR_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__MEASURANT = VCONNECTOR_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__NAME = VCONNECTOR_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__LINE_TYPE = VCONNECTOR_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__ROUTING_TYPE = VCONNECTOR_ELEMENT__ROUTING_TYPE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__ARROW_TYPE_FOR_SOURCE = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__ARROW_TYPE_FOR_TARGET = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__SOURCE_ID = VCONNECTOR_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__TARGET_ID = VCONNECTOR_ELEMENT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__INVOCATIONS = VCONNECTOR_ELEMENT__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION__CONNECTORS = VCONNECTOR_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>VAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION_FEATURE_COUNT = VCONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VASSOCIATION_OPERATION_COUNT = VCONNECTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VAgregationImpl <em>VAgregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VAgregationImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVAgregation()
	 * @generated
	 */
	int VAGREGATION = 22;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__COLOR = VCONNECTOR_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__THICKNESS = VCONNECTOR_ELEMENT__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__SOURCE = VCONNECTOR_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__TARGET = VCONNECTOR_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__MEASURANT = VCONNECTOR_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__NAME = VCONNECTOR_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__LINE_TYPE = VCONNECTOR_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__ROUTING_TYPE = VCONNECTOR_ELEMENT__ROUTING_TYPE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__ARROW_TYPE_FOR_SOURCE = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__ARROW_TYPE_FOR_TARGET = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__SOURCE_ID = VCONNECTOR_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__TARGET_ID = VCONNECTOR_ELEMENT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__INVOCATIONS = VCONNECTOR_ELEMENT__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION__CONNECTORS = VCONNECTOR_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>VAgregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION_FEATURE_COUNT = VCONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VAgregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGREGATION_OPERATION_COUNT = VCONNECTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.impl.VCompositionImpl <em>VComposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.impl.VCompositionImpl
	 * @see universal.visualization.impl.VisualizationPackageImpl#getVComposition()
	 * @generated
	 */
	int VCOMPOSITION = 23;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__COLOR = VCONNECTOR_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__THICKNESS = VCONNECTOR_ELEMENT__THICKNESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__SOURCE = VCONNECTOR_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__TARGET = VCONNECTOR_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__MEASURANT = VCONNECTOR_ELEMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__NAME = VCONNECTOR_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__LINE_TYPE = VCONNECTOR_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Routing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__ROUTING_TYPE = VCONNECTOR_ELEMENT__ROUTING_TYPE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__ARROW_TYPE_FOR_SOURCE = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE;

	/**
	 * The feature id for the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__ARROW_TYPE_FOR_TARGET = VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__SOURCE_ID = VCONNECTOR_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__TARGET_ID = VCONNECTOR_ELEMENT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__INVOCATIONS = VCONNECTOR_ELEMENT__INVOCATIONS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION__CONNECTORS = VCONNECTOR_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>VComposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION_FEATURE_COUNT = VCONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VComposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCOMPOSITION_OPERATION_COUNT = VCONNECTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.visualization.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.Color
	 * @see universal.visualization.impl.VisualizationPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 24;

	/**
	 * The meta object id for the '{@link universal.visualization.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.Alignment
	 * @see universal.visualization.impl.VisualizationPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 25;

	/**
	 * The meta object id for the '{@link universal.visualization.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.Position
	 * @see universal.visualization.impl.VisualizationPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 26;

	/**
	 * The meta object id for the '{@link universal.visualization.LineType <em>Line Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.LineType
	 * @see universal.visualization.impl.VisualizationPackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 27;

	/**
	 * The meta object id for the '{@link universal.visualization.RoutingType <em>Routing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.RoutingType
	 * @see universal.visualization.impl.VisualizationPackageImpl#getRoutingType()
	 * @generated
	 */
	int ROUTING_TYPE = 28;

	/**
	 * The meta object id for the '{@link universal.visualization.ArrowType <em>Arrow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.visualization.ArrowType
	 * @see universal.visualization.impl.VisualizationPackageImpl#getArrowType()
	 * @generated
	 */
	int ARROW_TYPE = 29;


	/**
	 * Returns the meta object for class '{@link universal.visualization.VDiagramElement <em>VDiagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDiagram Element</em>'.
	 * @see universal.visualization.VDiagramElement
	 * @generated
	 */
	EClass getVDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VDiagramElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see universal.visualization.VDiagramElement#getUuid()
	 * @see #getVDiagramElement()
	 * @generated
	 */
	EAttribute getVDiagramElement_Uuid();

	/**
	 * Returns the meta object for the reference '{@link universal.visualization.VDiagramElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see universal.visualization.VDiagramElement#getLabel()
	 * @see #getVDiagramElement()
	 * @generated
	 */
	EReference getVDiagramElement_Label();

	/**
	 * Returns the meta object for the reference '{@link universal.visualization.VDiagramElement#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Border</em>'.
	 * @see universal.visualization.VDiagramElement#getBorder()
	 * @see #getVDiagramElement()
	 * @generated
	 */
	EReference getVDiagramElement_Border();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VLabel <em>VLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLabel</em>'.
	 * @see universal.visualization.VLabel
	 * @generated
	 */
	EClass getVLabel();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VLabel#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see universal.visualization.VLabel#getSize()
	 * @see #getVLabel()
	 * @generated
	 */
	EAttribute getVLabel_Size();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VLabel#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see universal.visualization.VLabel#getFont()
	 * @see #getVLabel()
	 * @generated
	 */
	EAttribute getVLabel_Font();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VLabel#isIsBold <em>Is Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bold</em>'.
	 * @see universal.visualization.VLabel#isIsBold()
	 * @see #getVLabel()
	 * @generated
	 */
	EAttribute getVLabel_IsBold();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VLabel#isIsItalic <em>Is Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Italic</em>'.
	 * @see universal.visualization.VLabel#isIsItalic()
	 * @see #getVLabel()
	 * @generated
	 */
	EAttribute getVLabel_IsItalic();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VLabel#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see universal.visualization.VLabel#getAlignment()
	 * @see #getVLabel()
	 * @generated
	 */
	EAttribute getVLabel_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VLabel#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see universal.visualization.VLabel#getPosition()
	 * @see #getVLabel()
	 * @generated
	 */
	EAttribute getVLabel_Position();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VDrawable <em>VDrawable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDrawable</em>'.
	 * @see universal.visualization.VDrawable
	 * @generated
	 */
	EClass getVDrawable();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VDrawable#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see universal.visualization.VDrawable#getColor()
	 * @see #getVDrawable()
	 * @generated
	 */
	EAttribute getVDrawable_Color();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VDrawable#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see universal.visualization.VDrawable#getThickness()
	 * @see #getVDrawable()
	 * @generated
	 */
	EAttribute getVDrawable_Thickness();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VBorder <em>VBorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBorder</em>'.
	 * @see universal.visualization.VBorder
	 * @generated
	 */
	EClass getVBorder();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VContainer <em>VContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContainer</em>'.
	 * @see universal.visualization.VContainer
	 * @generated
	 */
	EClass getVContainer();

	/**
	 * Returns the meta object for the reference list '{@link universal.visualization.VContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see universal.visualization.VContainer#getElements()
	 * @see #getVContainer()
	 * @generated
	 */
	EReference getVContainer_Elements();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VDiagram <em>VDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDiagram</em>'.
	 * @see universal.visualization.VDiagram
	 * @generated
	 */
	EClass getVDiagram();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VDiagram#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see universal.visualization.VDiagram#isIsRoot()
	 * @see #getVDiagram()
	 * @generated
	 */
	EAttribute getVDiagram_IsRoot();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VClass <em>VClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VClass</em>'.
	 * @see universal.visualization.VClass
	 * @generated
	 */
	EClass getVClass();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VClass#isIsShared <em>Is Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shared</em>'.
	 * @see universal.visualization.VClass#isIsShared()
	 * @see #getVClass()
	 * @generated
	 */
	EAttribute getVClass_IsShared();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VPackage <em>VPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPackage</em>'.
	 * @see universal.visualization.VPackage
	 * @generated
	 */
	EClass getVPackage();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VShape <em>VShape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VShape</em>'.
	 * @see universal.visualization.VShape
	 * @generated
	 */
	EClass getVShape();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VShape#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see universal.visualization.VShape#getColor()
	 * @see #getVShape()
	 * @generated
	 */
	EAttribute getVShape_Color();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VShape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see universal.visualization.VShape#getWidth()
	 * @see #getVShape()
	 * @generated
	 */
	EAttribute getVShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VShape#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see universal.visualization.VShape#getHeigth()
	 * @see #getVShape()
	 * @generated
	 */
	EAttribute getVShape_Heigth();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VCircule <em>VCircule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCircule</em>'.
	 * @see universal.visualization.VCircule
	 * @generated
	 */
	EClass getVCircule();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VTriangle <em>VTriangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTriangle</em>'.
	 * @see universal.visualization.VTriangle
	 * @generated
	 */
	EClass getVTriangle();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VDiamond <em>VDiamond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDiamond</em>'.
	 * @see universal.visualization.VDiamond
	 * @generated
	 */
	EClass getVDiamond();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VQuadrangle <em>VQuadrangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VQuadrangle</em>'.
	 * @see universal.visualization.VQuadrangle
	 * @generated
	 */
	EClass getVQuadrangle();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VDot <em>VDot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDot</em>'.
	 * @see universal.visualization.VDot
	 * @generated
	 */
	EClass getVDot();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VEllipse <em>VEllipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VEllipse</em>'.
	 * @see universal.visualization.VEllipse
	 * @generated
	 */
	EClass getVEllipse();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VRelationInvocation <em>VRelation Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VRelation Invocation</em>'.
	 * @see universal.visualization.VRelationInvocation
	 * @generated
	 */
	EClass getVRelationInvocation();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VRelationInvocation#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see universal.visualization.VRelationInvocation#getClassName()
	 * @see #getVRelationInvocation()
	 * @generated
	 */
	EAttribute getVRelationInvocation_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VRelationInvocation#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see universal.visualization.VRelationInvocation#getMethodName()
	 * @see #getVRelationInvocation()
	 * @generated
	 */
	EAttribute getVRelationInvocation_MethodName();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VInvocation <em>VInvocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VInvocation</em>'.
	 * @see universal.visualization.VInvocation
	 * @generated
	 */
	EClass getVInvocation();

	/**
	 * Returns the meta object for the reference '{@link universal.visualization.VInvocation#getFromMethod <em>From Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Method</em>'.
	 * @see universal.visualization.VInvocation#getFromMethod()
	 * @see #getVInvocation()
	 * @generated
	 */
	EReference getVInvocation_FromMethod();

	/**
	 * Returns the meta object for the reference '{@link universal.visualization.VInvocation#getToMethod <em>To Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Method</em>'.
	 * @see universal.visualization.VInvocation#getToMethod()
	 * @see #getVInvocation()
	 * @generated
	 */
	EReference getVInvocation_ToMethod();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VConnectorElement <em>VConnector Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VConnector Element</em>'.
	 * @see universal.visualization.VConnectorElement
	 * @generated
	 */
	EClass getVConnectorElement();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see universal.visualization.VConnectorElement#getName()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getLineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Type</em>'.
	 * @see universal.visualization.VConnectorElement#getLineType()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_LineType();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getRoutingType <em>Routing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Type</em>'.
	 * @see universal.visualization.VConnectorElement#getRoutingType()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_RoutingType();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getArrowTypeForSource <em>Arrow Type For Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrow Type For Source</em>'.
	 * @see universal.visualization.VConnectorElement#getArrowTypeForSource()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_ArrowTypeForSource();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getArrowTypeForTarget <em>Arrow Type For Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrow Type For Target</em>'.
	 * @see universal.visualization.VConnectorElement#getArrowTypeForTarget()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_ArrowTypeForTarget();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see universal.visualization.VConnectorElement#getSourceID()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link universal.visualization.VConnectorElement#getTargetID <em>Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target ID</em>'.
	 * @see universal.visualization.VConnectorElement#getTargetID()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EAttribute getVConnectorElement_TargetID();

	/**
	 * Returns the meta object for the reference '{@link universal.visualization.VConnectorElement#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocations</em>'.
	 * @see universal.visualization.VConnectorElement#getInvocations()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EReference getVConnectorElement_Invocations();

	/**
	 * Returns the meta object for the reference '{@link universal.visualization.VConnectorElement#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectors</em>'.
	 * @see universal.visualization.VConnectorElement#getConnectors()
	 * @see #getVConnectorElement()
	 * @generated
	 */
	EReference getVConnectorElement_Connectors();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VGeneralization <em>VGeneralization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VGeneralization</em>'.
	 * @see universal.visualization.VGeneralization
	 * @generated
	 */
	EClass getVGeneralization();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VImplements <em>VImplements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VImplements</em>'.
	 * @see universal.visualization.VImplements
	 * @generated
	 */
	EClass getVImplements();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VDependecy <em>VDependecy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDependecy</em>'.
	 * @see universal.visualization.VDependecy
	 * @generated
	 */
	EClass getVDependecy();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VAssociation <em>VAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAssociation</em>'.
	 * @see universal.visualization.VAssociation
	 * @generated
	 */
	EClass getVAssociation();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VAgregation <em>VAgregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAgregation</em>'.
	 * @see universal.visualization.VAgregation
	 * @generated
	 */
	EClass getVAgregation();

	/**
	 * Returns the meta object for class '{@link universal.visualization.VComposition <em>VComposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VComposition</em>'.
	 * @see universal.visualization.VComposition
	 * @generated
	 */
	EClass getVComposition();

	/**
	 * Returns the meta object for enum '{@link universal.visualization.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see universal.visualization.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link universal.visualization.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see universal.visualization.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for enum '{@link universal.visualization.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see universal.visualization.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link universal.visualization.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Type</em>'.
	 * @see universal.visualization.LineType
	 * @generated
	 */
	EEnum getLineType();

	/**
	 * Returns the meta object for enum '{@link universal.visualization.RoutingType <em>Routing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing Type</em>'.
	 * @see universal.visualization.RoutingType
	 * @generated
	 */
	EEnum getRoutingType();

	/**
	 * Returns the meta object for enum '{@link universal.visualization.ArrowType <em>Arrow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrow Type</em>'.
	 * @see universal.visualization.ArrowType
	 * @generated
	 */
	EEnum getArrowType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizationFactory getVisualizationFactory();

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
		 * The meta object literal for the '{@link universal.visualization.impl.VDiagramElementImpl <em>VDiagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VDiagramElementImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVDiagramElement()
		 * @generated
		 */
		EClass VDIAGRAM_ELEMENT = eINSTANCE.getVDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VDIAGRAM_ELEMENT__UUID = eINSTANCE.getVDiagramElement_Uuid();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VDIAGRAM_ELEMENT__LABEL = eINSTANCE.getVDiagramElement_Label();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VDIAGRAM_ELEMENT__BORDER = eINSTANCE.getVDiagramElement_Border();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VLabelImpl <em>VLabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VLabelImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVLabel()
		 * @generated
		 */
		EClass VLABEL = eINSTANCE.getVLabel();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLABEL__SIZE = eINSTANCE.getVLabel_Size();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLABEL__FONT = eINSTANCE.getVLabel_Font();

		/**
		 * The meta object literal for the '<em><b>Is Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLABEL__IS_BOLD = eINSTANCE.getVLabel_IsBold();

		/**
		 * The meta object literal for the '<em><b>Is Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLABEL__IS_ITALIC = eINSTANCE.getVLabel_IsItalic();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLABEL__ALIGNMENT = eINSTANCE.getVLabel_Alignment();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLABEL__POSITION = eINSTANCE.getVLabel_Position();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VDrawableImpl <em>VDrawable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VDrawableImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVDrawable()
		 * @generated
		 */
		EClass VDRAWABLE = eINSTANCE.getVDrawable();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VDRAWABLE__COLOR = eINSTANCE.getVDrawable_Color();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VDRAWABLE__THICKNESS = eINSTANCE.getVDrawable_Thickness();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VBorderImpl <em>VBorder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VBorderImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVBorder()
		 * @generated
		 */
		EClass VBORDER = eINSTANCE.getVBorder();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VContainerImpl <em>VContainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VContainerImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVContainer()
		 * @generated
		 */
		EClass VCONTAINER = eINSTANCE.getVContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTAINER__ELEMENTS = eINSTANCE.getVContainer_Elements();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VDiagramImpl <em>VDiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VDiagramImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVDiagram()
		 * @generated
		 */
		EClass VDIAGRAM = eINSTANCE.getVDiagram();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VDIAGRAM__IS_ROOT = eINSTANCE.getVDiagram_IsRoot();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VClassImpl <em>VClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VClassImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVClass()
		 * @generated
		 */
		EClass VCLASS = eINSTANCE.getVClass();

		/**
		 * The meta object literal for the '<em><b>Is Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCLASS__IS_SHARED = eINSTANCE.getVClass_IsShared();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VPackageImpl <em>VPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VPackageImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVPackage()
		 * @generated
		 */
		EClass VPACKAGE = eINSTANCE.getVPackage();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VShapeImpl <em>VShape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VShapeImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVShape()
		 * @generated
		 */
		EClass VSHAPE = eINSTANCE.getVShape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSHAPE__COLOR = eINSTANCE.getVShape_Color();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSHAPE__WIDTH = eINSTANCE.getVShape_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSHAPE__HEIGTH = eINSTANCE.getVShape_Heigth();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VCirculeImpl <em>VCircule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VCirculeImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVCircule()
		 * @generated
		 */
		EClass VCIRCULE = eINSTANCE.getVCircule();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VTriangleImpl <em>VTriangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VTriangleImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVTriangle()
		 * @generated
		 */
		EClass VTRIANGLE = eINSTANCE.getVTriangle();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VDiamondImpl <em>VDiamond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VDiamondImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVDiamond()
		 * @generated
		 */
		EClass VDIAMOND = eINSTANCE.getVDiamond();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VQuadrangleImpl <em>VQuadrangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VQuadrangleImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVQuadrangle()
		 * @generated
		 */
		EClass VQUADRANGLE = eINSTANCE.getVQuadrangle();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VDotImpl <em>VDot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VDotImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVDot()
		 * @generated
		 */
		EClass VDOT = eINSTANCE.getVDot();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VEllipseImpl <em>VEllipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VEllipseImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVEllipse()
		 * @generated
		 */
		EClass VELLIPSE = eINSTANCE.getVEllipse();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VRelationInvocationImpl <em>VRelation Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VRelationInvocationImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVRelationInvocation()
		 * @generated
		 */
		EClass VRELATION_INVOCATION = eINSTANCE.getVRelationInvocation();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VRELATION_INVOCATION__CLASS_NAME = eINSTANCE.getVRelationInvocation_ClassName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VRELATION_INVOCATION__METHOD_NAME = eINSTANCE.getVRelationInvocation_MethodName();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VInvocationImpl <em>VInvocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VInvocationImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVInvocation()
		 * @generated
		 */
		EClass VINVOCATION = eINSTANCE.getVInvocation();

		/**
		 * The meta object literal for the '<em><b>From Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINVOCATION__FROM_METHOD = eINSTANCE.getVInvocation_FromMethod();

		/**
		 * The meta object literal for the '<em><b>To Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINVOCATION__TO_METHOD = eINSTANCE.getVInvocation_ToMethod();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VConnectorElementImpl <em>VConnector Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VConnectorElementImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVConnectorElement()
		 * @generated
		 */
		EClass VCONNECTOR_ELEMENT = eINSTANCE.getVConnectorElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__NAME = eINSTANCE.getVConnectorElement_Name();

		/**
		 * The meta object literal for the '<em><b>Line Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__LINE_TYPE = eINSTANCE.getVConnectorElement_LineType();

		/**
		 * The meta object literal for the '<em><b>Routing Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__ROUTING_TYPE = eINSTANCE.getVConnectorElement_RoutingType();

		/**
		 * The meta object literal for the '<em><b>Arrow Type For Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE = eINSTANCE.getVConnectorElement_ArrowTypeForSource();

		/**
		 * The meta object literal for the '<em><b>Arrow Type For Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET = eINSTANCE.getVConnectorElement_ArrowTypeForTarget();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__SOURCE_ID = eINSTANCE.getVConnectorElement_SourceID();

		/**
		 * The meta object literal for the '<em><b>Target ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONNECTOR_ELEMENT__TARGET_ID = eINSTANCE.getVConnectorElement_TargetID();

		/**
		 * The meta object literal for the '<em><b>Invocations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONNECTOR_ELEMENT__INVOCATIONS = eINSTANCE.getVConnectorElement_Invocations();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONNECTOR_ELEMENT__CONNECTORS = eINSTANCE.getVConnectorElement_Connectors();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VGeneralizationImpl <em>VGeneralization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VGeneralizationImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVGeneralization()
		 * @generated
		 */
		EClass VGENERALIZATION = eINSTANCE.getVGeneralization();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VImplementsImpl <em>VImplements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VImplementsImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVImplements()
		 * @generated
		 */
		EClass VIMPLEMENTS = eINSTANCE.getVImplements();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VDependecyImpl <em>VDependecy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VDependecyImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVDependecy()
		 * @generated
		 */
		EClass VDEPENDECY = eINSTANCE.getVDependecy();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VAssociationImpl <em>VAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VAssociationImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVAssociation()
		 * @generated
		 */
		EClass VASSOCIATION = eINSTANCE.getVAssociation();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VAgregationImpl <em>VAgregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VAgregationImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVAgregation()
		 * @generated
		 */
		EClass VAGREGATION = eINSTANCE.getVAgregation();

		/**
		 * The meta object literal for the '{@link universal.visualization.impl.VCompositionImpl <em>VComposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.impl.VCompositionImpl
		 * @see universal.visualization.impl.VisualizationPackageImpl#getVComposition()
		 * @generated
		 */
		EClass VCOMPOSITION = eINSTANCE.getVComposition();

		/**
		 * The meta object literal for the '{@link universal.visualization.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.Color
		 * @see universal.visualization.impl.VisualizationPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link universal.visualization.Alignment <em>Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.Alignment
		 * @see universal.visualization.impl.VisualizationPackageImpl#getAlignment()
		 * @generated
		 */
		EEnum ALIGNMENT = eINSTANCE.getAlignment();

		/**
		 * The meta object literal for the '{@link universal.visualization.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.Position
		 * @see universal.visualization.impl.VisualizationPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link universal.visualization.LineType <em>Line Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.LineType
		 * @see universal.visualization.impl.VisualizationPackageImpl#getLineType()
		 * @generated
		 */
		EEnum LINE_TYPE = eINSTANCE.getLineType();

		/**
		 * The meta object literal for the '{@link universal.visualization.RoutingType <em>Routing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.RoutingType
		 * @see universal.visualization.impl.VisualizationPackageImpl#getRoutingType()
		 * @generated
		 */
		EEnum ROUTING_TYPE = eINSTANCE.getRoutingType();

		/**
		 * The meta object literal for the '{@link universal.visualization.ArrowType <em>Arrow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.visualization.ArrowType
		 * @see universal.visualization.impl.VisualizationPackageImpl#getArrowType()
		 * @generated
		 */
		EEnum ARROW_TYPE = eINSTANCE.getArrowType();

	}

} //VisualizationPackage
