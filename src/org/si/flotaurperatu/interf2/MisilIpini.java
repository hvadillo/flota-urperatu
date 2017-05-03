package org.si.flotaurperatu.interf2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MisilIpini implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ArmenPanela.getArmenPanela().setArmaMota("misil");
	}

}
