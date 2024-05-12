package segundo.ejemplo3_2;

import java.util.Arrays;
import java.util.Scanner;

public class LeerPalabras {

    public static final int NUM_PALABRAS = 10;

    public static void main(String[] args) {
        String[] words = new String[NUM_PALABRAS];
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe "+NUM_PALABRAS+" palabras separadas por espacios.");
        System.out.println("Las puedes ecribir en lineas de texto diferente si quieres");
        for(int i=0; i<NUM_PALABRAS; i++) {
            String palabra = sc.next();
            words[i]=palabra;
            System.out.println("Palabra "+ i + ": Has escrito \" "+ palabra +" \".");
        }
        // Se lee el resto de la linea y se ignora el contenido
        sc.nextLine();

        System.out.println(Arrays.toString(words));
    }
    
}
