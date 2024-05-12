package Peaje;

public class Vehiculo {
    
    private String matricula;

    //Constructor completo
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    //Get y set
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //@toString
    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + "]";
    }

}
