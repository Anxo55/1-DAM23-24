package Medicina;

public class Pediatra extends Medico{

    enum tipologiaP {NEUROLOGO, PSICOLOGO}

    private tipologiaP tipologiaP;

    public Pediatra(String nombre, tipologiaP tipologiaP) {
        super(nombre);
        this.tipologiaP = tipologiaP;
    }

    public tipologiaP getTipologiaP() {
        return tipologiaP;
    }

    public void setTipologiaP(tipologiaP tipologiaP) {
        this.tipologiaP = tipologiaP;
    }

    @Override
    public String toString() {
        return "Pediatra [nombre=" + nombre + ", tipologiaP=" + tipologiaP + "]";
    }

    // metodos de la clase

    public void soyPediatra() {
        System.out.println("Soy un pediatra y me gusta mi profesion");
    }
    
}
