package variasPracticasJava;

import java.util.Scanner;

public class mayorTresNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("Dame el primer numero entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero");
        numero2 = sc.nextInt();

        System.out.println("Dame el tercer numero entero: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3 ) {
            System.out.println("El numero: "+numero1+" es el mayor");
        } else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero: "+numero2+ " es el mayor");
        }else{
            System.out.println("El numero: "+numero3+ " es el mayor");
        }
        
    }
    
}
