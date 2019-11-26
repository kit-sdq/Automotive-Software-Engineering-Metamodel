/**
 */
package edu.kit.ipd.sdq.metamodels.asem.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.base.Identifiable#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.base.BasePackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.kit.ipd.sdq.metamodels.asem.base.BasePackage#getIdentifiable_Id()
	 * @model default="" unique="false" id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.asem.base.Identifiable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Identifiable
