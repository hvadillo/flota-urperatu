package org.si.flotaurperatu.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.flotaurperatu.interf2.OntzienPanela;

public class Bertikal implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		OntzienPanela.getOntzienPanela().setNorabide("Bertikal");
	}

}
