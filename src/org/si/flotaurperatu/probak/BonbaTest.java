package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Bonba;

public class BonbaTest {
	
	Bonba bonba1;

	@Before
	public void setUp() throws Exception {
		bonba1 = new Bonba(100);
	}

	@After
	public void tearDown() throws Exception {
		bonba1 = null;
	}

	@Test
	public void testErabili() {
		fail("Not yet implemented");
	}

	@Test
	public void testKopuruaKendu() {
		assertEquals(bonba1.getKopurua(),100);
		bonba1.kopuruaKendu();
		assertEquals(bonba1.getKopurua(),99);
	}

	@Test
	public void testKopuruaGehitu() {
		assertEquals(bonba1.getKopurua(),100);
		bonba1.kopuruaKendu();
		bonba1.kopuruaKendu();
		bonba1.kopuruaGehitu();
		assertEquals(bonba1.getKopurua(),99);
	}

}
