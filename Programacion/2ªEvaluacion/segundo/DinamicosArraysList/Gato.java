package segundo.DinamicosArraysList;

public class Gato implements Comparable<Gato> {

	private String nombre;
	private String color;
	private String raza;

	public Gato(String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
	}

	// si despues del return pones delante un simbolo (-) te lo ordena de forma descendente
	public int compareTo(Gato g) {
		// Compara el nombre del gato con el nombre del gato que le pasas
		return (this.nombre).compareTo(g.getNombre());
	}

	// @Override
	// public int hashCode() {
	// 	final int prime = 31;
	// 	int result = 1;
	// 	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	// 	result = prime * result + ((color == null) ? 0 : color.hashCode());
	// 	result = prime * result + ((raza == null) ? 0 : raza.hashCode());
	// 	return result;
	// }

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == obj)
	// 		return true;
	// 	if (obj == null)
	// 		return false;
	// 	if (getClass() != obj.getClass())
	// 		return false;
	// 	Gato other = (Gato) obj;
	// 	if (nombre == null) {
	// 		if (other.nombre != null)
	// 			return false;
	// 	} else if (!nombre.equals(other.nombre))
	// 		return false;
	// 	if (color == null) {
	// 		if (other.color != null)
	// 			return false;
	// 	} else if (!color.equals(other.color))
	// 		return false;
	// 	if (raza == null) {
	// 		if (other.raza != null)
	// 			return false;
	// 	} else if (!raza.equals(other.raza))
	// 		return false;
	// 	return true;
	// }

	 public boolean equals(Gato g) {
	 	return (this.nombre).equals(g.getNombre());
	}

	

}
