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
	
	public void armakErosi(String pMota){
		int kostua;
		if(Denda.getNDenda().getKostua(pMota)<dirua){
			kostua=Denda.getNDenda().getKostua(pMota);
			diruaKendu(kostua);
			Denda.getNDenda().armaErosi(pMota);
			armak.armaErosi(pMota);
		}
	}
	
	public abstract void ezkutuaJarri(int pZutabe,int pErrenkada);
	
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
	public Biltegia getArmak(){
		return this.armak;
	}
	private void diruaKendu(int pKostua){
		dirua=dirua-pKostua;
	}
	public abstract void radarraErabili(int pZutabe,int pErrenkada);
}
