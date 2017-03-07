package org.si.flotaurperatu.interf;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class Leihoa extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	
	public static Leihoa getLeihoa(){
		if(nLeihoa == null){
			try {
				nLeihoa = new Leihoa();			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		return nLeihoa;
	}
	
	public void jokalariarenIzena(){
		setJMenuBar(null);
		getContentPane().removeAll();
		getContentPane().add(new ErabiltzailePanela(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub 
	}
}
