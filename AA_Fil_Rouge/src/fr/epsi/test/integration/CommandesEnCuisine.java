package fr.epsi.test.integration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.epsi.restaurant.CommandeNourriture;
import fr.epsi.restaurant.I_Commande;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Serveur;

public class CommandesEnCuisine {

	@Test
	/**
	 *  ÉTANT DONNE un serveur dans un restaurant
	 *  QUAND il prend une commande de nourriture
	 *  ALORS cette commande apparaît dans la liste de tâches de la cuisine de ce restaurant
	 */
	public void commanderNourriture()
	{
		//ÉTANT DONNE un serveur dans un restaurant
		Serveur serveur = new Serveur("Jean", 1200);
		Restaurant restaurant = new Restaurant();
		List<Serveur> serveurs = new ArrayList<Serveur>();
		serveurs.add(serveur);
		restaurant.setServeurs(serveurs);
		 //QUAND il prend une commande de nourriture
		CommandeNourriture commandeNourriture = new CommandeNourriture();
		serveur.prendreCommandeNourriture(commandeNourriture);
		 //ALORS cette commande apparaît dans la liste de tâches de la cuisine de ce restaurant
		List<I_Commande> tachesEnCuisine =  restaurant.getTachesEnCuisine();
		
		assertThat(tachesEnCuisine, hasItem(commandeNourriture));

		
	}
}
