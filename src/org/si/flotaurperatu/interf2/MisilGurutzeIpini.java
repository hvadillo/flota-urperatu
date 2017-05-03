package org.si.flotaurperatu.interf2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MisilGurutzeIpini implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ArmenPanela.getArmenPanela().setArmaMota("misilGurutze");
	}

}
