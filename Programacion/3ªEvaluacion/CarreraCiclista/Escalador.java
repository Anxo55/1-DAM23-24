package CarreraCiclista;

public class Escalador extends Ciclista{

	private double aceleracionPromedio;
	private double gradoRampa;

	public Escalador(int identificador, String nombre, double aceleracion , double grado) {
		super(identificador, nombre);
		// TODO Auto-generated constructor stub´
		this.aceleracionPromedio = aceleracion;
		this.gradoRampa = grado;
	}
	
	@Override
	String imprimirTipo() {
		// TODO Auto-generated method stub
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
}
