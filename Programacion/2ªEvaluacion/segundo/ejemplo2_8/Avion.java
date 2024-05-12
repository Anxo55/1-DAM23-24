package segundo.ejemplo2_8;

public class Avion {

    private String nombreFabricante;
    private int numeroMotores;

    Avion(String nombreFabricante, int numeroMotores) {
        this.nombreFabricante = nombreFabricante;
        this.numeroMotores = numeroMotores;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public String toString() {
        return "Avion [nombreFabricante=" + nombreFabricante + ", numeroMotores=" + numeroMotores + "]";
    }

    public void imprimirFabricante() {
        System.out.println(this.getNombreFabricante());
    }

    static void cambiarFabricante(Avion a) {
        a.setNombreFabricante("Loockhead");
    }
    
    
}
