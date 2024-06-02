package ModeloA.Ejercicio4B;

public class Inmuebles {
	//Cada inmueble tiene los siguientes atributos: 
	//	identificador inmobiliario (tipo entero);
	//área en metros cuadrados (tipo entero) 
	//dirección (tipo String).
	
	
	// -----ATRIBUTOS-----
	protected int id;
	protected int area;
	protected String direccion;
	//NO LO VEO
	protected double precioVenta=0d;
	
	//-----CONTRUCTOR----
	
	public Inmuebles(int id, int area, String direccion) {
		this.id = id;
		this.area = area;
		this.direccion = direccion;
	}
	
	
	//------GETER AND SETTER----
	public int getId() {
		return id;
	}
	public int getArea() {
		return area;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

// ---- TOSTRING----
	@Override
	public String toString() {
		return "Inmuebles [id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
//-------METODO-------
	//COMO LO USO?
	public double calcularPrecioVenta() {
		//precioVenta = area * valorArea;
		return 0d;

	
	}
}
