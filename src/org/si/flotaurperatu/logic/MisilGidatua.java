package org.si.flotaurperatu.logic;

public abstract class MisilGidatua extends Arma {
	protected TiroPortaera portaera;
	
public MisilGidatua(String pIzena, int pKostua, int pKop) {
	super(pIzena, pKostua, pKop);

	// TODO Auto-generated constructor stub
}

	public abstract void erabili(int pZutabe ,int pErrenkada);

}
