/**
 */
package edu.kit.ipd.sdq.metamodels.asem.classifiers;

import edu.kit.ipd.sdq.metamodels.asem.base.Named;

import edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method;

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
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.classifiers.Classifier#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Named {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.asem.classifiers.ClassifiersPackage#getClassifier_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

} // Classifier
