/**
 */
package edu.kit.ipd.sdq.ASEM.classifiers;

import edu.kit.ipd.sdq.ASEM.base.Identifiable;
import edu.kit.ipd.sdq.ASEM.base.Named;
import edu.kit.ipd.sdq.ASEM.base.TypedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.classifiers.Component#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Classifier, Named, Identifiable {
	/**
	 * Returns the value of the '<em><b>Typed Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.ASEM.base.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Elements</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage#getComponent_TypedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedElement> getTypedElements();

} // Component
