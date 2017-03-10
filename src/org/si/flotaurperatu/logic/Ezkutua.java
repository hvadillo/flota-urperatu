package org.si.flotaurperatu.logic;

public class Ezkutua extends Arma{

	private int kolpeak;
	
	public Ezkutua(int pKop) {
		super("Ezkutua",5,pKop);
		kolpeak = 2;
	}

	@Override
	public void erabili() {
		// TODO Auto-generated method stub
		//
	}
	public void kolpeaJaso(Arma pArma){
		if(pArma instanceof Bonba){
			kolpeak--;
		}
		else{
			kolpeak = 0;
		}
	}

}
