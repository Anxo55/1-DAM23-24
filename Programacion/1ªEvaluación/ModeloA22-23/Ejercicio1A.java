//package ModeloA22-23;

import java.util.Scanner;

public class Ejercicio1A {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio normal del producto: ");
        double precioNormal = scanner.nextDouble();


        System.out.print("Ingrese el tipo de tarjeta (ORO, PLATA, BRONCE): ");
        String tipoTarjeta = scanner.next().toUpperCase();


        System.out.print("¿La tarjeta es de clase STAR? (Sí/No): ");
        String claseStarInput = scanner.next().toUpperCase();
        boolean esClaseStar = claseStarInput.equals("SÍ") || claseStarInput.equals("SI");

        // Calcular descuentos acumulativos
        double descuento = 0;

        switch (tipoTarjeta) {
            case "ORO":
                descuento += 0.20; // 20% de descuento por tarjeta ORO
                break;
            case "PLATA":
                descuento += 0.10; // 10% de descuento por tarjeta PLATA
                break;
            case "BRONCE":
                descuento += 0.05; // 5% de descuento por tarjeta BRONCE
                break;
            default:
                System.out.println("Tipo de tarjeta no reconocido.");
                return;
        }

        if (esClaseStar) {
            descuento += 0.05; // 5% de descuento adicional por clase STAR
        }

        // Calcular el precio final con descuento
        double precioFinal = precioNormal * (1 - descuento);

        // Mostrar resultados
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final con descuento: " + precioFinal);

        scanner.close();
    }
}
