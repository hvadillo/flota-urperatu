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
		denda.add(new MisilIH(10));
		denda.add(new MisilEM(10));
		denda.add(new MisilGurutze(10));
		
		return denda;
		
		
	}
	
	public Kolekzioa<Arma> biltegiaSortu(){
		//TODO
		biltegi=new Kolekzioa<Arma>();
		biltegi.add(new Radarra(2));
		biltegi.add(new Bonba(2)));
		biltegi.add(new Misil(2));
		biltegi.add(new Ezkutua(2));
		denda.add(new MisilIH(2));
		denda.add(new MisilEM(2));
		denda.add(new MisilGurutze(2));
		
		return biltegi;
	}

}
