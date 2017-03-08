package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public abstract class Ontzia {

	private ArrayList<Gelaxka> posizioak;
	private int luzeera;
	private Ezkutua ezkutua;
	private Boolean urperatuta = false;
	
	public Ontzia(int pLuzeera){
		luzeera = pLuzeera;
	}
	
	public void tiroaJaso(){
		//TODO
	}
	
	private void urperatura(){
		//TODO
	}
	
	public Boolean urperatutaDago(){
		return urperatuta;
	}
	
	public void kokatu(){
		//TODO
	}
	public void ezkutuaJarri(Ezkutua pEzkutua){
		this.ezkutua = pEzkutua;
	}
}
