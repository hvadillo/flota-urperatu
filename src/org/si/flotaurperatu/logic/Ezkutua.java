package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;

public class Ezkutua extends Arma{

	private int kolpeak;
	
	public Ezkutua(int pKop) {
		super("Ezkutua",5,pKop);
		kolpeak = 2;
	}

	@Override
	public void erabili(int pZutabe, int pErrenkada) {
		// TODO Auto-generated method stub
		if(kopurua>0){
		Jokalaria jok=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu());
		jok.getIkusi().getGelaxka(pZutabe, pErrenkada).ezkutuaJarri(this);
		kopurua--;}
		else{
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				Leihoa2.getLeihoa2().idatzi("Ez daukazu ezkuturik");
			}
		}
	}
	public int kolpeaJaso(Arma pArma){
		if(pArma instanceof Bonba){
			kolpeak--;
		}
		else{
			kolpeak = 0;
		}
		return kolpeak;
	}

}
