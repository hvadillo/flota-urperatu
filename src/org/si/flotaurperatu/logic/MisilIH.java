package org.si.flotaurperatu.logic;

public class MisilIH extends MisilGidatua {
	
public MisilIH(int pKop){
	super("MisilIH",5,pKop);
	portaera=new TiroBertikal();
}
public void erabili() {
	// TODO Auto-generated method stub
	portaera.tiroEgin();
}

}
