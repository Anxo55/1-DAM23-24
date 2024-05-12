package uno;

import java.util.Scanner;

public class calculos {

     public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();
        sc.close();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        // Mostrar los resultados
        System.out.println("Longitud del círculo: " + longitud);
        System.out.println("Área del círculo: " + area);
    }
}
