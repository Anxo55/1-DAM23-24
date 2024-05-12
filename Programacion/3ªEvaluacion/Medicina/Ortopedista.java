package Medicina;

public class Ortopedista extends Medico{

    enum tipologiaG{MAXILOFACIAL, PEDIATRICA}

    private tipologiaG tipologiaP2;

    public Ortopedista(String nombre, tipologiaG tipologiaP2) {
        super(nombre);
        this.tipologiaP2 = tipologiaP2;
    }

    public tipologiaG getTipologiaP2() {
        return tipologiaP2;
    }

    public void setTipologiaP2(tipologiaG tipologiaP2) {
        this.tipologiaP2 = tipologiaP2;
    }

    @Override
    public String toString() {
        return "Ortopedista [nombre=" + nombre + ", tipologiaP2=" + tipologiaP2 + "]";
    }

    // metodos de la clase

    public void soyOrtopedista() {
        System.out.println("Soy ortopedista y me gusta mi profesion");
    }
    
}
