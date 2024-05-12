package POO2;

import java.util.Scanner;

// Conversor de Moneda: Crea una clase ConversorMoneda que tenga métodos para convertir entre diferentes monedas, como dólares a euros, euros a libras, etc.

public class ConversorMoneda {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int datoAPasar;

        System.out.println("Dame el dato a pasar: ");
        datoAPasar = sc.nextInt();

        System.out.println("En dolares: "+euroaDolar(datoAPasar));
        System.out.println("En euros: "+dolaraEuro(datoAPasar));

        System.out.println("En libras: "+euroaLibra(datoAPasar));
        System.out.println("En euros: "+libraaEuro(datoAPasar));
       
    }

    // 1 euro = 1.5 dolares
    public static double euroaDolar(double euro) {
        double dolar;
        // return dolar;
        dolar = euro * 1.05;
        return dolar;
       
    }

    //1 dolar = 0.95 euros
    public static double dolaraEuro(double dolar) {
        double euro;
        euro = dolar / 1.05;
        return euro;
    }

    //1 euro = 0.87 libra esterlina
    public static double euroaLibra(double euro) {
        double libra;
        libra = euro * 0.87;
        return libra;
    }

    public static double libraaEuro(double libra) {
        double euro;
        euro = libra / 0.87;
        return euro;

    }
    
}
