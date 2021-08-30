package projetjava;

import java.util.ArrayList;

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
	

	

	
}
