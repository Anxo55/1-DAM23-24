package practicaJavaVarios;

import java.util.Random;
import java.util.Scanner;

public class contadorLetras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Clase donde pediré letras al azar.");

        Random random = new Random();
        int contador = 0;
        for(int i=0; i<=100; i++) {
            char letras = (char) (random.nextInt(26) + 'a');
            System.out.println("Letra: "+letras);

            if (letras == 'b') {
                contador++;
            }

        }

        System.out.println("La letra 'a' salio "+contador);        
        
    }
    
}
