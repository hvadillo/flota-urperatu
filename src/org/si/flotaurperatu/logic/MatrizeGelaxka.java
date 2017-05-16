package org.si.flotaurperatu.logic;

public class MatrizeGelaxka {

	private Gelaxka[][] matrizea;
	
	public MatrizeGelaxka(){
		matrizea = new Gelaxka[10][10];
	}
	
	public void matrizeaHasieratu(){
		int kont1 = 0;
		int kont2;
		while(kont1 <= 9){
			kont2 = 0;
			while(kont2 <= 9){
				matrizea[kont1][kont2]=new Gelaxka(kont1,kont2);
				kont2++;
			}
			kont1++;
		}
	}
	
	public void set(int pZutabe,int pErrenkada){	
		matrizea[pZutabe][pErrenkada].eguneratu(Egoera.ONTZIA);
	}
	
	public Gelaxka getGelaxka(int pZutabe,int pErrenkada){
		Gelaxka gelaxka1 = null;
		if((pZutabe >= 0 && pZutabe <= 9) && (pErrenkada >= 0 && pErrenkada <= 9 )){
			gelaxka1 = matrizea[pZutabe][pErrenkada];
		}
		return gelaxka1;
	}
	
}