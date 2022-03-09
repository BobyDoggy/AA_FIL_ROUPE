package fr.epsi.test.unit;

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
	public void affecterLaTableEtRendreLaTableIndisponible()
	{
		Table table = new Table();
		Restaurant restaurant = new Restaurant();
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		restaurant.setTables(tables);
		restaurant.demarerService();
		Client client = new Client();
		table.affecter(client);
		List<Table> tablesLibre = restaurant.tablesDisponible();
		assertThat(tablesLibre, not(hasItem(table)));		

	}
}
