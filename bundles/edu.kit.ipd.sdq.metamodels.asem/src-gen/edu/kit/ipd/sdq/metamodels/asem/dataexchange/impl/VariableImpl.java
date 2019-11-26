/**
 */
package edu.kit.ipd.sdq.metamodels.asem.dataexchange.impl;

import edu.kit.ipd.sdq.metamodels.asem.base.impl.TypedElementImpl;

import edu.kit.ipd.sdq.metamodels.asem.dataexchange.DataexchangePackage;
import edu.kit.ipd.sdq.metamodels.asem.dataexchange.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.impl.VariableImpl#isReadable <em>Readable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.asem.dataexchange.impl.VariableImpl#isWritable <em>Writable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends TypedElementImpl implements Variable {
	/**
	 * The default value of the '{@link #isReadable() <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadable() <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadable()
	 * @generated
	 * @ordered
	 */
	protected boolean readable = READABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected boolean writable = WRITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataexchangePackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadable() {
		return readable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadable(boolean newReadable) {
		boolean oldReadable = readable;
		readable = newReadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataexchangePackage.VARIABLE__READABLE, oldReadable, readable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWritable() {
		return writable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWritable(boolean newWritable) {
		boolean oldWritable = writable;
		writable = newWritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataexchangePackage.VARIABLE__WRITABLE, oldWritable, writable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataexchangePackage.VARIABLE__READABLE:
				return isReadable();
			case DataexchangePackage.VARIABLE__WRITABLE:
				return isWritable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataexchangePackage.VARIABLE__READABLE:
				setReadable((Boolean)newValue);
				return;
			case DataexchangePackage.VARIABLE__WRITABLE:
				setWritable((Boolean)newValue);
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
			case DataexchangePackage.VARIABLE__READABLE:
				setReadable(READABLE_EDEFAULT);
				return;
			case DataexchangePackage.VARIABLE__WRITABLE:
				setWritable(WRITABLE_EDEFAULT);
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
			case DataexchangePackage.VARIABLE__READABLE:
				return readable != READABLE_EDEFAULT;
			case DataexchangePackage.VARIABLE__WRITABLE:
				return writable != WRITABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (readable: ");
		result.append(readable);
		result.append(", writable: ");
		result.append(writable);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
