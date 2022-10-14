package guiTimoMVC;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import guiTimoMVC.View;

public class Controller {
	
	private View view;
	Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	public Controller(View view) { 
	    this.view = view;
	}
	
	private void initView() {
	}

	public int count = 0;
	
	public int getCount() {
	     return this.count;
	}
	
	public void initController() {
		view.getBtnKnopf().addActionListener(e -> view.getPanelSimple().setCursor(cursor));
		
		view.getBtnCount().addActionListener(e -> {
			++count; // Wert vom Zaehler erhoehen
	         // Wert vom Zaehler anzeigen
	         view.getTfCount().setText(count + "");
		});
		
		view.addWindowListener(new WindowAdapter() { 

			public void windowClosing(WindowEvent e) { 

			int answer = JOptionPane.showConfirmDialog(null, 

			"Möchten Sie das Programm beenden?", 

			"Bestätigung", 

			JOptionPane.YES_NO_OPTION); 

			if (answer == JOptionPane.YES_OPTION) { 

			System.exit(0);

			} 

			} 

			});
	}
	
	
	// Methode fuer das PopUp Menu
	public void addPopup(Component component, JPopupMenu popup) {
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
