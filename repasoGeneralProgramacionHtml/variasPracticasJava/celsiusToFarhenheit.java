package variasPracticasJava;

import java.util.Scanner;

public class celsiusToFarhenheit {

    public static void main(String[] args) {
        
        menu();

    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        char eleccion;
        double cantidad;

        System.out.println("Dame la cantidad para hacer la conversion: ");
        cantidad = sc.nextDouble();

        System.out.println("Para pasar a Celsius (C), para pasar a Farhenheit (F");
        eleccion = sc.next().toLowerCase().charAt(0);

        switch (eleccion) {
            case 'f':
                System.out.println("A farhenheiot es: "+celsiusToFarhenheit(cantidad));
                break;

            case 'c':
                System.out.println("A celsius es: "+farhenheitToCelsius(cantidad));    
        
            default:
                break;
        }

        }

        public static double celsiusToFarhenheit(double celsius) {
            double farhenheit = (celsius * 1.8) +32;
            return farhenheit;
        }

        public static double  farhenheitToCelsius(double farhenheit) {
            double celsius = (farhenheit-32) /1.8;
            return celsius;

        }
    
}
