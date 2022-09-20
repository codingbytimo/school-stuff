package gui;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends Frame implements ActionListener {
	
	JPanel Panel;
	JTextField textFeld;
	JLabel text;
	JButton Knopf;
	
	public MainGUI() {
		
		JFrame Fenster = new JFrame("IP Finder 3000");
		Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Fenster.setResizable(true);
		Fenster.setLocation(250, 250);
		
		Panel = new JPanel(new BorderLayout());
		
		textFeld = new JTextField();
		textFeld.setBounds(50, 50, 150, 20);
		
		text = new JLabel("Hier wird die IP angezeigt.");
		text.setBounds(50, 102, 400, 20);
		
		Knopf = new JButton("IP herausfinden");
		Knopf.setBounds(50, 150, 95, 30);
		Knopf.setSize(400, 100);
		Knopf.addActionListener(this);
		
		Fenster.getContentPane().add(textFeld);
		Fenster.getContentPane().add(text);
		Fenster.getContentPane().add(Knopf);
		
		
		Fenster.setSize(1000, 750);
		Fenster.getContentPane().setLayout(null);
		Fenster.setVisible(true);
	}
	
	public static void main(String[] args){
		
		new MainGUI();
		
	}

	public void actionPerformed(ActionEvent e) {
		try {  
	        String host = textFeld.getText();  
	        String ip = java.net.InetAddress.getByName(host).getHostAddress();  
	        text.setText("Die IP von " + host + " lautet: " + ip);  
	        }
		
		catch(Exception ex) {
			text.setText("ungültige IP Adresse!");
			System.out.println(ex);
			}  
		
	}

}
