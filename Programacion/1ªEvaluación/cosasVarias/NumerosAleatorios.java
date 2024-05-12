package cosasVarias;

// Total de diez numeros consecutivos aleatoriamente primero, después de este proceos, hacemos que salgan desordendados, y a poder
// que podamos detectar los que son multiplos de dos, y en el proximo los que son multiplos de tres.

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        for(int numero=0; numero<10; numero++) {
            System.out.println("Los numeros son: "+numero);
        }

    }
    
}
