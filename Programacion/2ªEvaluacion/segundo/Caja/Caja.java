package segundo.Caja;

public class Caja {

    private double longitud;
    private double anchura;
    private double altura;
    private String tipoCaja;

    Caja(double longitud, double anchura, double altura, String tipoCaja) {
        this.longitud = longitud;
        this.anchura = anchura;
        this.altura = altura;
        this.tipoCaja = tipoCaja;
    }

    Caja(){
        this.longitud = 0;
        this.anchura = 0;
        this.altura = 0;
        this.tipoCaja = null;
    }

    Caja(double longitud) {
        this.longitud = longitud;
        this.anchura = longitud;
        this.altura = longitud;
        this.tipoCaja = null;
    }
    
    // Caja(double longitud, double anchura, double altura, String tipoCaja) {
    //       this(longitud, anchura, altura, tipoCaja);
    // }

    @Override
    public String toString() {
        return "Caja [longitud=" + longitud + ", anchura=" + anchura + ", altura=" + altura + ", tipoCaja=" + tipoCaja
                + "]";
    }

    
   
}