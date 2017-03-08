package org.si.flotaurperatu.interf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class KasilenPanela extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	private static KasilenPanela nKasilenPanela = null;
	private Kasila[][] botoiak;
	
	private KasilenPanela(){
		setBackground(new Color(250,250,250));
			
		JPanel bereizgarri = new JPanel();								//botoien eta smiley-aren arteko tartea
		bereizgarri.setBackground(new Color(250, 250, 250));
		add(bereizgarri, BorderLayout.NORTH);
	}
	
	public static KasilenPanela getKasilenPanela(){
		if(nKasilenPanela==null){
			nKasilenPanela = new KasilenPanela();
		}
		return nKasilenPanela;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
