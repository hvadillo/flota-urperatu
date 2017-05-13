package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;

public class Gelaxka {

	private int x;
	private int y;
	private Egoera e;
	private Ontzia o;
	
	public Gelaxka(int pX, int pY){
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
				Leihoa2.getLeihoa2().getMatrize1().iconoAldatu("miss", this.x, this.y);
			}
			else{
				Leihoa2.getLeihoa2().getMatrize2().iconoAldatu("miss", this.x, this.y);
			}
			this.eguneratu(Egoera.MISS);
		}
		else if(e.equals(Egoera.EMANDA) || e.equals(Egoera.MISS)){
		
		}
		else{
				o.tiroaJaso(pArma, this);
		}
	}
	public void ezkutuaJarri(Ezkutua pEzkutua){
		if(o!=null){
			o.ezkutuaJarri(pEzkutua);
		}
		else{
			System.out.println(" Ez dago ontzirik posizio horretan. ");
		}
	}
	public boolean ontziaKonpondu(){
		boolean konpondu = false;
		if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
			if(o!=null && !o.urperatutaDago()){
				if(e.equals(Egoera.EMANDA)){
					eguneratu(Egoera.ONTZIA);
					Leihoa2.getLeihoa2().getMatrize2().iconoAldatu("ontzia", this.x, this.y);
					konpondu = true;
				}else{
					Leihoa2.getLeihoa2().idatzi("Posizio hori ez dago emanda.");
				}
			}else{
				Leihoa2.getLeihoa2().idatzi("Ontzia urperatuta dago jada");
				Leihoa2.getLeihoa2().idatzi("edo ez dago ontzirik.");
			}
		}else{
			if(o!=null && !o.urperatutaDago()){
				if(e.equals(Egoera.EMANDA)){
					eguneratu(Egoera.ONTZIA);
					Leihoa2.getLeihoa2().getMatrize1().iconoAldatu("ontzia", this.x, this.y);
					konpondu = true;
				}else{
					Leihoa2.getLeihoa2().idatzi("Posizio hori ez dago emanda.");
				}
			}else{
				Leihoa2.getLeihoa2().idatzi("Ontzia urperatuta dago jada");
				Leihoa2.getLeihoa2().idatzi("edo ez dago ontzirik.");
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
}
