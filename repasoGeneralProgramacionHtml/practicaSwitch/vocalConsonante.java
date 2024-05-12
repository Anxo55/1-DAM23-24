package practicaSwitch;

import java.util.Scanner;

// Escribe un programa que tome una letra como entrada y determine si es una vocal o una consonante usando un switch.

public class vocalConsonante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra;
        System.out.println("Dame una letra para determinar si es vocal o consonante.");
        letra = sc.next().charAt(0);

        switch (letra) {
            case 'a','e','i','o','u':
                System.out.println("La letra "+letra+" es vocal");
                break;

            case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s', 't', 'v','w','x','y','z':
                System.out.println("La letra "+letra+" es consonante");    
                break;
        
            default:
            System.out.println("Opcion incorrecta vuelve a intentarlo otra vez.");
                break;
        }
        
    }
    
}
