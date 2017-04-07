package org.si.flotaurperatu.logic;

import java.util.ArrayList;

public abstract class Ontzia {

	private ArrayList<Gelaxka> posizioak;
	private int luzeera;
	private Ezkutua ezkutua;
	private Boolean urperatuta = false;
	
	public Ontzia(int pLuzeera){
		luzeera = pLuzeera;
		posizioak = new ArrayList<Gelaxka>();
	}
	
	public void tiroaJaso(Arma pArma, Gelaxka pGelaxka){
		if(ezkutua != null){
			if(ezkutua.kolpeaJaso(pArma)==0){
				ezkutua = null;
				for(int i = 0; i < posizioak.size(); i++){
					if(posizioak.get(i).getEgoera()!=Egoera.EMANDA){
						posizioak.get(i).eguneratu(Egoera.ONTZIA);
					}
				}
			}
		}else{
			if(pArma instanceof Misil){
				for(int i = 0; i < posizioak.size(); i++){
					posizioak.get(i).eguneratu(Egoera.EMANDA);
				}
				this.urperatu();
			}else{
				pGelaxka.eguneratu(Egoera.EMANDA);
				boolean urperatu = true;
				int i = 0;
				while(i < posizioak.size() && urperatu == true){
					if(posizioak.get(i).getEgoera()==Egoera.ONTZIA){
						urperatu = false;
					}
				}
				if(urperatu == true){
					this.urperatu();
				}
			}
		}
	}
	
	private void urperatu(){
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
			}	
		}
	}
	public void posizioakEguneratu(int pPos, Gelaxka pGelaxka){
		this.posizioak.add(pPos, pGelaxka);
	}
}
