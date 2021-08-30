package projetjava;

import java.util.ArrayList;

public class Seance {
	Concert concert; 
	Standup santdup; 
	PieceTheatre piecetheatre; 
	Salle salle;
	Datee dateseance;
	Heure heuredebut;
	Heure heurefin;
	int nbplaces;
	int nbplaceslibres;
	ArrayList<Billet> billets;
	int nbbillets;
	
	
	public Seance(Concert concert, Salle salle, Datee dateseance, Heure heuredebut, Heure heurefin) {
		super();
		this.concert = concert;
		this.salle = salle;
		this.dateseance = dateseance;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.nbplaces = salle.getNbplaces();
		this.nbplaceslibres = this.nbplaces;
	}
	
	public Seance(Standup santdup, Salle salle, Datee dateseance, Heure heuredebut, Heure heurefin) {
		super();
		this.santdup = santdup;
		this.salle = salle;
		this.dateseance = dateseance;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.nbplaces = salle.getNbplaces();
		this.nbplaceslibres = this.nbplaces;
	}
	
	public Seance(PieceTheatre piecetheatre, Salle salle, Datee dateseance, Heure heuredebut, Heure heurefin) {
		super();
		this.piecetheatre = piecetheatre;
		this.salle = salle;
		this.dateseance = dateseance;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.nbplaces = salle.getNbplaces();
		this.nbplaceslibres = this.nbplaces;
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

	
	
	public boolean SeanceExistSpectacle (Standup spectacle, Datee date, Heure heuredeb, Heure heurefin) { //Sert à vérifier si pour un spectacle la seance a ajouter se supperpose à une seance déjà prévue.
		int i=0;
		boolean rep = false;
		Seance seance;
		
		while (i<spectacle.getNbseances() && rep == false) {
			
			seance = spectacle.seances.get(i); // pour chaque seance du spectacle 
			if (seance.dateseance.equals(date)) { //Si la date et la même on vérifie les heures 
				if ((seance.heuredebut.equals(heuredeb)) || (seance.heurefin.equals(heuredeb))||(seance.heuredebut.equals(heurefin))||(seance.heurefin.equals(heurefin))) { //Pour une seance si son heure de début ou son heure de fin est égale à l'heure de début ou de fin testée il y a supperposition
					rep =  true;
				}
				else if (!(seance.heuredebut.EstSup(heuredeb)) && (seance.heuredebut.EstSup(heurefin))) { //Pour une seance si son heure de début est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
					rep = true;
				}
				else if (!(seance.heurefin.EstSup(heuredeb)) && (seance.heurefin.EstSup(heurefin))) { //Pour une seance si son heure de fin est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
					rep = true;
				}
			}
			i++;
		}
		return rep;
		
	}
	
	public boolean SeanceExisteSalle (Universite universite, Salle salle, Datee date, Heure heuredeb, Heure heurefin ) {
		boolean rep = false; 
		int i = 0;
		int j = 0;
		Seance seance; 
		Spectacle spectacle;
		
		while ((i< universite.getNbSpectacles())&& (rep == false) ) { //On passe dans tous les spectacle
			spectacle = universite.spectacles.get(i);
			j=0;
			while ((j<spectacle.getNbseances())&&(rep==false)) {
				seance = spectacle.seances.get(j); //Pour chaque seance d'un spectacle
				if((seance.dateseance.equals(date))&&(seance.salle==salle)) { //Si la seance est le mmême jour dans la même salle il faut vérifier les heures
					if ((seance.heuredebut.equals(heuredeb)) || (seance.heurefin.equals(heuredeb))||(seance.heuredebut.equals(heurefin))||(seance.heurefin.equals(heurefin))) { //Pour une seance si son heure de début ou son heure de fin est égale à l'heure de début ou de fin testée il y a supperposition
						rep =  true;
					}
					else if (!(seance.heuredebut.EstSup(heuredeb)) && (seance.heuredebut.EstSup(heurefin))) { //Pour une seance si son heure de début est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
						rep = true;
					}
					else if (!(seance.heurefin.EstSup(heuredeb)) && (seance.heurefin.EstSup(heurefin))) { //Pour une seance si son heure de fin est inférieure à l'heure de début testée et est supérieur à l'heure de fin c'est qu'elle se trouve entre les deux et donc supperposition des seances
						rep = true;
					}
					
				}
				j++;
			}
			i++;
		}
			
		
		return rep;
	}

	public void AjoutBillet (Tarif tarif, Personne personne, Seance seance) {
		if (this.nbplaceslibres > 0) {
			Datee dateachat = new Datee();
			Billet nouvbillet = new Billet (tarif, personne, seance, dateachat);
			this.billets.add(nouvbillet );
			this.nbbillets ++;
			this.nbplaceslibres --;



		}

	}
	
	
	
}

	
	

