package org.si.flotaurperatu.logic;

public class Gelaxka {

	private int x;
	private int y;
	private Egoera e;
	private Ontzia o;
	
	public Gelaxka(int pX, int pY){
		x = pX;
		y = pY;	
		e = Egoera.URA;
		o=null;
		
	}
	public void eguneratu(Egoera pEgo){
		e=pEgo;
	}
	
	public Egoera getEgoera(){
		return e;
	}
	public void ontziaEguneratu(Ontzia pOntzia){
		this.o=pOntzia;
	}
}
