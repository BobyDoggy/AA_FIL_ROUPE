package leGrandRstaurant;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	
	
	private String nom;
	private double salaire;
	private final List<Commande> commandesPrises = new ArrayList<Commande>();
	
	public Serveur (String _nom, double _salaire) {
		
		setNom(_nom);
		setSalaire(_salaire);
		
	}
	
	public List<Commande> getcommandesPrises() {
		return commandesPrises;
	}
	
	
	public void prendreCommande(CommandeNourriture commande) {
		
		commandesPrises.add(commande);
	
	}
	
	public void prendreCommande(CommandeBoissons commande) {
		
	
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
	


	public void setScommandesPrises(double salaire) {
		this.salaire = salaire;
	}
	
	
	
}