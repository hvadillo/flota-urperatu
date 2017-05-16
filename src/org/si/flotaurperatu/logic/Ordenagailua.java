package org.si.flotaurperatu.logic;

import java.util.ArrayList;
import java.util.Iterator;

import org.si.flotaurperatu.interf2.OntzienPanela;

public class Ordenagailua extends Jokalaria{
	
	int txanda, radarX, radarY;
	
	public Ordenagailua(){
		super();
		txanda = 0;
		radarX = 5;
		radarY = 5;
	}

	public void txandaBurutu() {
		int zut=0;
		int err=0;
		boolean lekuona = false;
		while(!lekuona){
			zut = (int) (Math.random() * 9);
			err = (int) (Math.random() * 9);
			Egoera ego = ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getIkusi().getGelaxka(zut, err).getEgoera();
			if(ego.equals(Egoera.EZKUTUA)||ego.equals(Egoera.ONTZIA)||ego.equals(Egoera.URA)){
				lekuona=true;
			}
		}
		int tiro = (int) (Math.random() * 3);
		String arma = "Bonba";
		if(tiro == 0){
			arma = "Bonba";
		}else if(tiro == 1){
			arma = "MisilIH";
		}else if(tiro == 2){
			arma = "MisilEM";
		}else{
			arma = "MisilGurutze";
		}
		if(txanda==0){
			int ont = (int) (Math.random() * 9);
			Ontzia ontzia = flota.getOntzia(ont);
			ArrayList<Gelaxka> posizioak = ontzia.getPosizioak();
			this.ezkutuaJarri(posizioak.get(0).getX(),posizioak.get(0).getY());
			if(arma.equals("Bonba")){
				this.bonbaErabili(zut, err);
			}else if(arma.equals("MisilIH")){
				this.misilIHErabili(zut, err);
			}else if(arma.equals("MisilEM")){
				this.misilEMErabili(zut, err);
			}else{
				this.misilGurutzeErabili(zut, err);
			}
		}else{
			int zeregin = (int) (Math.random() * 4);
			if(zeregin == 0){
				erosi();
			}else if(zeregin == 1){
				konpondu();
			}else if(zeregin == 2){
				this.radarraErabili(zut, err);
				zut = radarX;
				err = radarY;
			}else if(zeregin == 3){
				int i=0;
				boolean aurkitua = false;
				Ontzia ontzi;
				while(!aurkitua && i<10){
					ontzi = flota.getOntzia(i);
					if(!ontzi.urperatutaDago()&&!ontzi.ezkutuaDauka()){
						aurkitua=true;
						armak.armaErabili("Ezkutua", ontzi.getPosizioak().get(0).getX(), ontzi.getPosizioak().get(0).getY());
					}else{
						i++;
					}
				}
			}else{
				armak.armaErabili(arma, zut, err);
			}
			if((zeregin == 0)||(zeregin == 1)||(zeregin == 2)||(zeregin == 3)){
				armak.armaErabili(arma, zut, err);
			}
		}
		txanda++;
	}
	
