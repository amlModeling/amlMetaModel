/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.RoleClassLib#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getRoleClassLib()
 * @model extendedMetaData="name='RoleClassLib' kind='elementOnly'"
 * @generated
 */
public interface RoleClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.RoleClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of a class of a role type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getRoleClassLib_RoleClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleClass> getRoleClass();

} // RoleClassLib
