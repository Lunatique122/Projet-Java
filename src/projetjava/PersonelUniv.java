package projetjava;

public class PersonelUniv extends Personne {
	private String status;

	public PersonelUniv(String nom, String prenom, int numCNI, String status) {
		super(nom, prenom, numCNI);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	

}
