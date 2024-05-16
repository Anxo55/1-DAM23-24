package OrdenAgregacionIVA;

public class LineaPedido {
    
    private int indetificador;
	private int cantidad;
	private Producto producto;
	
	public LineaPedido(int identificador, int cantidad, Producto producto) {
		this.indetificador = identificador;
		this.cantidad= cantidad;
		this.producto=producto;
	}

	public int getIndetificador() {
		return indetificador;
	}

	public void setIndetificador(int indetificador) {
		this.indetificador = indetificador;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public double calcularSubtotalLineaPedido() {
		return cantidad * producto.getPrecio();
	}

	@Override
	public String toString() {
		return "LineaPedido [id=" + indetificador + ", cantidad=" + cantidad + ", " + producto
				+ "]\n";
	}
	
}
