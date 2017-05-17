package org.si.flotaurperatu.logic;

import java.awt.Frame;

import org.si.flotaurperatu.interf2.ArmenPanela;
import org.si.flotaurperatu.interf2.DendaPanela;
import org.si.flotaurperatu.interf2.Leihoa2;

public abstract class Main {

	public static void main(String[] args) {
		Frame leihoa = Leihoa2.getLeihoa2();
		ListaJokalariak.getNireListaJokalariak();
		ListaJokalariak.getNireListaJokalariak().hasieratu();
		ArmenPanela armak = ArmenPanela.getArmenPanela();
		armak.armenKopurua("bonba");
		armak.armenKopurua("misil");
		armak.armenKopurua("misilIH");
		armak.armenKopurua("misilEM");
		armak.armenKopurua("misilGurutzatu");
		armak.armenKopurua("radarra");
		armak.armenKopurua("ezkutua");
		armak.ipiniDirua();
		DendaPanela denda = DendaPanela.getDendaPanela();
		denda.armenPrezioa("bonba");
		denda.armenPrezioa("misil");
		denda.armenPrezioa("misilIH");
		denda.armenPrezioa("misilEM");
		denda.armenPrezioa("misilGurutzatu");
		denda.armenPrezioa("radarra");
		denda.armenPrezioa("ezkutua");
		leihoa.setVisible(true);
	}

}