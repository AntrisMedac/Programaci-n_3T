package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AgrupaciónPersonasEdad {

	public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Maria", 30));
        personas.add(new Persona("Pedro", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Luis", 20));
        personas.add(new Persona("Laura", 25));

        // Crear un HashMap para almacenar las personas agrupadas por edad
        Map<Integer, List<String>> personasPorEdad = new HashMap<>();

        // Iterar sobre la lista de personas y agruparlas por edad
        for (Persona persona : personas) {
            int edad = persona.getEdad();
            String nombre = persona.getNombre();

            // Comprobar si ya hay personas con esta edad en el mapa
            if (!personasPorEdad.containsKey(edad)) {
                // Si no hay, crear una nueva lista para esa edad
                personasPorEdad.put(edad, new ArrayList<>());
            }

            // Agregar el nombre de la persona a la lista correspondiente a su edad
            personasPorEdad.get(edad).add(nombre);
        }

        // Imprimir el resultado
        for (Map.Entry<Integer, List<String>> entry : personasPorEdad.entrySet()) {
            int edad = entry.getKey();
            List<String> nombres = entry.getValue();
            System.out.println("Personas de " + edad + " años: " + nombres);
        }
    }
}
