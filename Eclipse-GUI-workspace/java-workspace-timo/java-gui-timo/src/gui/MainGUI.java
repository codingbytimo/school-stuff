package gui;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends Frame implements ActionListener {
	
	JFrame Fenster;
	JTextField textFeld;
	JLabel ladeWert;
	JLabel ladeWert2;
	JButton Knopf;
	JToggleButton plusMinus;
	JProgressBar progressBar1;
	JSlider slider;
	int p1Value = 0;
	int p2Value = 0;
	JProgressBar progressBar2;
	
	public MainGUI() {
		
		Fenster = new JFrame("GUI Testprogramm");
		Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Fenster.setResizable(true);
		Fenster.setLocation(250, 250);
		
		textFeld = new JTextField("Textfeld");
		textFeld.setBounds(50, 50, 150, 20);
		
		ladeWert = new JLabel("Wert von Ladebalken 2: ");
		ladeWert.setBounds(50, 269, 400, 20);
		
		Knopf = new JButton("ProgressBar aktualisieren.");
		Knopf.setBounds(50, 150, 150, 100);
		Knopf.setSize(400, 100);
		Knopf.addActionListener(this);
		
		Fenster.getContentPane().add(textFeld);
		Fenster.getContentPane().add(ladeWert);
		Fenster.getContentPane().add(Knopf);
		
		Fenster.setSize(1000, 750);
		Fenster.getContentPane().setLayout(null);
		
		ladeWert2 = new JLabel("");
		ladeWert2.setBounds(50, 300, 139, 14);
		Fenster.getContentPane().add(ladeWert2);
		
		progressBar1 = new JProgressBar();
		progressBar1.setBounds(50, 300, 400, 14);
		Fenster.getContentPane().add(progressBar1);
		
		slider = new JSlider();
		slider.setBounds(50, 351, 400, 26);
		slider.setBorder(new TitledBorder("Ladebalken 2 bedienen."));
		Fenster.getContentPane().add(slider);
		
		progressBar2 = new JProgressBar();
		progressBar2.setBounds(50, 425, 400, 14);
		Fenster.getContentPane().add(progressBar2);
		
		ladeWert2 = new JLabel("Wert von Ladebalken 2: ");
		ladeWert2.setBounds(50, 400, 400, 14);
		Fenster.getContentPane().add(ladeWert2);
		
		JToggleButton plusMinus = new JToggleButton("Plus/Minus");
		plusMinus.setBounds(50, 116, 121, 23);
		Fenster.getContentPane().add(plusMinus);
		Fenster.setVisible(true);
		
	}
	
	public static void main(String[] args){
		
		new MainGUI();
		
	}

	public void actionPerformed(ActionEvent e) {
		try {
	        Fenster.setCursor(new Cursor(Cursor.WAIT_CURSOR));
	        
	        if(plusMinus.isSelected() == true){
	        	if (p1Value < 100){
		        	p1Value = p1Value + 10;
		        }
		        if(p1Value > 100) {
		        	p1Value = 100;
		        }
	        } else {
	        	if (p1Value > 0){
		        	p1Value = p1Value - 10;
		        }
		        if(p1Value < 0) {
		        	p1Value = 0;
		        }
	        }
	        
	        if (p1Value < 100){
	        	p1Value = p1Value + 10;
	        }
	        if(p1Value >= 100) {
	        	p1Value = 0;
	        }
	        progressBar1.setValue(p1Value);
	        ladeWert.setText("Wert von Ladebalken 1: " + p1Value);
	        p2Value = slider.getValue();
	        ladeWert2.setText("Wert von Ladebalken 2: " + p2Value);
	        progressBar2.setValue(p2Value);
	        }
		
		catch(Exception ex) {
			ladeWert.setText("Kann den Cursor nicht �ndern.");
			System.out.println(ex);
			}  
		
	}
}
