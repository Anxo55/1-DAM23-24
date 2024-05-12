package segundo.ejemplo3_2;

import java.util.Scanner;

public class InvertirNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero entero: ");
        int numero = sc.nextInt();
        String cadena = String.valueOf(numero);
        System.out.println(cadena);
        StringBuilder sb = new StringBuilder(cadena); 
        String rev =  sb.reverse().toString();
        System.out.println(rev);

        int invertido = Integer.parseInt(rev);

        System.out.println(invertido);
        System.out.println(invertido + 1000);
        
    }
    
}
