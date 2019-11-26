/**
 */
package edu.kit.ipd.sdq.metamodels.asem.dataexchange;

import edu.kit.ipd.sdq.metamodels.asem.base.Identifiable;
import edu.kit.ipd.sdq.metamodels.asem.base.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Identifiable, Named {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getMethod_Parameters()
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.Parameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.ReturnType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(ReturnType)
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getMethod_ReturnType()
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.ReturnType#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	ReturnType getReturnType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getMethod_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Method
