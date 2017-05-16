package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class FactoryArma {
	
	private static FactoryArma nFactoryArma = null;
	
	private FactoryArma(){
		
	}
	
	public static FactoryArma getFactoryArma(){
		if(nFactoryArma==null){
			nFactoryArma = new FactoryArma();
		}
		return nFactoryArma;
	}
	
	public ArrayList<Arma> dendaSortu(){
		//TODO
		ArrayList<Arma> denda=new ArrayList<Arma>();
		denda.add(new Radarra(10));
		denda.add(new Bonba(10));
		denda.add(new Misil(10));
		denda.add(new Ezkutua(10));
		denda.add(new MisilIH(10));
		denda.add(new MisilEM(10));
		denda.add(new MisilGurutze(10));
		
		return denda;
	}
	
	public ArrayList<Arma> biltegiaSortu(){
		//TODO
		ArrayList<Arma> biltegi=new ArrayList<Arma>();
		biltegi.add(new Radarra(2));
		biltegi.add(new Bonba(100));
		biltegi.add(new Misil(2));
		biltegi.add(new Ezkutua(2));
		biltegi.add(new MisilIH(2));
		biltegi.add(new MisilEM(2));
		biltegi.add(new MisilGurutze(2));
		
		return biltegi;
	}

}