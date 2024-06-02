package ExamenFinal.Coche;

import java.util.ArrayList;
import java.util.List;

public class testConcesionario2 {
    public static void main(String[] args) {
        List<VehiculoConMulta> lista = new ArrayList<>();

        SUV suv1 = new SUV(200, 30000, "Verde", 220);
        SUV suv2 = new SUV(190, 28000, "Amarillo", 180);
        VAN van1 = new VAN(150, 32000, "Gris", 2100, 2500);
        VAN van2 = new VAN(160, 34000, "Azul", 2300, 3500);

        lista.add(suv1);
        lista.add(suv2);
        lista.add(van1);
        lista.add(van2);

        for (VehiculoConMulta v : lista) {
            System.out.println(v.Multa(50));
        }

        for (VehiculoConMulta v : lista) {
            System.out.println(v.disminuirMulta(10));
        }

        for (VehiculoConMulta v : lista) {
            System.out.println(v.aumentarMulta(30));
        }

        double precioTotal = 0;
        for (VehiculoConMulta v : lista) {
            double precioVenta = v.getPrecioVenta();
            System.out.println("Precio de venta: " + precioVenta);
            precioTotal += precioVenta;
        }

        System.out.println("Precio total de venta: " + precioTotal);
    }
}