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
			if(armak.get(0).getKopurua()>0){
				armak.get(0).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
		}
		else if (pMota.equals("bonba")){
			if(armak.get(1).getKopurua()>0){
				armak.get(1).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
		}
		else if(pMota.equals("misil")){
			if(armak.get(2).getKopurua()>0){
				armak.get(2).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
		}
		else if(pMota.equals("ezkutua")){
			if(armak.get(3).getKopurua()>0){
				armak.get(3).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
		}
		else if(pMota.equals("misilIH")){
			if(armak.get(4).getKopurua()>0){
				armak.get(4).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
		}
		else if(pMota.equals("misilEM")){
			if(armak.get(5).getKopurua()>0){
				armak.get(5).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
		}
		else{
			if(armak.get(6).getKopurua()>0){
				armak.get(6).kopuruaKendu();
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).armak.armaErosi(pMota);
				}
				else{
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).armak.armaErosi(pMota);
				}
			}
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
