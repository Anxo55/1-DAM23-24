package variasPracticasJava;

import java.util.Scanner;

// Desarrolla un programa que verifique si un estudiante ha aprobado un examen 
// (nota mayor o igual a 60) o ha reprobado utilizando if-else.

public class apruebaExamen {

    public static boolean notaExamen(int notaExamen){
        if(notaExamen>=60) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaExamen;

        System.out.println("Dame la nota del examen: ");
        notaExamen = sc.nextInt();

        if (notaExamen(notaExamen)) {
            System.out.println("Aprobo el examen con un "+notaExamen);
        }else{
            System.out.println("No aprobó el examen");
        }
        
    }
    
}
