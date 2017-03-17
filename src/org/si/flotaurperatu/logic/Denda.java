package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class Denda {
	
	private ArrayList<Arma> armak;
	private static Denda nDenda = null;
	
	private Denda(){
		armak = FactoryArma.getFactoryArma().dendaSortu();
	}
	
	public static Denda getNDenda(){
		if(nDenda == null){
			nDenda = new Denda();
		}
		return nDenda;
	}
	
	public Arma armaErosi(){
		//TODO
	}
	
	public void ontziakKonpondu(){
		//TODO
	}

}
