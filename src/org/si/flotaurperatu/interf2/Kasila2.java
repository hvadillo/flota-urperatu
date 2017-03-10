package org.si.flotaurperatu.interf2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import org.si.flotaurperatu.interf.baliabideak.Irudiak;

public class Kasila2 extends JButton implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	private int zutabe;
	private int errenkada;
	
	public Kasila2(int pZut, int pErr){
		setBorder(BorderFactory.createEmptyBorder());
		setFocusPainted(false);
		setBorder(null);
		setContentAreaFilled(false);
		zutabe = pZut;
		errenkada = pErr;
		addMouseListener(this);
		setText("X");
		setIcon(Irudiak.bloke[0]);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
