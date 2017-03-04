package org.si.flotaurperatu.logic;

public abstract class Jokalaria {

	private int dirua;
	private Biltegia armak;
	private TableroEraso tableroEraso;
	private TableroIkusi tableroIkusi;
	
	public Jokalaria(){
		dirua = 1000;
		armak = new Biltegia();
		tableroEraso = new TableroEraso();
		tableroIkusi = new TableroIkusi();
	}
	
	public abstract void txandaBurutu();
	
	public abstract void armakErosi();
}
