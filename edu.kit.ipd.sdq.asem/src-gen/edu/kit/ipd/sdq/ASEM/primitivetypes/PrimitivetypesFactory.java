/**
 */
package edu.kit.ipd.sdq.ASEM.primitivetypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.ASEM.primitivetypes.PrimitivetypesPackage
 * @generated
 */
public interface PrimitivetypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitivetypesFactory eINSTANCE = edu.kit.ipd.sdq.ASEM.primitivetypes.impl.PrimitivetypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Continuous Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Type</em>'.
	 * @generated
	 */
	ContinuousType createContinuousType();

	/**
	 * Returns a new object of class '<em>Unsigned Discrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Discrete Type</em>'.
	 * @generated
	 */
	UnsignedDiscreteType createUnsignedDiscreteType();

	/**
	 * Returns a new object of class '<em>Signed Discrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signed Discrete Type</em>'.
	 * @generated
	 */
	SignedDiscreteType createSignedDiscreteType();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrimitivetypesPackage getPrimitivetypesPackage();

} //PrimitivetypesFactory
