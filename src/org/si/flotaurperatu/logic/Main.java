package org.si.flotaurperatu.logic;

import java.awt.Frame;

import org.si.flotaurperatu.interf2.Leihoa2;

public abstract class Main {

	public static void main(String[] args) {
		Frame leihoa = Leihoa2.getLeihoa2();
		leihoa.setVisible(true);
	}

}
