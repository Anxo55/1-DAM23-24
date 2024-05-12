package dos.resueltos;

import java.util.Scanner;

public class pipu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de pies: ");
        double pies = sc.nextDouble();

        System.out.println("Ingresa la cantidad de pulgadas: ");
        double pulgadas = sc.nextDouble();

        double centimetros = (pies * 12 + pulgadas) * 2.54;

        System.out.println("Los centímetros son: " + centimetros + " cm");
        
        System.out.println("");

        System.out.println("Dame los centimetros: ");
        centimetros = sc.nextDouble();

        pulgadas = centimetros / 2.54;
        pies = pulgadas / 12;
        pulgadas = pulgadas % 12;
        
        // Muestra el resultado
        System.out.println("Pies y pulgadas: " + pies + " pies, " + pulgadas + " pulgadas");
        
    }
    
}
