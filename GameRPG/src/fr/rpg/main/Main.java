package fr.rpg.main;


import java.util.Scanner;

import fr.rpg.entities.ActionsDesJoueursSecondaire;
import fr.rpg.entities.Joueur;
import fr.rpg.entities.Joueurs;
import fr.rpg.entities.NombreDeJoueurs;
import fr.rpg.entities.NumeroJoueur;
import fr.rpg.entities.Quitter;


public class Main {

	public static void main(String[] args) {

		Joueur joueur = new Joueur("Joueur");
		Scanner clavier = new Scanner(System.in);
		NombreDeJoueurs nombre = new NombreDeJoueurs();
		
		while(nombre.nombreJoueurs() <= 0)
		{
			System.out.println("Combien de personnage voulez-vous créer ?");
			nombre.setNombreJoueurs(clavier);
			clavier.nextLine();
		}
		
		Joueurs joueurs = new Joueurs(nombre);
		
		System.out.println("================================================");
		System.out.println("Lancement du meilleur RPG au monde !");
		System.out.println("================================================");
		Quitter quitter = null;
		while(quitter == null)
		{
			if(joueurs.sontIlsKO())
			{
				System.out.println("Félicitations, tout les joueurs secondaires sont K.O !");
				quitter = new Quitter();
				return;
			}

			System.out.println("Personnages encore vivant : " + joueurs.nombreDeJoueursEncoreVivants());
			System.out.println("A pour attaquer");
			System.out.println("S pour soigner");
			System.out.println("U pour réaliser une attaque ultime !");
			System.out.println("Q pour quitter le jeu");
			
			String action = clavier.nextLine();
			action = action.toLowerCase();
			
			switch (action) 
			{
			case "a":
				System.out.println("Quelle joueur voulez-vous attaquer ? Joueurs vivants : " + joueurs.numerosDesJoueursVivants());
				try 
				{
					NumeroJoueur numero = new NumeroJoueur(clavier.nextInt());
					Joueur joueurSecondaire = joueurs.choisirUnJoueur(numero);
					joueur.attaquer(joueurSecondaire);

				} catch (Exception e) {
					System.out.println("Impossible de récupérer ce joueur");
				}
				break;
				
			case "s":
				System.out.println("Quelle joueur voulez-vous soigner ? Joueurs vivants " + joueurs.numerosDesJoueursVivants());
				try 
				{
					NumeroJoueur numero = new NumeroJoueur(clavier.nextInt());
					Joueur joueurSecondaire = joueurs.choisirUnJoueur(numero);
					joueur.soigner(joueurSecondaire);
				} catch (Exception e) {
					System.out.println("Impossible de récupérer ce joueur");
				}

				break;
				
			case "u":
				System.out.println("Quelle joueur voulez-vous humilié ? Personnages vivants : " + joueurs.numerosDesJoueursVivants());
				try 
				{
					NumeroJoueur numero = new NumeroJoueur(clavier.nextInt());
					Joueur joueurSecondaire = joueurs.choisirUnJoueur(numero);
					joueur.attaqueUltime(joueurSecondaire);
					
				} catch (Exception e) {
					System.out.println("Impossible de récupérer ce joueur");
				}
				break;
				
			case "q" :
				quitter = new Quitter();
				return;
				
			default:
				System.out.println("Aucune commande correspondante, veuillez réessayer ! Appuyer sur n'importe quelle touche");
				break;
				
			}
			
			clavier.nextLine();
			System.out.println("================================================");
			
			System.out.println("TOUR DES JOUEURS SECONDAIRES");
			ActionsDesJoueursSecondaire.actionsDesJoueursSecondaires(joueurs);
			System.out.println("FIN DU TOUR DES JOUEURS SECONDAIRES");
			System.out.println("================================================");

	
		}
		

		
	}
	

}
