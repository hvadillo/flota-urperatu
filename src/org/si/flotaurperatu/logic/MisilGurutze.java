package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;

public class MisilGurutze extends MisilGidatua {
	private TiroPortaera portaera2;

	public MisilGurutze(int pKop){
		super("MisilGurutze", 5, pKop);
		portaera=new TiroBertikal();
		portaera2=new TiroHorizontal();
	}
	
	public void erabili(int pZutabe ,int pErrenkada) {
		// TODO Auto-generated method stub
		if(this.kopurua>0){
			portaera.tiroEgin(this, pZutabe ,pErrenkada);
			portaera2.tiroEgin(this,pZutabe ,pErrenkada);
			kopurua--;
		}
		else{
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==1){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).txandaBurutu();
			}
		}
	}

}
