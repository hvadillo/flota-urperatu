package org.si.flotaurperatu.interf2;

import javax.swing.JPanel; 

import org.si.flotaurperatu.logic.ListaJokalariak;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Canvas;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class OntzienPanela extends JPanel {
	private static final long serialVersionUID = 1L;
	
	
	public OntzienPanela(){
		
		JButton btnNewButton = new JButton("Fragata");
		
		JButton btnNewButton_3 = new JButton("Fragata");
		setLayout(new GridLayout(0, 4, 0, 0));
		add(btnNewButton);
		add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Fragata");
		add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Fragata");
		add(btnNewButton_1);
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bertikal");
		g.add(rdbtnNewRadioButton_1);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Horizontal");
		g.add(rdbtnNewRadioButton);
		add(rdbtnNewRadioButton);
	
		
	
		JButton btnNewButton_5 = new JButton("Itsaspeko");
		add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("Suntsitzaile");
		add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Suntsitzaile");
		add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Suntsitzaile");
		add(btnNewButton_9);
		
		JButton btnNewButton_6 = new JButton("Itsaspeko");
		add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("Hegazkin-Ontzi");
		add(btnNewButton_4);
		
		JLabel label_2 = new JLabel("");
		add(label_2);
		
		JLabel label_3 = new JLabel("");
		add(label_3);
		
		JLabel label_4 = new JLabel("");
		add(label_4);
		
		JLabel label_5 = new JLabel("");
		add(label_5);
		
		JLabel label_6 = new JLabel("");
		add(label_6);
		
		JLabel label_7 = new JLabel("");
		add(label_7);
		
		JLabel label_8 = new JLabel("");
		add(label_8);
		
		JLabel label_9 = new JLabel("");
		add(label_9);
		
		JLabel label_10 = new JLabel("");
		add(label_10);
		
		JLabel label_11 = new JLabel("");
		add(label_11);
		
		JLabel label_12 = new JLabel("");
		add(label_12);
		//jarri ontzi bakoitzeko botoi bat
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
