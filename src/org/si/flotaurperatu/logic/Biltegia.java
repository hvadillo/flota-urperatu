package org.si.flotaurperatu.logic;

import java.util.ArrayList;

import org.si.flotaurperatu.interf2.Leihoa2;

public class Biltegia {

	private ArrayList<Arma> armak;
	
	public Biltegia(){
		armak = FactoryArma.getFactoryArma().biltegiaSortu();
	}
	
	public ArrayList<Arma> getArmak(){
		return armak;
	}
	
	public void armaErosi(String pMota){
		if(pMota.equals("radarra")){
			armak.get(0).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("Radar bat erosi duzu.");
		}
		else if (pMota.equals("bonba")){
			armak.get(1).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("Bonba bat erosi duzu.");
		}
		else if(pMota.equals("misil")){
			armak.get(2).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("Misil bat erosi duzu.");
		}
		else if(pMota.equals("ezkutua")){
			armak.get(3).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("Ezkutu bat erosi duzu.");
		}
		else if(pMota.equals("misilIH")){
			armak.get(4).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("MisilIH bat erosi duzu.");
		}
		else if(pMota.equals("misilEM")){
			armak.get(5).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("MisilEM bat erosi duzu.");
		}
		else{
			armak.get(6).kopuruaGehitu();
			Leihoa2.getLeihoa2().idatzi("Misil gurutzatu bat erosi duzu.");
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
