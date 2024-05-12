package practicaJunior;

import java.util.Scanner;

// Crea un programa que determine si un número ingresado por el usuario es par o impar. 
// Pídele al usuario que ingrese un número y muestra el resultado.

public class estructurasDeControl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;

        while (numero >= -10 && numero <=10) {
    
        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero "+numero+" es par.");
        }else{
            System.out.println("El numero "+numero+" es impar.");
        }

        }//fin del bucle while
            System.out.println("El numero "+numero+" esta fuera del rango establecido.");
    }
    
}
