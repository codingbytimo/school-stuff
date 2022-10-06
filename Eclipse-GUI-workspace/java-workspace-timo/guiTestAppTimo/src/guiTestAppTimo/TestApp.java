package javaGuiTimo;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;

public class TestApp implements ActionListener {

	private JFrame frame;
	private JPanel panelRot;
	private JPanel panelBlue;
	private JPanel panelGreen;
	private JPanel panelSpass;
	private JTabbedPane tabpane;
	private JLabel lblGutenTag;
	private JButton btnKnopf;
	private JLabel label;
	private JColorChooser farben;
	private JComboBox comboBox;
	
	String comboBoxListe[] = {"Baden-W�rttemberg", "Bayern",
            "Berlin", "Brandenburg", "Bremen",
            "Hamburg", "Hessen", "Mecklenburg-Vorpommern",
            "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz",
            "Saarland", "Sachsen", "Sachsen-Anhalt",
            "Schleswig-Holstein", "Th�ringen"};
	private JPasswordField passwordField;
	
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
		frame.setBounds(300, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        panelRot = new JPanel();
        panelBlue = new JPanel();
        panelGreen = new JPanel();
        panelSpass = new JPanel();
 
        panelRot.setBackground(Color.RED);
        panelBlue.setBackground(Color.BLUE);
        panelGreen.setBackground(Color.GREEN);
 
        tabpane = new JTabbedPane
            (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
 
        tabpane.addTab("Ich bin rot", panelRot);
        panelRot.setLayout(null);
        
        tabpane.addTab("Ich bin blau", panelBlue);
        tabpane.addTab("Ich bin gr�n", panelGreen);
        tabpane.addTab("Komponenten", panelSpass);
        
        btnKnopf = new JButton("Knopf");
        btnKnopf.setBounds(61, 26, 85, 23);
        btnKnopf.setForeground(Color.WHITE);
        btnKnopf.setBackground(Color.DARK_GRAY);
        btnKnopf.addActionListener(e -> System.exit(0));
        panelSpass.setLayout(null);
        
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setBounds(-10008, -10053, 121, 77);
        addPopup(panelSpass, popupMenu);
        
        JLabel lblDasIstEin = new JLabel("Das ist ein PopUp Menu");
        popupMenu.add(lblDasIstEin);
        
        JButton btnZurck = new JButton("Noch ein Knopf");
        popupMenu.add(btnZurck);
        
        JLabel lblPasswort = new JLabel("Passwort:");
        popupMenu.add(lblPasswort);
        
        passwordField = new JPasswordField();
        popupMenu.add(passwordField);
        panelSpass.add(btnKnopf);
        
        label = new JLabel("");
        label.setBounds(61, 114, 0, 0);
        panelSpass.add(label);
        
        lblGutenTag = new JLabel("JButton");
        lblGutenTag.setBounds(61, 10, 85, 14);
        panelSpass.add(lblGutenTag);
        
        JTextArea txtrTextEingebenBitte = new JTextArea();
        txtrTextEingebenBitte.setBounds(61, 70, 171, 22);
        txtrTextEingebenBitte.setText("Eingabe bitte.");
        txtrTextEingebenBitte.setForeground(Color.BLACK);
        txtrTextEingebenBitte.setBackground(Color.WHITE);
        panelSpass.add(txtrTextEingebenBitte);
        
        JCheckBox chckbxCheck = new JCheckBox("JCheckBox");
        chckbxCheck.setBounds(61, 99, 97, 23);
        panelSpass.add(chckbxCheck);
        
        JRadioButton rdbtnPunktknopf = new JRadioButton("JRadioButton");
        rdbtnPunktknopf.setBounds(61, 125, 109, 23);
        panelSpass.add(rdbtnPunktknopf);
        
        JSlider slider = new JSlider();
        slider.setBounds(61, 164, 200, 26);
        slider.setBackground(Color.WHITE);
        panelSpass.add(slider);
        
        comboBox = new JComboBox(comboBoxListe);
        comboBox.setBounds(61, 219, 171, 20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(Color.GRAY);
        panelSpass.add(comboBox);
        
        /*BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("C:\\Users\\T.Kochanski.AD\\Desktop\\java-workspace-timo\\guiTestAppTimo\\src\\ressources\\spriteBottle.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			panelGreen.add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
        
        JLabel lblBundeslnderDeutschland = new JLabel("JComboBox Bundesländer:");
        lblBundeslnderDeutschland.setBounds(61, 200, 171, 14);
        panelSpass.add(lblBundeslnderDeutschland);
        
        JLabel lblNewLabel = new JLabel("JTextField");
        lblNewLabel.setBounds(59, 59, 87, 13);
        panelSpass.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("JSlider");
        lblNewLabel_1.setBounds(61, 154, 45, 13);
        panelSpass.add(lblNewLabel_1);
        frame.getContentPane().add(tabpane);
        
        
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
