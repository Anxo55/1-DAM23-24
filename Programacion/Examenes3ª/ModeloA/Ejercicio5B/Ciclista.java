package ModeloA.Ejercicio5B;

import java.util.Random;

public abstract class Ciclista {
    
    private int identificador; /* Atributo que define el identificador de un ciclista */
	private String nombre; // Atributo que define el nombre del ciclista
	private double tiempoAcumulado = 0; /* Atributo que define el tiempo acumulado de un ciclista */
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

	/**
	 * Método que devuelve el puesto que ocupa un ciclista en la posición general de
	 * la competencia
	 * 
	 * @return El puesto del ciclista en la posición general
	 */
	protected int getPosicionGeneral() {
		return posicionGeneral;
	}

	/**
	 * Método que establece el puesto que ocupa un ciclista en la posición general
	 * 
	 * @param posicionGeneral que especifica el puesto que ocupa un ciclista en la
	 *                  posición general
	 */
	protected void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}

	/**
	 * Método que devuelve el tiempo acumulado de un ciclista en una competencia
	 * 
	 * @return El tiempo acumulado de un ciclista en una competencia
	 */
	protected double getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	/**
	 * Método que establece el tiempo acumulado por un ciclista
	 * 
	 * @param tiempoAcumulado que especifica el tiempo acumulado por un ciclista
	 */
	protected void setTiempoAcumulado(double tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	/**
	 * Método muestra en pantalla los datos de un ciclista
	 */
	protected void imprimir() {
		System.out.println("Identificador = " + identificador);
		System.out.println("Nombre = " + nombre);
		System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
		System.out.println("Posicion = "+ posicionGeneral);
	}


    protected abstract void calculaTiempoParcial();


    protected abstract void acumulaTiempoTotal();

    protected void calcularTiempoParcial() {
        Random rand = new Random();
        double tiempoParcial = 5 + (15 * rand.nextDouble());
        setTiempoAcumulado(getTiempoAcumulado() + tiempoParcial);
    }
}