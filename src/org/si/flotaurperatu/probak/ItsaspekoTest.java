package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Ezkutua;
import org.si.flotaurperatu.logic.Itsaspeko;

public class ItsaspekoTest {
	
	Itsaspeko itsaspeko1;
	Ezkutua ezkutu1;

	@Before
	public void setUp() throws Exception {
		itsaspeko1 = new Itsaspeko();
		ezkutu1 = new Ezkutua(2);
	}

	@After
	public void tearDown() throws Exception {
		itsaspeko1 = null;
		ezkutu1 = null;
	}

	@Test
	public void testUrperatutaDago() {
		assertTrue(!itsaspeko1.urperatutaDago());
		itsaspeko1.urperatu();
		assertTrue(itsaspeko1.urperatutaDago());
	}
	@Test
	public void testEzkutuaJarri(){
		assertTrue(!itsaspeko1.ezkutuaDauka());
		itsaspeko1.ezkutuaJarri(ezkutu1);
		assertTrue(itsaspeko1.ezkutuaDauka());
	}

}
