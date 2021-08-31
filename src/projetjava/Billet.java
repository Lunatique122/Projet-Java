package projetjava;

public class Billet {
	private Tarif tarif;
	private Personne personne;
	private Seance seance;
	private Datee dateachat;
	
	
	public Billet(Tarif tarif, Personne personne, Seance seance, Datee dateachat) { // Constructeur de billet pour etudiant
		super();
		this.tarif = tarif;
		this.personne = personne;
		this.seance = seance;
		this.dateachat = dateachat;
	}
	

	public Tarif getTarif() {
		return tarif;
	}

	public Personne getPersonne() {
		return personne;
	}


	public Seance getSeance() {
		return seance;
	}

	public Datee getDateachat() {
		return dateachat;
	}




	@Override
	public String toString() {
		return "Billet Réservé par [ " + this.personne.getNom() + " " + this.personne.getPrenom()
				+ ", Date d'achat : " + this.dateachat + ", Tarif :" + this.tarif.getPrix() + "€ ]";
	}
	

}
