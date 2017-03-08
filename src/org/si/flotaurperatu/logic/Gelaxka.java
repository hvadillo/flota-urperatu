package org.si.flotaurperatu.logic;

public class Gelaxka {

	private int x;
	private int y;
	private Egoera e;
	
	public Gelaxka(int pX, int pY){
		x = pX;
		y = pY;	
		e = Egoera.URA;
	}
	public void eguneratu(Egoera pEgo){
		e=pEgo;
	}
	
	public Egoera getEgoera(){
		return e;
	}
}
