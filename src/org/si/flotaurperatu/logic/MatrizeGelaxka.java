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
}
