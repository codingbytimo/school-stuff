package mvcTableTimo;

public class App {

	public static void main(String[] args) {
		Model m = new Model(); 
	    View v = new View();
	    Controller c = new Controller(m, v);
	    c.getDataOnStartup();
	    c.initController(); 
	    v.setVisible(true); 

	}

}
