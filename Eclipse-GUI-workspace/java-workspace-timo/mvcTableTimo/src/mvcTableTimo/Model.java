package mvcTableTimo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {
	
		private View view;
		private Person person;
		ArrayList<Person> data;
		
		String[] columnNames = {"Vorname", 
				"Nachname",
				"Klasse"};

		@Override
		public int getColumnCount() {
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			return data.size(); 
		}

		@Override
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}
		
		Class[] columns = new Class[] {String.class,
				String.class, 
				String.class}; 
		
		public Class getColumnClass(int c) {
			return getValueAt(0, c).getClass();
		}
		
		public boolean isCellEditable(int row, int col) {
			if (col == 1) {
	            return true;
	        } else {
	            return false;
	        }
		}

		public void setValueAt(Object value, int row, int col) {
			data[row][col] = value;
	        fireTableCellUpdated(row, col);
		}
		
		public void addElements() {
			data = new ArrayList<>(3);
			data.add(new Person("Peter", "Lustig", "TG 12/3"));
		}
		
}
