package org.si.flotaurperatu.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import org.si.flotaurperatu.interf2.OntzienPanela;

public class Horizontala implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		OntzienPanela.getOntzienPanela().setNorabide("Horizontal");
	}

}
