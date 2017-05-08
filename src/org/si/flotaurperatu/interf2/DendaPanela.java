package org.si.flotaurperatu.interf2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.si.flotaurperatu.logic.Denda;

public class DendaPanela extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private static DendaPanela nDenda;
	private boolean konponketa = false;
	JButton bomba;
	JButton misil;
	JButton misilIH;
	JButton misilEM;
	JButton misilGurutzatu;
	JButton radarra;
	JButton ezkutua;
	JButton konpondu;
	
	private DendaPanela(){
		setLayout(new GridLayout(4, 2, 0, 0));
		
		bomba = new JButton("Bomba");
		add(bomba);
		bomba.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("bonba");
			}
			
		});
		
		misil = new JButton("Misil");
		add(misil);
		misil.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("misil");
			}
			
		});
		
		misilIH = new JButton("MisilIH");
		add(misilIH);
		misilIH.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("misilIH");
			}
			
		});
		
		misilEM = new JButton("MisilEM");
		add(misilEM);
		misilEM.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("misilEM");
			}
			
		});
		
		misilGurutzatu = new JButton("MisilGurutzatu");
		add(misilGurutzatu);
		misilGurutzatu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("misilgurutzatu");
			}
			
		});
		
		radarra = new JButton("Radarra");
		add(radarra);
		radarra.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("radarra");
			}
			
		});
		
		ezkutua = new JButton("Ezkutua");
		add(ezkutua);
		ezkutua.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Denda.getNDenda().armaErosi("ezkutua");
			}
			
		});
		
		konpondu = new JButton("Konpoketa");
		add(konpondu);
		konpondu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				nDenda.konponketa=true;
			}
			
		});
	}
	
	public static DendaPanela getDendaPanela(){
		if(nDenda==null){
			nDenda = new DendaPanela();
		}
		return nDenda;
	}
	
	public boolean konponketa(){
		return konponketa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
