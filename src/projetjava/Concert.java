package projetjava;

public class Concert extends Spectacle {
	private String compositeur; 
	private int anneeparution;
	private String genre;
	private static String typespec = "Concert";
	
	
	public Concert(String titre, Association association, String compositeur, int anneeparution, String genre){
		super(titre, typespec, association);
		this.compositeur = compositeur;
		this.anneeparution = anneeparution;
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Concert [compositeur=" + compositeur + ", anneeparution=" + anneeparution + ", genre=" + genre
				+ ", titre=" + titre + "]";
	}


	public String getCompositeur() {
		return compositeur;
	}


	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}


	public int getAnneeparution() {
		return anneeparution;
	}


	public void setAnneeparution(int anneeparution) {
		this.anneeparution = anneeparution;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
}
