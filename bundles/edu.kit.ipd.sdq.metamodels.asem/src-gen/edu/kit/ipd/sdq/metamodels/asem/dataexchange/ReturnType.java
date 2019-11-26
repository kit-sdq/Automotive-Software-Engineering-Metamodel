/**
 */
package edu.kit.ipd.sdq.metamodels.asem.dataexchange;

import edu.kit.ipd.sdq.metamodels.asem.base.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.ReturnType#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getReturnType()
 * @model
 * @generated
 */
public interface ReturnType extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getReturnType_Method()
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getReturnType
	 * @model opposite="returnType" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.ReturnType#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // ReturnType
