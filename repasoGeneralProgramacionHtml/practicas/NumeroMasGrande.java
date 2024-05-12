// package practicas;

import java.util.Scanner;

public class NumeroMasGrande {

  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una lista de números separados por espacios: ");
        String input = scanner.nextLine();

        // Dividir la entrada en números individuales
        String[] numerosComoTexto = input.split(" ");

        // Inicializar la variable para el número más grande
        int maximo = Integer.MIN_VALUE;


        for (String numeroTexto : numerosComoTexto) {
            try {
                int numero = Integer.parseInt(numeroTexto);
                if (numero > maximo) {
                    maximo = numero;
                }
            } catch (NumberFormatException e) {
                // Manejar números no válidos si los hubiera
                System.err.println("Ignorando entrada no válida: " + numeroTexto);
            }
        }


        if (maximo != Integer.MIN_VALUE) {
            System.out.println("El número más grande en la lista es: " + maximo);
        } else {
            System.out.println("No se ingresaron números válidos en la lista.");
        }
    
    }
}
