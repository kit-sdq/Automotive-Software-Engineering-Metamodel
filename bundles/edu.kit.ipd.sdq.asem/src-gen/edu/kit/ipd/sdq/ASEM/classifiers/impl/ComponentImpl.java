/**
 */
package edu.kit.ipd.sdq.ASEM.classifiers.impl;

import edu.kit.ipd.sdq.ASEM.base.BasePackage;
import edu.kit.ipd.sdq.ASEM.base.Named;
import edu.kit.ipd.sdq.ASEM.base.TypedElement;

import edu.kit.ipd.sdq.ASEM.base.impl.IdentifiableImpl;
import edu.kit.ipd.sdq.ASEM.classifiers.Classifier;
import edu.kit.ipd.sdq.ASEM.classifiers.ClassifiersPackage;
import edu.kit.ipd.sdq.ASEM.classifiers.Component;

import edu.kit.ipd.sdq.ASEM.dataexchange.Method;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.classifiers.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.classifiers.impl.ComponentImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.classifiers.impl.ComponentImpl#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends IdentifiableImpl implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getTypedElements() <em>Typed Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedElement> typedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassifiersPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassifiersPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, ClassifiersPackage.COMPONENT__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedElement> getTypedElements() {
		if (typedElements == null) {
			typedElements = new EObjectContainmentEList<TypedElement>(TypedElement.class, this, ClassifiersPackage.COMPONENT__TYPED_ELEMENTS);
		}
		return typedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassifiersPackage.COMPONENT__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.COMPONENT__TYPED_ELEMENTS:
				return ((InternalEList<?>)getTypedElements()).basicRemove(otherEnd, msgs);
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
			case ClassifiersPackage.COMPONENT__NAME:
				return getName();
			case ClassifiersPackage.COMPONENT__METHODS:
				return getMethods();
			case ClassifiersPackage.COMPONENT__TYPED_ELEMENTS:
				return getTypedElements();
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
			case ClassifiersPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ClassifiersPackage.COMPONENT__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case ClassifiersPackage.COMPONENT__TYPED_ELEMENTS:
				getTypedElements().clear();
				getTypedElements().addAll((Collection<? extends TypedElement>)newValue);
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
			case ClassifiersPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassifiersPackage.COMPONENT__METHODS:
				getMethods().clear();
				return;
			case ClassifiersPackage.COMPONENT__TYPED_ELEMENTS:
				getTypedElements().clear();
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
			case ClassifiersPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassifiersPackage.COMPONENT__METHODS:
				return methods != null && !methods.isEmpty();
			case ClassifiersPackage.COMPONENT__TYPED_ELEMENTS:
				return typedElements != null && !typedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.COMPONENT__NAME: return BasePackage.NAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.COMPONENT__METHODS: return ClassifiersPackage.CLASSIFIER__METHODS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case BasePackage.NAMED__NAME: return ClassifiersPackage.COMPONENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case ClassifiersPackage.CLASSIFIER__METHODS: return ClassifiersPackage.COMPONENT__METHODS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
