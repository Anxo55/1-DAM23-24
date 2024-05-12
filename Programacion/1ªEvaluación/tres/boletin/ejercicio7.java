package tres.boletin;

import java.util.Scanner;

public class ejercicio7 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, contador = 0;

        System.out.print("Dame un numero positivo: ");
        num = sc.nextInt();

        while (num >= 0) {
            sum += num;
            contador++;
            System.out.print("Dame otro numero positivo: ");
            num = sc.nextInt();
        }

        if (contador == 0) {
            System.out.println("Con .");
        } else {
            double media = (double) sum / contador;
            System.out.println("La media de " + contador + " numeros positivos es " + media);
        }
    }
}