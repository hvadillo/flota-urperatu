package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.FactoryOntziak;
import org.si.flotaurperatu.logic.HegazkinOntzi;
import org.si.flotaurperatu.logic.Ontzia;

public class FactoryOntziakTest {
	
	FactoryOntziak listaOntziak;

	@Before
	public void setUp() throws Exception {
		listaOntziak = FactoryOntziak.getFactoryOntziak();
	}

	@After
	public void tearDown() throws Exception {
		listaOntziak = null;
	}

	@Test
	public void testFlotaSortu() {
		ArrayList<Ontzia> flota = listaOntziak.flotaSortu();
		assertEquals(flota.size(),10);
	}

}
