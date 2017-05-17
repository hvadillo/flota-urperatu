package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Ezkutua;
import org.si.flotaurperatu.logic.Suntzitzaile;

public class SuntzitzaileTest {
	
	Suntzitzaile suntzitzaile1;
	Ezkutua ezkutu1;

	@Before
	public void setUp() throws Exception {
		suntzitzaile1 = new Suntzitzaile();
		ezkutu1 = new Ezkutua(2);
	}

	@After
	public void tearDown() throws Exception {
		suntzitzaile1 = null;
		ezkutu1 = null;
	}

	@Test
	public void testUrperatutaDago() {
		assertTrue(!suntzitzaile1.urperatutaDago());
		suntzitzaile1.urperatu();
		assertTrue(suntzitzaile1.urperatutaDago());
	}
	@Test
	public void testEzkutuaJarri(){
		assertTrue(!suntzitzaile1.ezkutuaDauka());
		suntzitzaile1.ezkutuaJarri(ezkutu1);
		assertTrue(suntzitzaile1.ezkutuaDauka());
	}

}
