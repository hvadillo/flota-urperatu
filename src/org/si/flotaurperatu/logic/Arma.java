package org.si.flotaurperatu.logic;

import java.util.Observable;

import org.si.flotaurperatu.interf2.Leihoa2;

public abstract class Arma extends Observable{

	private String izena;
	private int kostua;
	protected int kopurua;
	
	public Arma(String pIzena, int pKostua, int pKop){
		addObserver(Leihoa2.getLeihoa2());
		izena = pIzena;
		kostua = pKostua;
		kopurua = pKop;
	}
	
	public String getIzena(){
		return izena;
	}
	
	public int getKostua(){
		return kostua;
	}
	
	public int getKopurua(){
		return kopurua;
	}
	
	public abstract void erabili(int pZutabe, int pErrenkada);

	public void kopuruaKendu(){
		kopurua--;
	}
	
	public void kopuruaGehitu(){
		kopurua++;
	}
	
	protected void idatzi(String textua){
		String n = textua;
		setChanged();
		notifyObservers(n);
	}

}