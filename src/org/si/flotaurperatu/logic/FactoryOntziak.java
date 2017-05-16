package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class FactoryOntziak {

	private static FactoryOntziak nFactoryOntziak = null;
	
	private FactoryOntziak(){
		
	}
	
	public static FactoryOntziak getFactoryOntziak(){
		if(nFactoryOntziak==null){
			nFactoryOntziak = new FactoryOntziak();
		}
		return nFactoryOntziak;
	}
	
	public ArrayList<Ontzia> flotaSortu(){
		ArrayList<Ontzia> flota = new ArrayList<Ontzia>();
		HegazkinOntzi hegazkinOntzi = new HegazkinOntzi();
		flota.add(0,hegazkinOntzi);
		Itsaspeko itsaspeko1 = new Itsaspeko();
		flota.add(1,itsaspeko1);
		Itsaspeko itsaspeko2 = new Itsaspeko();
		flota.add(2,itsaspeko2);
		Suntzitzaile suntsitzaile1 = new Suntzitzaile();
		flota.add(3,suntsitzaile1);
		Suntzitzaile suntsitzaile2 = new Suntzitzaile();
		flota.add(4,suntsitzaile2);
		Suntzitzaile suntsitzaile3 = new Suntzitzaile();
		flota.add(5,suntsitzaile3);
		Fragata fragata1 = new Fragata();
		flota.add(6,fragata1);
		Fragata fragata2 = new Fragata();
		flota.add(7,fragata2);
		Fragata fragata3 = new Fragata();
		flota.add(8,fragata3);
		Fragata fragata4 = new Fragata();
		flota.add(9,fragata4);
		return flota;
	}
}