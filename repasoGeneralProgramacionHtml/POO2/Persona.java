package POO2;

// Clase Persona: Crea una clase llamada Persona con atributos como nombre, edad y género. 
// Agrega métodos para obtener y establecer estos atributos.

public class Persona {

    private String nombre;
    private int edad; 
    private String genero;

    Persona() {
        this.nombre = "Pepe";
        this.edad = 18;
        this.genero = "Hombre";
    }

    Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
    }
    
}
