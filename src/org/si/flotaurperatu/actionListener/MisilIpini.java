package org.si.flotaurperatu.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.flotaurperatu.interf2.ArmenPanela;

public class MisilIpini implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ArmenPanela.getArmenPanela().setArmaMota("misil");
	}

}
