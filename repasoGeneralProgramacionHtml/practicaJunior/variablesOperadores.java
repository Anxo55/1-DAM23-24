package practicaJunior;

import java.util.Scanner;

// Escribe un programa en Java que solicite al usuario dos números enteros y 
// luego muestre la suma, resta, multiplicación y división de esos números.

public class variablesOperadores {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Dame el primer numero entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero: ");
        numero2 = sc.nextInt();

        System.out.println("");

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicación = numero1 * numero2;
        int división = numero1 / numero2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multiplicación);
        System.out.println("Division: "+división);
        
    }
    
}
