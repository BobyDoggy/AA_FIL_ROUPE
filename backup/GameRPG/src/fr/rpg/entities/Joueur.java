package fr.rpg.entities;

public class Joueur {
	
	private String nom;
	private int vie;
	private int niveau;
	private boolean estVivant;
	
	public Joueur(String nom) {
		this.vie = 1000;
		this.niveau = 1;
		this.nom = nom;
		this.estVivant = true;
	}
	
	public String afficherNom() 
	{
		String nomDuJoueur = nom;
		return nomDuJoueur;
	}

	public boolean estVivant() 
	{
		boolean statusDuJoueur = estVivant;
		return statusDuJoueur;
	}


	public void soigner(Joueur P_personnage)
	{
		if(P_personnage.estVivant && P_personnage.vie < 1000)
		{
			P_personnage.vie += this.niveau;
			System.out.println("Vie du personnage : " + P_personnage.vie);
			return;
		}
		
		System.out.println("Impossible de soigner car le personnage est soit mort soit à toute ça vie !");

	}
	
	public void attaquer(Joueur P_personnage)
	{
		if(!P_personnage.estVivant)
		{
			System.out.println("Le personnage est déjà mort");
			return;
		}
		
		//On attaque le personnage
		P_personnage.vie -= this.niveau;

		if(P_personnage.vie <= 0)
		{
			P_personnage.estVivant = false;
			this.niveau++; // lvlUP
			System.out.println("Le personnage est mort");
			return;
		}
		
		System.out.println("Vie restante du personnage : " + P_personnage.vie);
		
	}
	
	
	//Méthode pour forcer à descendre la vie d'un personnage à un 
	public void attaqueUltime(Joueur P_personnage)
	{
		P_personnage.vie = 1;
	}
	
	

}
