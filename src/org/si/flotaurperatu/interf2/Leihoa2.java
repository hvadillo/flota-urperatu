package org.si.flotaurperatu.interf2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.si.flotaurperatu.interf.baliabideak.Irudiak;

public class Leihoa2 extends JFrame implements Observer{
	
	private static final long serialVersionUID = 1L;
	//private static Leihoa2 nLeihoa = null;
	private static KasilenPanela2 matrize1 = new KasilenPanela2();
	private static KasilenPanela2 matrize2 = new KasilenPanela2();
	JLabel text1 = new JLabel();
	JLabel text2 = new JLabel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	public Leihoa2(){
		Irudiak.kargatu();
		this.setTitle("Flota Urperatu");
		panel1.setLayout(new GridLayout(2,1,50,0));
		panel1.add(matrize1, BorderLayout.NORTH);
		panel1.add(matrize2, BorderLayout.SOUTH);
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		text1.setText("dtahntnaetberdtnsatnstnsrnrssntr");
		text2.setText("dtahntnaetberdtnsatnstnsrnrssntr");
		panel2.add(text1, null);
		this.getContentPane().add(panel2, BorderLayout.WEST);
		panel3.add(text2, null);
		this.getContentPane().add(panel3, BorderLayout.EAST);
		this.setSize(300, 600);
	}
	
	/*public static Leihoa2 getLeihoa2(){
		if(nLeihoa==null){
			nLeihoa = new Leihoa2();
		}
		return nLeihoa;
	}*/

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
