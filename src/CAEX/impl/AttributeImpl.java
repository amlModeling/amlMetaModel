/**
 */
package CAEX.impl;

import CAEX.Attribute;
import CAEX.AttributeValueRequirement;
import CAEX.CAEXPackage;
import CAEX.RefSemantic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CAEX.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link CAEX.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CAEX.impl.AttributeImpl#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link CAEX.impl.AttributeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link CAEX.impl.AttributeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CAEX.impl.AttributeImpl#getAttributeDataType <em>Attribute Data Type</em>}</li>
 *   <li>{@link CAEX.impl.AttributeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends CAEXObjectImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected EObject defaultValue;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EObject value;

	/**
	 * The cached value of the '{@link #getRefSemantic() <em>Ref Semantic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSemantic()
	 * @generated
	 * @ordered
	 */
	protected EList<RefSemantic> refSemantic;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValueRequirement> constraint;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The default value of the '{@link #getAttributeDataType() <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeDataType() <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType()
	 * @generated
	 * @ordered
	 */
	protected String attributeDataType = ATTRIBUTE_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(EObject newDefaultValue, NotificationChain msgs) {
		EObject oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(EObject newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs) {
		EObject oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(EObject newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ATTRIBUTE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ATTRIBUTE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefSemantic> getRefSemantic() {
		if (refSemantic == null) {
			refSemantic = new EObjectContainmentEList<RefSemantic>(RefSemantic.class, this, CAEXPackage.ATTRIBUTE__REF_SEMANTIC);
		}
		return refSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueRequirement> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<AttributeValueRequirement>(AttributeValueRequirement.class, this, CAEXPackage.ATTRIBUTE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CAEXPackage.ATTRIBUTE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeDataType() {
		return attributeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeDataType(String newAttributeDataType) {
		String oldAttributeDataType = attributeDataType;
		attributeDataType = newAttributeDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE, oldAttributeDataType, attributeDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.ATTRIBUTE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case CAEXPackage.ATTRIBUTE__VALUE:
				return basicSetValue(null, msgs);
			case CAEXPackage.ATTRIBUTE__REF_SEMANTIC:
				return ((InternalEList<?>)getRefSemantic()).basicRemove(otherEnd, msgs);
			case CAEXPackage.ATTRIBUTE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case CAEXPackage.ATTRIBUTE__VALUE:
				return getValue();
			case CAEXPackage.ATTRIBUTE__REF_SEMANTIC:
				return getRefSemantic();
			case CAEXPackage.ATTRIBUTE__CONSTRAINT:
				return getConstraint();
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE:
				return getAttribute();
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				return getAttributeDataType();
			case CAEXPackage.ATTRIBUTE__UNIT:
				return getUnit();
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
			case CAEXPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((EObject)newValue);
				return;
			case CAEXPackage.ATTRIBUTE__VALUE:
				setValue((EObject)newValue);
				return;
			case CAEXPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				getRefSemantic().addAll((Collection<? extends RefSemantic>)newValue);
				return;
			case CAEXPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends AttributeValueRequirement>)newValue);
				return;
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				setAttributeDataType((String)newValue);
				return;
			case CAEXPackage.ATTRIBUTE__UNIT:
				setUnit((String)newValue);
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
			case CAEXPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((EObject)null);
				return;
			case CAEXPackage.ATTRIBUTE__VALUE:
				setValue((EObject)null);
				return;
			case CAEXPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				return;
			case CAEXPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				return;
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				setAttributeDataType(ATTRIBUTE_DATA_TYPE_EDEFAULT);
				return;
			case CAEXPackage.ATTRIBUTE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case CAEXPackage.ATTRIBUTE__DEFAULT_VALUE:
				return defaultValue != null;
			case CAEXPackage.ATTRIBUTE__VALUE:
				return value != null;
			case CAEXPackage.ATTRIBUTE__REF_SEMANTIC:
				return refSemantic != null && !refSemantic.isEmpty();
			case CAEXPackage.ATTRIBUTE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				return ATTRIBUTE_DATA_TYPE_EDEFAULT == null ? attributeDataType != null : !ATTRIBUTE_DATA_TYPE_EDEFAULT.equals(attributeDataType);
			case CAEXPackage.ATTRIBUTE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attributeDataType: ");
		result.append(attributeDataType);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
