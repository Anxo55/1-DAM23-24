package ModeloB.Ejercicio5B;

import java.util.Random;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima; // en km/h

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }

    @Override
    public void calcularTiempoParcial() {
        Random rand = new Random();
        double tiempoParcial = 5 + (15 * rand.nextDouble()) + (5 * getVelocidadMaxima());
        setTiempoAcumulado(getTiempoAcumulado() + tiempoParcial);
    }

    @Override
    public void acumulaTiempoTotal() {
        // Se puede implementar si es necesario
    }

	@Override
	protected void calculaTiempoParcial() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'calculaTiempoParcial'");
	}
}