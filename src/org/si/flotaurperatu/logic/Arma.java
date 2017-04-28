package org.si.flotaurperatu.logic;

public abstract class Arma {

	private String izena;
	private int kostua;
	protected int kopurua;
	
	public Arma(String pIzena, int pKostua, int pKop){
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

}
