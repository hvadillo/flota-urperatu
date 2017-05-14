package org.si.flotaurperatu.logic;

import java.util.ArrayList;

import org.si.flotaurperatu.interf2.ArmenPanela;
import org.si.flotaurperatu.interf2.Leihoa2;

public class Denda {
	
	private ArrayList<Arma> armak;
	private static Denda nDenda = null;
	
	private Denda(){
		armak = FactoryArma.getFactoryArma().dendaSortu();
	}
	
	public static Denda getNDenda(){
		if(nDenda == null){
			nDenda = new Denda();
		}
		return nDenda;
	}
	
	public void armaErosi(String pMota){
		int dirua=0;
		if(pMota.equals("radarra")){
			if(armak.get(0).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(0).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(0).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(0).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(0).kopuruaKendu();
					}
				}
			}
		}
		else if (pMota.equals("bonba")){
			if(armak.get(1).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(1).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(1).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(1).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(1).kopuruaKendu();
					}
				}
			}
		}
		else if(pMota.equals("misil")){
			if(armak.get(2).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(2).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(2).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(2).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(2).kopuruaKendu();
					}
				}
			}
		}
		else if(pMota.equals("ezkutua")){
			if(armak.get(3).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(3).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(3).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(3).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(3).kopuruaKendu();
					}
				}
			}
		}
		else if(pMota.equals("misilIH")){
			if(armak.get(4).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(4).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(4).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(4).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(4).kopuruaKendu();
					}
				}
			}
		}
		else if(pMota.equals("misilEM")){
			if(armak.get(5).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(5).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(5).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(5).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(5).kopuruaKendu();
					}
				}
			}
		}
		else{
			if(armak.get(6).getKopurua()>0){
				if(ListaJokalariak.getNireListaJokalariak().txandaKalkulatu()==0){
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
					if(dirua > armak.get(6).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().armaErosi(pMota);
						armak.get(6).kopuruaKendu();
					}
				}
				else{
					dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
					if(dirua > armak.get(6).getKostua()){
						ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getArmak().armaErosi(pMota);
						armak.get(6).kopuruaKendu();
					}
				}
			}
		}
		ArmenPanela.getArmenPanela().ipiniDirua();
	}
	
	public void ontziakKonpondu(int x , int y){
		if (ListaJokalariak.getNireListaJokalariak().txandaKalkulatu() == 0){
			int dirua = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua();
			if(dirua > 350){
				Gelaxka gelaxka = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getIkusi().getGelaxka(x, y);
				if(gelaxka.ontziaKonpondu()){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).diruaKendu(350);
				}
			}else{
				Leihoa2.getLeihoa2().idatzi("Ez duzu diru nahikorik ontzia konpontzeko");
			}
		}else{
			int dirua1 = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getDirua();
			if(dirua1 > 350){
				Gelaxka gelaxka1 = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).getIkusi().getGelaxka(x, y);
				if(gelaxka1.ontziaKonpondu()){
					ListaJokalariak.getNireListaJokalariak().getJokalariak().get(1).diruaKendu(350);
				}
			}
		}
	}
	
	public int getKostua(String pMota){
		if(pMota.equals("radarra")){
			return armak.get(0).getKostua();
		}
		else if (pMota.equals("bonba")){
			return armak.get(1).getKostua();
		}
		else if(pMota.equals("misil")){
			return armak.get(2).getKostua();
		}
		else if(pMota.equals("ezkutua")){
			return armak.get(3).getKostua();
		}
		else if(pMota.equals("misilIH")){
			return armak.get(4).getKostua();
		}
		else if(pMota.equals("misilEM")){
			return armak.get(5).getKostua();
		}
		else{
			return armak.get(6).getKostua();
		}
	}
	public ArrayList<Arma> getArmak(){
		return armak;
	}

}
