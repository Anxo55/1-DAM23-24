package uno;

import java.util.Scanner;

public class sumaEntera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el primer numero entero: ");
        int numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero: ");
        int numero2 = sc.nextInt();
        sc.close();

        int cociente = numero1 / numero2;
        int resto = numero1 % numero2;

        
        System.out.println("El cociente de la división es: " + cociente);
        System.out.println("El resto de la división es: " + resto);

        System.out.println("Si divido " +numero1+ " entre " +numero2+ " da de cociente "+cociente+ " y de resto " +resto);

    }
    
}
