package projetjava;

public class main {
	
    public static void test(){
    	Universite monuniversite = new Universite ("Sorbonne");
    	
    	
    	Personne etu1 = new Etudiant ("Dupont", "Louis", 123456789);
    	monuniversite.AjoutPersonne(etu1);
    	Personne etu2 = new Etudiant ("Dupond", "Charles", 987654321);
    	monuniversite.AjoutPersonne(etu2);
    	Personne etu3 = new Etudiant ("Matin", "Martin", 321456987);
    	monuniversite.AjoutPersonne(etu3);
    	
    	
    	Personne prof1 = new PersonelUniv ("Lefevre", "Jean", 789456123, "Professeur");
    	
    	monuniversite.Affichepersonnes();
    	
    	Tarif tarif1 = new Tarif("Inviation", 0);
    	monuniversite.AjoutTarif(tarif1);
    	
    	Tarif tarif2 = new Tarif("billet etudiant", 10);
    	monuniversite.AjoutTarif(tarif2);
    	
    	Tarif tarif3 = new Tarif ("Billet exterieur", 15);
    	
    	Salle salle1 = new Salle (0001, "Lavoisier", 30, "Salle de cours");
    	monuniversite.AjoutSalle(salle1);
    	
    	Association assoc1 = new Association ("Les fana de Balzac", "Club de lecture", "lesfanadebalzac@gmail.com", etu1, etu2,salle1);
    	monuniversite.AjoutAssociation(assoc1);
    	
    	Association assoc2 = new Association ("Les fana de Moliere", "Club de Theatre", "lesfanademoliere@gmail.com", etu3, etu2, salle1);
    	monuniversite.AjoutAssociation(assoc2);
    	
    	Spectacle spec1 = new Standup ("Lecture Le pere Goriot", assoc1, "Balzac", "Lecture");
    	monuniversite.AjoutSpectacle(spec1);
    	
    	Spectacle spec2 = new PieceTheatre ("Le malade imaginaire", assoc2, "Moliere", 1673, "Piece de theatre");
    	monuniversite.AjoutSpectacle(spec2);
    	
    	monuniversite.Affichespectacles();
    	
    	
    	Datee date1 = new Datee(10, 9, 2021);
    	Heure heuredeb1 = new Heure (14,0);
    	Heure heurefin1 = new Heure (16,15);
    	Seance seance1 = new Seance (spec1, salle1, date1, heuredeb1, heurefin1);
    	spec1.AjoutSeance(seance1, monuniversite);
    	
    	Seance seance2 = new Seance (spec2, salle1, date1, heuredeb1, heurefin1);  
    	spec2.AjoutSeance(seance2, monuniversite); //Comme c'est à la meme heure et dans la meme salle que le spectacle 1 ça ne devrait pas marcher
    	
    	Heure heuredeb2 = new Heure (18,0);
    	Heure heurefin2 = new Heure (20,15);
    	Seance seance3 = new Seance (spec1, salle1, date1, heuredeb2, heurefin2);
    	spec1.AjoutSeance(seance3, monuniversite);
    	
    	spec1.Afficheseances();
    	
    	seance3.AjoutBillet(tarif2, etu1);
    	
    	seance3.AjoutBillet(tarif3, prof1);
    	
    	
    	
    	
    	

        
    }
	
}
	
	