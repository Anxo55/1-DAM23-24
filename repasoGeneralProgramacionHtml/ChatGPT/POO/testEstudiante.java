package ChatGPT.POO;

import java.util.Scanner;

public class testEstudiante {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Estudiante pepe = new Estudiante("Pepe", 20, 15);
        Estudiante antonio = new Estudiante("Antonio", 18, 27);
        Estudiante pedro = new Estudiante("Pedro", 23, 19);

        System.out.println(pepe.toString());
        System.out.println(antonio.toString());
        System.out.println(pedro.toString());
        
        pepe.mediaCalificaciones();
        antonio.mediaCalificaciones();
        pedro.mediaCalificaciones();
        
    }
    
}
