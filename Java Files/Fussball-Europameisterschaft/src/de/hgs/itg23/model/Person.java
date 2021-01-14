package de.hgs.itg23.model;

public class Person {
	
	//Eigenschaften einer Person
	public String name;
	//public int jahrgang; //groeßer als 1900
	private int jahrgang;
	
	//Operatoren (get and set)
	public int getJahrgang() {
		return jahrgang;
	}
	
	public void setJahrgang(int pJahrgang) {
		if (pJahrgang >= 1900) {
			jahrgang = pJahrgang;
		}
	}

}
