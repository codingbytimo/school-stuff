package mvcTableTimo;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {
	
		private View view;
		private Person person;
		private Controller controller;
		
		String[] columnNames = {"Vorname", 
				"Nachname",
				"Klasse"};
		
		ArrayList<Person> data = new ArrayList<>(
		Arrays.asList( 
				new Person("Peter", "Mustermann", "TG12/1"), 
				new Person("Sandra", "Schmidt","TG12/1"), 
				new Person("Tobias", "Müller","TG12/3") 
		)
		);

		public void setData(ArrayList<Person> data) {
			this.data = data;
		}

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
			Object value = null;
			switch (col) {
			case 0:
				value = data.get(row).getVorname();
				break;
			case 1:
				value = data.get(row).getNachname();
				break;
			case 2:
				value = data.get(row).getKlasse();
				break;
			default:
				break;
			}
			return value;
		}
		
		Class[] columns = new Class[] {String.class,
				String.class, 
				String.class}; 
		
		public Class getColumnClass(int c) {
			return getValueAt(0, c).getClass();
		}
		
		public boolean isCellEditable(int row, int col) {
			return true;
		}

		public void setValueAt(Object value, int row, int col) {
			switch (col) {
			case 0:
				data.get(row).setVorname((String)value);
				break;
			case 1:
				data.get(row).setNachname((String)value);
				break;
			case 2:
				data.get(row).setKlasse((String)value);
				break;
			default:
				break;
			}
	        fireTableCellUpdated(row, col);
		}
		
		public void addElements() {
			data.add(new Person("Peter", "Lustig", "TG 12/3"));
		}
		
		public ArrayList<Person> getData() {
			return data;
		}
		
		public void appendEmptyRow() {
			data.add(new Person("", "", ""));
			int count = getRowCount();
			fireTableRowsInserted(count-1, count-1); 
		}
		
		public void deleteRow(int rowIndex) {
			data.remove(rowIndex);
			int count = getRowCount();
			fireTableRowsDeleted(count-1, count-1);
		}
		
}
