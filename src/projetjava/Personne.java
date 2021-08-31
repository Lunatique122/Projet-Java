package projetjava;

public class Personne {
	protected String Nom;
	protected String Prenom;
	protected final int NumCNI;
	
	protected Personne(String nom, String prenom, int numCNI) {
		super();
		Nom = nom;
		Prenom = prenom;
		NumCNI = numCNI;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getNumCNI() {
		return NumCNI;
	}

	@Override
	public String toString() {
		return String.format("Nom :" + this.Nom + "- Prénom :" + this.Prenom + " - CNI : " + this.NumCNI);
	}
	

}
