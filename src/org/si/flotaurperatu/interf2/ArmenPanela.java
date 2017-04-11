package org.si.flotaurperatu.interf2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.si.flotaurperatu.actionListener.EzkutuaIpini;
import org.si.flotaurperatu.actionListener.FragataIpini;
import org.si.flotaurperatu.actionListener.RadarraIpini;

public class ArmenPanela extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private static ArmenPanela nPanela;
	private String armaMota = null;
	JButton bomba;
	JButton misil;
	JButton misilIH;
	JButton misilEM;
	JButton misilGurutzatu;
	JButton radarra;
	JButton ezkutua;
	
	
	private ArmenPanela(){
		setLayout(new GridLayout(7, 1, 0, 0));
		
		bomba = new JButton("Bomba");
		add(bomba);
		//bomba.addActionListener(new FragataIpini());
		
		misil = new JButton("Misil");
		add(misil);
		//misil.addActionListener(new FragataIpini());
		
		misilIH = new JButton("MisilIH");
		add(misilIH);
		//misilIH.addActionListener(new FragataIpini());
		
		misilEM = new JButton("MisilEM");
		add(misilEM);
		//misilEM.addActionListener(new FragataIpini());
		
		misilGurutzatu = new JButton("MisilGurutzatu");
		add(misilGurutzatu);
		//misilGurutzatu.addActionListener(new FragataIpini());
		
		radarra = new JButton("Radarra");
		add(radarra);
		radarra.addActionListener(new RadarraIpini());
		
		ezkutua = new JButton("Ezkutua");
		add(ezkutua);
		ezkutua.addActionListener(new EzkutuaIpini());
	}
	
	public static ArmenPanela getArmenPanela(){
		if(nPanela==null){
			nPanela = new ArmenPanela();
		}
		return nPanela;
	}
	
	public void setArmaMota(String pMota){
		armaMota = pMota;
	}
	
	public String getArmaMota(){
		return armaMota;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
