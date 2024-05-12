package tres.boletin;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio;
        int numero;
        int contador = 0;

        aleatorio = (int) (Math.random()*100);

        do {
            
       System.out.println("Dame numero entre 1 y 100");
        numero = sc.nextInt();
        contador++;

        if(numero > aleatorio) {
            System.out.println("El numero es mas pequeño");
        }else if(numero < aleatorio) {
            System.out.println("El numero es mas grande");
        }else{
            System.out.println("Felicidades adivinaste el numero en "+contador+" intentos");
        }

        if (contador < 10) {
            System.out.println("Llevas "+contador+" intentos, todavia te quedan intentos");
        }else{
            System.out.println("No te quedan mas intentos, intentalo de nuevo");

        }

         } while (numero != aleatorio && contador<10);
        
    }
    
}
