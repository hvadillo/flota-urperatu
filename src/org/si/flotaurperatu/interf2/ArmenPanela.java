package org.si.flotaurperatu.interf2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.si.flotaurperatu.actionListener.BonbaIpini;
import org.si.flotaurperatu.actionListener.EzkutuaIpini;
import org.si.flotaurperatu.actionListener.MisilEMIpini;
import org.si.flotaurperatu.actionListener.MisilGurutzeIpini;
import org.si.flotaurperatu.actionListener.MisilIHIpini;
import org.si.flotaurperatu.actionListener.MisilIpini;
import org.si.flotaurperatu.actionListener.RadarraIpini;
import org.si.flotaurperatu.logic.ListaJokalariak;

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
		bomba.addActionListener(new BonbaIpini());
		
		misil = new JButton("Misil");
		add(misil);
		misil.addActionListener(new MisilIpini());
		
		misilIH = new JButton("MisilIH");
		add(misilIH);
		misilIH.addActionListener(new MisilIHIpini());
		
		misilEM = new JButton("MisilEM");
		add(misilEM);
		misilEM.addActionListener(new MisilEMIpini());
		
		misilGurutzatu = new JButton("MisilGurutzatu");
		add(misilGurutzatu);
		misilGurutzatu.addActionListener(new MisilGurutzeIpini());
		
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
