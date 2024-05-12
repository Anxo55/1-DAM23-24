package practicaJavaVarios;

import java.util.Random;
import java.util.Scanner;

public class totalConsonantesVocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        Random random = new Random();
        for(int i=0; i<=100; i++) {
            char letras = (char) (random.nextInt(26)+'a');
            System.out.println("Letra: "+letras);

            if(letras == 'a'|| letras =='e' || letras == 'i' || letras == 'o' || letras == 'u' ) {
                contadorVocales++;
            }
            
            if(letras == 'b'|| letras == 'c' || letras == 'd' || letras == 'f' || letras == 'g' || letras == 'h' || letras == 'j' || letras == 'k' || letras == 'l' || letras == 'm' || letras == 'n' || letras == 'ñ' || letras == 'p' || letras == 'q' || letras == 'r' || letras == 's' || letras == 't' || letras == 'v' || letras == 'w' || letras == 'x' || letras == 'y' || letras == 'z') {
                contadorConsonantes++;
            }
        }

        System.out.println("El total de vocales ha sido: "+contadorVocales);
        System.out.println("El total de consonantes ha sido: "+contadorConsonantes);
        
    }
    
}
