package org.si.flotaurperatu.logic;

public class MisilEM extends MisilGidatua {
	
	public MisilEM(int pKop){
		super("MisilEM",150,pKop);
		portaera=new TiroHorizontal();
	}
	
	public void erabili(int pZutabe ,int pErrenkada) {
		// TODO Auto-generated method stub
		if(this.kopurua>0){
			portaera.tiroEgin(this, pZutabe ,pErrenkada);
			kopurua--;
		}else{
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==1){
				ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).txandaBurutu();
			}
		}
	}

}