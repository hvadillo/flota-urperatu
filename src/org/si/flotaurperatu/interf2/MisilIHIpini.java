package org.si.flotaurperatu.interf2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MisilIHIpini implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ArmenPanela.getArmenPanela().setArmaMota("misilIH");
	}

}
