package algoPractica;

import java.util.Scanner;

public class numAleatorio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, aleatorio;
        aleatorio = (int) (Math.random()*100);
        int intentos = 0;

        do {
            
        

        System.out.println("Adivina el numero entre 0 y 100");
        numero = sc.nextInt();
        intentos++;

        if (numero > aleatorio) {
            System.out.println("EL numero es mas pequeño");
        } else if(numero < aleatorio){
            System.out.println("El numero es mas grande");
        }
        } while (numero != aleatorio);
        
    }
    
}
