package org.si.flotaurperatu.logic;

public abstract class Jokalaria {

	protected int dirua;
	protected Biltegia armak;
	protected TableroIkusi tableroIkusi;
	protected ListaOntziak flota;
	
	public Jokalaria(){
		dirua = 1000;
		armak = new Biltegia();
		tableroIkusi = new TableroIkusi();
		flota = new ListaOntziak();
	}
	
	public void armakErosi(String pMota){
		int kostua;
		if(Denda.getNDenda().getKostua(pMota)<dirua){
			kostua=Denda.getNDenda().getKostua(pMota);
			diruaKendu(kostua);
			Denda.getNDenda().armaErosi(pMota);
			armak.armaErosi(pMota);
		}
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
	
	public void diruaKendu(int pKostua){
		dirua=dirua-pKostua;
	}
	
	public int getDirua(){
		return dirua;
	}
	
	public abstract void radarraErabili(int pZutabe,int pErrenkada);
	
	public void misilErabili(int zutabe, int errenkada) {
		armak.armaErabili("Misil", zutabe, errenkada);
	}

	public void misilIHErabili(int zutabe, int errenkada) {
		armak.armaErabili("MisilIH", zutabe, errenkada);
	}

	public void misilEMErabili(int zutabe, int errenkada) {
		armak.armaErabili("MisilEM", zutabe, errenkada);
	}

	public void misilGurutzeErabili(int zutabe, int errenkada) {
		armak.armaErabili("MisilGurutze", zutabe, errenkada);
	}

	public void bonbaErabili(int zutabe, int errenkada){
		armak.armaErabili("Bonba", zutabe, errenkada);
	}
	
	public void ezkutuaJarri(int zutabe, int errenkada){
		armak.armaErabili("Ezkutua",zutabe,errenkada);
	}

	
	
}