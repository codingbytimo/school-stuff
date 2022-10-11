package guiTimoMVC;

import guiTimoMVC.View;
import guiTimoMVC.Controller;


public class App {

	public static void main(String[] args) {
		
		View v = new View();
		Controller c = new Controller();
		
		// VORSICHT NOCH KAPUTT ENDLOSSCHLEIFE
		//v.initView();
		c.initController();

	}

}
