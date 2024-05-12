package cuatro.recursos;

import java.util.Scanner;

public class Aritmetica {

    // termino enesimo      inicial +  (n-1) por la razon
    // an = a1 +(n - 1) . d fd

    public static void main(String[] args) {
        int inicial;
        int razon;
        int mostrados;
        Scanner sc = new Scanner(System.in);

        System.out.println("Termino inicial: ");
        inicial = sc.nextInt();

        System.out.println("Razon: ");
        razon = sc.nextInt();

        System.out.println("Cuantos terminos mostramos: ");
        mostrados = sc.nextInt();

        for (int i = 0; i <mostrados; i++) {
            System.out.println("Termino: "+(i+1)+" es: "+(inicial+i *razon));
        }

    }
    
}
