package segundo.ejemplo2_10;

public class Pedido {
    
// atributo
	String primero;
	String segundo;
	String bebida;
	String postre;

	// constructor
	public Pedido() {
		// TODO Auto-generated constructor stub
		primero = "";
		segundo = "";
		bebida = "";
		postre = "";
	}

	public Pedido(String primero, String segundo, String bebida, String postre) {
		super();
		this.primero = primero;
		this.segundo = segundo;
		this.bebida = bebida;
		this.postre = postre;
	}

	public void calcularPedido(String primero, double costoPrimero, String bebida, double costoBebida) {
		double total = costoPrimero + costoBebida;
		System.out.println("El costo de " + primero + " y " + bebida + " es = $" + total);
	}

	public void calcularPedido(String primerPlato, double costoPrimerPlato, 
			String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida) {
			double total = costoPrimerPlato + costoSegundoPlato +
			costoBebida;
			System.out.println("El costo de " + primerPlato + " + " +
			segundoPlato + " + " + bebida + " es = $" + total);
			}

	// public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato,
	// 		double costoSegundoPlato, String bebida, double costoBebida) {
	// 	double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
	// 	System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " + " + bebida + " es = $" + total);
	// }

	public void calcularPedido(String primerPlato, double
			costoPrimerPlato, String segundoPlato, double
			costoSegundoPlato, String postre, double costoPostre, String
			bebida, double costoBebida) {
			double total = costoPrimerPlato + costoSegundoPlato +
			costoBebida + costoPostre;
			System.out.println("El costo de " + primerPlato + " + " +
			segundoPlato + " + " + bebida + " + " +
			postre + " es = $" + total);
			}

}