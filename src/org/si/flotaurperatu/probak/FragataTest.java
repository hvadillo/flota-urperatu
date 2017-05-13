package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Ezkutua;
import org.si.flotaurperatu.logic.Fragata;

public class FragataTest {
	
	Fragata fragata1;
	Ezkutua ezkutu1;

	@Before
	public void setUp() throws Exception {
		fragata1 = new Fragata();
		ezkutu1 = new Ezkutua(2);
	}

	@After
	public void tearDown() throws Exception {
		fragata1 = null;
		ezkutu1 = null;
	}

	@Test
	public void testUrperatutaDago() {
		assertTrue(!fragata1.urperatutaDago());
		fragata1.urperatu();
		assertTrue(fragata1.urperatutaDago());
	}

	@Test
	public void testEzkutuaJarri() {
		assertTrue(!fragata1.ezkutuaDauka());
		fragata1.ezkutuaJarri(ezkutu1);
		assertTrue(fragata1.ezkutuaDauka());
	}

	@Test
	public void testPosizioakEguneratu() {
		fail("Not yet implemented");
	}

}
