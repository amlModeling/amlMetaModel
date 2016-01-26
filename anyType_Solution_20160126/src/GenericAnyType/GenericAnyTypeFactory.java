/**
 */
package GenericAnyType;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GenericAnyType.GenericAnyTypePackage
 * @generated
 */
public interface GenericAnyTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericAnyTypeFactory eINSTANCE = GenericAnyType.impl.GenericAnyTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Element</em>'.
	 * @generated
	 */
	GenericElement createGenericElement();

	/**
	 * Returns a new object of class '<em>Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Attribute</em>'.
	 * @generated
	 */
	GenericAttribute createGenericAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericAnyTypePackage getGenericAnyTypePackage();

} //GenericAnyTypeFactory
