package cosasVarias;

import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Dame el primer numero: ");
        num1=sc.nextInt();
        
        System.out.println("Dame el segundo numero: ");
        num2=sc.nextInt();

        int resta=num1-num2;

        System.out.println("La resta de los numeros es: "+resta);
    }
    
}
