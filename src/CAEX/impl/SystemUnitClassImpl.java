/**
 */
package CAEX.impl;

import CAEX.Attribute;
import CAEX.CAEXPackage;
import CAEX.InterfaceClass;
import CAEX.InternalElement;
import CAEX.InternalLink;
import CAEX.SupportedRoleClass;
import CAEX.SystemUnitClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CAEX.impl.SystemUnitClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CAEX.impl.SystemUnitClassImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link CAEX.impl.SystemUnitClassImpl#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link CAEX.impl.SystemUnitClassImpl#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link CAEX.impl.SystemUnitClassImpl#getInternalLink <em>Internal Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemUnitClassImpl extends CAEXObjectImpl implements SystemUnitClass {
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
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass> externalInterface;

	/**
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalElement> internalElement;

	/**
	 * The cached value of the '{@link #getSupportedRoleClass() <em>Supported Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedRoleClass> supportedRoleClass;

	/**
	 * The cached value of the '{@link #getInternalLink() <em>Internal Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLink()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalLink> internalLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.SYSTEM_UNIT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CAEXPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<InterfaceClass>(InterfaceClass.class, this, CAEXPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalElement> getInternalElement() {
		if (internalElement == null) {
			internalElement = new EObjectContainmentEList<InternalElement>(InternalElement.class, this, CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT);
		}
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedRoleClass> getSupportedRoleClass() {
		if (supportedRoleClass == null) {
			supportedRoleClass = new EObjectContainmentEList<SupportedRoleClass>(SupportedRoleClass.class, this, CAEXPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS);
		}
		return supportedRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalLink> getInternalLink() {
		if (internalLink == null) {
			internalLink = new EObjectContainmentEList<InternalLink>(InternalLink.class, this, CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK);
		}
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CAEXPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return ((InternalEList<?>)getInternalElement()).basicRemove(otherEnd, msgs);
			case CAEXPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return ((InternalEList<?>)getSupportedRoleClass()).basicRemove(otherEnd, msgs);
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return ((InternalEList<?>)getInternalLink()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return getAttribute();
			case CAEXPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return getInternalElement();
			case CAEXPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return getSupportedRoleClass();
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return getInternalLink();
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
			case CAEXPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass>)newValue);
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				getInternalElement().clear();
				getInternalElement().addAll((Collection<? extends InternalElement>)newValue);
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				getSupportedRoleClass().clear();
				getSupportedRoleClass().addAll((Collection<? extends SupportedRoleClass>)newValue);
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				getInternalLink().clear();
				getInternalLink().addAll((Collection<? extends InternalLink>)newValue);
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
			case CAEXPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				getInternalElement().clear();
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				getSupportedRoleClass().clear();
				return;
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				getInternalLink().clear();
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
			case CAEXPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CAEXPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return internalElement != null && !internalElement.isEmpty();
			case CAEXPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return supportedRoleClass != null && !supportedRoleClass.isEmpty();
			case CAEXPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return internalLink != null && !internalLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemUnitClassImpl
