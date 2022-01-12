package leGrandRstaurant;
public class Table {

    private boolean estlibre;

    public void Affecter(Client client){

        estlibre=false;

    }

    public void Liberer(){

    	estlibre=true;

    }

    public boolean getEstlibre(){
        return estlibre;
    }



}