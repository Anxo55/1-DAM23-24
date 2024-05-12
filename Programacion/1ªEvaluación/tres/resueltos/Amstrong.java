package tres.resueltos;

import java.util.Scanner;

// 32164049651

public class Amstrong {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (esArmstrong(numero)) {
            System.out.println(numero + " es un número Armstrong");
        } else {
            System.out.println(numero + " no es un número Armstrong");
        }
    }


    public static boolean esArmstrong(int numero) {
        int n = String.valueOf(numero).length();
        int suma = 0;
        int temp = numero;
        while (temp > 0) {
            int cifra = temp % 10;
            suma += Math.pow(cifra, n);
            temp /= 10;
        }
        return suma == numero;
    }
}


