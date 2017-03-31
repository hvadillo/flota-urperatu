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
		matrizea.set(pZutabe, pErrenkada);
	}
	
	public void ezkutuaJarri(){
		//TODO
	}
	public void konprobatu(int pZutabe, int pErrenkada ){
		boolean kokatu=true;
		if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
			if(OntzienPanela.getOntzienPanela().getMota().equals("Fragata")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
				}else{
					kokatu=false;
				}
			}
			else if(OntzienPanela.getOntzienPanela().getMota().equals("Suntsitzaile")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					pZutabe++;
					if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					}else{
						kokatu=false;
					}
				}
				else{
					kokatu=false;
				}
			}
			else if(OntzienPanela.getOntzienPanela().getMota().equals("Itsaspeko")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					pZutabe++;
					if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
						pZutabe++;
						if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
						}else{
							kokatu=false;
						}
					}else{
						kokatu=false;
					}
				}else{
					kokatu=false;
				}
			}else if(OntzienPanela.getOntzienPanela().getMota().equals("hegazkinontzi")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					pZutabe++;
					if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
						pZutabe++;
						if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
							pZutabe++;
							if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
							}else{
								kokatu=false;
							}
						}else{
							kokatu=false;
						}
					}else{
						kokatu=false;
					}
				}else{
					kokatu=false;
				}
			}
		}
		else{
			if(OntzienPanela.getOntzienPanela().getMota().equals("Fragata")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
				}else{
					kokatu=false;
				}
			}
			else if(OntzienPanela.getOntzienPanela().getMota().equals("Suntsitzaile")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					pErrenkada++;
					if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					}else{
						kokatu=false;
					}
				}
				else{
					kokatu=false;
				}
			}
			else if(OntzienPanela.getOntzienPanela().getMota().equals("Itsaspeko")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					pErrenkada++;
					if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
						pErrenkada++;
						if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
						}else{
							kokatu=false;
						}
					}else{
						kokatu=false;
					}
				}else{
					kokatu=false;
				}
			}else if(OntzienPanela.getOntzienPanela().getMota().equals("hegazkinontzi")){
				if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
					pErrenkada++;
					if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
						pErrenkada++;
						if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
							pErrenkada++;
							if(matrizea.getGelaxka(pZutabe-1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada-1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe-1, pErrenkada+1).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe+1, pErrenkada).getEgoera().equals(Egoera.URA)&&matrizea.getGelaxka(pZutabe, pErrenkada+1).getEgoera().equals(Egoera.URA)){
							}else{
								kokatu=false;
							}
						}else{
							kokatu=false;
						}
					}else{
						kokatu=false;
					}
				}else{
					kokatu=false;
				}
			}
			
		}
	}
	public void konprobatuBarruan(int pZutabe,int pErrenkada){
		boolean barruan;
		if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
			if(OntzienPanela.getOntzienPanela().getMota().equals("Fragata")){
			}
		}
	}
}	

//||(pZutabe-1<0||pErrenkada-1<0)
