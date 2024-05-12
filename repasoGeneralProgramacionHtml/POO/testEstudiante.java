package POO;

public class testEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Jacobo", 36, 18);
        Estudiante estudiante3 = new Estudiante("Cesar", 22, 23);

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());

        System.out.println("");

        System.out.println("La media de las notas de " + estudiante1.getNombre()+" es: "+estudiante1.mediaNotas());
        System.out.println("La media de las notas de " + estudiante2.getNombre()+" es: "+estudiante2.mediaNotas());
        System.out.println("La media de las notas de " + estudiante3.getNombre()+" es: "+estudiante3.mediaNotas());

        
    }
    
}
