package org.si.flotaurperatu.logic;

public class FactoryArma {
	
	private static FactoryArma nFactoryArma = null;
	
	private FactoryArma(){
		//TODO
	}
	
	public static FactoryArma getFactoryArma(){
		if(nFactoryArma==null){
			nFactoryArma = new FactoryArma();
		}
		return nFactoryArma;
	}
	
	public Kolezioa<Arma> dendaSortu(){
		//TODO
	}
	
	public Kolekzioa<Arma> biltegiaSortu(){
		//TODO
	}

}
