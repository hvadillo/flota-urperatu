package org.si.flotaurperatu.logic;

public class ListaOntziak {

	private Kolekzioa<Ontzia> ontziak;
	
	public ListaOntziak(){
		ontziak = FactoryOntziak.getFactoryOntziak().flotaSortu;
	}
}
