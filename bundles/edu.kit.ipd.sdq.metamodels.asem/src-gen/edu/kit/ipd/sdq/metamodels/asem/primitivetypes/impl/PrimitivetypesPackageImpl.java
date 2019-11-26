/**
 */
package edu.kit.ipd.sdq.metamodels.asem.primitivetypes.impl;

import edu.kit.ipd.sdq.metamodels.asem.AsemPackage;

import edu.kit.ipd.sdq.metamodels.asem.base.BasePackage;

import edu.kit.ipd.sdq.metamodels.asem.base.impl.BasePackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage;

import edu.kit.ipd.sdq.metamodels.asem.classifiers.impl.ClassifiersPackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage;

import edu.kit.ipd.sdq.metamodels.asem.dataexchange.impl.DataexchangePackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.impl.AsemPackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.BooleanType;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.ContinuousType;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveType;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveTypeRepository;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesFactory;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesPackage;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.SignedDiscreteType;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.UnsignedDiscreteType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitivetypesPackageImpl extends EPackageImpl implements PrimitivetypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedDiscreteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedDiscreteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeRepositoryEClass = null;

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
	 * @see edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrimitivetypesPackageImpl() {
		super(eNS_URI, PrimitivetypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrimitivetypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrimitivetypesPackage init() {
		if (isInited) return (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPrimitivetypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = registeredPrimitivetypesPackage instanceof PrimitivetypesPackageImpl ? (PrimitivetypesPackageImpl)registeredPrimitivetypesPackage : new PrimitivetypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AsemPackage.eNS_URI);
		AsemPackageImpl theAsemPackage = (AsemPackageImpl)(registeredPackage instanceof AsemPackageImpl ? registeredPackage : AsemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(registeredPackage instanceof ClassifiersPackageImpl ? registeredPackage : ClassifiersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI);
		DataexchangePackageImpl theDataexchangePackage = (DataexchangePackageImpl)(registeredPackage instanceof DataexchangePackageImpl ? registeredPackage : DataexchangePackage.eINSTANCE);

		// Create package meta-data objects
		thePrimitivetypesPackage.createPackageContents();
		theAsemPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theDataexchangePackage.createPackageContents();

		// Initialize created meta-data
		thePrimitivetypesPackage.initializePackageContents();
		theAsemPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theDataexchangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrimitivetypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrimitivetypesPackage.eNS_URI, thePrimitivetypesPackage);
		return thePrimitivetypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousType() {
		return continuousTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsignedDiscreteType() {
		return unsignedDiscreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignedDiscreteType() {
		return signedDiscreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeRepository() {
		return primitiveTypeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeRepository_PrimitiveTypes() {
		return (EReference)primitiveTypeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitivetypesFactory getPrimitivetypesFactory() {
		return (PrimitivetypesFactory)getEFactoryInstance();
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
		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		continuousTypeEClass = createEClass(CONTINUOUS_TYPE);

		unsignedDiscreteTypeEClass = createEClass(UNSIGNED_DISCRETE_TYPE);

		signedDiscreteTypeEClass = createEClass(SIGNED_DISCRETE_TYPE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		primitiveTypeRepositoryEClass = createEClass(PRIMITIVE_TYPE_REPOSITORY);
		createEReference(primitiveTypeRepositoryEClass, PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES);
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
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveTypeEClass.getESuperTypes().add(theClassifiersPackage.getClassifier());
		continuousTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		unsignedDiscreteTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		signedDiscreteTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeRepositoryEClass.getESuperTypes().add(theBasePackage.getNamed());

		// Initialize classes, features, and operations; add parameters
		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousTypeEClass, ContinuousType.class, "ContinuousType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsignedDiscreteTypeEClass, UnsignedDiscreteType.class, "UnsignedDiscreteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signedDiscreteTypeEClass, SignedDiscreteType.class, "SignedDiscreteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeRepositoryEClass, PrimitiveTypeRepository.class, "PrimitiveTypeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveTypeRepository_PrimitiveTypes(), this.getPrimitiveType(), null, "primitiveTypes", null, 0, -1, PrimitiveTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PrimitivetypesPackageImpl
