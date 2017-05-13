package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Bonba;
import org.si.flotaurperatu.logic.Ezkutua;
import org.si.flotaurperatu.logic.Misil;

public class EzkutuaTest {
	
	Ezkutua ezkutua1;
	Ezkutua ezkutua2;
	Bonba bonba1;
	Misil misil1;

	@Before
	public void setUp() throws Exception {
		ezkutua1 = new Ezkutua(5);
		ezkutua2 = new Ezkutua(5);
		bonba1 = new Bonba(5);
		misil1 = new Misil(5);
	}

	@After
	public void tearDown() throws Exception {
		ezkutua1 = null;
		ezkutua2 = null;
		bonba1 = null;
		misil1 = null;
	}

	@Test
	public void testKolpeaJaso() {
		assertTrue(ezkutua1.kolpeaJaso(bonba1)==1);
		assertTrue(ezkutua1.kolpeaJaso(bonba1)==0);
		assertTrue(ezkutua2.kolpeaJaso(misil1)==0);
	}

}
