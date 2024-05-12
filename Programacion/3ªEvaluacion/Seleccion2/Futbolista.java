package Seleccion2;

public class Futbolista extends SeleccionFutbol{
    //Atributos
    private int dorsal;
    private String demarcacion;

    //Constructor herencia
    public Futbolista(){
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    //Getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    //Métodos propios
    public void entrevista(){
        System.out.println("Realiza un viaje");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega un partido");
    }

    @Override
    public void entrenar(){
        System.out.println("Realiza un entrenamiento");
    }

    @Override
    public void viajar() {
        System.out.println("Entrenador --- > viajo en avion");
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+"Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
    }
    
} //Fin de la clase
