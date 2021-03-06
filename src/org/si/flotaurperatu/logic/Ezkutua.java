package org.si.flotaurperatu.logic;

public class Ezkutua extends Arma{

	private int kolpeak;
	
	public Ezkutua(int pKop) {
		super("Ezkutua",300,pKop);
		kolpeak = 2;
	}

	@Override
	public void erabili(int pZutabe, int pErrenkada) {
		if(kopurua>0){
		Jokalaria jok=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu());
		jok.getIkusi().getGelaxka(pZutabe, pErrenkada).ezkutuaJarri(new Ezkutua(1));
		kopurua--;
		}else{
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				idatzi("Ez daukazu ezkuturik");
			}
		}
	}
	
	public int kolpeaJaso(Arma pArma){
		if(pArma instanceof Bonba){
			kolpeak--;
		}else{
			kolpeak = 0;
		}
		return kolpeak;
	}

}