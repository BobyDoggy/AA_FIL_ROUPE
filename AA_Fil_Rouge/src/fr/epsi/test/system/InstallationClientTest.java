package fr.epsi.test.system;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.IsNot.not;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fr.epsi.restaurant.Client;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Table;

public class InstallationClientTest {

	@Test
	/**
	 * �TANT DONN� une table dans un restaurant ayant d�but� son service
	 * QUAND un client est affect� � une table 
	 * ALORS cette table n'est plus sur la liste des tables libres du restaurant
	 */	
	public void affectationClient()
	{
		 //�TANT DONN� une table dans un restaurant ayant d�but� son service
		Table table = new Table();
		Restaurant restaurant = new Restaurant();
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		restaurant.setTables(tables);
		restaurant.demarerService();
		
		 //QUAND un client est affect� � une table 
		Client client = new Client();
		table.affecter(client);

		 //ALORS cette table n'est plus sur la liste des tables libres du restaurant
		List<Table> tablesLibre = restaurant.tablesDisponible();
		assertThat(tablesLibre, not(hasItem(table)));		

	}
}
