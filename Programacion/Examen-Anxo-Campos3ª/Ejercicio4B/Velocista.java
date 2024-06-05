package Ejercicio4B;

import java.util.Random;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedio; 

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " + velocidadPromedio);
    }

    @Override
    protected void calculaTiempoParcial() {
        Random rand = new Random();
        double tiempoParcial = 5 + (15 * rand.nextDouble()) + (4 * getVelocidadPromedio() - 3 * getPotenciaPromedio());
        setTiempoAcumulado(getTiempoAcumulado() + tiempoParcial);
    }

    @Override
    protected void acumulaTiempoTotal() {
       
    }
}