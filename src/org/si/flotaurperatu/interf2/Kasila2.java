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
		setIcon(new ImageIcon(Kasila2.class.getResource("/org/si/flotaurperatu/interf/baliabideak/close.png")));
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){   
			ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getIkusi().kokatu(zutabe,errenkada);
			setIcon(new ImageIcon(Kasila2.class.getResource("/org/si/flotaurperatu/interf/baliabideak/open.png")));
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
