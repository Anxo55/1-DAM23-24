package RepasoPooAnxo;

public class Estudiante {

    private int notas;
    private String nombre;
    private int edad;

    Estudiante() {
        this.notas = 9;
        this.nombre = "Pepe";
        this.edad = 18;
    }

    Estudiante(int notas, String nombre, int edad) {
        this.notas = notas;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
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

    @Override
    public String toString() {
        return "Estudiante [notas=" + notas + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
