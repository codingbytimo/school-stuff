package de.hgs.itg23.test;

import de.hgs.itg23.model.Spieler;

public class Test {
	
	public static void main(String[] args) {
		
		Spieler ginter = new Spieler();
		ginter.name = "Matthias Ginter";
		ginter.setJahrgang(1994);
		ginter.staerke = 5;
		ginter.torschuss = 5;
		ginter.motivation = 5;
		
	}

}
