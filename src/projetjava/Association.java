package projetjava;

import java.util.ArrayList;

public class Association {
	private final String nom;
	private String description;
	private String categorie;
	private String mail;
	private Datee datecrea;
	private String siteweb;
	private Personne president;
	private Personne tresorier;
	private Salle salle;
	private ArrayList<Etudiant> etudiants;
	
	
	public Association(String nom, String categorie, String mail, Personne president, Personne tresorier,
			Salle salle) {
		super();
		this.nom = nom;
		this.categorie = categorie;
		this.mail = mail;
		Datee date = new Datee();
		this.datecrea = date ;
		this.president = president;
		this.tresorier = tresorier;
		this.salle = salle;
		this.etudiants = new ArrayList<Etudiant>();
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getSiteweb() {
		return siteweb;
	}


	public void setSiteweb(String siteweb) {
		this.siteweb = siteweb;
	}


	public Personne getPresident() {
		return president;
	}


	public void setPresident(Etudiant president) {
		this.president = president;
	}


	public Personne getTresorier() {
		return tresorier;
	}


	public void setTresorier(Etudiant tresorier) {
		this.tresorier = tresorier;
	}


	public Salle getSalle() {
		return salle;
	}


	public void setSalle(Salle salle) {
		this.salle = salle;
	}


	public String getNom() {
		return nom;
	}


	public Datee getDatecrea() {
		return datecrea;
	}


	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}
	
	
	
	
	
	
	
	
	

}
