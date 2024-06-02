public class Hotel {


    
int capacidad;
	int numPersonas;

	// Constructor
	Hotel(int capacidad) {
		this.capacidad = capacidad;
		this.numPersonas = 0;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	@Override
	public String toString() {
		return "Hotel [capacidad=" + capacidad + ", numPersonas=" + numPersonas + "]";
	}

	// metodo meter
	public void meter() {
		if (numPersonas < capacidad) {
			numPersonas++;
			System.out.println(this.toString());
		} else {
			System.out.println("No hay mas espacio en este hotel");
		}
	}

	// metodo sacar
	public void sacar() {
		if (numPersonas > 0) {
			numPersonas--;
			System.out.println(this.toString());
		} else {
			System.out.println("No hay personas en este hotel");
		}
	}

}