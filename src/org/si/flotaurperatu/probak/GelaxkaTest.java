package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Egoera;
import org.si.flotaurperatu.logic.Ezkutua;
import org.si.flotaurperatu.logic.Fragata;
import org.si.flotaurperatu.logic.Gelaxka;
import org.si.flotaurperatu.logic.HegazkinOntzi;
import org.si.flotaurperatu.logic.Itsaspeko;
import org.si.flotaurperatu.logic.Ontzia;
import org.si.flotaurperatu.logic.Suntzitzaile;

public class GelaxkaTest {
	
	Gelaxka gelaxka1;
	Gelaxka gelaxka2;
	Gelaxka gelaxka3;
	Gelaxka gelaxka4;
	Gelaxka gelaxka5;
	Gelaxka gelaxka6;
	Gelaxka gelaxka7;
	Gelaxka gelaxka8;
	Gelaxka gelaxka9;
	Gelaxka gelaxka10;

	@Before
	public void setUp() throws Exception {
		gelaxka1 = new Gelaxka(0,0);
		
		gelaxka2 = new Gelaxka(0,2);
		gelaxka3 = new Gelaxka(1,2);
		
		gelaxka4 = new Gelaxka(0,4);
		gelaxka5 = new Gelaxka(1,4);
		gelaxka6 = new Gelaxka(2,5);
		
		gelaxka7 = new Gelaxka(0,6);
		gelaxka8 = new Gelaxka(1,6);
		gelaxka9 = new Gelaxka(2,6);
		gelaxka10 = new Gelaxka(3,6);
	}

	@After
	public void tearDown() throws Exception {
		gelaxka1 = null;
		gelaxka2 = null;
		gelaxka3 = null;
		gelaxka4 = null;
		gelaxka5 = null;
		gelaxka6 = null;
		gelaxka7 = null;
		gelaxka8 = null;
		gelaxka9 = null;
		gelaxka10 = null;
	}

	@Test
	public void testEguneratu() {
		gelaxka1.eguneratu(Egoera.EMANDA);
		assertEquals(gelaxka1.getEgoera(),Egoera.EMANDA);
		
		gelaxka1.eguneratu(Egoera.EZKUTUA);
		assertEquals(gelaxka1.getEgoera(),Egoera.EZKUTUA);
		
		gelaxka1.eguneratu(Egoera.MISS);
		assertEquals(gelaxka1.getEgoera(),Egoera.MISS);
		
		gelaxka1.eguneratu(Egoera.ONTZIA);
		assertEquals(gelaxka1.getEgoera(),Egoera.ONTZIA);
	}

	@Test
	public void testOntziaEguneratu() {
		assertNull(gelaxka1.getOntzia());
		
		Fragata ontzi1 = new Fragata();
		gelaxka1.ontziaEguneratu(ontzi1);
		assertNotNull(gelaxka1.getOntzia());
	}

	@Test
	public void testEzkutuaJarri() {
		Fragata ontzi1 = new Fragata();
		Suntzitzaile ontzi2 = new Suntzitzaile();
		Itsaspeko ontzi3 = new Itsaspeko();
		HegazkinOntzi ontzi4 = new HegazkinOntzi();
		Ezkutua ezkutu1 = new Ezkutua(2);
		Ezkutua ezkutu2 = new Ezkutua(2);
		Ezkutua ezkutu3 = new Ezkutua(2);
		Ezkutua ezkutu4 = new Ezkutua(2);
		
		gelaxka1.ontziaEguneratu(ontzi1);
		ontzi1.posizioakEguneratu(0, gelaxka1);
		gelaxka1.ezkutuaJarri(ezkutu1);
		for(int i = 0; i < gelaxka1.getOntzia().getPosizioak().size(); i++){
			assertEquals(gelaxka1.getOntzia().getPosizioak().get(i).getEgoera(),Egoera.EZKUTUA);
		}
		
		gelaxka2.ontziaEguneratu(ontzi2);
		ontzi2.posizioakEguneratu(0, gelaxka2);
		ontzi2.posizioakEguneratu(1, gelaxka3);
		gelaxka2.ezkutuaJarri(ezkutu2);
		for(int i = 0; i < gelaxka2.getOntzia().getPosizioak().size(); i++){
			assertEquals(gelaxka2.getOntzia().getPosizioak().get(i).getEgoera(),Egoera.EZKUTUA);
		}
		
		gelaxka4.ontziaEguneratu(ontzi3);
		ontzi3.posizioakEguneratu(0, gelaxka4);
		ontzi3.posizioakEguneratu(1, gelaxka5);
		ontzi3.posizioakEguneratu(2, gelaxka6);
		gelaxka4.ezkutuaJarri(ezkutu3);
		for(int i = 0; i < gelaxka4.getOntzia().getPosizioak().size(); i++){
			assertEquals(gelaxka4.getOntzia().getPosizioak().get(i).getEgoera(),Egoera.EZKUTUA);
		}
		
		gelaxka7.ontziaEguneratu(ontzi4);
		ontzi4.posizioakEguneratu(0, gelaxka7);
		ontzi4.posizioakEguneratu(0, gelaxka8);
		ontzi4.posizioakEguneratu(0, gelaxka9);
		ontzi4.posizioakEguneratu(0, gelaxka10);
		gelaxka7.ezkutuaJarri(ezkutu4);
		for(int i = 0; i < gelaxka7.getOntzia().getPosizioak().size(); i++){
			assertEquals(gelaxka7.getOntzia().getPosizioak().get(i).getEgoera(),Egoera.EZKUTUA);
		}
	}

}
