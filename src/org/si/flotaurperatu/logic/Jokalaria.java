package org.si.flotaurperatu.logic;

public abstract class Jokalaria {

	protected int dirua;
	protected Biltegia armak;
	protected TableroEraso tableroEraso;
	protected TableroIkusi tableroIkusi;
	protected ListaOntziak flota;
	
	public Jokalaria(){
		dirua = 1000;
		armak = new Biltegia();
		tableroEraso = new TableroEraso();
		tableroIkusi = new TableroIkusi();
		flota = new ListaOntziak();
	}
	
	public abstract void txandaBurutu();
	
	public abstract void armakErosi();
	
	public abstract void ezkutuaJarri();
	
	public abstract void ontziakIpini();
	
	public TableroEraso getEraso(){
		return tableroEraso;
	}
	
	public TableroIkusi getIkusi(){
		return tableroIkusi;
	}
	public ListaOntziak getFlota(){
		return this.flota;
	}
}
