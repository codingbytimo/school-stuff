package mvcTableTimo;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JButton;

public class View extends JFrame {
	
	private JTable table;
	private JButton btnAppend;
	private JButton btnDelete;
	
	public View() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 120);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setTitle("MVC Table - Timo");
		table = new JTable();
		getContentPane().add(table, BorderLayout.CENTER);
		
		btnAppend = new JButton("Append");
		getContentPane().add(btnAppend, BorderLayout.SOUTH);
		btnDelete = new JButton("Delete");
		getContentPane().add(btnAppend, BorderLayout.SOUTH);
		
	}
	
	public JTable getTable() {
		return table;
	}

}
