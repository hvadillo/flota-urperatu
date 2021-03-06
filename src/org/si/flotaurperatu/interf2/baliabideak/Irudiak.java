package org.si.flotaurperatu.interf2.baliabideak;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Irudiak {
	
	public static ImageIcon[] bloke = new ImageIcon[8];
	public static Image ikonoa;
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
		bloke[0] = new ImageIcon(Irudiak.class.getResource("ura.png"));
		bloke[1] = new ImageIcon(Irudiak.class.getResource("ontzia.png"));
		bloke[2] = new ImageIcon(Irudiak.class.getResource("miss.png"));
		bloke[3] = new ImageIcon(Irudiak.class.getResource("ezkutua.png"));
		bloke[4] = new ImageIcon(Irudiak.class.getResource("emanda.png"));
		bloke[5] = new ImageIcon(Irudiak.class.getResource("ezkutuaErdiEmanda.png"));
		bloke[6] = new ImageIcon(Irudiak.class.getResource("ezkutuaEmanda.png"));
		bloke[7] = new ImageIcon(Irudiak.class.getResource("berreskuratuta.png"));
		//bloke[8] = new ImageIcon(Irudiak.class.getResource("battleship.png"));
		ImageIcon ikono = new ImageIcon(Irudiak.class.getResource("battleship.png"));
		ikonoa = ikono.getImage();
	}

}
