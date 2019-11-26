/**
 */
package edu.kit.ipd.sdq.metamodels.asem.dataexchange;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter#getPosition <em>Position</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getParameter_Position()
	 * @model unique="false"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getParameter_Method()
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // Parameter
