package org.si.flotaurperatu.logic;

public class MisilGurutze extends MisilGidatua {
	private TiroPortaera portaera2;

public MisilGurutze(int pKop){
	super("MisilGurutze", 5, pKop);
	portaera=new TiroBertikal();
	portaera2=new TiroHorizontal();
}

public void erabili(int pZutabe ,int pErrenkada) {
	// TODO Auto-generated method stub
	portaera.tiroEgin(this,pZutabe ,pErrenkada);
	portaera2.tiroEgin(this,pZutabe ,pErrenkada);
	kopurua--;
}

}
