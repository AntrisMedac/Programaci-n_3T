package Map;

import java.util.*;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto:");
        String texto = scanner.nextLine();

        // Convertimos el texto a minúsculas para ignorar diferencias entre mayúsculas y minúsculas
        texto = texto.toLowerCase();

        // Eliminamos los caracteres que no son letras ni espacios
        texto = texto.replaceAll("[^a-zA-Z\\s]", "");

        // Dividimos la cadena en palabras separadas por espacios
        String[] palabras = texto.split("\\s+");

        // Creamos un HashMap para almacenar las frecuencias de las palabras
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        // Contamos la frecuencia de cada palabra
        for (String palabra : palabras) {
            if (frecuenciaPalabras.containsKey(palabra)) {
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
            } else {
                frecuenciaPalabras.put(palabra, 1);
            }
        }

        // Mostramos las frecuencias de las palabras
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

