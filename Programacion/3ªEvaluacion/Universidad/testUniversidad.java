package Universidad;

import java.util.ArrayList;

public class testUniversidad {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        double[] notas = {5, 8, 3};
        double[] notas2 = {7 , 3, 3};

        Persona persona = new Persona("Pepe", "Cebem 30");
        Estudiante estudiante = new Estudiante("Angel", "Alcalde lavadores", "Ingenieria informatica", 2, notas);
        Estudiante estudiante2 = new Estudiante("Miguel", "Castrelos", "Escritor", 3, notas2);
        Profesor profesor = new Profesor("Pedro", "Avenida de Madrid", "Software", "Maestro");
        
        personas.add(persona);
        personas.add(estudiante);
        personas.add(estudiante2);
        personas.add(profesor);

        for (Persona persona2 : personas) {
            System.out.println(persona2.toString());

            if (persona instanceof Persona) {
                System.out.println(Persona.levantarseDeCama());
                System.out.println(Persona.desayunar());
                System.out.println(Persona.irParaClase());
            }

            if (persona instanceof Profesor) {
                System.out.println(Profesor.darClase());
                System.out.println(Profesor.corregir());
            }

            if (persona instanceof Estudiante) {
                System.out.println(Estudiante.hacerEjercicios());
            }
        }

        System.out.println("La media de las notas de "+estudiante.getNombre()+" es: "+estudiante.calcularMedia());
        System.out.println("La media de las notas de "+estudiante2.getNombre()+" es: "+estudiante2.calcularMedia());

    }
    
}
