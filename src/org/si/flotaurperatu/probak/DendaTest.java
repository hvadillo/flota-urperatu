package org.si.flotaurperatu.probak;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.si.flotaurperatu.logic.Denda;
import org.si.flotaurperatu.logic.ListaJokalariak;

public class DendaTest {
	
	Denda denda1;
	ListaJokalariak listaJok1;

	@Before
	public void setUp() throws Exception {
		denda1 = Denda.getNDenda();
		listaJok1 = ListaJokalariak.getNireListaJokalariak();
	}

	@After
	public void tearDown() throws Exception {
		denda1 = null;
		listaJok1 = null;
	}

	@Test
	public void testArmaErosi() {
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(0).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),700);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(0).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),700);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),101);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),650);
		
		
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),102);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),600);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),101);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),650);
		
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),102);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),600);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),500);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(2).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),500);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("ezkutua");
		assertEquals(denda1.getArmak().get(3).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),200);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misilIH");
		assertEquals(denda1.getArmak().get(4).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(4).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),350);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misilEM");
		assertEquals(denda1.getArmak().get(5).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(5).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),50);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misilGurutze");
		assertEquals(denda1.getArmak().get(6).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(6).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),175);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(3).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),50);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misilGurutze");
		assertEquals(denda1.getArmak().get(6).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(6).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),0);
		
		denda1.armaErosi("misilGurutze");
		assertEquals(denda1.getArmak().get(6).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(6).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),0);
		
		
	}
}
