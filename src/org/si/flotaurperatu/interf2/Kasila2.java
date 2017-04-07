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
	
	public void iconoAldatu(){
		setIcon(Irudiak.getNIrudiak().bloke[1]);
		//this.removeMouseListener(this);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		Jokalaria jok=ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0);
		Ontzia ontz;
		if(e.getButton() == MouseEvent.BUTTON1){
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
						
					
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Fragata");
					}else{
					
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
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
					
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0, jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 1, errenkada);
						jok.getIkusi().kokatu(zutabe+1,errenkada);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe+1, errenkada));
						jok.getIkusi().getGelaxka(zutabe+1, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 2, errenkada);
						jok.getIkusi().kokatu(zutabe+2,errenkada);
						ontz.posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe+2, errenkada));
						jok.getIkusi().getGelaxka(zutabe+2, errenkada).ontziaEguneratu(ontz);
						
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Itsaspeko");
					}
					else{
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 1);
						jok.getIkusi().kokatu(zutabe,errenkada+1);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe, errenkada+1));
						jok.getIkusi().getGelaxka(zutabe, errenkada+1).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 2);
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
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 1, errenkada);
						jok.getIkusi().kokatu(zutabe+1,errenkada);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe+1, errenkada));
						jok.getIkusi().getGelaxka(zutabe+1, errenkada).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Suntsitzaile");
					}else{
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						ontz.posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(ontz);
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 1);
						jok.getIkusi().kokatu(zutabe,errenkada+1);
						ontz.posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe, errenkada+1));
						jok.getIkusi().getGelaxka(zutabe, errenkada+1).ontziaEguneratu(ontz);
						OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Suntsitzaile");
					}
				}
				
				
				else{
					if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 1, errenkada);
						jok.getIkusi().kokatu(zutabe+1,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe+1, errenkada));
						jok.getIkusi().getGelaxka(zutabe+1, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 2, errenkada);
						jok.getIkusi().kokatu(zutabe+2,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe+2, errenkada));
						jok.getIkusi().getGelaxka(zutabe+2, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 3, errenkada);
						jok.getIkusi().kokatu(zutabe+3,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(3,jok.getIkusi().getGelaxka(zutabe+3, errenkada));
						jok.getIkusi().getGelaxka(zutabe+3, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						OntzienPanela.getOntzienPanela().kenduBotoia("hegazkinontzi");
						OntzienPanela.getOntzienPanela().setMota(null);
					}else{
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
						jok.getIkusi().kokatu(zutabe,errenkada);
						jok.getFlota().getOntzia(0).posizioakEguneratu(0,jok.getIkusi().getGelaxka(zutabe, errenkada));
						jok.getIkusi().getGelaxka(zutabe, errenkada).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 1);
						jok.getIkusi().kokatu(zutabe,errenkada+1);
						jok.getFlota().getOntzia(0).posizioakEguneratu(1,jok.getIkusi().getGelaxka(zutabe, errenkada+1));
						jok.getIkusi().getGelaxka(zutabe, errenkada+1).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 2);
						jok.getIkusi().kokatu(zutabe,errenkada+2);
						jok.getFlota().getOntzia(0).posizioakEguneratu(2,jok.getIkusi().getGelaxka(zutabe, errenkada+2));
						jok.getIkusi().getGelaxka(zutabe, errenkada+2).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 3);
						jok.getIkusi().kokatu(zutabe,errenkada+3);
						jok.getFlota().getOntzia(0).posizioakEguneratu(3,jok.getIkusi().getGelaxka(zutabe, errenkada+3));
						jok.getIkusi().getGelaxka(zutabe, errenkada+3).ontziaEguneratu(jok.getFlota().getOntzia(0));
						
						OntzienPanela.getOntzienPanela().kenduBotoia("hegazkinontzi");
						OntzienPanela.getOntzienPanela().setMota(null);
					}
				}
			}
		}
			 // else{             //ESKUMAKO BOTOIA
			   //Panela.getPanela().eskuinKlika(zutabe, errenkada);
			  //}
		
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
