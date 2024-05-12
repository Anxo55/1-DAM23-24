package segundo.ejemplo2_1;

public class Planeta {

    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol;
    private TipoPlaneta tipo;
    private boolean observableASimpleVista;
    private int periodoOrbital;
    private int periodoRotacion;
    
    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableASimpleVista, int periodoOrbital, int periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    
    public void imprimirDatosPlaneta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km^3");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia Media al Sol: " + distanciaMediaAlSol + " millones de km");
        System.out.println("Tipo de Planeta: " + tipo);
        System.out.println("Observable a Simple Vista: " + observableASimpleVista);
        System.out.println("El periodo de rotacion es: "+periodoRotacion);
        System.out.println("El periodo orbital es: "+periodoOrbital);
    }

   
    public double calcularDensidad() {
        return masa / volumen;
    }

    
    public boolean esExteriorSistemaSolar() {
        return distanciaMediaAlSol > 3.4 || distanciaMediaAlSol < 2.1;
    }

    enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
}

