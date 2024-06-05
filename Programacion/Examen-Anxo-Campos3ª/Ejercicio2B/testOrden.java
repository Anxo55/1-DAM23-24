package Ejercicio2B;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class testOrden {

    public static void main(String[] args) {
        ArrayList<Producto> productos = generarProductosRandom(5);

        OrdenCompra orden = new OrdenCompra(1);
        for (Producto producto : productos) {
            int cantidad = new Random().nextInt(10) + 1;
            orden.añadirItem(producto.getIdentificador(), cantidad, producto);
        }

        double totalOrden = orden.calcularTotalOrden();
        double totalConIva = totalOrden * 1.15;

        orden.ticket();
        guardarTicketATexto("Anxo.txt", orden, totalConIva);
    }

    private static ArrayList<Producto> generarProductosRandom(int cantidad) {
        ArrayList<Producto> productos = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= cantidad; i++) {
            double precio = random.nextDouble() * 100 + 1;
            Producto producto = new Producto(i, "Producto " + i, "Descripción " + i, precio);
            productos.add(producto);
        }

        return productos;
    }

    private static void guardarTicketATexto(String nombreArchivo, OrdenCompra orden, double totalConIva) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Orden: " + orden.getIdentificador() + "\n");
            writer.write("Producto \t Cantidad \t Precio \t Precio total\n");

            for (LineaPedido l : orden.itemsPedido) {
                writer.write(l.getProducto().getNombre() + " \t " + l.getCantidad() + " \t\t " + l.getProducto().getPrecio() + " \t " + (l.getProducto().getPrecio() * l.getCantidad()) + "\n");
            }

            writer.write("_____________________________________________________________________________");
            writer.write("\n\t\t\t Precio total: \t\t" + orden.calcularTotalOrden());
            writer.write("\n\t\t\t Precio con iva: \t" + totalConIva);

        } catch (IOException e) {
            System.err.println("Error al guardar el ticket en el archivo: " + e.getMessage());
        }
    }
}
