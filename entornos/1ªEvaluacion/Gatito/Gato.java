package Gatito;

public class Gato {

    private String nombre;
    private int edad;

    public Gato() {
        super();
        this.nombre = "Antonio";
        this.edad=0;
    }

    public Gato(String nombre, int edad) {
        this. nombre =  nombre;
        this.edad = edad;
    }

    //unicamente los getters, para que no se pueda editar el contenido con los setters.
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void darDefinicionGato() {
    System.out.println("Mamífero de la familia de los félidos, digitígrado, doméstico, de unos 50 cm de largo desde la cabeza hasta el arranque de la cola, que por sí sola mide unos 20 cm, de cabeza redonda, lengua muy áspera, patas cortas y generalmente pelaje suave y espeso");
    }

    

    
    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
