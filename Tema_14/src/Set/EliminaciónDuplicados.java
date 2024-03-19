package Set;

import java.util.*;

public class EliminaciónDuplicados {

	public static void main(String[] args) {

		Integer [] Lista ={1, 2, 2 ,3 , 4, 5, 5, 5};
		
		HashSet<Integer>ListaHash=new HashSet <Integer> (Arrays.asList(Lista));
		
		System.out.println(ListaHash);
		
	}

}
