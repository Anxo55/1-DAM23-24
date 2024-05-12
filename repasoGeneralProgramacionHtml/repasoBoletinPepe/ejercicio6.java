package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        do {
            
        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if (numero > 0 || numero < 0) {
            suma+= numero;
            contador++;
        }else if(numero == 0) {
            System.out.println("El numero seleccionado es el 0, cerrando el programa.");
        }

        } while (numero != 0);

        System.out.println("la suma de todos los numeros es: "+suma);
        System.out.println("El total de numeros distintos a cero fue: "+contador);

    }
    
}
