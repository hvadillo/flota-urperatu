package org.si.flotaurperatu.logic;

public class ListaOntziak {

	private Kolekzioa<Ontziak> ontziak;
	
	public ListaOntziak(){
		ontziak = FactoryOntziak.getFactoryOntziak().flotaSortu;
	}
}
