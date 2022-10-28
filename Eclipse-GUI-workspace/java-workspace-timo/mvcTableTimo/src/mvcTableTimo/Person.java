package mvcTableTimo;

public class Person {
	
	String vorname;
	String nachname;
	String klasse;

    public Person(String vorname, String nachname, String klasse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
    }

    public String getKlasse() {
        return klasse;
    }

    public String getVorname() {
        return vorname;
    }
    
    public String getNachname() {
        return nachname;
    }
	
}
