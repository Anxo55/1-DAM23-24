package ModeloA.Ejercicio5B;

import java.util.Random;

public class Escalador extends Ciclista {

	private double aceleracionPromedio;
	private double gradoRampa;

	public Escalador(int identificador, String nombre, double aceleracion , double grado) {
		super(identificador, nombre);
		this.aceleracionPromedio = aceleracion;
		this.gradoRampa = grado;
	}
	
	@Override
	String imprimirTipo() {
		return "Es un escalador";
	}
	
	protected void imprimir() {
		super.imprimir();
		System.out.println("Aceleracion promedio = "+ aceleracionPromedio);
		System.out.println("Grado Rampa = "+ gradoRampa);
	}
	
	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}

	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	@Override
	protected void calculaTiempoParcial() {
        Random rand = new Random();
        double tiempoParcial = 5 + (15 * rand.nextDouble()) + (3 * getAceleracionPromedio());
        setTiempoAcumulado(getTiempoAcumulado() + tiempoParcial);
	}

	@Override
	protected void acumulaTiempoTotal() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'acumulaTiempoTotal'");
	}
}