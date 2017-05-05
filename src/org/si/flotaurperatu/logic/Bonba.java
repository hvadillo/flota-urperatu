package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;

public class Bonba extends Arma {
	
public Bonba(int pKop){
	super("Bonba",5,pKop);
}

	@Override
	public void erabili(int pZutabe, int pErrenkada) {
		// TODO Auto-generated method stub
		int txanda;
		Jokalaria etsaia;
		
		txanda=ListaJokalariak.getNireListaJokalariak().txandaKalkulatu();
		if(txanda==0){
			etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1);
			if(this.kopurua>0){
				etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada).eraso(this);
				kopurua--;
			}
			else{
				Leihoa2.getLeihoa2().idatzi().setText("Ez daukazu bonbarik");
			}
		}
		else{
			etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
			if(this.kopurua>0){
				etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada).eraso(this);
				kopurua--;
			}
		}
	}
}
