package org.si.flotaurperatu.interf2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.si.flotaurperatu.interf.baliabideak.Irudiak;
import org.si.flotaurperatu.logic.ListaJokalariak;

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
		Irudiak.kargatu();
		//setIcon(new ImageIcon(Kasila2.class.getResource("/org/si/flotaurperatu/interf/baliabideak/close.png")));
		setIcon(Irudiak.bloke[0]);
	}
	
	public void kenduListener(){
		this.removeMouseListener(this);
	}
	
	public void iconoAldatu(){
		setIcon(new ImageIcon(Kasila2.class.getResource("/org/si/flotaurperatu/interf/baliabideak/open.png")));
		this.removeMouseListener(this);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){   
			ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getIkusi().kokatu(zutabe,errenkada);
			//setIcon(new ImageIcon(Kasila2.class.getResource("/org/si/flotaurperatu/interf/baliabideak/open.png")));
			if(OntzienPanela.getOntzienPanela().getMota().equals("Fragata")){
				if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Fragata");
				}else{
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Fragata");
				}
			}else if(OntzienPanela.getOntzienPanela().getMota().equals("Itsaspeko")){
				if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 1, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 2, errenkada);
					OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Itsaspeko");
				}else{
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 1);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 2);
					OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Itsaspeko");
				}
			}else if(OntzienPanela.getOntzienPanela().getMota().equals("Suntsitzaile")){
				if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 1, errenkada);
					OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Suntsitzaile");
				}else{
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 1);
					OntzienPanela.getOntzienPanela().kontagailuaEguneratu("Suntsitzaile");
				}
			}else{
				if(OntzienPanela.getOntzienPanela().getNorabide().equals("Horizontal")){
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 1, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 2, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe + 3, errenkada);
					OntzienPanela.getOntzienPanela().kenduBotoia("hegazkinontzi");
					OntzienPanela.getOntzienPanela().setMota(null);
				}else{
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 1);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 2);
					Leihoa2.getLeihoa2().getPanela().iconoAldatu(zutabe, errenkada + 3);
					OntzienPanela.getOntzienPanela().kenduBotoia("hegazkinontzi");
					OntzienPanela.getOntzienPanela().setMota(null);
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
