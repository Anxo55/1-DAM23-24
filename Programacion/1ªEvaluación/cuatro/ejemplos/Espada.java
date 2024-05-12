package cuatro.ejemplos;

public class Espada extends Pez{
    
private int largoApendice;
private int numero_aletas;

	public Espada() {
		super();
	}

	public Espada(String nombre, int longitud, float peso) {
		super(nombre,longitud,peso);
	}

	public Espada(String nombre, int longitud, float peso, int l, int n) {
		super(nombre,longitud,peso);
		this.largoApendice=l;
		this.numero_aletas=n;
	}

	public int getLargoApendice() {
		return largoApendice;
	}

	public void setLargoApendice(int largoApendice) {
		this.largoApendice = largoApendice;
	}

	public int getNumero_aletas() {
		return numero_aletas;
	}

	public void setNumero_aletas(int numero_aletas) {
		this.numero_aletas = numero_aletas;
	}

	public void nada() {
		super.nada();
		System.out.println(" ojo qu te pincho");
	}

	@Override
	public String toString() {
		// String prin = super.toString();
		return "Espada [nombre=" + nombre + ", longitud=" + longitud + ", peso=" + peso + super.toString() +"]";
	}

}
