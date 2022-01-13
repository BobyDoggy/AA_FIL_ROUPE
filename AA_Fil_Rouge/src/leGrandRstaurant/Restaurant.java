package leGrandRstaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private Serveur serveur;
    private Table table;
    private List<Commande> tachesCuisine = new ArrayList<Commande>();
    
    

    public Restaurant(Serveur _serveur, Table _table){
        serveur=_serveur;
        table= _table;
    }
    
    
    public List<Commande> getCommande(Serveur serveur){
    	
    	return serveur.getcommandesPrises();
    	
    }
    
    public List<Table> tablesLibre(){
    	
    	List<Table> tablesLibre = new ArrayList<Table>();
    	
    	
    	if(table.getEstlibre()) {
    			
    		tablesLibre.add(table);
    			
    	}
    	
    	return tablesLibre;
    }
    	
    	

    public void DebuterService(){
    	
    }


	public boolean findCommande(Commande commande) {
		// TODO Auto-generated method stub
		int i=0;
		boolean result=false;
		
		
		while(result==false && i<serveur.getcommandesPrises().size()) {
			if(serveur.getcommandesPrises().get(i).equals(commande)) {
				result=true;
			}
			i++;
			
		}
		
		return result;
	}
    
    
    

}