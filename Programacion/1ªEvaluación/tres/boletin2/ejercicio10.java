package tres.boletin2;

import java.util.Scanner;

// 10. Pedir 15 números y escribir la suma total.

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Dame un numero: " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("La suma de los numeros es: : " + sum);
    
    }
}
