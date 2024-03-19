package Set;

import java.util.*;

public class IntersecciónConjuntos {
    public static void main(String[] args) {

        Set<Integer> Lista1= new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Set<Integer> Lista2= new TreeSet<>(Arrays.asList(9,10,11,12,13,14,15,16));

        Set<Integer> Intersecciones=new TreeSet<>(Lista1);

        Intersecciones.retainAll(Lista2);

        System.out.println(Intersecciones);

    }
}
