package projetjava;

import java.util.ArrayList;
import java.util.ListIterator;

public class Spectacle {
	protected final String titre;
	protected final String type;
	protected Association association;
	protected ArrayList<Intervenant> intervenants;
	protected ArrayList<Seance> seances;
	
	
	
	
	protected Spectacle(String titre, String type,  Association association) {
		super();
		this.titre = titre;
		this.type = type;
		this.association = association;
		this.intervenants = new ArrayList<Intervenant>();
		this.seances = new ArrayList<Seance>();
	}
	
	





	public String Affichespectacle() {
		return "Spectacle [titre=" + titre + ", type=" + type + ", association=" + association + " Nombre de seances =" + seances.size() +"]";
	}



	public String getTitre() {
		return titre;
	}




	public Association getAssociation() {
		return association;
	}




	public ArrayList<Intervenant> getIntervenants() {
		return intervenants;
	}




	public ArrayList<Seance> getSeances() {
		return seances;
	}




	public int getNbseances() {
		return seances.size();
	}
	
	
	public void  AjoutSeance (Seance seance, Universite univ) {
		
		if  (!(seance.SeanceExisteSalle(univ)) && !(seance.SeanceExistSpectacle())){
			this.seances.add(seance);
		}
		
	}
	
	public void  Afficheseances () {
		ListIterator<Seance> sean = this.seances.listIterator();
		while (sean.hasNext())
		{	 
			sean.next().afficheseance();
		}
	
	}
	
}
