package org.si.flotaurperatu.logic;

public class MisilEM extends MisilGidatua {
	
public MisilEM(int pKop){
	super("MisilEm",5,pKop);
	portaera=new TiroHorizontal();
}

public void erabili() {
	// TODO Auto-generated method stub
	portaera.tiroEgin();
}

}