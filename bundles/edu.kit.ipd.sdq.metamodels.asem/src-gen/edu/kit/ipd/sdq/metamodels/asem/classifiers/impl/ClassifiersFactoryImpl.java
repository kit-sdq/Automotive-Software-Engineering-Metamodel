/**
 */
package edu.kit.ipd.sdq.metamodels.asem.classifiers.impl;

import edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersFactory;
import edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage;
import edu.kit.ipd.sdq.metamodels.asem.classifiers.ComposedType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifiersFactoryImpl extends EFactoryImpl implements ClassifiersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassifiersFactory init() {
		try {
			ClassifiersFactory theClassifiersFactory = (ClassifiersFactory)EPackage.Registry.INSTANCE.getEFactory(ClassifiersPackage.eNS_URI);
			if (theClassifiersFactory != null) {
				return theClassifiersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassifiersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassifiersPackage.COMPOSED_TYPE: return createComposedType();
			case ClassifiersPackage.CLASS: return createClass();
			case ClassifiersPackage.MODULE: return createModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposedType createComposedType() {
		ComposedTypeImpl composedType = new ComposedTypeImpl();
		return composedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edu.kit.ipd.sdq.metamodels.asem.classifiers.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edu.kit.ipd.sdq.metamodels.asem.classifiers.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifiersPackage getClassifiersPackage() {
		return (ClassifiersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassifiersPackage getPackage() {
		return ClassifiersPackage.eINSTANCE;
	}

} //ClassifiersFactoryImpl
