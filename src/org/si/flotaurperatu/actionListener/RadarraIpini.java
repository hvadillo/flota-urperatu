package org.si.flotaurperatu.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.flotaurperatu.interf2.ArmenPanela;

public class RadarraIpini implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ArmenPanela.getArmenPanela().setArmaMota("radarra");	
	}

}
