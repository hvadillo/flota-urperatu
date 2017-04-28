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
	
	public void armaErabili(String pMota,int pZutabe,int pErrenkada){
		//TODO
		if(pMota.equals("Ezkutua")){
			armak.get(3).erabili(pZutabe, pErrenkada);
		}
		else if(pMota.equals("Radarra")){
			armak.get(0).erabili(pZutabe, pErrenkada);
		}
		else if(pMota.equals("Bonba")){
			armak.get(1).erabili(pZutabe,pErrenkada);
		}
	}
}
