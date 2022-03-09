package fr.epsi.test.example;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import fr.epsi.restaurant.CommandeBoisson;
import fr.epsi.restaurant.CommandeNourriture;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Serveur;

public class CommandesCuisineTest {
	
	/**
	 * ÉTANT DONNÉ un serveur dans un restarant
	 * QUAND il prend une commande de nourriture
	 * ALORS cette commande apparaît dans la liste des tâches de la cuisine de ce restaurant
	 */
	@Test
	public void commandeNourriture()
	{
		/* ÉTANT DONNÉ un serveur dans un restaurant */
		Serveur serveur = new Serveur("Jean", 1300);
		List<Serveur> serveurs = new ArrayList<Serveur>();
		serveurs.add(serveur);
		Restaurant restaurant = new Restaurant();
		restaurant.setServeurs(serveurs);

		
		/* QUAND il prend une commande de nourriture */
		CommandeNourriture commande = new CommandeNourriture();
		serveur.prendreCommandeNourriture(commande);
		
		/* ALORS cette commande apparaît dans la liste des tâches de la cuisine de ce restaurant */
		assertThat(restaurant.getTachesEnCuisine(), hasItem(commande));
	}
	
	/**
	 * ÉTANT DONNÉ un serveur dans un restarant
	 * QUAND il prend une commande de boisson
	 * ALORS cette commande n'apparaît pas dans la liste des tâches de la cuisine du restarant
	 */
	@Test
	public void commandeBoisson()
	{
		/* ÉTANT DONNÉ un serveur dans un restarant */
		Serveur serveur = new Serveur("Baptiste", 1215);
		List<Serveur> serveurs = new ArrayList<Serveur>();
		serveurs.add(serveur);
		Restaurant restaurant = new Restaurant();
		restaurant.setServeurs(serveurs);
		
		/* QUAND il prend une commande de boisson */
		CommandeBoisson commande = new CommandeBoisson();
		serveur.prendreCommandeBoisson(commande);
		
		
		/* ALORS cette commande n'apparaît pas dans la liste des tâches de la cuisine du restarant */
		assertThat(restaurant.getTachesEnCuisine(), not(hasItem(commande)));

	}

}
