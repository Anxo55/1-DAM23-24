package cosasVarias;

import java.util.Scanner;

// Metodo donde vamos a pedir letras vocales y nos mostrará unas cosas y con consonantes otras.

public class algo {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (0 para salir): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }

            if (numero % 2 == 0) {
                // Es un número par, imprimir una vocal
                char vocal = obtenerVocal();
                System.out.println("Número par, vocal: " + vocal);
            } else {
                // Es un número impar, imprimir una consonante
                char consonante = obtenerConsonante();
                System.out.println("Número impar, consonante: " + consonante);
            }
        }

        scanner.close();
    }

    // Función para obtener una vocal de manera circular (a, e, i, o, u)
    private static char obtenerVocal() {
        String vocales = "aeiou";
        char vocalActual = 'a'; // Iniciar con 'a'
        // Obtener la vocal siguiente
        for (char vocal : vocales.toCharArray()) {
            if (vocal > vocalActual) {
                vocalActual = vocal;
                break;
            }
        }
        return vocalActual;
    }

    // Función para obtener una consonante de manera circular (b, c, d, f, g, ...)
    private static char obtenerConsonante() {
        String consonantes = "bcdfghjklmnpqrstvwxyz";
        char consonanteActual = 'b'; // Iniciar con 'b'
        // Obtener la consonante siguiente
        for (char consonante : consonantes.toCharArray()) {
            if (consonante > consonanteActual) {
                consonanteActual = consonante;
                break;
            }
        }
        return consonanteActual;
    }
}
