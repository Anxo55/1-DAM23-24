package Medicina;

public class Medico implements Entretenerse{

    protected String nombre;

    public Medico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Medico [nombre=" + nombre + "]";
    }

    // metodos de la clase
    public void tomarLaTension() {
        System.out.println("Te estoy tomando la tension. ");
    }

    @Override
    public void verVideos() {
        System.out.println("Veo videos para entretenerme");
    }

    @Override
    public void escucharPodscast() {
        System.out.println("Mientras aprovecho y escucho un podcast");
    }
    
}
