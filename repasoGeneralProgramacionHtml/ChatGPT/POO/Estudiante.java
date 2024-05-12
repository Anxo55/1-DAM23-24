package ChatGPT.POO;

// Crea una clase Estudiante con atributos como nombre, edad y 
// calificaciones. 
// Implementa métodos para calcular el promedio de calificaciones 
// y para imprimir la información del estudiante.

public class Estudiante {

    //Atributos o parametros de la clase estudiante.
    private String nombre;
    private int edad;
    private int calificaciones;

    //metodo para calcular la media de las notas de los alumnos
    public void mediaCalificaciones() {
        // Calcular el promedio de las calificaciones
        double media = calificaciones / 3.0;
        // Imprimir el promedio en la información del estudiante
        System.out.println("Media de las notas: " + media);
    }

    //Constructor con todos los atributos o parametros de la clase
    public Estudiante(String nombre, int edad, int calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", calificaciones=" + calificaciones + "]";
    }

     
}
