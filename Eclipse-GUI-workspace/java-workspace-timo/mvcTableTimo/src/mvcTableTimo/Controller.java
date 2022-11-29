package mvcTableTimo;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Controller {
	
	private Model model; 
	private View view;

	public Controller(Model m, View v) { 

	  model = m;
	  view = v;

	  initView();
	}

	public void initView() { 
		view.getTable().setModel(model);
	} 

	public void initController() { 
		view.getBtnAppend().addActionListener(e -> appendEmptyRow(e));
		view.getBtnDelete().addActionListener(e -> deleteRow(e));
		saveDataOnClose();
	}
	
	private void appendEmptyRow(ActionEvent e) { 
		this.model.appendEmptyRow();
		int count = view.getTable().getRowCount(); 
		view.getTable().setRowSelectionInterval(count-1, count-1); 
		view.getTable().editCellAt(count-1, 0);
		view.getTable().setSurrendersFocusOnKeystroke(true);
		view.getTable().getEditorComponent().requestFocus();
	}
	
	private void deleteRow(ActionEvent e) { 
		  int row = view.getTable().getSelectedRow(); 
		  this.model.deleteRow(row);
	}
	
	private void saveDataOnClose() {
		view.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				String fileName = "src/resources/persons.json";
		        Path path = Paths.get(fileName);
		        
		        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
					
		        	Gson gson = new Gson();
		            gson.toJson(model.getData(), writer);
		        	
				} catch (Exception e) {
					System.out.println("Failed to save the File.");
				}
		        
		        System.out.println("Printed Persons to JSON File.");
			}
		});
	}
	
	public ArrayList<Person> getDataOnStartup() {
			
				String fileName = "src/resources/persons.json";
		        Path path = Paths.get(fileName);
		        assertFalse(Files.exists(path));
		        
				try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

		            Gson gson = new Gson();
		            model.data = gson.fromJson(reader, 
		            		new TypeToken<ArrayList<Person>>(){}.getType());
		        }
				catch (Exception e) {
					System.out.println("Error on reading!");
				}
				
				return model.data;
				
			}

}
