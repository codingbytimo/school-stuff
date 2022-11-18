package mvcTableTimo;

public class Person {
	
	private String vorname;
	private String nachname;
	private String klasse;

    public Person(String vorname, String nachname, String klasse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
    }

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

    
	
}
