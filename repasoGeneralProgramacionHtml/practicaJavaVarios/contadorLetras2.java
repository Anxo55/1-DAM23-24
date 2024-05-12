package practicaJavaVarios;

import java.util.Random;
import java.util.Scanner;

public class contadorLetras2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        Random random = new Random();

        for(int i=0; i<=100; i++ ) {
            char letras = (char) (random.nextInt(26)+'a');
            System.out.println("Letra-"+i+ ": "+letras);

            if(letras =='a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
                contador++;
            }
        }
        
        System.out.println("El total de vocales que han salido es: "+contador);
        
    }
    
}
