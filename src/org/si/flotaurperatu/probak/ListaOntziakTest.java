package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.ListaOntziak;
import org.si.flotaurperatu.logic.Misil;

public class ListaOntziakTest {
	
	ListaOntziak lista1;
	Misil misil1;

	@Before
	public void setUp() throws Exception {
		lista1 = new ListaOntziak();
		misil1 = new Misil(10);
	}

	@After
	public void tearDown() throws Exception {
		lista1 = null;
	}

	@Test
	public void testGetOntzia() {
		fail("Not yet implemented");
	}

	@Test
	public void testDenakUrperaturik() {
		assertTrue(!lista1.denakUrperaturik());
		lista1.getOntzia(0).kokatu();
	}

}
