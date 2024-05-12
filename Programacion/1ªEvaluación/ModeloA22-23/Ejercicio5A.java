import java.util.Scanner;

public class Ejercicio5A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de dólares a pagar
        System.out.print("Ingrese la cantidad de dólares a pagar: ");
        double cantidadDolares = scanner.nextDouble();

        // Calcular la cantidad de billetes y monedas
        int billetes100 = (int) cantidadDolares / 100;
        cantidadDolares %= 100;

        int billetes50 = (int) cantidadDolares / 50;
        cantidadDolares %= 50;

        int billetes20 = (int) cantidadDolares / 20;
        cantidadDolares %= 20;

        int billetes10 = (int) cantidadDolares / 10;
        cantidadDolares %= 10;

        int billetes5 = (int) cantidadDolares / 5;
        cantidadDolares %= 5;

        int billetes2 = (int) cantidadDolares / 2;
        cantidadDolares %= 2;

        int billetes1 = (int) cantidadDolares;

        // Calcular el resto a pagar en monedas
        int monedasResto = (int) (cantidadDolares * 100);

        // Mostrar los resultados
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Billetes de 2: " + billetes2);
        System.out.println("Billetes de 1: " + billetes1);

        System.out.println("Resto a pagar en monedas: " + monedasResto + " centavos");

        scanner.close();
    }
    
}
