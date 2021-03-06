package org.si.flotaurperatu.logic;

import java.util.Observable;

import org.si.flotaurperatu.interf2.OntzienPanela;

public class TableroIkusi extends Observable{
	
	private MatrizeGelaxka matrizea;
	
	public TableroIkusi(){
		matrizea=new MatrizeGelaxka();
		matrizea.matrizeaHasieratu();
	}
	
	public void tiroaJaso(){
		//TODO
	}
	
	public void kokatu(int pZutabe, int pErrenkada){
		if(konprobatuKasila(pZutabe,pErrenkada)){
			matrizea.set(pZutabe, pErrenkada);
		}
	}
	
	public Gelaxka getGelaxka(int pZutabe, int pErrenkada){
		return this.matrizea.getGelaxka(pZutabe, pErrenkada);
	}
	
	public void ezkutuaJarri(){
		//TODO
	}
	public boolean konprobatu(int pZutabe, int pErrenkada, String pMota, String pNorabidea ){
		boolean kokatu = false;
		boolean ontzia = false;
		if(konprobatuBarruan(pZutabe, pErrenkada, pMota, pNorabidea)){
			if(pNorabidea.equals("Horizontal")){
				if(pMota.equals("Fragata")){
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+1) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+1) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}else if(pMota.equals("Suntsitzaile")){
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+2) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+1) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}else if(pMota.equals("Itsaspeko")){
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+3) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+1) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}else{
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+4) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+1) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}	
			}else{
				if(pMota.equals("Fragata")){
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+1) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+1) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}else if(pMota.equals("Suntsitzaile")){
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+1) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+2) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}else if(pMota.equals("Itsaspeko")){
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+1) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+3) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}else{
					int i = pZutabe-1;
					int j = pErrenkada-1;
					while((i <= pZutabe+1) && !ontzia){
						j = pErrenkada-1;
						while((j <= pErrenkada+4) && !ontzia){
							if(konprobatuKasila(i, j)){
								if(!matrizea.getGelaxka(i, j).getEgoera().equals(Egoera.URA)){
									ontzia = true;
								}
							}
							j++;
						}
						i++;
					}
				}
			}
			if(!ontzia){
				kokatu = true;
			}
		}
		return kokatu;
	}
	
	public boolean konprobatuKasila(int pZut, int pErr){
		boolean barruan = false;
		if((pZut >= 0 && pZut <= 9) && (pErr >= 0 && pErr <= 9 )){ 
			barruan = true;
		}
		return barruan;
	}
		
	private boolean konprobatuBarruan(int pZutabe,int pErrenkada, String pMota, String pNorabidea){
		boolean barruan = false;
		if(pNorabidea.equals("Horizontal")){
			if(pMota.equals("Fragata")){
				barruan = true;
			}else if(pMota.equals("Suntsitzaile")){
				if(pZutabe <= 8){
					barruan = true;
				}
			}else if(pMota.equals("Itsaspeko")){
				if(pZutabe <= 7){
					barruan = true;
				}
			}else{
				if(pZutabe <= 6){
					barruan = true;
				}
			}
		}else{
			if(pMota.equals("Fragata")){
				barruan = true;
			}else if(pMota.equals("Suntsitzaile")){
				if(pErrenkada <= 8){
					barruan = true;
				}
			}else if(pMota.equals("Itsaspeko")){
				if(pErrenkada <= 7){
					barruan = true;
				}
			}else{
				if(pErrenkada <= 6){
					barruan = true;
				}
			}
		}
		return barruan;
	}
	
}	