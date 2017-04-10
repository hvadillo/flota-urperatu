package org.si.flotaurperatu.logic;

import org.si.flotaurperatu.interf2.Leihoa2;
import org.si.flotaurperatu.interf2.OntzienPanela;

public class Ordenagailua extends Jokalaria{
	
	public Ordenagailua(){
		super();
	}

	@Override
	public void txandaBurutu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void armakErosi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ezkutuaJarri(int pZutabe,int pErrenkada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ontziakIpini() {
		int zutabe;
		int errenkada;
		int norabidea;
		Ontzia ontz;
		boolean barruan;
		OntzienPanela.getOntzienPanela().setMota("Fragata");
		OntzienPanela.getOntzienPanela().setNorabide("Horizontal");
		for(int i=0; i <= 3; i++){
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
				if(tableroIkusi.konprobatu(zutabe, errenkada)){
					barruan = true;
					//Ontzia logikan sartu
					tableroIkusi.kokatu(zutabe,errenkada);
					ontz.posizioakEguneratu(0,tableroIkusi.getGelaxka(zutabe, errenkada));
					tableroIkusi.getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
				}
			}
		}
		OntzienPanela.getOntzienPanela().setMota("Suntsitzaile");
		for(int i=0; i <= 2; i++){
			barruan = false;
			if (i==0){
				ontz=flota.getOntzia(3);
			}
			else if(i==1){
				ontz=flota.getOntzia(4);
			}
			else{ontz=flota.getOntzia(5);}
			
			while(!barruan){
				norabidea = (int) (Math.random() * 1);
				if(norabidea==0){
					OntzienPanela.getOntzienPanela().setNorabide("Horizontal");
				}else{
					OntzienPanela.getOntzienPanela().setNorabide("Bertikal");
				}
				zutabe = (int) (Math.random() * 9);
				errenkada = (int) (Math.random() * 9);
				if(tableroIkusi.konprobatu(zutabe, errenkada)){
					barruan = true;
					//Ontzia logikan sartu
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
						
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
		OntzienPanela.getOntzienPanela().setMota("Itsaspeko");
		for(int i=0; i <= 1; i++){
			barruan = false;
			if (i==0){
				ontz=flota.getOntzia(1);
			}
			else{ontz=flota.getOntzia(2);}
			
			while(!barruan){
				norabidea = (int) (Math.random() * 1);
				if(norabidea==0){
					OntzienPanela.getOntzienPanela().setNorabide("Horizontal");
				}else{
					OntzienPanela.getOntzienPanela().setNorabide("Bertikal");
				}
				zutabe = (int) (Math.random() * 9);
				errenkada = (int) (Math.random() * 9);
				if(tableroIkusi.konprobatu(zutabe, errenkada)){
					barruan = true;
					//Ontzia logikan sartu
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
						
						
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
		
		OntzienPanela.getOntzienPanela().setMota("HegazkinOntzi");
		
		ontz=flota.getOntzia(0);
		barruan=false;
		while(!barruan){
			norabidea = (int) (Math.random() * 1);
			if(norabidea==0){
				OntzienPanela.getOntzienPanela().setNorabide("Horizontal");
			}else{
				OntzienPanela.getOntzienPanela().setNorabide("Bertikal");
			}
			zutabe = (int) (Math.random() * 9);
			errenkada = (int) (Math.random() * 9);
			if(tableroIkusi.konprobatu(zutabe, errenkada)){
				barruan = true;
				//Ontzia logikan sartu
				if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
					
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
		OntzienPanela.getOntzienPanela().setMota(null);
	}
}
