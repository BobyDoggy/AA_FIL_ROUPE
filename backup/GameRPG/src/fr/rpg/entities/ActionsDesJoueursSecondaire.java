package fr.rpg.entities;


public class ActionsDesJoueursSecondaire {
	
	public static void actionsDesJoueursSecondaires(Joueurs P_joueurs)
	{
		for(Joueur joueurSecondaire : P_joueurs.getJoueurs())
		{
			System.out.println("////////////////////////////////////");
			System.out.println("Une action du joueur " + joueurSecondaire.afficherNom());
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

		}
	}

}
