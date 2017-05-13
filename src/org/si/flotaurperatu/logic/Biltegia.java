package org.si.flotaurperatu.logic;

import java.util.ArrayList;

import org.si.flotaurperatu.interf2.ArmenPanela;
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
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(0).getKostua());
				Leihoa2.getLeihoa2().idatzi("Radar bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(0).getKostua());
			}
		}
		else if (pMota.equals("bonba")){
			armak.get(1).kopuruaGehitu();
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(1).getKostua());
				Leihoa2.getLeihoa2().idatzi("Bonba bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(1).getKostua());
			}
		}
		else if(pMota.equals("misil")){
			armak.get(2).kopuruaGehitu();
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(2).getKostua());
				Leihoa2.getLeihoa2().idatzi("Misil bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(2).getKostua());
			}
		}
		else if(pMota.equals("ezkutua")){
			armak.get(3).kopuruaGehitu();
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(3).getKostua());
				Leihoa2.getLeihoa2().idatzi("Ezkutu bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(3).getKostua());
			}
		}
		else if(pMota.equals("misilIH")){
			armak.get(4).kopuruaGehitu();
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(4).getKostua());
				Leihoa2.getLeihoa2().idatzi("MisilIH bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(4).getKostua());
			}
		}
		else if(pMota.equals("misilEM")){
			armak.get(5).kopuruaGehitu();
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(5).getKostua());
				Leihoa2.getLeihoa2().idatzi("MisilEM bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(5).getKostua());
			}
		}
		else{
			armak.get(6).kopuruaGehitu();
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(armak.get(6).getKostua());
				Leihoa2.getLeihoa2().idatzi("Misil gurutzatu bat erosi duzu.");
				ArmenPanela.getArmenPanela().armenKopurua(pMota);
			}
			else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(armak.get(6).getKostua());
			}
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
