package POO;

// Crea una clase llamada Persona con atributos como nombre, edad y dirección. 
// Agrega métodos para obtener y establecer estos atributos.

public class Persona {

    private String nombre;
    private int edad;
    private String direccion;

    Persona() {
        this.nombre = "Anxo";
        this.edad = 19;
        this.direccion = "Pizarro";
    }

    Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "La persona " + nombre + " con " + edad + " años vive en " + direccion + "]";
    }
    
}
