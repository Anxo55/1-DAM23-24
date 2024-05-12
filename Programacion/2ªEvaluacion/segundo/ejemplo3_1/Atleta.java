package segundo.ejemplo3_1;

public class Atleta {

    private int id;
    private String nombre;
    private double tiempo;

    private static int contador;
    private static String seleccion="Colombia";
    private static double tiempoEquipo = 0d;

    Atleta(String nombre) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.tiempo = 9+Math.random()*3;
    }

    

    public double getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // metodos
    public static void imprimeDatos() {
        System.out.println(seleccion +" --- "+tiempoEquipo);
    }

    public static void calculaTiempo(Atleta[] equipo) {
        for(int i=0; i<equipo.length; i++) {
            tiempoEquipo+=equipo[i].getTiempo();
            // System.out.println(tiempoEquipo);
        }
    }

    @Override
    public String toString() {
        return "Atleta [id=" + id + ", nombre=" + nombre + ", tiempo=" + tiempo + "]";
    }

}
