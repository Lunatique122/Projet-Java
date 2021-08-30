package projetjava;

public class Intervenant {
	private Personne personne;
	private String fonction;
	
	
	public Intervenant(Personne personne, String fonction) {
		super();
		this.personne = personne;
		this.fonction = fonction;
	}
	


	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Personne getPersonne() {
		return personne;
	}


	
	
	
	

}
