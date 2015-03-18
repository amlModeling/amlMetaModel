package Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import CAEX.util.CAEXResourceFactoryImpl;
import CAEX.util.CaexPreprocessor;
import CAEX.util.CaexSerializer;


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
		File xmlFile = new File("examples/01_Topology/ExampleTopology.aml");
		CaexPreprocessor.removeAdditionalInformation("examples/01_Topology/ExampleTopology.aml");
		CaexSerializer serializer = new CaexSerializer();
		serializer.writeXMI(xmlFile, resourceSet, "testOutput/Topology.xmi");

		URI modelURI = URI.createFileURI(new File("testOutput/Topology.xmi").getAbsolutePath());
		serializer.writeXML(resourceSet.getResource(modelURI, true), "testOutput/Topology_AML_generated.aml");
	}

}
