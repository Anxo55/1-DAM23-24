package ExamenAnxo2ªEvaluacion;

import java.util.Scanner;

// Ingresar una cadena y determinar cuántas palabras se encuentran en la cadena.
// Cada palabra se separa por medio de un espacio en blanco. 
// Mostrar la misma cadena pera con las palabras en sentido inverso


public class Ejercicio5B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = sc.nextLine();

        
        int contadorPalabras = contarPalabras(cadena);
        System.out.println("Número de palabras en la cadena: " + contadorPalabras);

        String cadenaInvertida = invertirPalabras(cadena);
        System.out.println("Cadena con palabras en sentido inverso:");
        System.out.println(cadenaInvertida);

        sc.close();
    }

    public static int contarPalabras(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.split("\\s+");
        return palabras.length;
    }

    public static String invertirPalabras(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return cadena;
        }

        String[] palabras = cadena.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]).append(" ");
        }

        return resultado.toString();
    }
}