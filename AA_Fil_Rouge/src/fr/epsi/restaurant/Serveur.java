package fr.epsi.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	
	
	private final List<I_Commande> commandesPrise;
	
	private String nom;
	private double salaire;
	
	
	
	
	public Serveur(String nom, double salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
		commandesPrise = new ArrayList<I_Commande>();
		
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public void prendreCommandeNourriture(I_Commande commandeNourriture)
	{
		if(commandeNourriture instanceof CommandeNourriture)
			this.commandesPrise.add(commandeNourriture);
	}
	
	public void prendreCommandeBoisson(I_Commande commandeBoisson)
	{
		
	}

	public List<I_Commande> getCommandesPrise() {
		return commandesPrise;
	}
	
	
	
	
	

}
