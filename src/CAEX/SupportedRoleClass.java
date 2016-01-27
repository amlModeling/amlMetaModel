/*******************************************************************************
 * Copyright (c) 2015 Business Informatics Group at TU Wien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Manuel Wimmer and Emanuel Maetzler
 *******************************************************************************/
/**
 */
package CAEX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link CAEX.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}</li>
 *   <li>{@link CAEX.SupportedRoleClass#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getSupportedRoleClass()
 * @model extendedMetaData="name='SupportedRoleClass' kind='elementOnly'"
 * @generated
 */
public interface SupportedRoleClass extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference.
	 * @see #setMappingObject(Mapping)
	 * @see CAEX.CAEXPackage#getSupportedRoleClass_MappingObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MappingObject' namespace='##targetNamespace'"
	 * @generated
	 */
	Mapping getMappingObject();

	/**
	 * Sets the value of the '{@link CAEX.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Object</em>' containment reference.
	 * @see #getMappingObject()
	 * @generated
	 */
	void setMappingObject(Mapping value);

	/**
	 * Returns the value of the '<em><b>Ref Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Role Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Role Class Path</em>' attribute.
	 * @see #setRefRoleClassPath(String)
	 * @see CAEX.CAEXPackage#getSupportedRoleClass_RefRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='RefRoleClassPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefRoleClassPath();

	/**
	 * Sets the value of the '{@link CAEX.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Role Class Path</em>' attribute.
	 * @see #getRefRoleClassPath()
	 * @generated
	 */
	void setRefRoleClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' reference.
	 * @see #setRoleClass(RoleClass)
	 * @see CAEX.CAEXPackage#getSupportedRoleClass_RoleClass()
	 * @model
	 * @generated
	 */
	RoleClass getRoleClass();

	/**
	 * Sets the value of the '{@link CAEX.SupportedRoleClass#getRoleClass <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Class</em>' reference.
	 * @see #getRoleClass()
	 * @generated
	 */
	void setRoleClass(RoleClass value);

} // SupportedRoleClass
