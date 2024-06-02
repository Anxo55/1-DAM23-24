package ModeloB.Ejercicio5B;

import java.util.Random;

public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private double tiempoAcumulado = 0;
    private int posicionGeneral;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getPosicionGeneral() {
        return posicionGeneral;
    }

    protected void setPosicionGeneral(int posicionGeneral) {
        this.posicionGeneral = posicionGeneral;
    }

    protected double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
        System.out.println("Posicion = " + posicionGeneral);
    }

    protected abstract void calculaTiempoParcial();

    protected abstract void acumulaTiempoTotal();

    protected void calcularTiempoParcial() {
        Random rand = new Random();
        double tiempoParcial = 5 + (15 * rand.nextDouble());
        setTiempoAcumulado(getTiempoAcumulado() + tiempoParcial);
    }
}