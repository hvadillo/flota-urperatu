package org.si.flotaurperatu.logic;

import java.util.ArrayList;
import java.util.Observable;

import org.si.flotaurperatu.interf2.ArmenPanela;
import org.si.flotaurperatu.interf2.Leihoa2;

public class Biltegia extends Observable{

	private ArrayList<Arma> armak;
	
	public Biltegia(){
		addObserver(Leihoa2.getLeihoa2());
		addObserver(ArmenPanela.getArmenPanela());
		armak = FactoryArma.getFactoryArma().biltegiaSortu();
	}
	
	public ArrayList<Arma> getArmak(){
		return armak;
	}
	
	public void armaErosi(String pMota){
		int txanda = ListaJokalariak.getNireListaJokalariak().txandaKalkulatu();
		ArrayList<Jokalaria> lista = ListaJokalariak.getNireListaJokalariak().getJokalariak();
		if(pMota.equals("radarra")){
			armak.get(0).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(0).getKostua());
				idatzi("Radar bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(0).getKostua());
			}
		}else if (pMota.equals("bonba")){
			armak.get(1).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(1).getKostua());
				idatzi("Bonba bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(1).getKostua());
			}
		}else if(pMota.equals("misil")){
			armak.get(2).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(2).getKostua());
				idatzi("Misil bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(2).getKostua());
			}
		}else if(pMota.equals("ezkutua")){
			armak.get(3).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(3).getKostua());
				idatzi("Ezkutu bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(3).getKostua());
			}
		}else if(pMota.equals("misilIH")){
			armak.get(4).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(4).getKostua());
				idatzi("MisilIH bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(4).getKostua());
			}
		}else if(pMota.equals("misilEM")){
			armak.get(5).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(5).getKostua());
				idatzi("MisilEM bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(5).getKostua());
			}
		}else{
			armak.get(6).kopuruaGehitu();
			if(txanda==0){
				lista.get(0).diruaKendu(armak.get(6).getKostua());
				idatzi("Misil gurutzatu bat erosi duzu.");
				armenKopurua(pMota);
			}else{
				lista.get(1).diruaKendu(armak.get(6).getKostua());
			}
		}
	}
	
	public void armaErabili(String pMota,int pZutabe,int pErrenkada){
		if(pMota.equals("Ezkutua")){
			armak.get(3).erabili(pZutabe, pErrenkada);
		}else if(pMota.equals("Radarra")){
			armak.get(0).erabili(pZutabe, pErrenkada);
		}else if(pMota.equals("Bonba")){
			armak.get(1).erabili(pZutabe,pErrenkada);
		}else if(pMota.equals("Misil")){
			armak.get(2).erabili(pZutabe,pErrenkada);
		}else if(pMota.equals("MisilIH")){
			armak.get(4).erabili(pZutabe,pErrenkada);
		}else if(pMota.equals("MisilEM")){
			armak.get(5).erabili(pZutabe,pErrenkada);
		}else if(pMota.equals("MisilGurutze")){
			armak.get(6).erabili(pZutabe,pErrenkada);
		}
	}
	
	private void idatzi(String textua){
		String n = textua;
		setChanged();
		notifyObservers(n);
	}
	
	private void armenKopurua(String arma){
		Object[] n = {arma, 1};
		setChanged();
		notifyObservers(n);
	}
}