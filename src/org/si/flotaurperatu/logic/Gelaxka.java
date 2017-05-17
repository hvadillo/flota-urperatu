package org.si.flotaurperatu.logic;

import java.util.Observable;
import java.util.Observer;

import org.si.flotaurperatu.interf2.KasilenPanela2;
import org.si.flotaurperatu.interf2.Leihoa2;

public class Gelaxka extends Observable{

	private int x;
	private int y;
	private Egoera e;
	private Ontzia o;
	
	public Gelaxka(int pX, int pY){
		addObserver(Leihoa2.getLeihoa2());
		x = pX;
		y = pY;	
		e = Egoera.URA;
		o=null;
		
	}
	
	public void eguneratu(Egoera pEgo){
		e=pEgo;
	}
	
	public Ontzia getOntzia(){
		return o;
	}
	
	public Egoera getEgoera(){
		return e;
	}
	
	public void ontziaEguneratu(Ontzia pOntzia){
		this.o=pOntzia;
	}
	
	public void eraso(Arma pArma){
		if(o==null && e.equals(Egoera.URA)){
			if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
				eguneratuIrudia("miss", this.x, this.y, 1);
			}else{
				eguneratuIrudia("miss", this.x, this.y, 2);
			}
			this.eguneratu(Egoera.MISS);
		}else if(e.equals(Egoera.EMANDA) || e.equals(Egoera.MISS)){
		
		}else{
			o.tiroaJaso(pArma, this);
		}
	}
	
	public void ezkutuaJarri(Ezkutua pEzkutua){
		if(o!=null){
			o.ezkutuaJarri(pEzkutua);
		}else{
			idatzi("Ez dago ontzirik posizio horretan.");
		}
	}
	
	public boolean ontziaKonpondu(){
		boolean konpondu = false;
		if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
			if(o!=null && !o.urperatutaDago()){
				if(e.equals(Egoera.EMANDA)){
					eguneratu(Egoera.ONTZIA);
					eguneratuIrudia("ontzia", this.x, this.y, 2);
					konpondu = true;
				}else{
					idatzi("Posizio hori ez dago emanda.");
				}
			}else{
				idatzi("Ontzia urperatuta dago jada");
				idatzi("edo ez dago ontzirik.");
			}
		}else{
			if(o!=null && !o.urperatutaDago()){
				if(e.equals(Egoera.EMANDA)){
					eguneratu(Egoera.ONTZIA);
					eguneratuIrudia("ura", this.x, this.y, 1);
					konpondu = true;
				}
			}
		}
		return konpondu;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	private void eguneratuIrudia(String egoera, int pX,int pY, int matrizea){
		Object[] n = {egoera, pX, pY, matrizea};
		setChanged();
		notifyObservers(n);
	}
	
	private void idatzi(String textua){
		String n = textua;
		setChanged();
		notifyObservers(n);
	}
	
}