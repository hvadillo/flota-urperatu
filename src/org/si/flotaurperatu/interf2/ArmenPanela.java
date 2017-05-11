package org.si.flotaurperatu.interf2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
	JLabel dirua;
	
	
	private ArmenPanela(){
		setLayout(new GridLayout(8, 1, 0, 0));
		
		bomba = new JButton("Bomba");
		armenKopurua("bonba");
		add(bomba);
		bomba.addActionListener(new BonbaIpini());
		
		misil = new JButton("Misil");
		armenKopurua("misil");
		add(misil);
		misil.addActionListener(new MisilIpini());
		
		misilIH = new JButton("MisilIH");
		armenKopurua("misilIH");
		add(misilIH);
		misilIH.addActionListener(new MisilIHIpini());
		
		misilEM = new JButton("MisilEM");
		armenKopurua("misilEM");
		add(misilEM);
		misilEM.addActionListener(new MisilEMIpini());
		
		misilGurutzatu = new JButton("MisilGurutzatu");
		armenKopurua("misilGurutzatu");
		add(misilGurutzatu);
		misilGurutzatu.addActionListener(new MisilGurutzeIpini());
		
		radarra = new JButton("Radarra");
		armenKopurua("radarra");
		add(radarra);
		radarra.addActionListener(new RadarraIpini());
		
		ezkutua = new JButton("Ezkutua");
		armenKopurua("ezkutua");
		add(ezkutua);
		ezkutua.addActionListener(new EzkutuaIpini());
		
		dirua = new JLabel("Dirua");
		ipiniDirua();
		add(dirua);
	}
	
	public static ArmenPanela getArmenPanela(){
		if(nPanela==null){
			nPanela = new ArmenPanela();
		}
		return nPanela;
	}
	
	public void ipiniDirua(){
		dirua.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getDirua() + "€ dituzu");
	}
	
	public void armenKopurua(String pArma){
		if(pArma.equals("bonba")){
			bomba.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(1).getKopurua()+" Bonba");
		}else if(pArma.equals("misil")){
			misil.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(2).getKopurua()+" Misil");
		}else if(pArma.equals("misilEM")){
			misilEM.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(5).getKopurua()+" MisilEM");
		}else if(pArma.equals("misilIH")){
			misilIH.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(4).getKopurua()+" MisilIH");
		}else if(pArma.equals("misilGurutzatu")){
			misilGurutzatu.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(6).getKopurua()+" MisilGurutze");
		}else if(pArma.equals("radarra")){
			radarra.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(0).getKopurua()+" Radar");
		}else{
			ezkutua.setText(ListaJokalariak.getNireListaJokalariak().getJokalariak().get(0).getArmak().getArmak().get(3).getKopurua()+" Ezkutu");
		}
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
