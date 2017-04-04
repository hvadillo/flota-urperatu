package org.si.flotaurperatu.interf2;

import javax.swing.JPanel;

import org.si.flotaurperatu.actionListener.Bertikal;
import org.si.flotaurperatu.actionListener.EzkutuaIpini;
import org.si.flotaurperatu.actionListener.FragataIpini;
import org.si.flotaurperatu.actionListener.HegazkinOntziIpini;
import org.si.flotaurperatu.actionListener.Horizontala;
import org.si.flotaurperatu.actionListener.ItsaspekoIpini;
import org.si.flotaurperatu.actionListener.SuntsitzaileIpini;
import org.si.flotaurperatu.logic.ListaJokalariak;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class OntzienPanela extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private static OntzienPanela nPanela;
	private String ontziMota = null;
	private String norabide = null;
	private int fragataKop = 3;
	private int suntsitzaileKop = 2;
	private int itsaspekoKop = 1;
	ButtonGroup g;
	JRadioButton bertikal;
	JRadioButton horizontal;
	JButton fragata;
	JButton suntsitzaile;
	JButton itsaspeko;
	JButton hegazkinontzi;
	JButton ezkutua;
	
	private OntzienPanela(){
		
		setLayout(new GridLayout(3, 3, 0, 0));
		
		g = new ButtonGroup();
		bertikal = new JRadioButton("Bertikal");
		bertikal.addActionListener(new Bertikal());
		g.add(bertikal);
		add(bertikal);
		horizontal = new JRadioButton("Horizontal");
		horizontal.addActionListener(new Horizontala());
		g.add(horizontal);
		add(horizontal);
		
		fragata = new JButton("Fragata");
		add(fragata);
		fragata.addActionListener(new FragataIpini());
		
		suntsitzaile = new JButton("Suntsitzaile");
		add(suntsitzaile);
		suntsitzaile.addActionListener(new SuntsitzaileIpini());
		
		itsaspeko = new JButton("Itsaspeko");
		add(itsaspeko);
		itsaspeko.addActionListener(new ItsaspekoIpini());
		
		hegazkinontzi = new JButton("Hegazkin-Ontzi");
		add(hegazkinontzi);
		hegazkinontzi.addActionListener(new HegazkinOntziIpini());
		
		ezkutua = new JButton("Ezkutua");
		add(ezkutua);
		ezkutua.addActionListener(new EzkutuaIpini());

		//jarri ontzi bakoitzeko botoi bat
	}
	
	public static OntzienPanela getOntzienPanela(){
		if(nPanela==null){
			nPanela= new OntzienPanela();
		}
		return nPanela;
	}
	
	public void setMota(String pMota){
		ontziMota = pMota;
	}
	
	public String getMota(){
		return ontziMota;
	}
	
	public void setNorabide(String pNorabide){
		norabide = pNorabide;
	}
	
	public String getNorabide(){
		return norabide;
	}
	
	public void kontagailuaEguneratu(String pMota){
		if(pMota.equals("Fragata")){
			if(fragataKop==0){
				kenduBotoia("Fragata");
			}else{
				fragataKop--;
				ontziMota=null;
			}	
		}else if(pMota.equals("Suntsitzaile")){
			if(suntsitzaileKop==0){
				kenduBotoia("Suntsitzaile");
			}else{
				suntsitzaileKop--;
				ontziMota=null;
			}
		}else{
			if(itsaspekoKop==0){
				kenduBotoia("Itsaspeko");
			}else{
				itsaspekoKop--;
				ontziMota=null;
			}
		}
		ontziMota=null;
	}
	
	public void kenduBotoia(String pMota){
		if(pMota.equals("Fragata")){
			remove(fragata);
		}else if(pMota.equals("Suntsitzaile")){
			remove(suntsitzaile);
		}else if(pMota.equals("Itsaspeko")){
			remove(itsaspeko);
		}else{
			remove(hegazkinontzi);
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	public void actionListenerKendu(String pMota){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
