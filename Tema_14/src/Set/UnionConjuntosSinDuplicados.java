package Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnionConjuntosSinDuplicados {
    public static void main(String[] args) {

        List L1=new ArrayList<>(Arrays.asList("Hola", "Juan", "Alberto", "Pepe"));
        List L2=new ArrayList<>(Arrays.asList("Hola", "Pedro", "Antonio", "Pablo", "Pepe"));

        HashSet Union=new HashSet(L1);
        Union.addAll(L2);

        System.out.println(Union);

    }
}
