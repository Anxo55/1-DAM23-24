package cosasVarias;

import java.util.Scanner;

public class multiplo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        double numero1=sc.nextDouble();

        System.out.println("Dame el segundo numero: ");
        double numero2 = sc.nextDouble();
        sc.close();

        if(numero1%4==0) {
            System.out.println("EL numero es multiplo de dos");
        }else if(numero2%4==0) {
            System.out.println("El numero es multiplo de dos");
        }else{
            System.out.println("No es multiplo de dos");
        }

        }

    }
    

