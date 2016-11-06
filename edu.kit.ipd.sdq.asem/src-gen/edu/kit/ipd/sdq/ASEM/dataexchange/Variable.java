/**
 */
package edu.kit.ipd.sdq.ASEM.dataexchange;

import edu.kit.ipd.sdq.ASEM.base.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.dataexchange.Variable#isReadable <em>Readable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.dataexchange.Variable#isWritable <em>Writable</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.ASEM.dataexchange.DataexchangePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readable</em>' attribute.
	 * @see #setReadable(boolean)
	 * @see edu.kit.ipd.sdq.ASEM.dataexchange.DataexchangePackage#getVariable_Readable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReadable();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.ASEM.dataexchange.Variable#isReadable <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readable</em>' attribute.
	 * @see #isReadable()
	 * @generated
	 */
	void setReadable(boolean value);

	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see edu.kit.ipd.sdq.ASEM.dataexchange.DataexchangePackage#getVariable_Writable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.ASEM.dataexchange.Variable#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

} // Variable
