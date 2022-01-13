package fr.epsi.leGrandRestaurantTest;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import leGrandRstaurant.Client;
import leGrandRstaurant.Commande;
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

    CommandeNourriture commande = new CommandeNourriture();

    
    
    
    // QUAND il prend une commande de nourriture
    
    @Test
    public void faire_un_test() {
    	
    	// ALORS cette commande apparaît dans la liste de tâches de la cuisine de ce restaurant
    	serveur.prendreCommande(commande);
    
    	Assert.assertEquals(restaurant.findCommande(commande),true);
    	
    }
    

    

}