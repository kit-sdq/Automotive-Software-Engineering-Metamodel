/**
 */
package edu.kit.ipd.sdq.ASEM.classifiers;

import edu.kit.ipd.sdq.ASEM.base.Named;

import edu.kit.ipd.sdq.ASEM.dataexchange.Method;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.classifiers.Classifier#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Named {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.ASEM.dataexchange.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage#getClassifier_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

} // Classifier
