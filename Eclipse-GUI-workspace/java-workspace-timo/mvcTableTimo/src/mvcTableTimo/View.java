package mvcTableTimo;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JPanel;

public class View extends JFrame {
	
	private JTable table;
	private JButton btnAppend;
	private JButton btnDelete;
	
	public View() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 250);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setTitle("MVC Table - Timo");
		table = new JTable();
		getContentPane().add(table, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnAppend = new JButton("Append");
		panel.add(btnAppend);
		
		btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		
	}
	
	public JButton getBtnAppend() {
		return btnAppend;
	}

	public void setBtnAppend(JButton btnAppend) {
		this.btnAppend = btnAppend;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JTable getTable() {
		return table;
	}

}
