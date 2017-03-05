package org.si.flotaurperatu.logic;

public class FactoryOntziak {

	private static FactoryOntziak nFactoryOntziak = null;
	
	private FactoryOntziak(){
		nFactoryOntziak = getFactoryOntziak();
	}
	
	public static FactoryOntziak getFactoryOntziak(){
		if(nFactoryOntziak==null){
			nFactoryOntziak = new FactoryOntziak();
		}
		return nFactoryOntziak;
	}
	
	public Kolekzioa<Ontzia> flotaSortu(){
		flota = new Kolekzioa<Ontzia>();
		HegazkinOntzi hegazkinOntzi = new HegazkinOntzi();
		flota.add(hegazkinOntzi);
		Itsaspeko itsaspeko1 = new Itsaspeko();
		flota.add(itsaspeko1);
		Itsaspeko itsaspeko2 = new Itsaspeko();
		flota.add(itsaspeko2);
		Suntzitzaile suntsitzaile1 = new Suntzitzaile();
		flota.add(suntsitzaile1);
		Suntzitzaile suntsitzaile2 = new Suntzitzaile();
		flota.add(suntsitzaile2);
		Suntzitzaile suntsitzaile3 = new Suntzitzaile();
		flota.add(suntsitzaile3);
		Fragata fragata1 = new Fragata();
		flota.add(fragata1);
		Fragata fragata2 = new Fragata();
		flota.add(fragata2);
		Fragata fragata3 = new Fragata();
		flota.add(fragata3);
		Fragata fragata4 = new Fragata();
		flota.add(fragata4);
		return flota;
	}
}
