/**
 */
package edu.kit.ipd.sdq.ASEM.primitivetypes;

import edu.kit.ipd.sdq.ASEM.base.BasePackage;
import edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitivetypesFactory
 * @model kind="package"
 * @generated
 */
public interface PrimitivetypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "primitivetypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.asem.primitivetypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "primitivetypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitivetypesPackage eINSTANCE = edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeImpl
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = ClassifiersPackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__METHODS = ClassifiersPackage.CLASSIFIER__METHODS;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = ClassifiersPackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = ClassifiersPackage.CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.ContinuousTypeImpl <em>Continuous Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.ContinuousTypeImpl
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getContinuousType()
	 * @generated
	 */
	int CONTINUOUS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_TYPE__METHODS = PRIMITIVE_TYPE__METHODS;

	/**
	 * The number of structural features of the '<em>Continuous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Continuous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.UnsignedDiscreteTypeImpl <em>Unsigned Discrete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.UnsignedDiscreteTypeImpl
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getUnsignedDiscreteType()
	 * @generated
	 */
	int UNSIGNED_DISCRETE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_DISCRETE_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_DISCRETE_TYPE__METHODS = PRIMITIVE_TYPE__METHODS;

	/**
	 * The number of structural features of the '<em>Unsigned Discrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_DISCRETE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsigned Discrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_DISCRETE_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.SignedDiscreteTypeImpl <em>Signed Discrete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.SignedDiscreteTypeImpl
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getSignedDiscreteType()
	 * @generated
	 */
	int SIGNED_DISCRETE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_DISCRETE_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_DISCRETE_TYPE__METHODS = PRIMITIVE_TYPE__METHODS;

	/**
	 * The number of structural features of the '<em>Signed Discrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_DISCRETE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signed Discrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_DISCRETE_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.BooleanTypeImpl
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__METHODS = PRIMITIVE_TYPE__METHODS;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeRepositoryImpl <em>Primitive Type Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeRepositoryImpl
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getPrimitiveTypeRepository()
	 * @generated
	 */
	int PRIMITIVE_TYPE_REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REPOSITORY__NAME = BasePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES = BasePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REPOSITORY_FEATURE_COUNT = BasePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REPOSITORY_OPERATION_COUNT = BasePackage.NAMED_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.ContinuousType <em>Continuous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Type</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.ContinuousType
	 * @generated
	 */
	EClass getContinuousType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.UnsignedDiscreteType <em>Unsigned Discrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Discrete Type</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.UnsignedDiscreteType
	 * @generated
	 */
	EClass getUnsignedDiscreteType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.SignedDiscreteType <em>Signed Discrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Discrete Type</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.SignedDiscreteType
	 * @generated
	 */
	EClass getSignedDiscreteType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveTypeRepository <em>Primitive Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Repository</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveTypeRepository
	 * @generated
	 */
	EClass getPrimitiveTypeRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveTypeRepository#getPrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveTypeRepository#getPrimitiveTypes()
	 * @see #getPrimitiveTypeRepository()
	 * @generated
	 */
	EReference getPrimitiveTypeRepository_PrimitiveTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrimitivetypesFactory getPrimitivetypesFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeImpl
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.ContinuousTypeImpl <em>Continuous Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.ContinuousTypeImpl
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getContinuousType()
		 * @generated
		 */
		EClass CONTINUOUS_TYPE = eINSTANCE.getContinuousType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.UnsignedDiscreteTypeImpl <em>Unsigned Discrete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.UnsignedDiscreteTypeImpl
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getUnsignedDiscreteType()
		 * @generated
		 */
		EClass UNSIGNED_DISCRETE_TYPE = eINSTANCE.getUnsignedDiscreteType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.SignedDiscreteTypeImpl <em>Signed Discrete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.SignedDiscreteTypeImpl
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getSignedDiscreteType()
		 * @generated
		 */
		EClass SIGNED_DISCRETE_TYPE = eINSTANCE.getSignedDiscreteType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.BooleanTypeImpl
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeRepositoryImpl <em>Primitive Type Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitiveTypeRepositoryImpl
		 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl#getPrimitiveTypeRepository()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_REPOSITORY = eINSTANCE.getPrimitiveTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypeRepository_PrimitiveTypes();

	}

} //PrimitivetypesPackage
