package fr.epsi.test;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;
import fr.epsi.restaurant.Client;
import fr.epsi.restaurant.Restaurant;
import fr.epsi.restaurant.Table;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


@ExtendedWith(MockitoExtension.Test2)
public class Test2 {

	
	@Mock
    Client client1;
	
	 @InjectMocks
	    Table table1;
	    
	    ArrayList<table> A;
	    

	 //creation du mock
	 List mockedtable = mock(list.class);

	 // utilisation de l'objet mock 
	 mockedList.add("one");
	 mockedList.clear();

	 verify(mockedList).add("one");
	 verify(mockedList).clear();
	 LinkedList mockedList = mock(LinkedList.class);
	 when(mockedList.get(0)).thenReturn("first");
	 System.out.println(mockedList.get(0));

	 System.out.println(mockedList.get(999));

