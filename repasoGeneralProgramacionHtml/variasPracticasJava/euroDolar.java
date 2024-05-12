package variasPracticasJava;

import java.util.Scanner;

public class euroDolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad;

        System.out.println("Dame la cantidad para hcer la conversion: ");
        cantidad = sc.nextDouble();

        System.out.println("La cantidad en euros es: "+euroToDolar(cantidad));
        System.out.println("La cantidad en doalres es: "+dolarToEuro(cantidad));
        
    }

    public static double dolarToEuro(double dolar) {
        double euro;
        euro = dolar / 1.05;
        return euro;
    }

    public static double euroToDolar(double euro){
        double dolar;
        dolar = euro * 1.05;
        return dolar;
    }
    
}
