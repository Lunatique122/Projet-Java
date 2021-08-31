package projetjava;

import java.util.ArrayList;

public class Seance {
	Spectacle spectacle; 
	Salle salle;
	Datee dateseance;
	Heure heuredebut;
	Heure heurefin;
	int nbplaces;
	int nbplaceslibres;
	ArrayList<Billet> billets;
	int nbbillets;
	
	
	public Seance(Spectacle spectacle, Salle salle, Datee dateseance, Heure heuredebut, Heure heurefin) {
		super();
		this.spectacle = spectacle;
		this.salle = salle;
		this.dateseance = dateseance;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.nbplaces = salle.getNbplaces();
		this.nbplaceslibres = this.nbplaces;
		this.billets = new ArrayList <Billet>();
		this.nbbillets = 0;
		
	}
	
	


	
	public String afficheseance() {
		return "Seance [date=" + dateseance + ", heure de debut=" + heuredebut + ", heure de fin="
				+ heurefin + ", nombre de places libres=" + nbplaceslibres + " salle="+ salle +"]";
	}





	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Datee getDateseance() {
		return dateseance;
	}

	public void setDateseance(Datee dateseance) {
		this.dateseance = dateseance;
	}

	public Heure getHeuredebut() {
		return heuredebut;
	}

	public void setHeuredebut(Heure heuredebut) {
		this.heuredebut = heuredebut;
	}

	public Heure getHeurefin() {
		return heurefin;
	}

	public void setHeurefin(Heure heurefin) {
		this.heurefin = heurefin;
	}

	public int getNbplaces() {
		return nbplaces;
	}

	public void setNbplaces(int nbplaces) {
		this.nbplaces = nbplaces;
	}

	public int getNbplaceslibres() {
		return nbplaceslibres;
	}

	public void setNbplaceslibres(int nbplaceslibres) {
		this.nbplaceslibres = nbplaceslibres;
	}

	public ArrayList<Billet> getBillets() {
		return billets;
	}

	public void setBillets(ArrayList<Billet> billets) {
		this.billets = billets;
	}

	public int getNbbillets() {
		return nbbillets;
	}

	public void setNbbillets(int nbbillets) {
		this.nbbillets = nbbillets;
	}

	
	
	public boolean SeanceExistSpectacle () { //Sert à vérifier si pour un spectacle la seance a ajouter se supperpose à une seance déjà prévue.
		int i=0;
		boolean rep = false;
		Seance seance2;
		
		while (i<spectacle.getNbseances() && rep == false) {
			
			seance2 = spectacle.seances.get(i); // pour chaque seance du spectacle 
			if (seance2.dateseance.equals(this.getDateseance())) { //Si la date et la même on vérifie les heures 
				if ((seance2.heuredebut.equals(this.getHeuredebut())) || (seance2.heurefin.equals(this.getHeuredebut()))||(seance2.heuredebut.equals(this.getHeurefin()))||(seance2.heurefin.equals(this.getHeurefin()))) { //Pour une seance si son heure de début ou son heure de fin est égale à l'heure de début ou de fin testée il y a supperposition
					rep =  true;
				}
				else if (!(seance2.heuredebut.EstSup(this.getHeuredebut())) && (seance2.heuredebut.EstSup(this.getHeurefin()))) { //Pour une seance si son heure de début est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
					rep = true;
				}
				else if (!(seance2.heurefin.EstSup(this.getHeuredebut())) && (seance2.heurefin.EstSup(this.getHeurefin()))) { //Pour une seance si son heure de fin est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
					rep = true;
				}
			}
			i++;
		}
		if (rep == true) {
			System.out.println("Ce creneau est deja utilise pour ce spectacle");
		}
		return rep;
		
	}
	
	public boolean SeanceExisteSalle (Universite universite ) {
		boolean rep = false; 
		int i = 0;
		int j = 0;
		Seance seance2; 
		Spectacle spectacle;
		
		while ((i< universite.getNbSpectacles())&& (rep == false) ) { //On passe dans tous les spectacle
			spectacle = universite.spectacles.get(i);
			j=0;
			while ((j<spectacle.getNbseances())&&(rep==false)) {
				seance2 = spectacle.seances.get(j); //Pour chaque seance d'un spectacle
				if((seance2.dateseance.equals(this.getDateseance()))&&(seance2.salle==this.getSalle())) { //Si la seance est le mmême jour dans la même salle il faut vérifier les heures
					if ((seance2.heuredebut.equals(this.getHeuredebut())) || (seance2.heurefin.equals(this.getHeuredebut()))||(seance2.heuredebut.equals(this.getHeurefin()))||(seance2.heurefin.equals(this.getHeurefin()))) { //Pour une seance si son heure de début ou son heure de fin est égale à l'heure de début ou de fin testée il y a supperposition
						rep =  true;
					}
					else if (!(seance2.heuredebut.EstSup(this.getHeuredebut())) && (seance2.heuredebut.EstSup(this.getHeurefin()))) { //Pour une seance si son heure de début est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
						rep = true;
					}
					else if (!(seance2.heurefin.EstSup(this.getHeuredebut())) && (seance2.heurefin.EstSup(this.getHeurefin()))) { //Pour une seance si son heure de fin est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
						rep = true;
					}
					
				}
				j++;
			}
			i++;
		}
		if (rep == true) {
			System.out.println("Ce creneau est deja utilise pour cette salle");
		}
		return rep;
	}
		
		


	public void AjoutBillet (Tarif tarif, Personne personne) {
		if (this.nbplaceslibres > 0) {
			Datee dateachat = new Datee();
			Billet nouvbillet = new Billet (tarif, personne, this, dateachat);
			this.billets.add(nouvbillet );
			this.nbbillets ++;
			this.nbplaceslibres --;



		}

	}

	public void  AfficheBillets () {
		for (Billet billet: billets )
		{
			System.out.println (billet);
		}
	}
	
	@Override
	public String toString() {
		return this.afficheseance();
	}
	
}

	
	

