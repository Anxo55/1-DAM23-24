package EquipoFutbolAgregacion;

public class Tecnico extends Persona{

    
    private int aniosExperiencia;
    private boolean esNacional; 

    public Tecnico(String nombre, String apellido, int edad, int aniosExperiencia, boolean esNacional) {
        super(nombre, apellido, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.esNacional = esNacional;        
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public boolean isEsNacional() {
        return esNacional;
    }

    public void setEsNacional(boolean esNacional) {
        this.esNacional = esNacional;
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnico [aniosExperiencia=" + aniosExperiencia + ", esNacional=" + esNacional + "]";
    }  
}
