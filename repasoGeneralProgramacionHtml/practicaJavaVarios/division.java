package practicaJavaVarios;

import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor;

        System.out.println("Dame el dividendo: ");
        dividendo = sc.nextInt();

        System.out.println("Dame el divisor: ");
        divisor = sc.nextInt();

        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;

        System.out.println(dividendo+ " entre "+divisor+ " es igual a "+cociente+ " y de resto queda "+resto);
    }
    
}
