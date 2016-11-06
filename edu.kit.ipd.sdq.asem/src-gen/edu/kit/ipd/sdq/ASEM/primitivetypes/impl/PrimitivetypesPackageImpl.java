/**
 */
package edu.kit.ipd.sdq.ASEM.primitivetypes.impl;

import edu.kit.ipd.sdq.ASEM.base.BasePackage;

import edu.kit.ipd.sdq.ASEM.base.impl.BasePackageImpl;

import edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage;

import edu.kit.ipd.sdq.ASEM.classifiers.impl.ClassifiersPackageImpl;

import edu.kit.ipd.sdq.ASEM.dataexchange.DataexchangePackage;

import edu.kit.ipd.sdq.ASEM.dataexchange.impl.DataexchangePackageImpl;

import edu.kit.ipd.sdq.ASEM.primitivetypes.BooleanType;
import edu.kit.ipd.sdq.ASEM.primitivetypes.ContinuousType;
import edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitiveType;
import edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitivetypesFactory;
import edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitivetypesPackage;
import edu.kit.ipd.sdq.ASEM.primitivetypes.SignedDiscreteType;
import edu.kit.ipd.sdq.ASEM.primitivetypes.UnsignedDiscreteType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
	 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitivetypesPackage#eNS_URI
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
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrimitivetypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) instanceof ClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) : ClassifiersPackage.eINSTANCE);
		DataexchangePackageImpl theDataexchangePackage = (DataexchangePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI) instanceof DataexchangePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI) : DataexchangePackage.eINSTANCE);

		// Create package meta-data objects
		thePrimitivetypesPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theDataexchangePackage.createPackageContents();

		// Initialize created meta-data
		thePrimitivetypesPackage.initializePackageContents();
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
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousType() {
		return continuousTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedDiscreteType() {
		return unsignedDiscreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedDiscreteType() {
		return signedDiscreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveTypeEClass.getESuperTypes().add(theClassifiersPackage.getClassifier());
		continuousTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		unsignedDiscreteTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		signedDiscreteTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());

		// Initialize classes, features, and operations; add parameters
		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousTypeEClass, ContinuousType.class, "ContinuousType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsignedDiscreteTypeEClass, UnsignedDiscreteType.class, "UnsignedDiscreteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signedDiscreteTypeEClass, SignedDiscreteType.class, "SignedDiscreteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PrimitivetypesPackageImpl
