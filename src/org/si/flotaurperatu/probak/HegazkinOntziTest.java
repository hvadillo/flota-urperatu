package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Ezkutua;
import org.si.flotaurperatu.logic.HegazkinOntzi;

public class HegazkinOntziTest {
	
	HegazkinOntzi hegazkinontzi1;
	Ezkutua ezkutu1;

	@Before
	public void setUp() throws Exception {
		hegazkinontzi1 = new HegazkinOntzi();
		ezkutu1 = new Ezkutua(2);
	}

	@After
	public void tearDown() throws Exception {
		hegazkinontzi1 = null;
		ezkutu1 = null;
	}

	@Test
	public void testUrperatutaDago() {
		assertTrue(!hegazkinontzi1.urperatutaDago());
		hegazkinontzi1.urperatu();
		assertTrue(hegazkinontzi1.urperatutaDago());
	}
	@Test
	public void testEzkutuaDauka(){
		assertTrue(!hegazkinontzi1.ezkutuaDauka());
		hegazkinontzi1.ezkutuaJarri(ezkutu1);
		assertTrue(hegazkinontzi1.ezkutuaDauka());
	}

}
