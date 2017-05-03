package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class Biltegia {

	private ArrayList<Arma> armak;
	
	public Biltegia(){
		armak = FactoryArma.getFactoryArma().biltegiaSortu();
	}
	
	public void armaErosi(String pMota){
		if(pMota.equals("radarra")){
			armak.get(0).kopuruaGehitu();
		}
		else if (pMota.equals("bonba")){
			armak.get(1).kopuruaGehitu();
		}
		else if(pMota.equals("misil")){
			armak.get(2).kopuruaGehitu();
		}
		else if(pMota.equals("ezkutua")){
			armak.get(3).kopuruaGehitu();
		}
		else if(pMota.equals("misilIH")){
			armak.get(4).kopuruaGehitu();
		}
		else if(pMota.equals("misilEM")){
			armak.get(5).kopuruaGehitu();
		}
		else{
			armak.get(6).kopuruaGehitu();
		}
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
		else if(pMota.equals("Misil")){
			armak.get(2).erabili(pZutabe,pErrenkada);
		}
		else if(pMota.equals("MisilIH")){
			armak.get(4).erabili(pZutabe,pErrenkada);
		}
		else if(pMota.equals("MisilEM")){
			armak.get(5).erabili(pZutabe,pErrenkada);
		}
		else if(pMota.equals("MisilGurutze")){
			armak.get(6).erabili(pZutabe,pErrenkada);
		}
	}
}
