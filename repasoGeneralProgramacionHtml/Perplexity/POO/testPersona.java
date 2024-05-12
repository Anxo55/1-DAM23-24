package Perplexity.POO;

import java.util.Scanner;

public class testPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona pepe = new Persona("Pepe", 20);
        Persona angel = new Persona("Angel", 21);

        System.out.println(pepe.toString());
        System.out.println(angel.toString());

        pepe.saludar();
        
    }
    
}
