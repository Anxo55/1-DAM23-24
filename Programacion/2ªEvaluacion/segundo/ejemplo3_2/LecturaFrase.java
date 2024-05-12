package segundo.ejemplo3_2;

import java.util.Arrays;
import java.util.Scanner;

public class LecturaFrase {

    public static final int NUM_FRASES = 4;

    public static void main(String[] args) {

        String[] frases = new String[NUM_FRASES];

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe "+ NUM_FRASES + " frases.");
        System.out.println("Para terminar una frase, pulsa la tecla de retorno.");
        for (int i= 0; i<NUM_FRASES; i++) {// Va leyendo frases una por una.
            String frase = sc.nextLine();
            frases[i] = frase;
            System.out.println("Frase " + i + ": Has escrito \" "+ frase +"\".");
            }
            System.out.println(Arrays.toString(frases));
        }
        }
