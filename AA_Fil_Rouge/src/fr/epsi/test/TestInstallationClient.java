package fr.epsi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.epsi.restaurant.Client;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Table;


public class TestInstallationClient {

	/**
	 * �TANT DONNE une table dans un restaurant ayant d�but� son service 
	 * QUAND un client est affect� � une table
	 * ALORS cette table n'est plus sur la liste des tables libres du restaturant
	 */
	@Test
	public void affectationClient() {
		
		/* �TANT DONN� une table dans un restaurant ayant d�but� son service */
		Table table = new Table();
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		Restaurant restaurant = new Restaurant(null,tables);
		restaurant.demarerService();
		Client client = new Client();
		/* QUAND un client est affect� � une table */
		table.affecter(client);
		
		/* ALORS cette table n'est plus disponible dans la liste des tables disponible du restaurant */
		//Assert.assertThat(table, Arrays.asList(restaurant.tablesDisponible().contains(table)));
		
	}
	

	

}
