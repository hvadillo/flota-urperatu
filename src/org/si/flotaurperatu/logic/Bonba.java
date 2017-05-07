package org.si.flotaurperatu.logic;

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
		}
		else{
			etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
			if(this.kopurua>0){
				etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada).eraso(this);
				kopurua--;
			}else{
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).txandaBurutu();
			}
		}
	}
}
