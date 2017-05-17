package org.si.flotaurperatu.interf2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import org.si.flotaurperatu.interf2.baliabideak.Textua;


public class Menua extends JMenuBar{

	private static final long serialVersionUID = 1L;
	private JMenu laguntza;
	private JMenuItem argibidea;
	
	public Menua(){
		setBorder(null);
		setBackground(new Color(255,255,255));
		Textua.kargatu();
		
		laguntza = new JMenu("Laguntza");
		add(laguntza);
		
		argibidea = new JMenuItem("Argibidea");
		laguntza.add(argibidea);
		argibidea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog p = new JDialog(Leihoa2.getLeihoa2(), "Argibidea");
				
				JTextPane textua = new JTextPane();
				textua.setContentType("text/html");
		      	textua.setText(Textua.argibidea);
		      	textua.setEditable(false);
				
		        JScrollPane scrollPane = new JScrollPane(textua, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		        scrollPane.setBounds(0,0,0,0);
		        
		        p.add(scrollPane);
		        p.setResizable(true);
		        p.setSize(500, 600);
		        p.setLocationRelativeTo(Leihoa2.getLeihoa2());
		        p.setVisible(true);
			}
		});
	}
}
