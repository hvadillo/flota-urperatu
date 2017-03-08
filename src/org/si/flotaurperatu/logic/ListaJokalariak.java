package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public class ListaJokalariak {
	private ArrayList<Jokalaria> listaJok;
	private int txanda;
	private boolean bukatu=false;
	
public ListaJokalariak(){
	listaJok=new ArrayList<Jokalaria>();
	listaJok.add(new Erabiltzailea());
	listaJok.add(new Ordenagailua());
	txanda =0;
}
public int txandaKalkulatu(){
	return txanda % 2;
}

public void txandaBurutu(){

	
	while (!bukatu){
		listaJok.get(txandaKalkulatu()).txandaBurutu();
		//
	}
}
public void hasieratu(){
	listaJok.get(0).ontziakIpini();
	listaJok.get(1).ontziakIpini();
}

}
