package Medicina;

public class Fontanero implements Entretenerse{

    private String nombre;
    private int licencia;
    
    public Fontanero(String nombre, int licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Fontanero [nombre=" + nombre + ", licencia=" + licencia + "]";
    }

    @Override
    public void verVideos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verVideos'");
    }

    @Override
    public void escucharPodscast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'escucharPodscast'");
    }

    
    
}
