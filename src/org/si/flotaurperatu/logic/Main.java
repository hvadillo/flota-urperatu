package org.si.flotaurperatu.logic;

import java.awt.Frame;

import org.si.flotaurperatu.interf2.Leihoa2;
import org.si.flotaurperatu.interf2.OntzienPanela;

public abstract class Main {

	public static void main(String[] args) {
		ListaJokalariak.getNireListaJokalariak();
		Frame leihoa = Leihoa2.getLeihoa2();
		ListaJokalariak.getNireListaJokalariak().hasieratu();
		leihoa.setVisible(true);
	}

}
