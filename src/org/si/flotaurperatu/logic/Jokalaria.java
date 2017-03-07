package org.si.flotaurperatu.logic;

public abstract class Jokalaria {

	protected int dirua;
	protected Biltegia armak;
	protected TableroEraso tableroEraso;
	protected TableroIkusi tableroIkusi;
	
	public Jokalaria(){
		dirua = 1000;
		armak = new Biltegia();
		tableroEraso = new TableroEraso();
		tableroIkusi = new TableroIkusi();
	}
	
	public abstract void txandaBurutu();
	
	public abstract void armakErosi();
	
	public abstract void ezkutuaJarri();
}
