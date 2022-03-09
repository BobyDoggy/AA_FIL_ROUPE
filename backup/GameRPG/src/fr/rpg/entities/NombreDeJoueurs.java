package fr.rpg.entities;

public class NombreDeJoueurs {
	
	private int nombreJoueurs;
	
	public NombreDeJoueurs(int P_nombreJoueur)
	{
		this.nombreJoueurs = P_nombreJoueur;
	}

	public int getNombreJoueurs() {
		final int nombreJoueursImmuable = nombreJoueurs;
		return nombreJoueursImmuable;
	}

	public void setNombreJoueurs(int nombreJoueurs) {
		this.nombreJoueurs = nombreJoueurs;
	}
	
	

}
