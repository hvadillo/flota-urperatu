package org.si.flotaurperatu.logic;

public class MisilGurutze extends MisilGidatua {

public MisilGurutze(int pKop){
	super("MisilGurutze", 5, pKop);
	portaera=new TiroGurutzatua();
}

public void erabili() {
	// TODO Auto-generated method stub
	portaera.tiroEgin();
}

}
