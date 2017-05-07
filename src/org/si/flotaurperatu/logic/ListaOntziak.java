package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class ListaOntziak {

	private ArrayList<Ontzia> ontziak;
	
	public ListaOntziak(){
		ontziak = FactoryOntziak.getFactoryOntziak().flotaSortu();
	}
	public Ontzia getOntzia(int pInt){
		return this.ontziak.get(pInt);
	}
	
	public boolean denakUrperaturik(){
		int i=0;
		boolean urperaturik=true;
		while(i<=(ontziak.size()-1) && urperaturik){
			if(!getOntzia(i).urperatutaDago()){
				urperaturik=false;
			}
			i++;
		}
		return urperaturik;
	}
}
