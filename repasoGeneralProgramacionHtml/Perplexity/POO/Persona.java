package Perplexity.POO;

public class Persona {

    private String nombre;
    private int edad;

    //Constructor con todos los parametros o atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos getters y setters
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

    //Metodo toString para mostrar por pantalla
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    //Creamos el metodo saludar
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ". ¡Mucho gusto!");
    }
    
}
