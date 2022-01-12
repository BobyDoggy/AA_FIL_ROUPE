package fr.epsi.test.system;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fr.epsi.restaurant.Client;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Table;


public class InstallationClientTest {

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
		assertThat(restaurant.tablesDisponible(), not(hasItem(table)));
		
	}
	
	
	/**
	 * ETANT DONN� une table dans un restaurant durant son service
	 * QUAND un client n'est plus affect� � une table
	 * ALORS cette table est sur la liste des tables libres du restaurant
	 */
	@Test
	public void dessaffectationClient()
	{
		
		/* ETANT DONN� une table dans un restaurant durant son service */
		Table table = new Table();
		Client client = new Client();
		table.affecter(client);
		

	}

}
