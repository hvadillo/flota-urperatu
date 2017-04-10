package org.si.flotaurperatu.logic;

public class TiroBertikal implements TiroPortaera {
	
	public void tiroEgin(MisilGidatua pMisil,int pZutabe ,int pErrenkada){
		//TODO
		int txanda;
		Jokalaria etsaia;
		
		txanda=ListaJokalariak.getNireListaJokalariak().txandaKalkulatu();
		if(txanda==0){
			etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1);
		}
		else{
			etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
		}
		for(int i=0;i<10;i++){
			etsaia.getIkusi().getGelaxka(pZutabe,i).eraso(pMisil);
		}
	}	

}
