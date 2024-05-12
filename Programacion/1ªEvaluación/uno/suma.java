package uno;

import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero: ");
        int numero2 = sc.nextInt();
        sc.close();

        int suma= numero1+numero2;
        System.out.println("La suma de los numeros es: "+suma);

    }
    
}
