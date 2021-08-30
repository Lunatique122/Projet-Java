package projetjava;

import java.util.Date;

public class Datee {
	private int jour;
	private int mois;
	private int annee;


	public Datee(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public Datee () {
		super();
		this.jour = java.time.LocalDate.now().getDayOfMonth();
		this.mois = java.time.LocalDate.now().getMonthValue();
		this.annee = java.time.LocalDate.now().getYear();

	}


	public boolean equals (Datee date2) {
		if ((this.jour==date2.jour)&&(this.mois==date2.mois)&&(this.annee==date2.annee)) return true;
		else return false;
	}


	public int getJour() {
		return jour;
	}


	public int getMois() {
		return mois;
	}


	public int getAnnee() {
		return annee;
	}




}