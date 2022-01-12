package leGrandRstaurant;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	
	
	private String nom;
	private double salaire;
	private final List<CommandeNourriture> commandesPrises = new ArrayList<CommandeNourriture>();
	
	public Serveur (String _nom, double _salaire) {
		
		setNom(_nom);
		setSalaire(_salaire);
		
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
	
}