package tres.boletin2;

import java.util.Scanner;

// 13. Pedir 10 números. Mostrar la media de los números positivos, 
// la media de los números negativos y la cantidad de ceros.

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, SumaPositivos= 0, SumaNegativa = 0, zeroCount = 0, CuentaPositivos = 0, CuentaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            num = sc.nextInt();

            if (num > 0) {
                SumaPositivos+= num;
                CuentaPositivos++;
            } else if (num < 0) {
                SumaNegativa += num;
                CuentaNegativos++;
            } else {
                zeroCount++;
            }
        }

        if (CuentaPositivos > 0) {
            double MediaPositiva = (double) SumaPositivos/ CuentaPositivos;
            System.out.println("Media de los números positivos: " + MediaPositiva);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        if (CuentaNegativos > 0) {
            double MediaNegativa = (double) SumaNegativa / CuentaNegativos;
            System.out.println("Media de los números negativos: " + MediaNegativa);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }

        System.out.println("Cantidad de ceros: " + zeroCount);
    }
        
}
    

