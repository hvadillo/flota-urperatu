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
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),995);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(0).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),990);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(0).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),985);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(0).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),980);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(0).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),975);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(0).getKopurua(),3);
		System.out.println(listaJok1.getJokalariak().get(1).getDirua());
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),995);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(0).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),990);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),2);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(0).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),985);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),1);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(0).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),980);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),0);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(0).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),975);
		denda1.armaErosi("radarra");
		assertEquals(denda1.getArmak().get(0).getKopurua(),0);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),101);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),970);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),102);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),965);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),103);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),960);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),104);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),955);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua(),105);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),950);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),101);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),970);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),102);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),965);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),2);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),103);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),960);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),1);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),104);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),955);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),0);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(1).getKopurua(),105);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),950);
		denda1.armaErosi("bonba");
		assertEquals(denda1.getArmak().get(1).getKopurua(),0);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),945);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),940);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),935);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),930);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),925);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(2).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),945);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(2).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),940);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),2);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(2).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),935);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),1);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(2).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),930);
		denda1.armaErosi("misil");
		assertEquals(denda1.getArmak().get(2).getKopurua(),0);
		assertEquals(listaJok1.getJokalariak().get(1).getArmak().getArmak().get(2).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(1).getDirua(),925);
		
		listaJok1.txandaEguneratu();
		
		denda1.armaErosi("ezkutua");
		assertEquals(denda1.getArmak().get(3).getKopurua(),9);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),3);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),920);
		denda1.armaErosi("ezkutua");
		assertEquals(denda1.getArmak().get(3).getKopurua(),8);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),4);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),915);
		denda1.armaErosi("ezkutua");
		assertEquals(denda1.getArmak().get(3).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),910);
		denda1.armaErosi("ezkutua");
		assertEquals(denda1.getArmak().get(3).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),6);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),905);
		denda1.armaErosi("ezkutua");
		assertEquals(denda1.getArmak().get(3).getKopurua(),5);
		assertEquals(listaJok1.getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua(),7);
		assertEquals(listaJok1.getJokalariak().get(0).getDirua(),900);
		
	}
}
