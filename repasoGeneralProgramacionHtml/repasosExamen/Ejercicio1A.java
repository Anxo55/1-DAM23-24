package repasosExamen;

import java.util.Scanner;

// Los clientes de un gran almacén tendrán ventajas según estos
// criterios:

// Si pagan con tarjeta ORO tendrán un 20% de descuento.
// Si pagan con tarjeta PLATA tendrán un 10% de descuento.
// Si pagan con tarjeta BRONCE tendrán un 5% de descuento.

// Si dichas tarjetas son además de clase STAR, tendrán un 5% de
// descuento.

// Los descuentos son acumulables.
// Preguntar al usuario un precio normal y el tipo de tarjeta y la
// clase presentar por pantalla el descuento y el precio final.


public class Ejercicio1A {

    public static double tipoTarjeta(double precioInicial, boolean tarjetaOro, boolean tarjetaPlata, boolean tarjetaBronce, boolean tarjetaStar) {

        if (tarjetaOro) {
            precioInicial *= 0.80; 
        }

        if (tarjetaPlata) {
            precioInicial *= 0.90;
        }

        if (tarjetaBronce) {
            precioInicial *= 0.95;
        }

        if (tarjetaStar) {
            precioInicial *= 0.95;
        }

        return precioInicial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el precio inicial: ");
        double precioInicial = sc.nextDouble();

        System.out.println("Tarjeta Oro true/false");
        boolean tarjetaOro = sc.nextBoolean();

        System.out.println("Tarjeta Plata true/false");
        boolean tarjetaPlata = sc.nextBoolean();

        System.out.println("Tarjeta Bronce true/false");
        boolean tarjetaBronce = sc.nextBoolean();

        System.out.println("Tarjeta Star true/false");
        boolean tarjetaStar = sc.nextBoolean();

        double precioFinal = tipoTarjeta(precioInicial, tarjetaOro, tarjetaPlata, tarjetaBronce, tarjetaStar);

        System.out.println("El precio definitivo con descuentos sería: "+precioFinal+" euros");
        
        
    }
    
}
