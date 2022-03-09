package fr.rpg.entities;

import java.util.ArrayList;
import java.util.List;

public class Joueurs {
	
	private List<Joueur> joueurs;

	public Joueurs(NombreDeJoueurs P_nombreJoueurs)
	{
		joueurs = new ArrayList<Joueur>();
		for(int i = 0; i < P_nombreJoueurs.nombreJoueurs(); i++)
		{
			Joueur personnage = new Joueur("Joueur n°" + i);
			joueurs.add(personnage);
		}
		
	}

	public List<Joueur> getJoueurs() {
		final List<Joueur> joueursImmuable = joueurs;
		return joueursImmuable;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
	public int nombreJoueurs()
	{
		final int nombreJoueursImmuable = joueurs.size();
		return nombreJoueursImmuable;
	}
	
	
	public Joueur choisirUnJoueur(NumeroJoueur P_numeroJoueur)
	{
		int numero = P_numeroJoueur.recupereNumero();
		final Joueur joueurImmuable = joueurs.get(numero);
		return joueurImmuable;
	}

	
	public boolean sontIlsKO()
	{
		if(nombreDeJoueursEncoreVivants() == 0)
		{
			return true;
		}
		
		return false;
	}
	
	public String numerosDesJoueursVivants()
	{
		String numerosDesJoueursVivants = "";
		for(Joueur joueur : joueurs)
		{
			if(joueur.estVivant())
			{
				String numeroDuJoueur = joueur.afficherNom();
				numeroDuJoueur = numeroDuJoueur.split("")[1];
				numerosDesJoueursVivants += joueur.afficherNom() + " (" + joueur.vieRestante() + ") | ";
			}
		}
		
		return numerosDesJoueursVivants;
	}
	
	public int nombreDeJoueursEncoreVivants()
	{
		int nombreJoueursEncoreVivants = 0;
		for(Joueur joueur : joueurs)
		{
			if(joueur.estVivant())
			{
				nombreJoueursEncoreVivants ++;
			}
		}
		return nombreJoueursEncoreVivants;
	}
	


}
