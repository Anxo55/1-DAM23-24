package Perplexity.cosas;

// Escribe un programa que lea el género (M/F) y muestre el género correspondiente utilizando 
// la sentencia switch.

import java.util.Scanner;

public class genero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char genero;
        boolean seguir = true;

        do {
            
        System.out.println("(M) MUJER, (H) HOMBRE, (S) SALIR: ");
        genero = sc.next().charAt(0);

        switch (genero) {
            case 'M':
                System.out.println("El genero escogido es mujer.");
                break;
            
            case 'H':
                System.out.println("El genero escogido es hombre.");    
                break;

            case 'S':
            seguir = false;
                System.out.println("Cerrando el programa con exito...");
                break;    
        
            default:
                System.out.println("Si se a confundido intentelo de nuevo, sino pulse S para salir del programa.");
                break;
        }

        } while (seguir);
        
    }
    
}
