package pruebaRepaso;
// Para ganar un set se necesita se tiene que ganar 6 juegos, pero por lo menos debe ganar
// dos juegos mas que su rival, si el set está empatados a 5 juegos, el ganador es el primero que llegue a 7.
// Dos enteros m y n sabiendo que el jugador A gano m juegos y el jugador b n juegos
// si A ganó el set o, si B ganó el set, o si el set todavia no termina, o si el resultado es invalido, por ejemplo 8-6

import java.util.Scanner;

public class Ejercicio2A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el valor de m: ");
        int m = sc.nextInt(); 

        System.out.println("Dame el valor de n: ");
        int n = sc.nextInt(); 

        if (m >= 6 && m - n >= 2) {
            System.out.println("El jugador A ha ganado el set.");
        } else if (n >= 6 && n - m >= 2) {
            System.out.println("El jugador B ha ganado el set.");
        } else if (m == 6 && n == 6) {
            System.out.println("El set está empatado a 6 juegos.");
        } else if ((m == 7 && n == 5) || (n == 7 && m == 5)) {
            System.out.println("El ganador es el primero que llegue a 7.");
        } else {
            System.out.println("El resultado es inválido.");
        }
    }
}