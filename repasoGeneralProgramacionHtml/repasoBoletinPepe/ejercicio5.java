package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio;
        int numero;
        int contador = 0;

        aleatorio = (int) (Math.random()*100);

        do {
            
         System.out.println("Dame un numero entre 1 y 100");
        numero = sc.nextInt();
        contador++;

        if (numero > aleatorio) {
            System.out.println("el numero es mas pequenio");
        }else if(numero < aleatorio) {
            System.out.println("El numero es mas grande");
        }else {
            System.out.println("Felicidades adivianste el numero aleatorio en "+contador+" intentos");
        }

        if (contador < 10) {
            System.out.println("Llevas "+contador+" intento/s");
        }else if(contador==10) {
            System.out.println("Llegaste a 10 intentos, intentalo de nuevo");
        }

        } while (numero != aleatorio && contador < 10);

    }
    
}
