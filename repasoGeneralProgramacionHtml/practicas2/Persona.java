package practicas2;

import java.util.Scanner;

// Define una clase llamada Persona con atributos nombre y edad. Agrega un método saludar que imprima un saludo personalizado.

public class Persona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        String nombre;

        System.out.println("Dame el nombre de la persona: ");
        nombre = sc.nextLine();

        System.out.println("Dime la edad de la persona: ");
        edad = sc.nextInt();

        saludar(edad, nombre);
        
    }

    public static void saludar(int edad, String nombre) {

        System.out.println("Hola me llamo "+nombre+" tengo "+edad+" años encanto de conocerte.");
    
    }
    
}
