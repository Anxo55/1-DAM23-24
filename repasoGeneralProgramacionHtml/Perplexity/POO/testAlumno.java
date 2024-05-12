package Perplexity.POO;

import java.util.Scanner;

public class testAlumno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        alumno pepe = new alumno(20, "Pepe");
        alumno antonio = new alumno(24, "Antonio");
        alumno miguel = new alumno(18, "Miguel");
        alumno pedro = new alumno(22, "Pedro");
        alumno angel = new alumno(28, "Angel");

        System.out.println(pepe.toString());
        System.out.println(antonio.toString());
        System.out.println(miguel.toString());
        System.out.println(pedro.toString());
        System.out.println(angel.toString());

    }
    
}
