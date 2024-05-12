package dos.propuestos;

import java.util.Scanner;

// Realiza una clase finanzas que convierta dólares a euros y viceversa. 
//Codifica los métodos dolaresToEurot y eurosToDolares. 
//Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. L¿ 
// clase tiene que tener:
// Un constructor finanzas() por defecto el cual establecerá el cambio Dólar-Euro en 1.36.
// Un constructor finanzas (double), el cual permitirá configurar el cambio dólar-euro.

public class finanzas {

    static Scanner sc;

    //constantes
    public static final double CAMBIOEaD = 1.36;

    //atributos
    double cambio;

    //constructor por defecto
    finanzas() {
        this.cambio=CAMBIOEaD;
    }

    finanzas(double cambio) {
        this.cambio=cambio;
    }

    public double dolaresEuro(double dolares) {
        double euros;
        euros = cambio / dolares;
        return euros;
    }

    public double euroDolar(double euros) {
        double dolares;
        dolares = cambio * euros;
        return dolares; 
    }

    public static double obtenerCantidad(String mensaje) {
        double cantidad;
        System.out.println(mensaje);
        cantidad = sc.nextDouble();
        return cantidad;

    }

    //Ponemos menu asecas
    public void menu() {
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

    @Override
    public String toString() {
        return "finanzas usando [cambio=" + cambio + "]";
    }
}
