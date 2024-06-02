package ExamenFinal.Coche;

import java.util.ArrayList;
import java.util.List;

public class testConcesionario {
    public static void main(String[] args) {
        List<Car> lista = new ArrayList<>();

        Sedan sedan = new Sedan(180, 20000, "Rojo", 4800);
        Ford ford1 = new Ford(200, 25000, "Azul", 2020, 3000);
        Ford ford2 = new Ford(220, 27000, "Negro", 2021, 3500);
        Car car = new Car(160, 18000, "Blanco");

        lista.add(sedan);
        lista.add(ford1);
        lista.add(ford2);
        lista.add(car);

        double precioTotal = 0;
        for (Car c : lista) {
            double precioVenta = c.getPrecioVenta();
            System.out.println("Precio de venta: " + precioVenta);
            precioTotal += precioVenta;
        }

        System.out.println("Precio total de venta: " + precioTotal);
    }
}