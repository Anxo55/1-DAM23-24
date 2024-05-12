package segundo.ejemplo2_4;

public class Cuadrado extends Figura{

    int lado; // Atributo que define el lado de un cuadrado
	
	public Cuadrado(String nombre, int lado) {
		super(nombre);
	this.lado = lado;
	}
	
	double calcularArea() {
	return lado*lado;
	}

	double calcularPerímetro() {
	return (4*lado);
	}

	@Override
	public String toString() {
		return super.toString()+"Cuadrado [lado=" + lado + "]";
	}

}
