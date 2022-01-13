package fr.epsi.leGrandRestaurantTest;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import leGrandRstaurant.Client;
import leGrandRstaurant.Commande;
import leGrandRstaurant.CommandeBoissons;
import leGrandRstaurant.CommandeNourriture;
import leGrandRstaurant.Restaurant;
import leGrandRstaurant.Serveur;
import leGrandRstaurant.Table;

public class CommandeCuisineTest {

	
    // ÉTANT DONNE un serveur dans un restaurant
	Client client = new Client();
    Serveur serveur = new Serveur("Anis", 1500);
    Table table = new Table();
    Restaurant restaurant = new Restaurant(serveur, table);

    CommandeNourriture _commandeNourriture = new CommandeNourriture();
    CommandeBoissons _commandeBoissons = new CommandeBoissons();

    
    
    
    // QUAND il prend une commande de nourriture
    
    @Test
    public void test_commandeNourriture() {
    	
    	// ALORS cette commande apparaît dans la liste de tâches de la cuisine de ce restaurant
    	serveur.prendreCommande(_commandeNourriture);
    
    	Assert.assertEquals(restaurant.findCommande(_commandeNourriture),true);
    	
    }
    
    
    // QUAND il prend une commande de boissons
    
    @Test
    public void test_commandeBoissons() {
    	
    	// ALORS cette commande n'apparaît pas dans la liste de tâches de la cuisine de ce restaurant
    	serveur.prendreCommande(_commandeBoissons);
    
    	Assert.assertEquals(restaurant.findCommande(_commandeBoissons),false);
    	
    }

    

}