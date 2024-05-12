package repasosExamen;

import java.util.Scanner;

// Los clientes de un gran almacén tendrán ventajas  según estos criterios:  


// Si pagan con tarjeta ORO tendrán un 20% de descuento.
// Si pagan con tarjeta PLATA tendrán un 10% de descuento.
// Si pagan con tarjeta BRONCE tendrán un 5% de descuento.  


// Si dichas tarjetas son además de clase STAR, tendrán un 5% de  descuento.  


// Los descuentos son acumulables.  


// Preguntar al usuario un precio normal y el tipo de tarjeta y  la clase presentar por pantalla el descuento y el precio final.


public class ClientesAlmacen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidadInicial;

        System.out.println("Dame la cantidad inicial: ");
        cantidadInicial = sc.nextDouble();

        System.out.println("Es tarjeta oro? true/false?");
        boolean tarjetaOro = sc.nextBoolean();

        System.out.println("Es tarjeta Plata true/false?");
        boolean tarjetaPlata = sc.nextBoolean();

        System.out.println("Es tarjeta Bronce? true/false?");
        boolean tarjetaBronce = sc.nextBoolean();

        System.out.println("Es de tipo Star? true/false?");
        boolean tarjetaStar = sc.nextBoolean();

        double cantidadFinal = tipoTarjeta(cantidadInicial, tarjetaOro, tarjetaPlata, tarjetaBronce, tarjetaStar);
        
        System.out.println("La cantidad final con descuentos es: "+cantidadFinal+" $");
    }

    public static double tipoTarjeta(double cantidadInicial, boolean tarjetaOro, boolean tarjetaPlata, boolean tarjetaBronce, boolean tarjetaStar) {

        if (tarjetaOro) {
            cantidadInicial *= 0.80;
        }

        if (tarjetaPlata) {
            cantidadInicial *= 0.90;
        }

        if (tarjetaBronce) {
            cantidadInicial *= 0.95;
        }

        if (tarjetaStar) {
            cantidadInicial *= 0.95;
        }

        return cantidadInicial;
    }
    
}
