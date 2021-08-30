package projetjava;

public class Tarif {
	private final String nom;
	private int prix;
	
	public Tarif(String nom, int prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Tarif [nom=" + nom + ", prix=" + prix + "]";
	}

	public String getNom() {
		return nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	

}
