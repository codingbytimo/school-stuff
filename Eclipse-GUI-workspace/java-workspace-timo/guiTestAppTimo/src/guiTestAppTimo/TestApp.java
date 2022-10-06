package src.guiTestAppTimo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextField;

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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.JEditorPane;

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
	private JLabel lblCount;
	private TextField tfCount;
	private JButton btnCount;
	private JEditorPane EditorPane;
	private int count = 0;
	
	String comboBoxListe[] = {"Baden-Wuerrttemberg", "Bayern",
            "Berlin", "Brandenburg", "Bremen",
            "Hamburg", "Hessen", "Mecklenburg-Vorpommern",
            "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz",
            "Saarland", "Sachsen", "Sachsen-Anhalt",
            "Schleswig-Holstein", "Thueringen"};
	private JPasswordField passwordField;
	private JSeparator separator_1;
	
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
        tabpane.addTab("Ich bin gruen", panelGreen);
        tabpane.addTab("einfache Komponenten", panelSpass);
        
        btnKnopf = new JButton("Knopf");
        btnKnopf.setBounds(61, 26, 85, 23);
        btnKnopf.setForeground(Color.WHITE);
        btnKnopf.setBackground(Color.DARK_GRAY);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnKnopf.addActionListener(e -> panelSpass.setCursor(cursor));
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
        slider.setBounds(325, 30, 200, 26);
        slider.setBackground(Color.WHITE);
        panelSpass.add(slider);
        
        comboBox = new JComboBox(comboBoxListe);
        comboBox.setBounds(325, 90, 171, 20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(Color.GRAY);
        panelSpass.add(comboBox);
        
        JLabel lblBundeslnderDeutschland = new JLabel("JComboBox Bundeslaender:");
        lblBundeslnderDeutschland.setBounds(325, 70, 171, 14);
        panelSpass.add(lblBundeslnderDeutschland);
        
        JLabel lblNewLabel = new JLabel("JTextField");
        lblNewLabel.setBounds(61, 55, 87, 13);
        panelSpass.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("JSlider");
        lblNewLabel_1.setBounds(325, 11, 45, 13);
        panelSpass.add(lblNewLabel_1);
        
        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(160, 160, 160));
        separator.setBackground(new Color(0, 0, 0));
        separator.setBounds(35, 160, 550, 10);
        panelSpass.add(separator);
        frame.getContentPane().add(tabpane);
        
        JPanel panelComplex = new JPanel();
        tabpane.addTab("komplexe Komponenten", null, panelComplex, null);
        panelComplex.setLayout(null);
        
        lblCount = new JLabel("Zaehler");
        lblCount.setSize(50, 20);
        lblCount.setLocation(50, 25);
        panelComplex.add(lblCount); 

        tfCount = new TextField(count + "", 10);
        tfCount.setSize(50, 20);
        tfCount.setLocation(105, 25);
        tfCount.setEditable(false);
        panelComplex.add(tfCount);

        btnCount = new JButton("Hochzaehlen");
        btnCount.setSize(120, 20);
        btnCount.setLocation(160, 25);
        btnCount.setForeground(new Color(0, 0, 0));
        panelComplex.add(btnCount); 
        
        separator_1 = new JSeparator();
        separator_1.setBackground(new Color(0, 0, 0));
        separator_1.setForeground(new Color(128, 128, 128));
        separator_1.setBounds(40, 60, 540, 10);
        panelComplex.add(separator_1);

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);
        
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
        
		
	}
	
	// Das ist eine innere Klasse um den Zaehler nutzen zu koennen
	   private class BtnCountListener implements ActionListener {
	      @Override
	      public void actionPerformed(ActionEvent evt) {
	         ++count; // Wert vom Zaehler erhoehen
	         // Wert vom Zaehler anzeigen
	         tfCount.setText(count + ""); // 'int' zu 'String' konvertieren
	      }
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
