package org.si.flotaurperatu.logic;

import java.util.ArrayList;
import java.util.Observable;

import org.si.flotaurperatu.interf2.Leihoa2;

public abstract class Ontzia extends Observable{

	private ArrayList<Gelaxka> posizioak;
	private int luzeera;
	private Ezkutua ezkutua;
	private Boolean urperatuta;
	
	public Ontzia(int pLuzeera){
		addObserver(Leihoa2.getLeihoa2());
		luzeera = pLuzeera;
		posizioak = new ArrayList<Gelaxka>();
		ezkutua = null;
		urperatuta = false;
	}
	
	public void tiroaJaso(Arma pArma, Gelaxka pGelaxka){
		int txanda = ListaJokalariak.getNireListaJokalariak().txandaKalkulatu();
		if(ezkutua != null){
			if(ezkutua.kolpeaJaso(pArma)==0){
				ezkutua = null;
				if(txanda==1){
					for(int i = 0; i <= (posizioak.size()-1); i++){
						if(posizioak.get(i).getEgoera()!=Egoera.EMANDA){
							posizioak.get(i).eguneratu(Egoera.ONTZIA);
							iconoAldatu("ezkutuaEmanda", posizioak.get(i).getX(), posizioak.get(i).getY(), 2);
						}
					}				
				}else{
					iconoAldatu("ezkutuaEmanda", pGelaxka.getX(), pGelaxka.getY(), 1);
					for(int j = 0; j <= (posizioak.size()-1); j++){
						if(posizioak.get(j).getEgoera()!=Egoera.EMANDA){
							posizioak.get(j).eguneratu(Egoera.ONTZIA);
						}
					}
				}
			}else{
				if(txanda==1){
					for(int j = 0; j <= (posizioak.size()-1); j++){
						iconoAldatu("ezkutuaErdiEmanda", posizioak.get(j).getX(), posizioak.get(j).getY(), 2);
					}
				}else{
					iconoAldatu("ezkutuaErdiEmanda", pGelaxka.getX(), pGelaxka.getY(), 1);
				}
			}
		}else{
			boolean urperatu = true;
			if(pArma instanceof Misil){
				for(int i = 0; i <= (posizioak.size()-1); i++){
					posizioak.get(i).eguneratu(Egoera.EMANDA);
					if(txanda==0){
						iconoAldatu("emanda", posizioak.get(i).getX(), posizioak.get(i).getY(), 1);
					}
					else{
						iconoAldatu("emanda", posizioak.get(i).getX(), posizioak.get(i).getY(), 2);
					}
				}
				this.urperatu();
			}else{
				pGelaxka.eguneratu(Egoera.EMANDA);
				if(txanda==0){
					iconoAldatu("emanda", pGelaxka.getX(), pGelaxka.getY(), 1);
				}else{
					iconoAldatu("emanda", pGelaxka.getX(), pGelaxka.getY(), 2);
				}
				int i = 0;
				while(i <= (posizioak.size()-1) && urperatu == true){
					if(posizioak.get(i).getEgoera()==Egoera.ONTZIA){
						urperatu = false;
					}
					i++;
				}
			}
			if(urperatu == true){
				this.urperatu();
				Jokalaria etsaia;
				if(txanda==0){
					etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1);
				}else{
					etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
				}
				for(int j = 0; j <= (posizioak.size()-1); j++){
					int x;
					int y;
					int x1;
					int y1;
					x=posizioak.get(j).getX();
					y=posizioak.get(j).getY();
					for( int k = 0; k < 8; k++){
						if (k==0){
							x1=x;
							y1=y-1;
						}else if(k==1){
							x1=x+1;
							y1=y-1;
						}else if(k==2){
							x1=x+1;
							y1=y;
						}else if(k==3){
							x1=x+1;
							y1=y+1;
						}else if(k==4){
							x1=x;
							y1=y+1;
						}else if(k==5){
							x1=x-1;
							y1=y+1;
						}else if(k==6){
							x1=x-1;
							y1=y;
						}else {
							x1=x-1;
							y1=y-1;
						}
						if(etsaia.getIkusi().konprobatuKasila(x1, y1)){
							if(etsaia.getIkusi().getGelaxka(x1, y1).getEgoera().equals(Egoera.URA)){
								etsaia.getIkusi().getGelaxka(x1, y1).eguneratu(Egoera.MISS);
								if(txanda==0){
									iconoAldatu("miss", x1, y1, 1);
								}else{
									iconoAldatu("miss", x1, y1, 2);
								}
							}	
						}
					}
				}
			}
		}
	}
	
	public void urperatu(){
		urperatuta = true;
	}
	
	public Boolean urperatutaDago(){
		return urperatuta;
	}
	
	
	public void kokatu(){
		//TODO
	}
	
	public void ezkutuaJarri(Ezkutua pEzkutua){
		this.ezkutua = pEzkutua;
		for(int i = 0; i < posizioak.size(); i++){
			if(posizioak.get(i).getEgoera()!=Egoera.EMANDA){
				posizioak.get(i).eguneratu(Egoera.EZKUTUA);
				int txanda=ListaJokalariak.getNireListaJokalariak().txandaKalkulatu();
				if(txanda==0){
					iconoAldatu("ezkutua", posizioak.get(i).getX(), posizioak.get(i).getY(), 2);
				}
			}	
		}
	}
	
	public void posizioakEguneratu(int pPos, Gelaxka pGelaxka){
		this.posizioak.add(pPos, pGelaxka);
	}
	
	public ArrayList<Gelaxka> getPosizioak(){
		return posizioak;
	}
	
	public boolean ezkutuaDauka(){
		boolean dauka = false;
		if(ezkutua!=null){
			dauka = true;
		}
		return dauka;
	}
	
	private void iconoAldatu(String egoera, int pX,int pY, int matrizea){
		Object[] n = {egoera, pX, pY, matrizea};
		setChanged();
		notifyObservers(n);
	}
	
}