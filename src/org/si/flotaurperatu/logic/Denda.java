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
	
	public void armaErosi(String pMota){
		//TODO
		if(pMota.equals("radarra")){
			armak.get(0).kopuruaKendu();
		}
		else if (pMota.equals("bonba")){
			armak.get(1).kopuruaKendu();
		}
		else if(pMota.equals("misil")){
			armak.get(2).kopuruaKendu();
		}
		else if(pMota.equals("ezkutua")){
			armak.get(3).kopuruaKendu();
		}
		else if(pMota.equals("misilIH")){
			armak.get(4).kopuruaKendu();
		}
		else if(pMota.equals("misilEM")){
			armak.get(5).kopuruaKendu();
		}
		else{
			armak.get(6).kopuruaKendu();
		}
	}
	
	public void ontziakKonpondu(){
		//TODO
	}
	
	public int getKostua(String pMota){
		if(pMota.equals("radarra")){
			return armak.get(0).getKostua();
		}
		else if (pMota.equals("bonba")){
			return armak.get(1).getKostua();
		}
		else if(pMota.equals("misil")){
			return armak.get(2).getKostua();
		}
		else if(pMota.equals("ezkutua")){
			return armak.get(3).getKostua();
		}
		else if(pMota.equals("misilIH")){
			return armak.get(4).getKostua();
		}
		else if(pMota.equals("misilEM")){
			return armak.get(5).getKostua();
		}
		else{
			return armak.get(6).getKostua();
		}
	}

}
