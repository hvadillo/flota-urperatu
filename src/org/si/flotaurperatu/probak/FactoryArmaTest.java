package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Arma;
import org.si.flotaurperatu.logic.FactoryArma;

public class FactoryArmaTest {
	
	FactoryArma listaArmak;

	@Before
	public void setUp() throws Exception {
		listaArmak = FactoryArma.getFactoryArma();
	}

	@After
	public void tearDown() throws Exception {
		listaArmak = null;
	}

	@Test
	public void testDendaSortu() {
		ArrayList<Arma> denda = listaArmak.dendaSortu();
		assertEquals(denda.size(),7);
	}

	@Test
	public void testBiltegiaSortu() {
		ArrayList<Arma> biltegia = listaArmak.biltegiaSortu();
		assertEquals(biltegia.size(),7);
	}

}
