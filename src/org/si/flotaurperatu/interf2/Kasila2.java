package org.si.flotaurperatu.interf2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.si.flotaurperatu.interf.baliabideak.Irudiak;
import org.si.flotaurperatu.logic.Jokalaria;
import org.si.flotaurperatu.logic.ListaJokalariak;
import org.si.flotaurperatu.logic.Ontzia;

public class Kasila2 extends JButton implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	private int zutabe;
	private int errenkada;
	private boolean ontzia;
	
	public Kasila2(int pZut, int pErr){
		ontzia=false;
		setBorder(BorderFactory.createEmptyBorder());
		setFocusPainted(false);
		setBorder(null);
		setContentAreaFilled(false);
		zutabe = pZut;
		errenkada = pErr;
		addMouseListener(this);
		setIcon(Irudiak.getNIrudiak().bloke[0]);
	}
	
	public void kenduListener(){
		this.removeMouseListener(this);
	}
	
	public void ipiniListener(){
		this.addMouseListener(this);
	}
	
	public void iconoAldatu(String egoera){
		if(egoera.equals("ezkutua")){
			setIcon(Irudiak.getNIrudiak().bloke[3]);
		}else if(egoera.equals("emanda")){
			setIcon(Irudiak.getNIrudiak().bloke[4]);
		}else if(egoera.equals("ontzia")){
			setIcon(Irudiak.getNIrudiak().bloke[1]);
		}else if(egoera.equals("ura")){
			setIcon(Irudiak.getNIrudiak().bloke[0]);
		}else{
			setIcon(Irudiak.getNIrudiak().bloke[2]);
		}
		//this.removeMouseListener(this);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){
			if(OntzienPanela.getOntzienPanela().getKopOsoa()!=0){
				ontziakKokatu();	
			}
			else{
				if(ArmenPanela.getArmenPanela().getArmaMota().equals("ezkutua")){
					ezkutuaKokatu();
				}else if(ArmenPanela.getArmenPanela().getArmaMota().equals("radarra")){
					radarraErabili();
				}else if(ArmenPanela.getArmenPanela().getArmaMota().equals("bonba")){
					bonbaErabili();
				}else if(ArmenPanela.getArmenPanela().getArmaMota().equals("misil")){
					misilErabili();
				}else if(ArmenPanela.getArmenPanela().getArmaMota().equals("misilIH")){
					misilIHErabili();
				}else if(ArmenPanela.getArmenPanela().getArmaMota().equals("misilEM")){
					misilEMErabili();
				}else{
					misilGurutzeErabili();
				}
			}
		}
			 // else{             //ESKUMAKO BOTOIA
			   //Panela.getPanela().eskuinKlika(zutabe, errenkada);
			  //}
		
	}
	
	private void bonbaErabili() {
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).bonbaErabili(zutabe, errenkada);
		
	}

	private void radarraErabili(){
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).radarraErabili(zutabe, errenkada);
	}
	
	private void ezkutuaKokatu(){
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).ezkutuaJarri(zutabe, errenkada);
	}
	
	private void misilErabili(){
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).misilErabili(zutabe, errenkada);
	}
	
	private void misilIHErabili(){
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).misilIHErabili(zutabe,errenkada);
	}
	
	private void misilEMErabili(){
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).misilEMErabili(zutabe,errenkada);
	}
	
	private void misilGurutzeErabili(){
		ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).misilGurutzeErabili(zutabe,errenkada);
	}
	
	private void ontziakKokatu(){
		Jokalaria jok=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
		Ontzia ontz;
		
			//ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getIkusi().kokatu(zutabe,errenkada);
			
			
			if(jok.getIkusi().konprobatu(zutabe, errenkada)){
				
				
				if(OntzienPanela.getOntzienPanela().getMota().equals("Fragata")){//FRAGATA
					
					if(OntzienPanela.getOntzienPanela().getKont()==3){
						ontz=jok.getFlota().getOntzia(6);	
					}
					else if(OntzienPanela.getOntzienPanela().getKont()==2){
						ontz=jok.getFlota().getOntzia(7);
					}
					else if(OntzienPanela.getOntzienPanela().getKont()==1){
						ontz=jok.getFlota().getOntzia(8);
					}
					else{
						ontz=jok.getFlota().getOntzia(9);
					}
					
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
						
					
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Fragata");
					}else{
					
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Fragata");
					}//Fragatarentzako
					
					
				}else if(OntzienPanela.getOntzienPanela().getMota().equals("Itsaspeko")){//Itsaspekoarentzako
					
					if(OntzienPanela.getOntzienPanela().getKont()==1){
						ontz=jok.getFlota().getOntzia(1);
					}
					else{
						ontz=jok.getFlota().getOntzia(2);
					}
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
					
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0, jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe + 1, errenkada);
						jok.getIkusi().kokatu(zutabe+1,errenkada);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe+1, errenkada));
						jok.getIkusi().getGelaxka(zutabe+1, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe + 2, errenkada);
						jok.getIkusi().kokatu(zutabe+2,errenkada);
						ontz.posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe+2, errenkada));
						jok.getIkusi().getGelaxka(zutabe+2, errenkada).ontziaEguneratu(ontz);
						
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Itsaspeko");
					}
					else{
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada + 1);
						jok.getIkusi().kokatu(zutabe,errenkada+1);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe, errenkada+1));
						jok.getIkusi().getGelaxka(zutabe, errenkada+1).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada + 2);
						jok.getIkusi().kokatu(zutabe,errenkada+2);
						ontz.posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe, errenkada+2));
						jok.getIkusi().getGelaxka(zutabe, errenkada+2).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Itsaspeko");
					}//Itsaspekoarentzako
					
					
					
				}else if(OntzienPanela.getOntzienPanela().getMota().equals("Suntsitzaile")){
					
					if(OntzienPanela.getOntzienPanela().getKont()==2){
						ontz=jok.getFlota().getOntzia(3);
					}
					else if(OntzienPanela.getOntzienPanela().getKont()==1){
						ontz=jok.getFlota().getOntzia(4);
					}
					else{
						ontz=jok.getFlota().getOntzia(5);
					}
					
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe + 1, errenkada);
						jok.getIkusi().kokatu(zutabe+1,errenkada);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe+1, errenkada));
						jok.getIkusi().getGelaxka(zutabe+1, errenkada).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Suntsitzaile");
					}else{
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada + 1);
						jok.getIkusi().kokatu(zutabe,errenkada+1);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe, errenkada+1));
						jok.getIkusi().getGelaxka(zutabe, errenkada+1).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Suntsitzaile");
					}
				}
				
				
				else{
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe + 1, errenkada);
						jok.getIkusi().kokatu(zutabe+1,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe+1, errenkada));
						jok.getIkusi().getGelaxka(zutabe+1, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe + 2, errenkada);
						jok.getIkusi().kokatu(zutabe+2,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe+2, errenkada));
						jok.getIkusi().getGelaxka(zutabe+2, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe + 3, errenkada);
						jok.getIkusi().kokatu(zutabe+3,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(3,jok.getIkusi().getGelaxka(zutabe+3, errenkada));
						jok.getIkusi().getGelaxka(zutabe+3, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						OntzienPanela.getOntzienPanela().kenduBotoia("hegazkinontzi");
						OntzienPanela.getOntzienPanela().setMota(null);
					}else{
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada + 1);
						jok.getIkusi().kokatu(zutabe,errenkada+1);
						jok.getFlota().getOntzia(0).posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe, errenkada+1));
						jok.getIkusi().getGelaxka(zutabe, errenkada+1).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada + 2);
						jok.getIkusi().kokatu(zutabe,errenkada+2);
						jok.getFlota().getOntzia(0).posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe, errenkada+2));
						jok.getIkusi().getGelaxka(zutabe, errenkada+2).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu("ontzia", zutabe, errenkada + 3);
						jok.getIkusi().kokatu(zutabe,errenkada+3);
						jok.getFlota().getOntzia(0).posizioakEguneratu(3,jok.getIkusi().getGelaxka(zutabe, errenkada+3));
						jok.getIkusi().getGelaxka(zutabe, errenkada+3).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						OntzienPanela.getOntzienPanela().kenduBotoia("hegazkinontzi");
						OntzienPanela.getOntzienPanela().setMota(null);
					}
				}
			}
		}
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
