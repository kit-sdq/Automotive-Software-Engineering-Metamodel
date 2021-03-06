/**
 */
package edu.kit.ipd.sdq.metamodels.asem.dataexchange;

import edu.kit.ipd.sdq.metamodels.asem.base.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Constant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage#getConstant_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Constant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Constant
