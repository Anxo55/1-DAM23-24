package CarreraCiclista;

public class Velocista extends Ciclista{
	
	private double potenciaPromedio;
	private double velocidadPromedio;

	
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



	public Velocista(int identificador, String nombre, double potencia, double velocidad) {
		super(identificador, nombre);
		// TODO Auto-generated constructor stub
		this.potenciaPromedio = potencia;
		this.velocidadPromedio = velocidad;
	}

	

	@Override
	String imprimirTipo() {
		// TODO Auto-generated method stub
		return "Es un velocista";
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Potenca Promedio = "+ potenciaPromedio);
		System.out.println("Velocidad Promedio = "+ velocidadPromedio);
	}
}