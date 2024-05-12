package ChatGPT.basicos;

import java.util.Scanner;

//  Crea un programa que tome dos números enteros ingresados por el usuario y luego muestre el mayor de los dos números. 
//  Utiliza un método llamado encontrarMayor que tome dos parámetros y devuelva el número más grande.

public class numeroMayor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Dame el primer entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo entero: ");
        numero2 = sc.nextInt();


      int mayor = encontrarMayor(numero1, numero2);

      System.out.println("El numero mayor es: " +mayor);

    }

    public static int encontrarMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else{
            return numero2;
        }

    }
    
}
