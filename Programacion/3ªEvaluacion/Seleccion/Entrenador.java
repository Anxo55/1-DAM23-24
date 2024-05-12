package Seleccion;

public class Entrenador extends SeleccionFutbol{

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador [id=" + id + ", idFederacion=" + idFederacion + ", nombre=" + nombre + ", apellidos="
                + apellidos + ", edad=" + edad + "]";
    }

    public void dirigirPartido() {
        System.out.println("Dirigir el partido ");
    }

    @Override
    public void Viajar() {
        // TODO Auto-generated method stub
        super.Viajar();
        System.out.println("Viaja pidiendo un whiskito");
    }
    
}
