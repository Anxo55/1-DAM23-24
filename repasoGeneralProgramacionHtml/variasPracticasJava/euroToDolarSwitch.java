package variasPracticasJava;

import java.util.Scanner;

public class euroToDolarSwitch {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        double cantidad;
        char operacion;

        System.out.println("Dame la cantidad para hacer la conversion: ");
        cantidad = sc.nextDouble();

        System.out.println("Euro a dolar(E), Dolar a euro(D)");
        operacion = sc.next().charAt(0);

        switch (operacion) {
            case 'E':
                System.out.println("La cantidad de euros a dolares es: "+euroToDolar(cantidad));
                break;

            case 'D':
                System.out.println("La cantidad de dolares a euros es : "+dolarToEuro(cantidad));
                break;    
        
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
        
    }

    public static double euroToDolar(double euro){
        double dolar;
        dolar = euro * 1.05;
        return dolar;
    }

    public static double dolarToEuro(double dolar) {
        double euro;
        euro = dolar / 1.05;
        return euro;
    }
    
}
