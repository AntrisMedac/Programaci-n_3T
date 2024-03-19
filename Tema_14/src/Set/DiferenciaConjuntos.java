package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DiferenciaConjuntos {
    public static void main(String[] args) {

        Set<String> ClaseA = new HashSet<>(Arrays.asList("Juan", "Alberto", "Jose"));
        Set<String> ClaseB = new HashSet<>(Arrays.asList("Antonio", "Alberto", "Pedro"));

        Set<String> Diferencias1=new HashSet<>(ClaseA);
        Set<String> Diferencias2=new HashSet<>(ClaseB);

        Diferencias1.removeAll(ClaseB);
        Diferencias2.removeAll(ClaseA);

        System.out.println("Diferencias entre las clases: " + Diferencias1  + Diferencias2);

    }
}