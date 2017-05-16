package org.si.flotaurperatu.logic;

import java.util.Observable;

public class TableroEraso extends Observable{

	private MatrizeGelaxka matrizea;
	
	public TableroEraso(){
		matrizea=new MatrizeGelaxka();
		matrizea.matrizeaHasieratu();
	}
	
	public void eraso(){
		//TODO
	}
	public Gelaxka getGelaxka(int pZutabe, int pErrenkada){
		return this.matrizea.getGelaxka(pZutabe, pErrenkada);
	}
	
}