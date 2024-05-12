package Perplexity.cosas;

import java.util.Scanner;

// Escribe un programa que verifique si un carácter es una vocal 
// o una consonante utilizando la sentencia switch.

public class vocalConsonante {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char letra;
        boolean seguir = true;

        do {
       
        System.out.println("Dame una letra para saber si es vocal o consonante: ");
        letra = sc.next().charAt(0);

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("La letra " +letra+ " es vocal");
                break;
             
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':     
                System.out.println("La letra " +letra+ " es consonante");
                break;
            default:
            seguir = false;
                System.out.println("Opcion incorrecta, saliendo del programa");
                break;
        }
             
        } while (seguir);

    }
    
}
