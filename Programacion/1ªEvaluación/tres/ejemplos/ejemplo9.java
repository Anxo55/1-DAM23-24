package tres.ejemplos;

import java.util.Scanner;

public class ejemplo9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Dame un numero para hacer la tabla: ");
        numero = sc.nextInt();

        for(int i=1; i<=10; i++) {
            int resultado = numero *i;
            System.out.println(numero+ " x "+i+" = "+resultado);
        }

        
    }
    
}
