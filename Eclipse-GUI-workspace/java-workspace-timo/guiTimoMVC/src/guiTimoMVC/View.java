package guiTimoMVC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import guiTimoMVC.Controller;

public class View extends JFrame {
	
	// JPanel Deklaration
	private JPanel panelRot;
	private JPanel panelBlue;
	private JPanel panelGreen;
	private JPanel panelSpass;
	private JPanel panelComplex;
	private JTabbedPane tabpane;
	
	// JLabel Deklaration
	private JLabel lblGutenTag;
	private JLabel lblBundeslnderDeutschland;
	private JLabel label;
	private JLabel popUpLabel;
	private JLabel passwordLabel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	// Button Deklaration
	private JButton btnKnopf;
	private JButton btnCount;
	private JButton btnBack;
	private JRadioButton rdbtnPunktknopf;
	
	// Deklaration anderer Komponenten
	private JPopupMenu popupMenu;
	private JColorChooser farben;
	private JComboBox comboBox;
	private JLabel lblCount;
	private TextField tfCount;
	private JEditorPane EditorPane;
	private JPasswordField passwordField;
	private JSeparator separator_1;
	private JTextArea txtrTextEingebenBitte;
	private JCheckBox chckbxCheck;
	private JSlider slider;
	private JSeparator separator;
	
	//int ViewCount = Controller.getCount();
	
	String comboBoxListe[] = {"Baden-Wuerrttemberg", "Bayern",
            "Berlin", "Brandenburg", "Bremen",
            "Hamburg", "Hessen", "Mecklenburg-Vorpommern",
            "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz",
            "Saarland", "Sachsen", "Sachsen-Anhalt",
            "Schleswig-Holstein", "Thueringen"};
	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void initView() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		initView();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 500);
		/*contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
		
		// Erstellen aller UI Komponenten
		
		// Panel
		tabpane = new JTabbedPane
                (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
		panelRot = new JPanel();
		panelRot.setBackground(Color.RED);
		panelRot.setLayout(null);
        panelBlue = new JPanel();
        panelBlue.setBackground(Color.BLUE);
        panelGreen = new JPanel();
        panelGreen.setBackground(Color.GREEN);
        panelSpass = new JPanel();
        panelSpass.setLayout(null);
        panelComplex = new JPanel();
        panelComplex.setLayout(null);
        
        // PopUp Menu
        popupMenu = new JPopupMenu();
        popupMenu.setBounds(-10008, -10053, 121, 77);
        Controller.addPopup(panelSpass, popupMenu);
        
        // Buttons
        btnBack = new JButton("Noch ein Knopf");
        btnKnopf = new JButton("Knopf");
        btnKnopf.setBounds(61, 26, 85, 23);
        btnKnopf.setForeground(Color.WHITE);
        btnKnopf.setBackground(Color.DARK_GRAY);
        panelSpass.add(btnKnopf);
        btnCount = new JButton("Hochzaehlen");
        btnCount.setSize(120, 20);
        btnCount.setLocation(160, 25);
        btnCount.setForeground(new Color(0, 0, 0));
        panelComplex.add(btnCount); 
        rdbtnPunktknopf = new JRadioButton("JRadioButton");
        rdbtnPunktknopf.setBounds(61, 125, 109, 23);
        panelSpass.add(rdbtnPunktknopf);
        
        // PasswordField
        passwordField = new JPasswordField();
        
        // Labels
        passwordLabel = new JLabel("Passwort:");
        label = new JLabel("");
        lblGutenTag = new JLabel("JButton");
        lblGutenTag.setBounds(61, 10, 85, 14);
        panelSpass.add(lblGutenTag);
        txtrTextEingebenBitte = new JTextArea();
        lblBundeslnderDeutschland = new JLabel("JComboBox Bundeslaender:");
        lblBundeslnderDeutschland.setBounds(325, 70, 171, 14);
        panelSpass.add(lblBundeslnderDeutschland);
        lblNewLabel = new JLabel("JTextField");
        lblNewLabel.setBounds(61, 55, 87, 13);
        panelSpass.add(lblNewLabel);
        lblNewLabel_1 = new JLabel("JSlider");
        lblNewLabel_1.setBounds(325, 11, 45, 13);
        panelSpass.add(lblNewLabel_1);
        lblCount = new JLabel("Zaehler");
        lblCount.setSize(50, 20);
        lblCount.setLocation(50, 25);
        panelComplex.add(lblCount); 
        popUpLabel = new JLabel("Das ist ein PopUp Menu");
        
        // TextField
        /*tfCount = new TextField(ViewCount + "", 10);
        tfCount.setSize(50, 20);
        tfCount.setLocation(105, 25);
        tfCount.setEditable(false);
        panelComplex.add(tfCount);*/
        
        // CheckBox
        chckbxCheck = new JCheckBox("JCheckBox");
        chckbxCheck.setBounds(61, 99, 97, 23);
        panelSpass.add(chckbxCheck);
        
        // Slider
        slider = new JSlider();
        slider.setBounds(325, 30, 200, 26);
        slider.setBackground(Color.WHITE);
        panelSpass.add(slider);
        
        // comboBox
        comboBox = new JComboBox(comboBoxListe);
        comboBox.setBounds(325, 90, 171, 20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(Color.GRAY);
        panelSpass.add(comboBox);
        
        // Separator
        separator = new JSeparator();
        separator.setForeground(new Color(160, 160, 160));
        separator.setBackground(new Color(0, 0, 0));
        separator.setBounds(35, 160, 550, 10);
        panelSpass.add(separator);
        separator_1 = new JSeparator();
        separator_1.setBackground(new Color(0, 0, 0));
        separator_1.setForeground(new Color(128, 128, 128));
        separator_1.setBounds(40, 60, 540, 10);
        panelComplex.add(separator_1);
        //tfCount = new TextField(count + "", 10);
        
        // EditorPane
        EditorPane = new JEditorPane();
        EditorPane.setLocation(15, 100);
        EditorPane.setSize(600, 200);
        EditorPane.setContentType("text/html");
        EditorPane.setText("<html>\r\n"
        		+ "<head>\r\n"
        		+ "<style>\r\n"
        		+ "body {background-color: orange;}\r\n"
        		+ "h1   {color: blue;}\r\n"
        		+ "p    {color: purple;}\r\n"
        		+ "</style>"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "\r\n"
        		+ "<h1>Guten Tag!</h1>\r\n"
        		+ "\r\n"
        		+ "<p>Das hier ist HTML innerhalb von Java.</p>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>");
        panelComplex.add(EditorPane);
        
        // Tabs zur Tabbedpane hinzufuegen
        tabpane.addTab("Ich bin rot", panelRot);
        tabpane.addTab("Ich bin blau", panelBlue);
        tabpane.addTab("Ich bin gruen", panelGreen);
        tabpane.addTab("einfache Komponenten", panelSpass);
        tabpane.addTab("komplexe Komponenten", null, panelComplex, null);
        
        // Hinzufuegen aller Komponenten in den JFrame
        getContentPane().add(tabpane);
	}

}
