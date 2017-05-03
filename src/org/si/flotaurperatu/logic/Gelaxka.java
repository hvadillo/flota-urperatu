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
	
	public Egoera getEgoera(){
		return e;
	}
	public void ontziaEguneratu(Ontzia pOntzia){
		this.o=pOntzia;
	}
	public void eraso(Arma pArma){
		if(o==null && e.equals(Egoera.URA)){
			Leihoa2.getLeihoa2().getMatrize1().iconoAldatu("miss", this.x, this.y);
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
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
