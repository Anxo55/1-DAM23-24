// package practica;

import java.util.Scanner;

public class dividir {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1, num2;

       System.out.println("Introduce el dividendo");
       num1 = sc.nextInt();

       do {
           System.out.println("Introduce el divisor");
           num2 = sc.nextInt();
           if (num2 == 0)
               System.out.println("No se puede dividir entre 0, inténtalo de nuevo");

       } while (num2 == 0);

       System.out.println("El cociente de la división es " + num1 / num2);
       System.out.println("El resto de la división es " + num1 % num2);
       
   
       
   }
}
