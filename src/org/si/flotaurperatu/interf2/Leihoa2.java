package org.si.flotaurperatu.interf2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.si.flotaurperatu.interf.baliabideak.Irudiak;
import javax.swing.border.LineBorder;

public class Leihoa2 extends JFrame implements Observer{
	
	private static final long serialVersionUID = 1L;
	private static Leihoa2 nLeihoa = null;
	private static KasilenPanela2 matrize1 = new KasilenPanela2();
	private static KasilenPanela2 matrize2 = new KasilenPanela2();
	private static OntzienPanela ontziak = OntzienPanela.getOntzienPanela();
	private static ArmenPanela armak = ArmenPanela.getArmenPanela();
	JLabel text1 = new JLabel();
	JLabel text2 = new JLabel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	private Leihoa2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Flota Urperatu");
		this.setIconImage(Irudiak.getNIrudiak().ikonoa);
		panel1.setBorder(null);
		panel1.setLayout(new GridLayout(2,1,50,0));
		matrize1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel1.add(matrize1, BorderLayout.NORTH);
		//matrize1.kenduListener();
		matrize2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel1.add(matrize2, BorderLayout.SOUTH);
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		text1.setText("dtahntnaetberdtnsatnstnsrnrssntr");
		panel2.add(text1, null);
		this.getContentPane().add(panel2, BorderLayout.WEST);
		panel3.add(armak, null);
		this.getContentPane().add(panel3, BorderLayout.EAST);
		this.getContentPane().add(ontziak, BorderLayout.SOUTH);
		
		this.setSize(800, 700);
		this.setResizable(false);
	}
	
	public static Leihoa2 getLeihoa2(){
		if(nLeihoa==null){
			nLeihoa = new Leihoa2();
		}
		return nLeihoa;
	}
	
	public KasilenPanela2 getPanela(){
		return matrize2;
	}
	
	public KasilenPanela2 getMatrize1(){
		return matrize1;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
