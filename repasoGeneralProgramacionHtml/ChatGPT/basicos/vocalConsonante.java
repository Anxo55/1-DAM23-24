package ChatGPT.basicos;

import java.util.Scanner;

public class vocalConsonante {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char letra;
        boolean seguir = true;

        do {
        
        System.out.println("Dame una letra del abecedario: ");
        letra = sc.next().charAt(0);
        
        if (letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra =='u' ) {
            System.out.println("La letra " + letra + " es vocal");
        } else {
            System.out.println("La letra " + letra + " es consonante");
            
        }
        
        } while (seguir);

    }
    
}
