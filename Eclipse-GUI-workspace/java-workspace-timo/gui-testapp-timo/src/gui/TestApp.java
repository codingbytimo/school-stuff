package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class TestApp implements ActionListener {

	private JFrame frame;
	private JPanel panelRot;
	private JPanel panelBlue;
	private JPanel panelGreen;
	private JPanel panelSpass;
	private JPanel panelDebug;
	private JTabbedPane tabpane;
	private JLabel lblGutenTag;
	private JLabel lblDebugLog;
	private JButton btnKnopf;
	private JLabel label;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestApp window = new TestApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        panelRot = new JPanel();
        panelBlue = new JPanel();
        panelGreen = new JPanel();
        panelSpass = new JPanel();
        panelDebug = new JPanel();
 
        panelRot.setBackground(Color.RED);
        panelBlue.setBackground(Color.BLUE);
        panelGreen.setBackground(Color.GREEN);
 
        tabpane = new JTabbedPane
            (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
 
        tabpane.addTab("Ich bin rot", panelRot);
        tabpane.addTab("Ich bin blau", panelBlue);
        tabpane.addTab("Ich bin grün", panelGreen);
        tabpane.addTab("Spass", panelSpass);
        tabpane.addTab("DEBUG", panelDebug);
        
        lblDebugLog = new JLabel("DEBUG Log:");
        panelDebug.add(lblDebugLog);
        panelSpass.setLayout(null);
        
        btnKnopf = new JButton("Knopf");
        btnKnopf.setBounds(61, 36, 85, 23);
        btnKnopf.addActionListener(e -> System.exit(0));
        panelSpass.add(btnKnopf);
        
        label = new JLabel("");
        label.setBounds(61, 114, 0, 0);
        panelSpass.add(label);
        
        lblGutenTag = new JLabel("Guten Tag.");
        lblGutenTag.setBounds(61, 11, 171, 14);
        panelSpass.add(lblGutenTag);
        
        JTextArea txtrTextEingebenBitte = new JTextArea();
        txtrTextEingebenBitte.setText("Text eingeben bitte.");
        txtrTextEingebenBitte.setBounds(61, 70, 171, 22);
        panelSpass.add(txtrTextEingebenBitte);
        
        JCheckBox chckbxCheck = new JCheckBox("gib Check");
        chckbxCheck.setBounds(61, 99, 97, 23);
        panelSpass.add(chckbxCheck);
        
        JRadioButton rdbtnPunktknopf = new JRadioButton("Punktknopf");
        rdbtnPunktknopf.setBounds(61, 125, 109, 23);
        panelSpass.add(rdbtnPunktknopf);
        
        frame.getContentPane().add(tabpane);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
