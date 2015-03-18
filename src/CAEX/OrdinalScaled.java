/**
 */
package CAEX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scaled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}</li>
 *   <li>{@link CAEX.OrdinalScaled#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link CAEX.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getOrdinalScaled()
 * @model extendedMetaData="name='OrdinalScaledType_._type' kind='elementOnly'"
 * @generated
 */
public interface OrdinalScaled extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a maximum value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Max Value</em>' containment reference.
	 * @see #setRequiredMaxValue(EObject)
	 * @see CAEX.CAEXPackage#getOrdinalScaled_RequiredMaxValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredMaxValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getRequiredMaxValue();

	/**
	 * Sets the value of the '{@link CAEX.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Max Value</em>' containment reference.
	 * @see #getRequiredMaxValue()
	 * @generated
	 */
	void setRequiredMaxValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' containment reference.
	 * @see #setRequiredValue(EObject)
	 * @see CAEX.CAEXPackage#getOrdinalScaled_RequiredValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getRequiredValue();

	/**
	 * Sets the value of the '{@link CAEX.OrdinalScaled#getRequiredValue <em>Required Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value</em>' containment reference.
	 * @see #getRequiredValue()
	 * @generated
	 */
	void setRequiredValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Required Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a minimum value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Min Value</em>' containment reference.
	 * @see #setRequiredMinValue(EObject)
	 * @see CAEX.CAEXPackage#getOrdinalScaled_RequiredMinValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredMinValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getRequiredMinValue();

	/**
	 * Sets the value of the '{@link CAEX.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Min Value</em>' containment reference.
	 * @see #getRequiredMinValue()
	 * @generated
	 */
	void setRequiredMinValue(EObject value);

} // OrdinalScaled
