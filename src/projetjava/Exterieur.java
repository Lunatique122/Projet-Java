package projetjava;

public class Exterieur extends Personne {
	private String orgaaffiliation;
	private int numtel;
	
	public Exterieur(String nom, String prenom, int numCNI, String orgaaffiliation, int numtel) {
		super(nom, prenom, numCNI);
		this.orgaaffiliation = orgaaffiliation;
		this.numtel = numtel;
	}

	public String getOrgaaffiliation() {
		return orgaaffiliation;
	}

	public void setOrgaaffiliation(String orgaaffiliation) {
		this.orgaaffiliation = orgaaffiliation;
	}

	public int getNumtel() {
		return numtel;
	}

	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}
	
	
	
	

}
