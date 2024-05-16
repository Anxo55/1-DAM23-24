package OrdenAgregacionIVA;

public class testOrden {
    
    public static void main(String[] args) {

		Producto producto1 = new Producto(1,"Tu abuela", "Usa pañales", 1000);
		Producto producto2 = new Producto(2,"Tu abuelo", "Se le rompió el bastón", 3000);
		Producto producto3 = new Producto(3,"Cinta pegante", "Se pesga, es una cinta",800.0);
		Producto producto4 = new Producto(4,"Cartulina","Prima lejana de Carolina",600.0 );
		
		Orden orden = new Orden(1);
		orden.añadirItem(1, 5, producto1);
		orden.añadirItem(2, 3, producto2);
		orden.añadirItem(3, 2, producto3);
		orden.añadirItem(4, 4, producto4);
		
		orden.ticket();
	}
}
