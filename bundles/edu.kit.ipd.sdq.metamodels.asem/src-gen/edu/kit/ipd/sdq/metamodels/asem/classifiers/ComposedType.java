/**
 */
package edu.kit.ipd.sdq.metamodels.asem.classifiers;

import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.classifiers.ComposedType#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#getComposedType()
 * @model
 * @generated
 */
public interface ComposedType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#getComposedType_PrimitiveType()
	 * @model
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.classifiers.ComposedType#getPrimitiveType <em>Primitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // ComposedType
