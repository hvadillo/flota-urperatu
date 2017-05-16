package org.si.flotaurperatu.logic;

import java.util.ArrayList;

import org.si.flotaurperatu.interf2.Leihoa2;

public class ListaJokalariak {
	
	private ArrayList<Jokalaria> listaJok;
	private int txanda;
	private boolean bukatu=false;
	private static ListaJokalariak nListaJokalariak = null;
	
	private ListaJokalariak(){
		listaJok=new ArrayList<Jokalaria>();
		listaJok.add(new Erabiltzailea());
		listaJok.add(new Ordenagailua());
		txanda =0;
	}
	
	public static synchronized ListaJokalariak getNireListaJokalariak(){
		if (nListaJokalariak==null){
			nListaJokalariak=new ListaJokalariak();
		}
		return nListaJokalariak;
	}
	

	public int txandaKalkulatu(){
		return txanda % 2;
	}
	
	public void txandaEguneratu(){
		txanda++;
	}

	public void bukatu(){
		if(txandaKalkulatu()==1){
			bukatu=listaJok.get(0).getFlota().denakUrperaturik();
		}else{
			bukatu=listaJok.get(1).getFlota().denakUrperaturik();
		}
		if(bukatu){
			Leihoa2.getLeihoa2().getMatrize1().kenduListener();
			Leihoa2.getLeihoa2().getMatrize2().kenduListener();
			Leihoa2.getLeihoa2().amaiera(txandaKalkulatu());
		}
		txandaEguneratu();
	}

	public void hasieratu(){
		((Ordenagailua) listaJok.get(1)).ontziakIpini();
	}
	
	public ArrayList<Jokalaria> getJokalariak(){
		return listaJok;
	}
	
}