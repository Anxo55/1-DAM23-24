package Ejercicio2B;

import java.util.ArrayList;
// import java.util.List;

public class OrdenCompra {

    private int identificador;
	ArrayList<LineaPedido> itemsPedido;
	
	public OrdenCompra(int identificador) {
		super();
		this.identificador = identificador;
		itemsPedido = new ArrayList<LineaPedido>();
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public double calcularTotalOrden() {
		double totalOrden =0;
		for(int i = 0; i<itemsPedido.size(); i++) {
			LineaPedido linea = (LineaPedido) itemsPedido.get(i);
			totalOrden = totalOrden + linea.calcularSubtotalLineaPedido();
		}
		return totalOrden;
	}

	@Override
	public String toString() {
		return "Orden [identificador=" + identificador + "]\n "
				+ "itemsPedido: \n" + itemsPedido + 
				"\nTotal orden = " + calcularTotalOrden();
	}
	
	public void añadirItem(int id, int cant, Producto producto) {
		LineaPedido linea = new LineaPedido(id,cant, producto);
		itemsPedido.add(linea);
	}
	
	public void ticket() {
		System.out.println("Orden: " + identificador);
		System.out.println("Producto \t Cantidad \t Precio \t Precio total\n");
		for(LineaPedido l : itemsPedido) {
			System.out.println(l.getProducto().nombre + " \t " + l.getCantidad() +" \t\t " + l.getProducto().precio +" \t " +(l.getProducto().precio*l.getCantidad()));
		}
		System.out.println("_____________________________________________________________________________");
		System.out.println("\t\t\t Precio total: \t\t" + calcularTotalOrden());
		System.out.println("\t\t\t Precio con iva: \t" + calcularTotalOrden()*1.21);
	}
	
}