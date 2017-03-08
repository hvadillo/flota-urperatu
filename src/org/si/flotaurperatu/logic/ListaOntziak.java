package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class ListaOntziak {

	private ArrayList<Ontzia> ontziak;
	
	public ListaOntziak(){
		ontziak = FactoryOntziak.getFactoryOntziak().flotaSortu();
	}
}
