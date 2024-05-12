package practicas2;

import java.util.Scanner;

public class supermercadotarjeta {

    public static double tipoTarjeta(double precio, boolean oro, boolean club, boolean joven) {

        if (oro) {
            precio *= 0.85;
        }

        if (club) {
            precio *= 0.95;
        }

        if (joven) {
            precio *= 0.95;
        }

        return precio;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el precio inicial: ");
        double precio = sc.nextDouble();

        System.out.println("Tienes tarjeta oro? true/false");
        boolean oro = sc.nextBoolean();

        System.out.println("Tienes tarjte club? true/false");
        boolean club = sc.nextBoolean();

        System.out.println("Tienes tarjeta joven? true/false");
        boolean joven = sc.nextBoolean();

        double precioFinal = tipoTarjeta(precio, oro, club, joven);

        System.out.println("El precio final con descuentos sería: "+precioFinal);

        
    }
    
}
