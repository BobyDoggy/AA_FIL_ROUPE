package fr.epsi.restaurant;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private List<Serveur>serveurs;
	private List<Table> tables;


	public Restaurant()
	{

	}

	public List<Table> tablesDisponible()
	{
		List<Table> tablesDisponible = new ArrayList<Table>();
		for(Table table : tables)
		{
			if(table.isEstLibre())
			{
				tablesDisponible.add(table);
			}
		}
		return tablesDisponible;
	}

	public void setTables(List<Table> P_tables)
	{
		this.tables = P_tables;
	}

	public void setServeurs(List<Serveur> serveurs) {
		this.serveurs = serveurs;
	}

	public void demarerService()
	{

	}

	public List<Commande> getTachesEnCuisine()
	{
		List<Commande> tachesCuisine = new ArrayList<Commande>();
		for(Serveur serveur : serveurs)
		{
			for(Commande commande : serveur.getCommandesPrise())
			{
				tachesCuisine.add(commande);
			}
		}

		return tachesCuisine;
	}


}