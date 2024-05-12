package variasPracticasJava;

import java.util.Scanner;

public class numeroAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numeroAleatorio;
        int contador = 0;

        numeroAleatorio = (int) (Math.random()*100);

        do {
      System.out.println("Dame numeros entre 1 y 100 para adivinar el numero aleatorio: ");
        numero = sc.nextInt();
        contador++;

        if (numero > numeroAleatorio) {
            System.out.println("El numero es mas pequenio");
        } else if(numero < numeroAleatorio){
            System.out.println("El numero es mas grande");
        }else{
            System.out.println("Felicidades adivinaste el numero aleatorio en "+contador+" intentos");
        }

        if (contador < 10) {
            System.out.println("Llevas "+contador+" intentos, todavia te quedan");
        } else if(contador == 10){
            System.out.println("Llegaste a 10 intentos, no tienes mas oportunidades.");
        }

              
        } while (numero != numeroAleatorio && contador<10);

    }
    
}
