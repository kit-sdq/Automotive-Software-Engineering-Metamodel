/**
 */
package edu.kit.ipd.sdq.ASEM.impl;

import edu.kit.ipd.sdq.ASEM.ASEMFactory;
import edu.kit.ipd.sdq.ASEM.ASEMPackage;
import edu.kit.ipd.sdq.ASEM.Dummy;

import edu.kit.ipd.sdq.ASEM.base.BasePackage;

import edu.kit.ipd.sdq.ASEM.base.impl.BasePackageImpl;

import edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage;

import edu.kit.ipd.sdq.ASEM.classifiers.impl.ClassifiersPackageImpl;

import edu.kit.ipd.sdq.ASEM.dataexchange.DataexchangePackage;

import edu.kit.ipd.sdq.ASEM.dataexchange.impl.DataexchangePackageImpl;

import edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitivetypesPackage;

import edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesPackageImpl;

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
public class ASEMPackageImpl extends EPackageImpl implements ASEMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyEClass = null;

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
	 * @see edu.kit.ipd.sdq.ASEM.ASEMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ASEMPackageImpl() {
		super(eNS_URI, ASEMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ASEMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ASEMPackage init() {
		if (isInited) return (ASEMPackage)EPackage.Registry.INSTANCE.getEPackage(ASEMPackage.eNS_URI);

		// Obtain or create and register package
		ASEMPackageImpl theASEMPackage = (ASEMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ASEMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ASEMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) instanceof ClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) : ClassifiersPackage.eINSTANCE);
		DataexchangePackageImpl theDataexchangePackage = (DataexchangePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI) instanceof DataexchangePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI) : DataexchangePackage.eINSTANCE);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) : PrimitivetypesPackage.eINSTANCE);

		// Create package meta-data objects
		theASEMPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theDataexchangePackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();

		// Initialize created meta-data
		theASEMPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theDataexchangePackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theASEMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ASEMPackage.eNS_URI, theASEMPackage);
		return theASEMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummy() {
		return dummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASEMFactory getASEMFactory() {
		return (ASEMFactory)getEFactoryInstance();
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
		dummyEClass = createEClass(DUMMY);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		DataexchangePackage theDataexchangePackage = (DataexchangePackage)EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBasePackage);
		getESubpackages().add(theClassifiersPackage);
		getESubpackages().add(theDataexchangePackage);
		getESubpackages().add(thePrimitivetypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dummyEClass, Dummy.class, "Dummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ASEMPackageImpl
