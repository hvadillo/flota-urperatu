package org.si.flotaurperatu.interf2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.si.flotaurperatu.logic.Denda;
import org.si.flotaurperatu.logic.ListaJokalariak;

public class DendaPanela extends JPanel implements ActionListener, Observer{
	
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
		
		konpondu = new JButton("Konpoketa 350€");
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
	
	public void setKonponketa(){
		konponketa = false;
	}
	
	public boolean konponketa(){
		return konponketa;
	}
	
	public void armenPrezioa(String pArma){
		ArmenPanela.getArmenPanela().ipiniDirua();
		if(pArma.equals("bonba")){
			bomba.setText(Denda.getNDenda().getArmak().get(1).getKopurua()+" Bonba "+Denda.getNDenda().getArmak().get(1).getKostua()+"€");
		}else if(pArma.equals("misil")){
			misil.setText(Denda.getNDenda().getArmak().get(2).getKopurua()+" Misil "+Denda.getNDenda().getArmak().get(2).getKostua()+"€");
		}else if(pArma.equals("misilEM")){
			misilEM.setText(Denda.getNDenda().getArmak().get(5).getKopurua()+" MisilEM "+Denda.getNDenda().getArmak().get(5).getKostua()+"€");
		}else if(pArma.equals("misilIH")){
			misilIH.setText(Denda.getNDenda().getArmak().get(4).getKopurua()+" MisilIH "+Denda.getNDenda().getArmak().get(4).getKostua()+"€");
		}else if(pArma.equals("misilGurutzatu")){
			misilGurutzatu.setText(Denda.getNDenda().getArmak().get(6).getKopurua()+" MisilGurutze "+Denda.getNDenda().getArmak().get(6).getKostua()+"€");
		}else if(pArma.equals("radarra")){
			radarra.setText(Denda.getNDenda().getArmak().get(0).getKopurua()+" Radar "+Denda.getNDenda().getArmak().get(0).getKostua()+"€");
		}else{
			ezkutua.setText(Denda.getNDenda().getArmak().get(3).getKopurua()+" Ezkutu "+Denda.getNDenda().getArmak().get(3).getKostua()+"€");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable o, Object arg) {
		Object[] obj =  (Object[]) arg;
		String e = (String) obj[0];
		int x = (int) obj[1];
		armenPrezioa(e);
	}

}