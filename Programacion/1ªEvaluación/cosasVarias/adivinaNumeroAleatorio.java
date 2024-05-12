package cosasVarias;

import java.util.Scanner;

public class adivinaNumeroAleatorio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, aleatorio;
        aleatorio = (int) (Math.random()*100);
        int numeroIntentos=0;

        do {
            System.out.println("Adivina el numero generado entre 0 y 100");
            numero = sc.nextInt();
            numeroIntentos++;

            if (numero > aleatorio) {
                System.out.println("El numero es mas pequeño");
            } else if(numero < aleatorio){
                System.out.println("El numero es mas grande");
            }
            
        } while (numero != aleatorio);
        System.out.println("Felicidades has adivinado el numero buscado en "+numeroIntentos+ " intentos");
        
    }
    
}
