package variasPracticasJava;

import java.util.Scanner;

public class edadPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Dame la edad de la persona: ");
        edad = sc.nextInt();

        if (edad >=10 && edad <=17) {
            System.out.println("La persona es un chico/a ");
        }

        if (edad>=18 && edad <= 40) {
            System.out.println("Es una persona adolescente");
        }

        if (edad>=50 && edad <=100) {
            System.out.println("Es una persona adulta");
        }
        
    }
    
}
