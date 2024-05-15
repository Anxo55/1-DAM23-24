package EquipoFutbolAgregacion;

public class Jugador extends Persona{

    private boolean esTitular;

    public Jugador(String nombre, String apellido, int edad, boolean esTitular) {
        super(nombre, apellido, edad);
        this.esTitular = esTitular;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return super.toString() + "Jugador [esTitular=" + esTitular + "]";
    }

    
    
}
