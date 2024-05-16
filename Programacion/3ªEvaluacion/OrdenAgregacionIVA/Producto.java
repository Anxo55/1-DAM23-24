package OrdenAgregacionIVA;

public class Producto {

    public int identificador;
	public String nombre;
	public String descripcion;
	public double precio;
	
	public Producto(int identificador, String nombre, String descripcion, double precio) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "id producto=" + identificador + ", precio=" + precio;
	}
	
	
	
	
}

