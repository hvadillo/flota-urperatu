package org.si.flotaurperatu.interf2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.si.flotaurperatu.interf2.baliabideak.Irudiak;
import org.si.flotaurperatu.interf2.baliabideak.Textua;

import javax.swing.border.LineBorder;

public class Leihoa2 extends JFrame implements Observer{
	
	private static final long serialVersionUID = 1L;
	private static Leihoa2 nLeihoa = null;
	private static KasilenPanela2 matrize1 = new KasilenPanela2();
	private static KasilenPanela2 matrize2 = new KasilenPanela2();
	private static OntzienPanela ontziak = OntzienPanela.getOntzienPanela();
	private static ArmenPanela armak = ArmenPanela.getArmenPanela();
	private static DendaPanela denda = DendaPanela.getDendaPanela();
	JLabel text1 = new JLabel();
	TextArea text2 = new TextArea();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	private Leihoa2(){
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setTitle("Flota Urperatu");
		Textua.kargatu();
		Irudiak.getNIrudiak();
		this.setIconImage(Irudiak.ikonoa);
		
		setJMenuBar(new Menua());
		
		matrize1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		matrize2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		panel1.setBorder(null);
		panel1.setLayout(new GridLayout(2,1,0,1));
		panel1.add(matrize1, BorderLayout.NORTH);
		panel1.add(matrize2, BorderLayout.SOUTH);
		
		text1.setText("Informazioa:");
		text2.setBackground(Color.WHITE);
		text2.setPreferredSize(new Dimension(300,25));
		text2.setEditable(false);
		text2.setFont(new Font("Serif",Font.PLAIN,16));
		
		panel2.setBorder(null);
		panel2.setLayout(new GridLayout(3,1,0,0));
		panel2.add(text1, BorderLayout.NORTH);
		panel2.add(text2, BorderLayout.CENTER);
		panel2.add(denda, BorderLayout.SOUTH);
		
		panel3.add(armak, null);
		
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		this.getContentPane().add(panel2, BorderLayout.WEST);
		this.getContentPane().add(panel3, BorderLayout.EAST);
		this.getContentPane().add(ontziak, BorderLayout.SOUTH);
		
		this.setSize(800, 700);
		this.setResizable(false);
		
		this.addWindowListener(new WindowAdapter() {					
			public void windowClosing(WindowEvent e) {
				Object[] options = { "BAI", "EZ" };
				int confirmed = JOptionPane.showOptionDialog(null, Textua.itxiText, Textua.itxiTextIzenburu,
				             JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
				             null, options, options[1]);
			    if (confirmed == JOptionPane.YES_OPTION) {
			    	System.exit(0);
			    }else{
			    	
			    }
			}
		});
	}
	
	public static Leihoa2 getLeihoa2(){
		if(nLeihoa==null){
			nLeihoa = new Leihoa2();
		}
		return nLeihoa;
	}
	
	public void idatzi(String pTextua){
		text2.append(pTextua + "\n");
	}
	
	public KasilenPanela2 getMatrize2(){
		return matrize2;
	}
	
	public KasilenPanela2 getMatrize1(){
		return matrize1;
	}
	
	public void amaiera(int pTxanda) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if(pTxanda==0){
			Object[] options = { "OK",};
			int confirmed = JOptionPane.showOptionDialog(null, Textua.irabazi, Textua.amaitu,
			             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
			             null, options, options[0]);
			    if (confirmed == JOptionPane.OK_OPTION) {
			    	System.exit(0);
			    }
		}else{
			Object[] options = { "OK",};
			int confirmed = JOptionPane.showOptionDialog(null, Textua.galdu, Textua.amaitu,
			             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
			             null, options, options[0]);
			    if (confirmed == JOptionPane.OK_OPTION) {
			    	System.exit(0);
			    }
		}
	    
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof String){
			String e = (String) arg1;
			idatzi(e);
		}else{
			Object[] obj = (Object[]) arg1;
			if(obj.length==4){
				String e = (String) obj[0];
				int x = (int) obj[1];
				int y = (int) obj[2];
				int matrizea = (int) obj[3];
				if(matrizea == 1){
					matrize1.iconoAldatu(e, x, y);
				}else{
					matrize2.iconoAldatu(e, x, y);
				}	
			}
		}
	}

}