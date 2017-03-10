package org.si.flotaurperatu.interf2;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class KasilenPanela2 extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	private Kasila2[][] botoiak;
	
	public KasilenPanela2(){
		removeAll();
		setLayout(new GridLayout(10, 10, 2, 2));
		botoiak = new Kasila2[10][10];
		for(int y = 0; y < 10; y++){
			for(int x = 0; x < 10; x++){
				botoiak[x][y] = new Kasila2(x,y);
				add(botoiak[x][y]);
			}
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
