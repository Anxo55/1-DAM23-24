package ChatGPT.POO;

//Atributos nombre y edad. La clase debe tener un metodo saludar que imprima un saludo que incluya el nombre de la persona y su edad.

public class Persona {

    private String nombre;
    private int edad;

    //Constructor por defecto
    public Persona() {
        this.nombre = "Pepe";
        this.edad = 35;
    }

    //constructor con todos los parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    // La clase debe tener un metodo saludar que imprima un saludo que incluya el nombre de la persona y su edad.
    public void saludar() {
        System.out.println("Hola soy "+nombre+ " y tengo "+edad+" años");
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
