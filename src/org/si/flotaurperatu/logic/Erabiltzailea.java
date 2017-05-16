package org.si.flotaurperatu.logic;

public class Erabiltzailea extends Jokalaria{
	
	public Erabiltzailea(){
		super();
	}

	@Override
	public void radarraErabili(int pZutabe, int pErrenkada) {
		armak.armaErabili("Radarra",pZutabe,pErrenkada);
	}

	@Override
	public void txandaBurutu() {
		// TODO Auto-generated method stub
		
	}

}