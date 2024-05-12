package uno;

import java.util.Scanner;

//introducir una cantidad double de pasta(dinero)
//cambiar de dolares a euros o euros a dolares
//metodo que pida la cantidad a introducir (obtenerValor).
//metodo  obtenerCantidad, donde pedimos la cantidad al escoger el metodo que queremos usar.

public class metodosCambio {

    static Scanner sc;

    //metodos
    public static double dolaresEuro(double dolares) {
            double euros;
            euros = dolares / 1.05;
            return euros;
    }

    public static double euroDolar(double euros) {
        double dolares;
        dolares = euros * 1.05;
        return dolares; 
    }

    public static double obtenerCantidad(String mensaje) {
        double cantidad;
        System.out.println(mensaje);
        cantidad = sc.nextDouble();
        return cantidad;

    }

    public static void main(String[] args) {
        //teniamos el metodo scanner del main mal iniciado, al tenerlo arriba no necesitamos declararlo abajo.
        //Por eso solo es "sc = new Scanner(System.in);" y no "Scanner sc = new Scanner(System.in);"
        sc = new Scanner(System.in);
        
        int operacion;
        // double cantidadDinero;
        boolean seguir = true;
        double cantidad;

        do {
      
        System.out.println("D (DOLAR, E (EURO), S (SALIR)");
        operacion = sc.next().charAt(0);

       
        switch (operacion) {
            case 'D':
            cantidad = obtenerCantidad("Introduce euros");
            System.out.println("De euro a dolar es: "+euroDolar(cantidad));
            break;

            case 'E':
            cantidad = obtenerCantidad("Introduce dolares");
            System.out.println("De dolar a euro es: "+dolaresEuro(cantidad));
            break;

            case 'S':
            seguir = false;
            System.out.println("Saliendo del programa...");
            break;

            default:
            System.out.println("Operacion no valida, repita.");
            break;
        }

        } while (seguir);
        
       
    }

    
}
