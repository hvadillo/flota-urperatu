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
		denda=new Kolekzioa<Arma>();
		denda.add(new Radarra(10));
		denda.add(new Bonba(10));
		denda.add(new Misil(10));
		denda.add(new Ezkutua(10));
		//misil gidatuak falta dira!!!!
		
		return denda;
		
		
	}
	
	public Kolekzioa<Arma> biltegiaSortu(){
		//TODO
		biltegi=new Kolekzioa<Arma>();
		biltegi.add(new Radarra(2));
		biltegi.add(new Bonba(2)));
		biltegi.add(new Misil(2));
		biltegi.add(new Ezkutua(2));
		//misil gidatuak falta dira!!!!
		
		return biltegi;
	}

}
