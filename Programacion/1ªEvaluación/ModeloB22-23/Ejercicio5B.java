//package ModeloB22-23;

import java.util.Scanner;

public class Ejercicio5B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de pesetas a pagar
        System.out.print("Ingrese la cantidad de pesetas a pagar: ");
        int cantidadPesetas = scanner.nextInt();

        // Calcular la cantidad de billetes y monedas
        int billetes10000 = cantidadPesetas / 10000;
        cantidadPesetas %= 10000;

        int billetes5000 = cantidadPesetas / 5000;
        cantidadPesetas %= 5000;

        int billetes2000 = cantidadPesetas / 2000;
        cantidadPesetas %= 2000;

        int billetes1000 = cantidadPesetas / 1000;
        cantidadPesetas %= 1000;

        int billetes500 = cantidadPesetas / 500;
        cantidadPesetas %= 500;

        int billetes200 = cantidadPesetas / 200;
        cantidadPesetas %= 200;

        int billetes100 = cantidadPesetas / 100;
        cantidadPesetas %= 100;

        // Calcular el resto a pagar en monedas
        int monedasResto = cantidadPesetas;

        // Mostrar los resultados
        System.out.println("Billetes de 10000: " + billetes10000);
        System.out.println("Billetes de 5000: " + billetes5000);
        System.out.println("Billetes de 2000: " + billetes2000);
        System.out.println("Billetes de 1000: " + billetes1000);
        System.out.println("Billetes de 500: " + billetes500);
        System.out.println("Billetes de 200: " + billetes200);
        System.out.println("Billetes de 100: " + billetes100);

        System.out.println("Resto a pagar en monedas: " + monedasResto + " pesetas");

        scanner.close();
    }
    
}
