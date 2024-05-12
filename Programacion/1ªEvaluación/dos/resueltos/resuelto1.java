package dos.resueltos;

import java.util.Scanner;

// 1. Realiza una clase Temperatura, la cual convierta grados Celsius a Farenheit y viceversa. Para ello crea dos 
// métodos double celsiusToFarenheit(double) y double farenheitToCelsius(double).
// En la construcción ten en cuenta las siguientes fórmulas:
// Fahrenheit a Celsius C = (F - 32)/l,8
// Celsius a Fahrenheit F = (1,8)C + 32

public class resuelto1 {

    //las clases abstractas no pueden crear objetos

    public static double celsiusToFarenheit(double celsius) {
        return (1.8) * celsius + 32;
    }

    public static double farenheitToCelsius(double fahr) {
        return (fahr - 32)/1.8;
    }
    public static void main(String[] args) {

        double temporal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame l valor de los graods centigrados: ");
        temporal = sc.nextDouble();

     System.out.println("Cuando son 0 grados celsius serian: "+celsiusToFarenheit(temporal)+ " grados farenheit");   

     System.out.println("Cuando son 0 grados farenheit son: "+farenheitToCelsius(temporal)+ " grados celsius");

    }
    
}
