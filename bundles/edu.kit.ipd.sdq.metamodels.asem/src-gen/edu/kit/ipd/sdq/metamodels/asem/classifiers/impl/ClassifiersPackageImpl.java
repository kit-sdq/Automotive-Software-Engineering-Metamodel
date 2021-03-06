/**
 */
package edu.kit.ipd.sdq.metamodels.asem.classifiers.impl;

import edu.kit.ipd.sdq.metamodels.asem.AsemPackage;

import edu.kit.ipd.sdq.metamodels.asem.base.BasePackage;

import edu.kit.ipd.sdq.metamodels.asem.base.impl.BasePackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.classifiers.Classifier;
import edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersFactory;
import edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage;
import edu.kit.ipd.sdq.metamodels.asem.classifiers.Component;
import edu.kit.ipd.sdq.metamodels.asem.classifiers.ComposedType;

import edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage;

import edu.kit.ipd.sdq.metamodels.asem.dataexchange.impl.DataexchangePackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.impl.AsemPackageImpl;

import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesPackage;

import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.impl.PrimitivetypesPackageImpl;

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
public class ClassifiersPackageImpl extends EPackageImpl implements ClassifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

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
	 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassifiersPackageImpl() {
		super(eNS_URI, ClassifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClassifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassifiersPackage init() {
		if (isInited) return (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredClassifiersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ClassifiersPackageImpl theClassifiersPackage = registeredClassifiersPackage instanceof ClassifiersPackageImpl ? (ClassifiersPackageImpl)registeredClassifiersPackage : new ClassifiersPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AsemPackage.eNS_URI);
		AsemPackageImpl theAsemPackage = (AsemPackageImpl)(registeredPackage instanceof AsemPackageImpl ? registeredPackage : AsemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI);
		DataexchangePackageImpl theDataexchangePackage = (DataexchangePackageImpl)(registeredPackage instanceof DataexchangePackageImpl ? registeredPackage : DataexchangePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(registeredPackage instanceof PrimitivetypesPackageImpl ? registeredPackage : PrimitivetypesPackage.eINSTANCE);

		// Create package meta-data objects
		theClassifiersPackage.createPackageContents();
		theAsemPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theDataexchangePackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();

		// Initialize created meta-data
		theClassifiersPackage.initializePackageContents();
		theAsemPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theDataexchangePackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassifiersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassifiersPackage.eNS_URI, theClassifiersPackage);
		return theClassifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_Methods() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposedType() {
		return composedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposedType_PrimitiveType() {
		return (EReference)composedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_TypedElements() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifiersFactory getClassifiersFactory() {
		return (ClassifiersFactory)getEFactoryInstance();
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
		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__METHODS);

		composedTypeEClass = createEClass(COMPOSED_TYPE);
		createEReference(composedTypeEClass, COMPOSED_TYPE__PRIMITIVE_TYPE);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__TYPED_ELEMENTS);

		classEClass = createEClass(CLASS);

		moduleEClass = createEClass(MODULE);
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
		DataexchangePackage theDataexchangePackage = (DataexchangePackage)EPackage.Registry.INSTANCE.getEPackage(DataexchangePackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierEClass.getESuperTypes().add(theBasePackage.getNamed());
		composedTypeEClass.getESuperTypes().add(this.getClassifier());
		componentEClass.getESuperTypes().add(theBasePackage.getIdentifiable());
		componentEClass.getESuperTypes().add(this.getClassifier());
		componentEClass.getESuperTypes().add(theBasePackage.getNamed());
		classEClass.getESuperTypes().add(this.getComponent());
		moduleEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_Methods(), theDataexchangePackage.getMethod(), null, "methods", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedTypeEClass, ComposedType.class, "ComposedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedType_PrimitiveType(), thePrimitivetypesPackage.getPrimitiveType(), null, "primitiveType", null, 0, 1, ComposedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_TypedElements(), theBasePackage.getTypedElement(), null, "typedElements", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, edu.kit.ipd.sdq.metamodels.asem.classifiers.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, edu.kit.ipd.sdq.metamodels.asem.classifiers.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ClassifiersPackageImpl
