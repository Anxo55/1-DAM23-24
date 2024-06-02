package ModeloA.Ejercicio5B;

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

	/**
	 * Método muestra en pantalla la clase a la que pertenece el objeto.
	 * 
	 * @return El tipo de la clase.
	 */
	@Override
	public String imprimirTipo() {
		String tipo = "Es un " + this.getClass().getSimpleName();
		return tipo;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Velocidad máxima = " + velocidadMaxima);
	}

	@Override
	protected void calculaTiempoParcial() {
        Random rand = new Random();
        double tiempoParcial = 5 + (15 * rand.nextDouble()) + (5 * getVelocidadMaxima());
        setTiempoAcumulado(getTiempoAcumulado() + tiempoParcial);
	}

	@Override
	protected void acumulaTiempoTotal() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'acumulaTiempoTotal'");
	}
}