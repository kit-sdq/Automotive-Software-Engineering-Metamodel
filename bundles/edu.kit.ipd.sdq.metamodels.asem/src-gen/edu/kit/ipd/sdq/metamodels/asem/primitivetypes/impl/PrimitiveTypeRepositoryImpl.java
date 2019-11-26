/**
 */
package edu.kit.ipd.sdq.metamodels.asem.primitivetypes.impl;

import edu.kit.ipd.sdq.metamodels.asem.base.impl.NamedImpl;

import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveType;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitiveTypeRepository;
import edu.kit.ipd.sdq.metamodels.asem.primitivetypes.PrimitivetypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.primitivetypes.impl.PrimitiveTypeRepositoryImpl#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeRepositoryImpl extends NamedImpl implements PrimitiveTypeRepository {
	/**
	 * The cached value of the '{@link #getPrimitiveTypes() <em>Primitive Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> primitiveTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimitivetypesPackage.Literals.PRIMITIVE_TYPE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrimitiveType> getPrimitiveTypes() {
		if (primitiveTypes == null) {
			primitiveTypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES);
		}
		return primitiveTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES:
				return ((InternalEList<?>)getPrimitiveTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES:
				return getPrimitiveTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				getPrimitiveTypes().addAll((Collection<? extends PrimitiveType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrimitivetypesPackage.PRIMITIVE_TYPE_REPOSITORY__PRIMITIVE_TYPES:
				return primitiveTypes != null && !primitiveTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveTypeRepositoryImpl
