package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;

public class MisilEM extends MisilGidatua {
	
public MisilEM(int pKop){
	super("MisilEm",5,pKop);
	portaera=new TiroHorizontal();
}

public void erabili(int pZutabe ,int pErrenkada) {
	// TODO Auto-generated method stub
	if(this.kopurua>0){
		portaera.tiroEgin(this, pZutabe ,pErrenkada);
		kopurua--;
	}
	else{
		if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==1){
			ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).txandaBurutu();
		}
	}
}

}
