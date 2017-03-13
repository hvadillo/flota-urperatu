package org.si.flotaurperatu.logic;

import java.util.Observable;

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

}
