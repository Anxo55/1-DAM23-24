package Medicina;

public class Alumno implements Entretenerse{

    private String nombre;
    private String centroEstudios;
    
    public Alumno(String nombre, String centroEstudios) {
        this.nombre = nombre;
        this.centroEstudios = centroEstudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCentroEstudios() {
        return centroEstudios;
    }

    public void setCentroEstudios(String centroEstudios) {
        this.centroEstudios = centroEstudios;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", centroEstudios=" + centroEstudios + "]";
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
