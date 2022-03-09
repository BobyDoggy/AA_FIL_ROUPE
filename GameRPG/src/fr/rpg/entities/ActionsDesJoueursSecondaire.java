package fr.rpg.entities;


public class ActionsDesJoueursSecondaire {
	
	public static void actionsDesJoueursSecondaires(Joueurs P_joueurs)
	{
		//On itère sur chaque joueur secondaire
		for(Joueur joueurSecondaire : P_joueurs.getJoueurs())
		{
			//Le joueur fait une action (soit soigner, soit attaquer)
			System.out.println("Une action du joueur " + joueurSecondaire.afficherNom());
		}
	}

}
