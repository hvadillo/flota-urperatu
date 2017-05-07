package org.si.flotaurperatu.logic;

public class MisilIH extends MisilGidatua {
	
	public MisilIH(int pKop){
		super("MisilIH",5,pKop);
		portaera=new TiroBertikal();
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
