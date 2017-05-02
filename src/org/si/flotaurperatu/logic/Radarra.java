package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;

public class Radarra extends Arma {
	
	private int kontsultaKop;
	
	public Radarra(int pKop){
		super ("Radarra",5,pKop);
		kontsultaKop = 4;
	}

	@Override
	public void erabili(int pZutabe, int pErrenkada) {
		// TODO Auto-generated method stub
		int txanda;
		Jokalaria etsaia;
		Gelaxka g;
		int kont=0;
		boolean aurkitua=false;
		txanda=ListaJokalariak.getNireListaJokalariak().txandaKalkulatu();
		if(kopurua==0 && kontsultaKop==0){
			System.out.println(" Ez daukazu kontsultarik radarra erabiltzeko. ");
			Leihoa2.getLeihoa2().idatzi().setText(" Ez daukazu kontsultarik radarra erabiltzeko. ");
		}
		else{
			if(txanda==0){
				etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1);
			}
			else{
				etsaia=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
			}
			while(kont<13&&!aurkitua){
				if(kont==0){
					g=etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada);
					if(g.getEgoera().equals(Egoera.ONTZIA)){//0
						aurkitua=true;
						System.out.println("Ontzi bat dago "+(pZutabe+1)+" zutabean eta "+(pErrenkada+1)+" errenkadan." );
						Leihoa2.getLeihoa2().idatzi().setText("Ontzi bat dago "+(pZutabe+1)+" zutabean eta "+(pErrenkada+1)+" errenkadan." );
					}
					else{
						kont++;
					}
				}
				else if(kont==1){//1
					if(etsaia.getIkusi().konprobatuKasila(pZutabe, pErrenkada-1)){
						g=etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada-1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+1)+" zutabean eta "+pErrenkada+" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==2){//2
					if(etsaia.getIkusi().konprobatuKasila(pZutabe, pErrenkada-2)){
						g=etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada-2);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+1)+" zutabean eta "+ (pErrenkada-1) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==3){//3
					if(etsaia.getIkusi().konprobatuKasila((pZutabe+1), pErrenkada-1)){
						g=etsaia.getIkusi().getGelaxka((pZutabe+1), pErrenkada-1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+2)+" zutabean eta "+ pErrenkada +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==4){//4
					if(etsaia.getIkusi().konprobatuKasila((pZutabe+1), pErrenkada)){
						g=etsaia.getIkusi().getGelaxka((pZutabe+1), pErrenkada);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+2)+" zutabean eta "+ (pErrenkada+1) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==5){//5
					if(etsaia.getIkusi().konprobatuKasila(pZutabe+2, pErrenkada)){
						g=etsaia.getIkusi().getGelaxka(pZutabe+2, pErrenkada);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+3)+" zutabean eta "+ (pErrenkada+1) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==6){//6
					if(etsaia.getIkusi().konprobatuKasila((pZutabe+1), pErrenkada+1)){
						g=etsaia.getIkusi().getGelaxka((pZutabe+1), pErrenkada+1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+2)+" zutabean eta "+ (pErrenkada+2) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==7){//7
					if(etsaia.getIkusi().konprobatuKasila(pZutabe, pErrenkada+1)){
						g=etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada+1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+1)+" zutabean eta "+ (pErrenkada+2) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==8){//8
					if(etsaia.getIkusi().konprobatuKasila(pZutabe, pErrenkada+2)){
						g=etsaia.getIkusi().getGelaxka(pZutabe, pErrenkada+2);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe+1)+" zutabean eta "+ (pErrenkada+3) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==9){//9
					if(etsaia.getIkusi().konprobatuKasila(pZutabe-1, pErrenkada+1)){
						g=etsaia.getIkusi().getGelaxka(pZutabe-1, pErrenkada+1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+pZutabe+" zutabean eta "+ (pErrenkada+2) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==10){//10
					if(etsaia.getIkusi().konprobatuKasila(pZutabe-1, pErrenkada)){
						g=etsaia.getIkusi().getGelaxka(pZutabe-1, pErrenkada);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+pZutabe+" zutabean eta "+ (pErrenkada+1) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==11){//11
					if(etsaia.getIkusi().konprobatuKasila(pZutabe-2, pErrenkada)){
						g=etsaia.getIkusi().getGelaxka(pZutabe-2, pErrenkada-1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+(pZutabe-1)+" zutabean eta "+ (pErrenkada+1) +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
				else if(kont==12){//12
					if(etsaia.getIkusi().konprobatuKasila(pZutabe-1, pErrenkada-1)){
						g=etsaia.getIkusi().getGelaxka(pZutabe-1, pErrenkada-1);
						if(g.getEgoera().equals(Egoera.ONTZIA)){
							aurkitua=true;
							System.out.println("Ontzi bat dago "+pZutabe+" zutabean eta "+ pErrenkada +" errenkadan." );
						}
						else{
							kont++;
						}
					}
					else{
						kont++;
					}
				}
			}
			if(!aurkitua){
				System.out.println(" Ez da ontzirik aurkitu. ");
			}
			kontsultaKop--;
			if(kontsultaKop==0){
				if(kopurua>0){
					kopuruaKendu();
					kontsultaKop=4;
				}
			}
		}
	}

}
