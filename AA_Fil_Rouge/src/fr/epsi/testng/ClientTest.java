package fr.epsi.testng;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import org.testng.Assert;
import fr.epsi.restaurant.Client;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Table;

public class ClientTest {

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
		Restaurant restaurant = new Restaurant();
		restaurant.setTables(tables);
		restaurant.demarerService();
		Client client = new Client();
		
		/* QUAND un client est affect� � une table */
		table.affecter(client);
		
		/* ALORS cette table n'est plus disponible dans la liste des tables disponible du restaurant */
		Assert.assertEquals(restaurant.tablesDisponible().contains(table), false);
		
	}
	
	
	/**
	 * ETANT DONN� une table dans un restaurant durant son service
	 * QUAND un client n'est plus affect� � une table
	 * ALORS cette table est sur la liste des tables disponibles du restaurant
	 */
	@Test
	public void dessaffectationClient()
	{
		
		/* ETANT DONN� une table dans un restaurant durant son service */
		Table table = new Table();
		Client client = new Client();
		table.affecter(client);
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		Restaurant restaurant = new Restaurant();
		restaurant.setTables(tables);

		/* QUAND un client n'est plus affect� � une table */
		table.liberer();
		
		/* ALORS cette table est sur la liste des tables disponibles du restaurant */
		Assert.assertEquals(restaurant.tablesDisponible().contains(table), true);


	}
	
}
