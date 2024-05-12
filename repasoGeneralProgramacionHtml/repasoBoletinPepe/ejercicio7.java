package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
        int suma = 0;

        do {

        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            suma+=numero;
            contador++;
            
        }else if(numero<0) {
            double media = suma |contador;
            System.out.println("La media de todos los numeros es: "+media);
        }
   
        } while (numero >= 0);

    }
    
}
