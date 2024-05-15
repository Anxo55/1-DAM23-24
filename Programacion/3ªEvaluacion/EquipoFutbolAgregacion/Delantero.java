package EquipoFutbolAgregacion;

public class Delantero extends Jugador{

    private int golesAnotados;

    public Delantero(String nombre, String apellido, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellido, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    @Override
    public String toString() {
        return super.toString() + "Delantero [golesAnotados=" + golesAnotados + "]";
    }

    
    
}
