package segundo.ejemplo3_2;

// haga un programa que genere automáticamente acrónimos.
// Partiendo de una frase determinada, debe mostrar por pantalla el texto
// compuesto por las iniciales de cada palabra individual que forma la
// frase.

import java.util.Scanner;

public class Reto7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        StringBuilder acronimo = new StringBuilder();

        for (String palabra : palabras) {
            acronimo.append(Character.toUpperCase(palabra.charAt(0)));
        }

        System.out.println("El acrónimo es: " + acronimo);
    }
}
