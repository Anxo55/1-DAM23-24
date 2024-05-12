package segundo.ejemplo3_6;

public class Computador {

    String marca;
	int memoria;

	String procesador;
	String sistema; 
	double precio; 

	
	public Computador(String marca, int memoria, String procesador, String sistema, double precio) {
		this.marca = marca;
		this.memoria = memoria;
		this.procesador = procesador;
		this.sistema = sistema;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", memoria=" + memoria + "]";
	}
	
	
}