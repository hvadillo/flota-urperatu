package org.si.flotaurperatu.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.flotaurperatu.interf2.OntzienPanela;

public class SuntsitzaileIpini implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		OntzienPanela.getOntzienPanela().setMota("Suntsitzaile");
	}

}
