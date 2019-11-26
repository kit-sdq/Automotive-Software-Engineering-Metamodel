/**
 */
package edu.kit.ipd.sdq.metamodels.asem.classifiers;

import edu.kit.ipd.sdq.metamodels.asem.base.Identifiable;
import edu.kit.ipd.sdq.metamodels.asem.base.Named;
import edu.kit.ipd.sdq.metamodels.asem.base.TypedElement;

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
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.classifiers.Component#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Identifiable, Classifier, Named {
	/**
	 * Returns the value of the '<em><b>Typed Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.asem.base.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Elements</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#getComponent_TypedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedElement> getTypedElements();

} // Component
