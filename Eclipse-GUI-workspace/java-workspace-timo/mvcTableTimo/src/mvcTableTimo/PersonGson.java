package mvcTableTimo;

import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;

public class PersonGson {
	
	private Model model;
	
	/*public void saveDataOnClose() {
		
		
		String fileName = "src/resources/persons.json";
        Path path = Paths.get(fileName);
        
        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
			
        	Gson gson = new Gson();
            gson.toJson(model.getData(), writer);
        	
		} catch (Exception e) {
			System.out.println("Failed to save the File.");
		}
        
        System.out.println("Printed Persons to JSON File.");
		
	}*/
	
}	
