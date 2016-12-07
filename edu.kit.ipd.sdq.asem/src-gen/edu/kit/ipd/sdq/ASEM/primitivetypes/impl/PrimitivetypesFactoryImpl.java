/**
 */
package edu.kit.ipd.sdq.ASEM.primitivetypes.impl;

import edu.kit.ipd.sdq.ASEM.primitivetypes.*;

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
public class PrimitivetypesFactoryImpl extends EFactoryImpl implements PrimitivetypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitivetypesFactory init() {
		try {
			PrimitivetypesFactory thePrimitivetypesFactory = (PrimitivetypesFactory)EPackage.Registry.INSTANCE.getEFactory(PrimitivetypesPackage.eNS_URI);
			if (thePrimitivetypesFactory != null) {
				return thePrimitivetypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrimitivetypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivetypesFactoryImpl() {
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
			case PrimitivetypesPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case PrimitivetypesPackage.CONTINUOUS_TYPE: return createContinuousType();
			case PrimitivetypesPackage.UNSIGNED_DISCRETE_TYPE: return createUnsignedDiscreteType();
			case PrimitivetypesPackage.SIGNED_DISCRETE_TYPE: return createSignedDiscreteType();
			case PrimitivetypesPackage.BOOLEAN_TYPE: return createBooleanType();
			case PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY: return createPrimitiveTypeRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousType createContinuousType() {
		ContinuousTypeImpl continuousType = new ContinuousTypeImpl();
		return continuousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedDiscreteType createUnsignedDiscreteType() {
		UnsignedDiscreteTypeImpl unsignedDiscreteType = new UnsignedDiscreteTypeImpl();
		return unsignedDiscreteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedDiscreteType createSignedDiscreteType() {
		SignedDiscreteTypeImpl signedDiscreteType = new SignedDiscreteTypeImpl();
		return signedDiscreteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeRepository createPrimitiveTypeRepository() {
		PrimitiveTypeRepositoryImpl primitiveTypeRepository = new PrimitiveTypeRepositoryImpl();
		return primitiveTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivetypesPackage getPrimitivetypesPackage() {
		return (PrimitivetypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrimitivetypesPackage getPackage() {
		return PrimitivetypesPackage.eINSTANCE;
	}

} //PrimitivetypesFactoryImpl
