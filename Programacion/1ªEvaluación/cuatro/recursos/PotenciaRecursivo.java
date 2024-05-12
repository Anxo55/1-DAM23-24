package cuatro.recursos;

import java.util.Scanner;

public class PotenciaRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base;
        int exponente;

        System.out.println("Dame la base: ");
        base = sc.nextInt();

        System.out.println("Dame el exponente: ");
        exponente = sc.nextInt();

        System.out.println("La potencia es: " + Numero_elevado(base, exponente));

    }

    public static int Numero_elevado(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * Numero_elevado(base, exponente - 1);
        }
    }
}
