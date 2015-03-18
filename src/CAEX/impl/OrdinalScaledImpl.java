/**
 */
package CAEX.impl;

import CAEX.CAEXPackage;
import CAEX.OrdinalScaled;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Scaled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CAEX.impl.OrdinalScaledImpl#getRequiredMaxValue <em>Required Max Value</em>}</li>
 *   <li>{@link CAEX.impl.OrdinalScaledImpl#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link CAEX.impl.OrdinalScaledImpl#getRequiredMinValue <em>Required Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdinalScaledImpl extends EObjectImpl implements OrdinalScaled {
	/**
	 * The cached value of the '{@link #getRequiredMaxValue() <em>Required Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMaxValue()
	 * @generated
	 * @ordered
	 */
	protected EObject requiredMaxValue;

	/**
	 * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected EObject requiredValue;

	/**
	 * The cached value of the '{@link #getRequiredMinValue() <em>Required Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMinValue()
	 * @generated
	 * @ordered
	 */
	protected EObject requiredMinValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdinalScaledImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.ORDINAL_SCALED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRequiredMaxValue() {
		return requiredMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredMaxValue(EObject newRequiredMaxValue, NotificationChain msgs) {
		EObject oldRequiredMaxValue = requiredMaxValue;
		requiredMaxValue = newRequiredMaxValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE, oldRequiredMaxValue, newRequiredMaxValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMaxValue(EObject newRequiredMaxValue) {
		if (newRequiredMaxValue != requiredMaxValue) {
			NotificationChain msgs = null;
			if (requiredMaxValue != null)
				msgs = ((InternalEObject)requiredMaxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE, null, msgs);
			if (newRequiredMaxValue != null)
				msgs = ((InternalEObject)newRequiredMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE, null, msgs);
			msgs = basicSetRequiredMaxValue(newRequiredMaxValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE, newRequiredMaxValue, newRequiredMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRequiredValue() {
		return requiredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredValue(EObject newRequiredValue, NotificationChain msgs) {
		EObject oldRequiredValue = requiredValue;
		requiredValue = newRequiredValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE, oldRequiredValue, newRequiredValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredValue(EObject newRequiredValue) {
		if (newRequiredValue != requiredValue) {
			NotificationChain msgs = null;
			if (requiredValue != null)
				msgs = ((InternalEObject)requiredValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE, null, msgs);
			if (newRequiredValue != null)
				msgs = ((InternalEObject)newRequiredValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE, null, msgs);
			msgs = basicSetRequiredValue(newRequiredValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE, newRequiredValue, newRequiredValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRequiredMinValue() {
		return requiredMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredMinValue(EObject newRequiredMinValue, NotificationChain msgs) {
		EObject oldRequiredMinValue = requiredMinValue;
		requiredMinValue = newRequiredMinValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE, oldRequiredMinValue, newRequiredMinValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMinValue(EObject newRequiredMinValue) {
		if (newRequiredMinValue != requiredMinValue) {
			NotificationChain msgs = null;
			if (requiredMinValue != null)
				msgs = ((InternalEObject)requiredMinValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE, null, msgs);
			if (newRequiredMinValue != null)
				msgs = ((InternalEObject)newRequiredMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE, null, msgs);
			msgs = basicSetRequiredMinValue(newRequiredMinValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE, newRequiredMinValue, newRequiredMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE:
				return basicSetRequiredMaxValue(null, msgs);
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE:
				return basicSetRequiredValue(null, msgs);
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE:
				return basicSetRequiredMinValue(null, msgs);
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
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE:
				return getRequiredMaxValue();
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE:
				return getRequiredValue();
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE:
				return getRequiredMinValue();
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
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE:
				setRequiredMaxValue((EObject)newValue);
				return;
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE:
				setRequiredValue((EObject)newValue);
				return;
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE:
				setRequiredMinValue((EObject)newValue);
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
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE:
				setRequiredMaxValue((EObject)null);
				return;
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE:
				setRequiredValue((EObject)null);
				return;
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE:
				setRequiredMinValue((EObject)null);
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
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MAX_VALUE:
				return requiredMaxValue != null;
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_VALUE:
				return requiredValue != null;
			case CAEXPackage.ORDINAL_SCALED__REQUIRED_MIN_VALUE:
				return requiredMinValue != null;
		}
		return super.eIsSet(featureID);
	}

} //OrdinalScaledImpl
