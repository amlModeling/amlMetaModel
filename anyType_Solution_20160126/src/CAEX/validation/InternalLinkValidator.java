/**
 *
 * $Id$
 */
package CAEX.validation;

import CAEX.InterfaceClass;


/**
 * A sample validator interface for {@link CAEX.InternalLink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InternalLinkValidator {
	boolean validate();

	boolean validateRefPartnerSideA(String value);
	boolean validateRefPartnerSideB(String value);

	boolean validatePartnerSideA(InterfaceClass value);

	boolean validatePartnerSideB(InterfaceClass value);
}
