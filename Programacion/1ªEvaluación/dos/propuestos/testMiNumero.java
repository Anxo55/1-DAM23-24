package dos.propuestos;

import java.util.Scanner;

public class testMiNumero {

    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner(System.in);
      
        System.out.println("introduce un numero entero: ");
        numero = sc.nextInt();

        MiNumero numerito = new MiNumero(numero);
        System.out.println(numerito.toString());
        
        System.out.println(numerito.doble());
        System.out.println(numerito.triple());
        System.out.println(numerito.cuadruple());
        
    }
    
}
