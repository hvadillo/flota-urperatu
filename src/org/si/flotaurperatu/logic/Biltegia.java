package org.si.flotaurperatu.logic;

public class Biltegia {

	private Kolekzioa<Arma> armak;
	
	public Biltegia(){
		armak = FactoryArma.getFactoryArma().biltegiaSortu();
	}
	
	public void armaErosi(){
		//TODO
	}
	
	public void armaErabili(){
		//TODO
	}
}
