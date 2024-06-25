package Java.Juegos;

import java.util.Random;
import java.util.Scanner;

public class practica {

    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Juego de adivinar el numero: ");

        int numero = 0;
        int numeroAleatorio;
        int intentos = 0;

        Random random = new Random();
        
        numeroAleatorio = random.nextInt(100);
        
        do {
            System.out.println("Dime el numero a adivinar: ");
            numero =sc.nextInt();
            intentos++;
            if (numero < numeroAleatorio) {
                System.out.println("El numero es mas grande");
                System.out.println("Llevas "+intentos+" intento/s");
            }else if (numero > numeroAleatorio) {
                System.out.println("El numero es mas pequenio");
                System.out.println("Llevas "+intentos+" intento/s");
            }else {
                System.out.println("Acertaste el numero en " +intentos+ " intentos.");
            }
            
        } while (numero != numeroAleatorio && intentos < 10);
    }
    
}
