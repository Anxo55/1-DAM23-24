package EquipoFutbolAgregacion;

public class Mediocampo extends Jugador{

    private int numeroAsistencias;

    public Mediocampo(String nombre, String apellido, int edad, boolean esTitular, int numeroAsistencias) {
        super(nombre, apellido, edad, esTitular);
        this.numeroAsistencias = numeroAsistencias;
    }

    public int getNumeroAsistencias() {
        return numeroAsistencias;
    }

    public void setNumeroAsistencias(int numeroAsistencias) {
        this.numeroAsistencias = numeroAsistencias;
    }

    @Override
    public String toString() {
        return super.toString() + "Mediocampo [numeroAsistencias=" + numeroAsistencias + "]";
    }
   
}