	public void ontziakIpini() {
		int zutabe;
		int errenkada;
		double norabidea;
		Ontzia ontz;
		boolean barruan;
		String norabide;
		String mota;
		norabide="Horizontal";
		mota = "Fragata";
		for(int i=0; i <= 3; i++){//Fragatak kokatzeko
			barruan=false;
			if (i==0){
				ontz=flota.getOntzia(6);
			}
			else if(i==1){
				ontz=flota.getOntzia(7);
			}
			else if(i==2){
				ontz=flota.getOntzia(8);
			}
			else{ontz=flota.getOntzia(9);}
			while(!barruan){
				zutabe = (int) (Math.random() * 9);
				errenkada = (int) (Math.random() * 9);
				if(tableroIkusi.konprobatu(zutabe, errenkada, mota, norabide)){
					barruan = true;
					//Ontzia logikan sartu
					tableroIkusi.kokatu(zutabe,errenkada);
					ontz.posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
					tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
				}
			}
		}
		mota = "Suntsitzaile";
		for(int i=0; i <= 2; i++){//Suntsitzaileak kokatzeko
			barruan = false;
			if (i==0){
				ontz=flota.getOntzia(3);
			}
			else if(i==1){
				ontz=flota.getOntzia(4);
			}
			else{ontz=flota.getOntzia(5);}
			
			while(!barruan){
				norabidea = Math.random()*1;
				if(norabidea<=0.5){
					norabide="Horizontal";
				}else{
					norabide="Bertikal";
				}
				zutabe = (int) (Math.random() * 9);
				errenkada = (int) (Math.random() * 9);
				if(tableroIkusi.konprobatu(zutabe, errenkada, mota, norabide)){
					barruan = true;
					//Ontzia logikan sartu
					if(norabide.equals("Horizontal")){
						
						tableroIkusi.kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
						tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						
						tableroIkusi.kokatu(zutabe+1,errenkada);
						ontz.posizioakEguneratu(1,tableroIkusi.getGelaxka(zutabe+1, errenkada));
						tableroIkusi.getGelaxka(zutabe+1, errenkada).ontziaEguneratu(ontz);
						
					}else{
						
						tableroIkusi.kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
						tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						
						tableroIkusi.kokatu(zutabe,errenkada+1);
						ontz.posizioakEguneratu(1,tableroIkusi.getGelaxka(zutabe, errenkada+1));
						tableroIkusi.getGelaxka(zutabe, errenkada+1).ontziaEguneratu(ontz);
						
					}
				}
			}
		}
		mota = "Itsaspeko";
		for(int i=0; i <= 1; i++){
			barruan = false;
			if (i==0){
				ontz=flota.getOntzia(1);
			}
			else{ontz=flota.getOntzia(2);}
			
			while(!barruan){
				norabidea =Math.random() * 1;
				if(norabidea<=0.5){
					norabide="Horizontal";
				}else{
					norabide="Bertikal";
				}
				zutabe = (int) (Math.random() * 9);
				errenkada = (int) (Math.random() * 9);
				if(tableroIkusi.konprobatu(zutabe, errenkada, mota, norabide)){
					barruan = true;
					//Ontzia logikan sartu
					if(norabide.equals("Horizontal")){
						
						
						tableroIkusi.kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0, tableroIkusi.getGelaxka(zutabe, errenkada));
						tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
					
						tableroIkusi.kokatu(zutabe+1,errenkada);
						ontz.posizioakEguneratu(1,tableroIkusi.getGelaxka(zutabe+1, errenkada));
						tableroIkusi.getGelaxka(zutabe+1, errenkada).ontziaEguneratu(ontz);
						
						
						tableroIkusi.kokatu(zutabe+2,errenkada);
						ontz.posizioakEguneratu(2,tableroIkusi.getGelaxka(zutabe+2, errenkada));
						tableroIkusi.getGelaxka(zutabe+2, errenkada).ontziaEguneratu(ontz);
						
						
					}
					else{
						
						tableroIkusi.kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
						tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
					
						tableroIkusi.kokatu(zutabe,errenkada+1);
						ontz.posizioakEguneratu(1,tableroIkusi.getGelaxka(zutabe, errenkada+1));
						tableroIkusi.getGelaxka(zutabe, errenkada+1).ontziaEguneratu(ontz);
						
						
						tableroIkusi.kokatu(zutabe,errenkada+2);
						ontz.posizioakEguneratu(2,tableroIkusi.getGelaxka(zutabe, errenkada+2));
						tableroIkusi.getGelaxka(zutabe, errenkada+2).ontziaEguneratu(ontz);
						
					}
				}
			}
		}
		mota = "HegazkinOntzi";
		ontz=flota.getOntzia(0);
		barruan=false;
		while(!barruan){
			norabidea =Math.random() * 1;
			if(norabidea<=0.5){
				norabide="Horizontal";
			}else{
				norabide="Bertikal";
			}
			zutabe = (int) (Math.random() * 9);
			errenkada = (int) (Math.random() * 9);
			if(tableroIkusi.konprobatu(zutabe, errenkada, mota, norabide)){
				barruan = true;
				//Ontzia logikan sartu
				if(norabide.equals("Horizontal")){
					
					tableroIkusi.kokatu(zutabe,errenkada);
					flota.getOntzia(0).posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
					tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(flota.getOntzia(0));
					
					
					tableroIkusi.kokatu(zutabe+1,errenkada);
					flota.getOntzia(0).posizioakEguneratu(1,tableroIkusi.getGelaxka(zutabe+1, errenkada));
					tableroIkusi.getGelaxka(zutabe+1, errenkada).ontziaEguneratu(flota.getOntzia(0));
					
					
					tableroIkusi.kokatu(zutabe+2,errenkada);
					flota.getOntzia(0).posizioakEguneratu(2,tableroIkusi.getGelaxka(zutabe+2, errenkada));
					tableroIkusi.getGelaxka(zutabe+2, errenkada).ontziaEguneratu(flota.getOntzia(0));
					
					
					tableroIkusi.kokatu(zutabe+3,errenkada);
					flota.getOntzia(0).posizioakEguneratu(3,tableroIkusi.getGelaxka(zutabe+3, errenkada));
					tableroIkusi.getGelaxka(zutabe+3, errenkada).ontziaEguneratu(flota.getOntzia(0));
					
					
					
				}else{
					
					tableroIkusi.kokatu(zutabe,errenkada);
					flota.getOntzia(0).posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
					tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(flota.getOntzia(0));
					
					
					tableroIkusi.kokatu(zutabe,errenkada+1);
					flota.getOntzia(0).posizioakEguneratu(1,tableroIkusi.getGelaxka(zutabe, errenkada+1));
					tableroIkusi.getGelaxka(zutabe, errenkada+1).ontziaEguneratu(flota.getOntzia(0));
					
					
					tableroIkusi.kokatu(zutabe,errenkada+2);
					flota.getOntzia(0).posizioakEguneratu(2,tableroIkusi.getGelaxka(zutabe, errenkada+2));
					tableroIkusi.getGelaxka(zutabe, errenkada+2).ontziaEguneratu(flota.getOntzia(0));
					
					
					tableroIkusi.kokatu(zutabe,errenkada+3);
					flota.getOntzia(0).posizioakEguneratu(3,tableroIkusi.getGelaxka(zutabe, errenkada+3));
					tableroIkusi.getGelaxka(zutabe, errenkada+3).ontziaEguneratu(flota.getOntzia(0));
				}
			}
		}
	}
	
	public void setRadarXY(int x, int y){
		radarX = x;
		radarY = y;
	}
	
	@Override
	public void radarraErabili(int pZutabe, int pErrenkada) {
		armak.armaErabili("Radarra", pZutabe, pErrenkada);
	}
	
	private void erosi(){
	int	arma =(int) (Math.random() * 6);
	if (arma==0){
		Denda.getNDenda().armaErosi("radarra");
	}
	else if(arma==1){
		Denda.getNDenda().armaErosi("bonba");
	}
	else if(arma==2){
		Denda.getNDenda().armaErosi("misil");
		}
	else if(arma==3){
		Denda.getNDenda().armaErosi("ezkutua");
	}
	else if(arma==4){
		Denda.getNDenda().armaErosi("misilIH");
	}
	else if(arma==5){
		Denda.getNDenda().armaErosi("misilEM");
	}
	else{
		Denda.getNDenda().armaErosi("misilGurutze");
	}
	}
	
	private void konpondu(){
		int i=0;
		boolean aurkitua = false;
		Ontzia ontzi;
		Gelaxka g;
		while(i<10&&!aurkitua){
			ontzi = flota.getOntzia(i);
			if(!ontzi.urperatutaDago()){
				int j=0;
				while(j<ontzi.getPosizioak().size()&&!aurkitua){
					g=ontzi.getPosizioak().get(j);
					if(g.getEgoera().equals(Egoera.EMANDA)){
						Denda.getNDenda().ontziakKonpondu(g.getX(), g.getY());
						aurkitua=true;
					}
					else{
						j++;
					}
				}
			}
			i++;
		}
	}

}
