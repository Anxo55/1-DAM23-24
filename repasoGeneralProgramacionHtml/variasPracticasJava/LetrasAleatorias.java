package variasPracticasJava;

import java.util.Random;
import java.util.Scanner;

public class LetrasAleatorias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int contadorVocales = 0;
        int contadorConsonantes = 0;

       for(int i=0; i<=100; i++) {


        char letras = (char) i;
        letras = (char) (random.nextInt(26)+'a');
        System.out.println("Letra: "+letras);

         if(letras == 'a' || letras =='e' || letras =='i' || letras == 'o' || letras == 'u'){
            contadorVocales++;
         }else{
            contadorConsonantes++;
         }

       }
        System.out.println("El total de vocales ha sido: "+contadorVocales);
        System.out.println("El total de consonantes ha sido: "+contadorConsonantes);
        
    }

}

