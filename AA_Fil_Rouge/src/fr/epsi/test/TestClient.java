package fr.epsi.testng;

import java.util.ArrayList;
import java.util.List;
import org.test.annotations.Test;
import org.test.Assert;
import fr.epsi.restaurant.Client;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Table;

public class ClientTest {

	@Test
	public void affectationClient() {

		
		Table table = new Table();
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		Restaurant restaurant = new Restaurant();
		restaurant.setTables(tables);
		restaurant.demarerService();
		Client client = new Client();
		table.affecter(client);


		Assert.assertEquals(restaurant.tablesDisponible().contains(table), false);

	}



	@Test
	public void dessaffectationClient()
	{

		Table table = new Table();
		Client client = new Client();
		table.affecter(client);
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		Restaurant restaurant = new Restaurant();
		restaurant.setTables(tables);
		table.liberer();
		Assert.assertEquals(restaurant.tablesDisponible().contains(table), true);


	}

}