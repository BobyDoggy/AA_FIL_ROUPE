package fr.rpg.entities;

import java.util.Scanner;

public class NombreDeJoueurs {
	
	private int nombreJoueurs;
	
	public NombreDeJoueurs()
	{

	}

	public int nombreJoueurs() 
	{
		final int nombreJoueursImmuable = nombreJoueurs;
		if(nombreJoueursImmuable <= 0)
		{
			System.out.println("Veuillez saisir une valeur valide !");
		}
		return nombreJoueursImmuable;
	}
	
	public void setNombreJoueurs(Scanner P_clavier)
	{
		
		try {
			this.nombreJoueurs = P_clavier.nextInt();
		} catch (Exception e) {
			System.out.println("Une erreur c'est produite, veuillez réessayer");
		}
	}


	
	

}
