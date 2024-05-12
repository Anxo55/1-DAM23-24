package uno;

// (Ejercicio de dificultad alta) Realiza un programa que genere letras aleatoriamente y determine si son vocales o 
// consonantes

import java.util.Scanner;

public class propuesto8b {

    public static char getLetras() {
        return (char) ('a' + Math.random()*26);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char letras = getLetras();

        if(letras == 'a' || letras =='e' || letras == 'i' || letras =='o' || letras == 'u')
            System.out.println(letras + " es vocal");
        else
            System.out.println(letras + " es consonante");

            switch (letras) {
                case 'a','e','i','o','u':
                    System.out.println(letras + " la letra es vocal");
                    break;
                    
                default:
                    System.out.println(letras + " la letra es consonante");
                    break;
            }

    }
    
}
