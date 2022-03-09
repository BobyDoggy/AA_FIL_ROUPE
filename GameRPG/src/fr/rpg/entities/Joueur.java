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
	
	public String vieRestante()
	{
		final String vieRestante = this.vie + " HP";
		return vieRestante;
	}
	
	public String afficherNom() 
	{
		final String nomDuJoueur = nom;
		return nomDuJoueur;
	}

	public boolean estVivant() 
	{
		final boolean statusDuJoueur = estVivant;
		return statusDuJoueur;
	}


	public void soigner(Joueur P_joueur)
	{
		if(P_joueur.estVivant && P_joueur.vie < 1000)
		{
			P_joueur.vie += this.niveau;
			System.out.println("Vie du personnage : " + P_joueur.vie);
			return;
		}
		
		System.out.println("Impossible de soigner le joueur car il est soit mort soit � toute �a vie !");

	}
	
	public void attaquer(Joueur P_joueur)
	{
		if(!P_joueur.estVivant)
		{
			System.out.println("Le personnage est d�j� mort");
			return;
		}
		
		//On attaque le personnage
		P_joueur.vie -= this.niveau;

		if(P_joueur.vie <= 0)
		{
			P_joueur.estVivant = false;
			this.niveau++; // lvlUP
			System.out.println("Le personnage est mort");
			return;
		}
		
		System.out.println("Vie restante du personnage : " + P_joueur.vie);
		
	}
	
	
	//M�thode pour forcer � descendre la vie d'un personnage � 1 
	public void attaqueUltime(Joueur P_joueur)
	{
		P_joueur.vie = 1;
	}
	
	

}
