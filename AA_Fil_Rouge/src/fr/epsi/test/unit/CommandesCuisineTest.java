package fr.epsi.test.unit;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import fr.epsi.restaurant.CommandeNourriture;
import fr.epsi.restaurant.Serveur;

public class CommandesCuisineTest {

	@Test
	public void PrendreCommandeNourritureEtAjouteLaCommandeDansLaListeDuServeur()
	{
		Serveur serveur = new Serveur("Jean", 2000);
		CommandeNourriture commande = new CommandeNourriture();
		serveur.prendreCommandeNourriture(commande);
		assertThat(serveur.getCommandesPrise(), hasItem(commande));
	}
}
