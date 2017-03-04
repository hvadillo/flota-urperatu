package org.si.flotaurperatu.logic;

public class FactoryOntziak {

	private static FactoryOntziak nFactoryOntziak = null;
	
	private FactoryOntziak(){
		//TODO
	}
	
	public static FactoryOntziak getFactoryOntziak(){
		if(nFactoryOntziak==null){
			nFactoryOntziak = new FactoryOntziak();
		}
		return nFactoryOntziak;
	}
	
	public Kolekzioa<Ontzia> flotaSortu(){
		//TODO
	}
}
