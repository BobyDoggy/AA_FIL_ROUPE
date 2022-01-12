package leGrandRstaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Serveur> serveurs;
    private List<Table> tables;
    private List<Commande> tachesCuisine;
    

    public Restaurant(List<Serveur> _serveurs, List<Table> _tables){
        serveurs=_serveurs;
        tables=_tables;
    }

    
    public List<Serveur> getServeurs(){
    	
    	return serveurs;
    	
    }
    
    public List<Commande> getCommande(){
    	
    	return tachesCuisine;
    	
    }
    
    public List<Table> tablesLibre(){
    	
    	List<Table> tablesLibre = new ArrayList<Table>();
    	
    	for (Table table : tables) {
    		
    		if(table.getEstlibre()) {
    			
    			tablesLibre.add(table);
    			
    		}
    	}
    	
    	return tablesLibre;
    }

    public void DebuterService(){
    	
    }
    
    
    

}