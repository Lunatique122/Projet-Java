package projetjava;

public class Salle {
	private final int numero;
	private String batiment;
	private int nbplaces;
	private String type;
	
	public Salle(int numero, String batiment, int nbplaces, String type) {
		super();
		this.numero = numero;
		this.batiment = batiment;
		this.nbplaces = nbplaces;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Salle [numero=" + numero + ", batiment=" + batiment + ", nbplaces=" + nbplaces + ", type=" + type + "]";
	}

	public int getNumero() {
		return numero;
	}


	public String getBatiment() {
		return batiment;
	}

	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}

	public int getNbplaces() {
		return nbplaces;
	}

	public void setNbplaces(int nbplaces) {
		this.nbplaces = nbplaces;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
