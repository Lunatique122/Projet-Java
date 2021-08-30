package projetjava;

public class Standup extends Spectacle {
	private String auteur;
	private String genre;
	private static String typespec = "Stand Up";
	
	public Standup(String titre, Association association, String auteur, String genre) {
		super(titre,typespec, association);
		this.auteur = auteur;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Standup [auteur=" + auteur + ", genre=" + genre + ", titre=" + titre + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
