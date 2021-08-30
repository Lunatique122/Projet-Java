package projetjava;

import java.util.ArrayList;
import java.util.ListIterator;

public class Universite {
	String nom;

	ArrayList <Spectacle> spectacles;
	ArrayList <Salle> salles;
	ArrayList <Tarif> tarifs;
	ArrayList <Association> associations;
	ArrayList <Personne> personnes;



	/* Salles */
	public ArrayList<Salle> getSalles() {
		return salles;
	}

	public void setSalles(ArrayList<Salle> salles) {
		this.salles = salles;
	}

	public int getNbsalles() {
		return salles.size();
	}

	public void AjoutSalle (Salle salle) {
		Boolean existe = false;
		ListIterator<Salle> sal = this.salles.listIterator();
		while (sal.hasNext())
		{	if (salle.getNumero() == sal.next().getNumero())
			{	existe = true;	}

		}

		if(existe == false)
		{	this.salles.add(salle);	}
		else {	System.out.println("Cette salle existe déjà et n'a donc pas été ajoutée à la liste.");	}
	}

	/* Tarifs */

	public ArrayList<Tarif> getTarifs() {
		return tarifs;
	}

	public void setTarifs(ArrayList<Tarif> tarifs) {
		this.tarifs = tarifs;
	}

	public int getNbtarifs() {
		return this.tarifs.size();
	}

	public void AjoutTarif (Tarif tarif) {
		Boolean existe = false;
		ListIterator<Tarif> tar = this.tarifs.listIterator();
		while (tar.hasNext())
		{
			if (tarif.getNom() == tar.next().getNom())
			{	existe = true;	}
		}

		if(existe == false)
		{	this.tarifs.add(tarif);	}
		else
		{	System.out.println("Ce tarif existe d�j� et n'a donc pas �t� ajout� � la liste.");	}
	}


	/* Associations */

	public ArrayList<Association> getAssociations() {
		return associations;
	}

	public void setAssociations(ArrayList<Association> associations) {
		this.associations = associations;
	}

	public int getNbassociations() {
		return this.associations.size();
	}

	public void AjoutAssociation (Association association) {
		Boolean existe = false;
		ListIterator<Association> asso = this.associations.listIterator();
		while (asso.hasNext())
		{
			if (association.getNom() == asso.next().getNom())
			{	existe = true;	}
		}

		if(existe == false)
		{	this.associations.add(association);	}
		else
		{	System.out.println("Cette association existe d�j� et n'a donc pas �t� ajout�e � la liste.");	}
	}

	/* Personnes */

	public ArrayList<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(ArrayList<Personne> personnes) {
		this.personnes = personnes;
	}

	public int getNbpersonnes() {
		return this.personnes.size();
	}




	/* Spectacles */
	public ArrayList<Spectacle> getSpectacles() {
		return spectacles;
	}

	public void setSpectacles(ArrayList<Spectacle> spectacles) {
		this.spectacles = spectacles;
	}

	public int getNbSpectacles() {
		return spectacles.size();
	}

	public void AjoutSpectacle (Spectacle spectacle) {
		Boolean existe = false;
		ListIterator<Spectacle> spec = this.spectacles.listIterator();
		while (spec.hasNext())
		{	if (spectacle.getTitre() == spec.next().getTitre())
				{	existe = true;	}
		}

		if(existe == false)
		{	this.spectacles.add(spectacle);	}
		else {	System.out.println("Ce spectacle existe déjà et n'a donc pas été ajouté à la liste.");	}
	}

	public ArrayList <Spectacle> rechercheSpectacle( String nomSpectacle )
	{
		ArrayList <Spectacle> spectacles_trouves = new ArrayList();
		ListIterator<Spectacle> spec = this.spectacles.listIterator();
		Spectacle spectacle;
		while (spec.hasNext())
		{
			spectacle = (Spectacle)spec;
			if (spectacle.getTitre() == nomSpectacle)
			{ spectacles_trouves.add(spectacle); }

		}
	return spectacles_trouves;
	}


}
