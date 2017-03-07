package org.si.flotaurperatu.interf.baliabideak;

import javax.swing.ImageIcon;

public class Irudiak {
	
	public static ImageIcon[] bloke = new ImageIcon[2];
	
	public static void kargatu(){
		blokeakKargatu();
	}
	
	private static void blokeakKargatu(){
		bloke[0] = new ImageIcon(Irudiak.class.getResource("close.png"));
		bloke[1] = new ImageIcon(Irudiak.class.getResource("open.png"));
	}

}
