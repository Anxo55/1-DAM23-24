package cosasVarias;

import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero1;
        int numero2;

        System.out.println("Dame el numero 1:");
        numero1=sc.nextInt();

        System.out.println("Dame el numero 2: ");
        numero2=sc.nextInt();

        int suma = numero1+numero2;

        System.out.println("la suma de los numeros es: "+suma);
    }
    
}
