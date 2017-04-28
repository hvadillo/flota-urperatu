package org.si.flotaurperatu.logic;

public class Erabiltzailea extends Jokalaria{
	
	public Erabiltzailea(){
		super();
	}

	@Override
	public void txandaBurutu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void armakErosi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ezkutuaJarri(int pZutabe,int pErrenkada) {
		// TODO Auto-generated method stub
		armak.armaErabili("Ezkutua",pZutabe,pErrenkada);
	}

	@Override
	public void ontziakIpini(String pKord ) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void radarraErabili(int pZutabe, int pErrenkada) {
		armak.armaErabili("Radarra",pZutabe,pErrenkada);
	}
	public void bonbaErabili(int pZutabe, int pErrenkada){
		armak.armaErabili("Bonba", pZutabe, pErrenkada);
	}
	

	@Override
	public void ontziakIpini() {
		// TODO Auto-generated method stub
		
	}
	

}
