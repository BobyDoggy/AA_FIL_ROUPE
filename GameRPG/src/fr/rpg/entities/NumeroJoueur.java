package fr.rpg.entities;

public class NumeroJoueur {
	int numeroJoueur;
	
	public NumeroJoueur(int P_numero)
	{
		this.numeroJoueur = P_numero;
	}

	public int recupereNumero() {
		final int numeroImmuable = numeroJoueur;
		return numeroImmuable;
	}

	
	

}
