/**
 */
package edu.kit.ipd.sdq.metamodels.asem.primitivetypes;

import edu.kit.ipd.sdq.metamodels.asem.base.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveTypeRepository#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesPackage#getPrimitiveTypeRepository()
 * @model
 * @generated
 */
public interface PrimitiveTypeRepository extends Named {
	/**
	 * Returns the value of the '<em><b>Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Types</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesPackage#getPrimitiveTypeRepository_PrimitiveTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitiveTypes();

} // PrimitiveTypeRepository
