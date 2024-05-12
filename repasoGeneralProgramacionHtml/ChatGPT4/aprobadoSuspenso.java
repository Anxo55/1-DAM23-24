package ChatGPT4;

import java.util.Scanner;

public class aprobadoSuspenso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Dame la nota del alumno: ");
        nota = sc.nextInt();

        if (nota <5 ) {
            System.out.println("Suspendio el examen");
        } else if(nota == 5){
            System.out.println("Aprobaste el examen");
        }else if(nota >= 6 && nota <= 8 ){
            System.out.println("Aprobaste con buena nota");
        }else if(nota>8 && nota <= 10) {
            System.out.println("Aprobaste con una notaza");
        }
        
        
    }
    
}
