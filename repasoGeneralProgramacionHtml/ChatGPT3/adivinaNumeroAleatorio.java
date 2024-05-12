package ChatGPT3;

import java.util.Scanner;

// Escribe un programa que genere un número aleatorio entre 1 y 100. Luego, pídele al usuario que adivine el número. 
// Utiliza un bucle do-while para continuar pidiendo al usuario que adivine hasta que lo adivine correctamente. 
// Proporciona pistas como "Demasiado alto" o "Demasiado bajo" según la conjetura del usuario.

public class adivinaNumeroAleatorio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio, numero;
        int contador = 0;

        numeroAleatorio = (int) (Math.random()*100);

        System.out.println("Ahora debemos devolver numeros entre el 1 y el 100 para adivinar el numero oculto.");

        do {
       
        System.out.println("Dame un entero: ");
        numero = sc.nextInt();
        contador++;

        if(numero > numeroAleatorio) {
            System.out.println("El numero es mas pe pequeño");
        }else if(numero < numeroAleatorio) {
            System.out.println("El numero es mas grande");
        }else{
            System.out.println("Felicidades acertaste el numero "+numeroAleatorio+ " en "+contador+ " intentos");
        }

        if(contador < 10) {
            System.out.println("Todavia puedes, llevas "+contador+ " intentos");
        }else if(contador == 10){
            System.out.println("YA hiciste "+contador+ " intentos, no lo lograste, intentalo de nuevo");
        }

        } while (numero != numeroAleatorio && contador <10);

        
        
    }
    
}
