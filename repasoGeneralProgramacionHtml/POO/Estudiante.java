package POO;

// Define una clase Estudiante con atributos como nombre, edad y calificaciones. 
// Agrega un método para calcular el promedio de calificaciones.

public class Estudiante {

    private String nombre;
    private int edad;
    private double calificaciones;

    Estudiante() {
        this.nombre = "Tomas";
        this.edad = 28;
        this.calificaciones = 26;
    }

    Estudiante(String nombre, int edad, double calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

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

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double mediaNotas() {
        double media;
        return media = calificaciones / 3;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", calificaciones=" + calificaciones + "]";
    }
    
}
