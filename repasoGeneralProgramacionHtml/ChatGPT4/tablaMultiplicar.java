package ChatGPT4;

import java.util.Scanner;

public class tablaMultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Dame un numero para mostrar su tabla de multiplicar: ");
        numero = sc.nextInt();

        int i=0;
        int resultado;
        while (i<10) {
            i++; 
            resultado = numero*i;
            System.out.println(numero+ " x "+i+ " =" +resultado);
            
        }
        
    }
    
}
