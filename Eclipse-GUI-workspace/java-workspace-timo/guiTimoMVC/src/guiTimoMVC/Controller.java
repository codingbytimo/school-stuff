package guiTimoMVC;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class Controller {
	
	public int count = 0;
	
	public int getCount() {
	     return this.count;
	  }
	
	public void initController() {
		
	}
	
	// Methode fuer das PopUp Menu
	public static void addPopup(JPanel panel, JPopupMenu popupMenu) {
		panel.addMouseListener(new MouseAdapter() {
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
				popupMenu.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
	}

}
