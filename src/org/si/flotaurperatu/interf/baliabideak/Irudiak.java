package org.si.flotaurperatu.interf.baliabideak;

import javax.swing.ImageIcon;

public class Irudiak {
	
	public static ImageIcon[] bloke = new ImageIcon[2];
	private static Irudiak nIrudiak = null;
	
	private Irudiak(){
		blokeakKargatu();
	}
	
	public static Irudiak getNIrudiak(){
		if(nIrudiak==null){
			nIrudiak = new Irudiak();
		}
		return nIrudiak;
	}
	
	private static void blokeakKargatu(){
		bloke[0] = new ImageIcon(Irudiak.class.getResource("close.png"));
		bloke[1] = new ImageIcon(Irudiak.class.getResource("open.png"));
	}

}
