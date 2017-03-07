package org.si.flotaurperatu.interf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.si.flotaurperatu.interf.baliabideak.*;

public class Leihoa extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	
	public Leihoa() {
		Irudiak.kargatu();
		Textua.kargatu();
		
		setTitle("FLOTA URPERATU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//setIconImage(Irudiak.ikonoa);
		setBackground(new Color(250, 250, 250));
		
		this.addWindowListener(new WindowAdapter() {					//Leihoa ixtean aterako den mezua
			public void windowClosing(WindowEvent e) {
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			        Textua.itxiText, Textua.itxiTextIzenburu,
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE /*Irudiak.smiley[4]*/);
			    if (confirmed == JOptionPane.YES_OPTION) {
			    	//TopLeihoa.getTopLeihoa().dispose();
			    	//dispose();
			    	System.exit(0);
			    }
			}
		});
		//Panela.getPanela().addObserver(this);
	}
	
	public static Leihoa getLeihoa(){
		if(nLeihoa == null){
			try {
				nLeihoa = new Leihoa();			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		return nLeihoa;
	}
	
	public void panelakEraiki(String pErabiltzaile){
		getContentPane().removeAll();
		setJMenuBar(new Menua(pErabiltzaile));											//Menua
		
		//getContentPane().add(new JokoarenGoikoPanela(), BorderLayout.NORTH);			//Goiko panela (Smiley, kontadorea, kronometroa)
		
		getContentPane().add(KasilenPanela.getKasilenPanela(), BorderLayout.CENTER);	//Kasilak gehitu panelean
		setVisible(true);
	}
	
	public void jokalariarenIzena(){
		setJMenuBar(null);
		getContentPane().removeAll();
		getContentPane().add(new ErabiltzailePanela(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub 
		//kjabfvñafjbvjfa
	}
}
