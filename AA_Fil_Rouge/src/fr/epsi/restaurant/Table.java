package fr.epsi.restaurant;

public class Table {

	private boolean estLibre;



	public boolean isEstLibre() {
		return estLibre;
	}
	
	public void affecter(Client client)
	{
		estLibre = false;
	}
	
	public void liberer()
	{
		estLibre = true;
	}
	
}
