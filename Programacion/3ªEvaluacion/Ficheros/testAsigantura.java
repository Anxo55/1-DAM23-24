package Ficheros;


import java.util.ArrayList;

public class testAsigantura {

    public static void main(String[] args) {

        Asignatura asignatura = new Asignatura(4100547, "Programacion Orientada a Objetos", 4);
        asignatura.escribirAsignatura();
        asignatura.leerAsignatura();
    
        // Crear una coleccion de asignaturas y guardarla
        Asignatura a = new Asignatura(4839383, "Sistemas informaticos", 5);
        Asignatura b = new Asignatura(4738393, "FOL", 6);
        Asignatura c = new Asignatura(48343030, "Entornos", 9);

        ArrayList<Asignatura> col = new ArrayList<Asignatura>();
        col.add(asignatura);
        col.add(a);
        col.add(b);
        col.add(c);

        Asignatura.Guardar(col);

        ArrayList<Asignatura> extra = Asignatura.Cargar();

        for (Asignatura asig : extra) {
            asig.imprimir();
        }
    }
}