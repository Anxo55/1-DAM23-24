package OrdenAgregacion;

public class testOrdenAgregacion {
    
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica", 1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro", 3000);
        Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente", 800);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60 x 40 cm", 600);

        LineaPedido linea1 = new LineaPedido(1, 5, producto1);
        LineaPedido linea2 = new LineaPedido(2, 3, producto2);
        LineaPedido linea3 = new LineaPedido(3, 2, producto3);
        LineaPedido linea4 = new LineaPedido(4, 4, producto4);

        OrdenCompra ordenCompra = new OrdenCompra(123);
        ordenCompra.añadirItem(linea1);
        ordenCompra.añadirItem(linea2);
        ordenCompra.añadirItem(linea3);
        ordenCompra.añadirItem(linea4);

        System.out.println(ordenCompra.toString());
    }
}
