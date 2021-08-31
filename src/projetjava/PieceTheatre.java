package projetjava;

public class PieceTheatre extends Spectacle {
	private String auteur;
	private int anneeparution;
	private static String typespec = "Piece de theatre";
	private String type;
	
	public PieceTheatre(String titre, Association association, String auteur, int anneeparution, String type) {
		super(titre, typespec,  association);
		this.auteur = auteur;
		this.anneeparution = anneeparution;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PieceTheatre [auteur=" + auteur + ", titre="
				+ titre + ", anneeparution=" + anneeparution + ", type=" + type  + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAnneeparution() {
		return anneeparution;
	}

	public void setAnneeparution(int anneeparution) {
		this.anneeparution = anneeparution;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
