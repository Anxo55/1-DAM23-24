package cuatro.ejemplos;

public class Pez {

protected String nombre;

	int longitud;
	float peso;

	public Pez() {

	}

	public Pez(String nombre, int longitud, float peso) {
		this.nombre = nombre;
		this.longitud = longitud;
		this.peso = peso;
	}

	public String getNombre() {
	    return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLongitud() {
		return longitud;
	}

    public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	public void nada() {
		System.out.println("Soy "+this.nombre+", estoy nadando glu");
	}

	public boolean soyComestible() {
		if(this.longitud>1000) {
			return false;
		} else {
			return true;
		}

	}	

	@Override
	public String toString() {
		return "Pez [nombre=" + nombre + ", longitud=" + longitud + ", peso=" + peso + "]";
	}

}