// package practica;

import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double division, resto, cociente;

        System.out.println("Dame el dividendo: ");
        double dividendo = sc.nextDouble();

        System.out.println("Dame el divisor: ");
        double divisor = sc.nextDouble();

        cociente= dividendo/divisor;
        resto = dividendo % divisor;

        System.out.println("#######################");
        System.out.println("##### RESULTADO #######");
        System.out.println("#######################");
        System.out.println("##El cociente es: "+cociente+"##");
        System.out.println("#######################");
        System.out.println("###El resto es: "+resto+"####");
        System.out.println("#######################");



    }
    
}