package fr.epsi.testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import fr.epsi.restaurant.CommandeBoisson;
import fr.epsi.restaurant.CommandeNourriture;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Serveur;

public class CommandeTest {
	
	/**
	 * �TANT DONN� un serveur dans un restaurant
	 * QUAND il prend une commande de nourriture
	 * ALORS cette commande appara�t dans la liste des t�ches de la cuisine de ce restaurant
	 */
	@Test
	public void commandeNourriture()
	{
		/* �TANT DONN� un serveur dans un restaurant */
		Serveur serveur = new Serveur("Jean", 1300);
		List<Serveur> serveurs = new ArrayList<Serveur>();
		serveurs.add(serveur);
		Restaurant restaurant = new Restaurant();
		restaurant.setServeurs(serveurs);

		
		/* QUAND il prend une commande de nourriture */
		CommandeNourriture commande = new CommandeNourriture();
		serveur.prendreCommandeNourriture(commande);
		
		/* ALORS cette commande appara�t dans la liste des t�ches de la cuisine de ce restaurant */
		Assert.assertEquals(restaurant.getTachesEnCuisine().contains(commande), true);
	}
	
	/**
	 * �TANT DONN� un serveur dans un restaurant
	 * QUAND il prend une commande de boisson
	 * ALORS cette commande n'appara�t pas dans la liste des t�ches de la cuisine du restarant
	 */
	@Test
	public void commandeBoisson()
	{
		/* �TANT DONN� un serveur dans un restarant */
		Serveur serveur = new Serveur("Baptiste", 1215);
		List<Serveur> serveurs = new ArrayList<Serveur>();
		serveurs.add(serveur);
		Restaurant restaurant = new Restaurant();
		restaurant.setServeurs(serveurs);
		
		/* QUAND il prend une commande de boisson */
		CommandeBoisson commande = new CommandeBoisson();
		serveur.prendreCommandeBoisson(commande);
		
		
		/* ALORS cette commande n'appara�t pas dans la liste des t�ches de la cuisine du restarant */
		Assert.assertEquals(restaurant.getTachesEnCuisine().contains(commande), false);

	}
	
}
