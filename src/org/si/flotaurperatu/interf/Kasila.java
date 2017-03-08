package org.si.flotaurperatu.interf;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Kasila extends JButton implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	private int zutabe;
	private int errenkada;
	
	public Kasila(int pZ, int pE){
		setBorder(BorderFactory.createEmptyBorder());
		setFocusPainted(false);
		setBorder(null);
		setContentAreaFilled(false);
		zutabe = pZ;
		errenkada = pE;
		addMouseListener(this);
		setIcon(Irudiak.bloke[0]);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
