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
package Test;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;

import CAEX.util.CAEXResourceFactoryImpl;
import CAEX.util.CaexSerializer;
import GenericAnyType.util.GenericAnyTypeUtil;


public class RoundTripTest {

	ResourceSet resourceSet = null;
	
	@Before
	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();
		
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("aml", new CAEXResourceFactoryImpl());
	
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("xmi", new XMIResourceFactoryImpl());
	}
	
	@org.junit.Test
	public void testRoundTrip() throws Exception{
		File xmlFile = new File("examples/IAF_AMLModel_journal.aml");

		CaexSerializer serializer = new CaexSerializer();
		serializer.writeXMI(xmlFile, resourceSet, "testOutput/IAF_AMLModel_journal.xmi");

		URI modelURI = URI.createFileURI(new File("testOutput/IAF_AMLModel_journal.xmi").getAbsolutePath());
		serializer.writeXML(resourceSet.getResource(modelURI, true), "testOutput/IAF_AMLModel_journal.aml");
		
	}

}
