package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class Biltegia {

	private ArrayList<Arma> armak;
	
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
