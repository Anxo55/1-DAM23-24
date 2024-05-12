package RepasoPooAnxo;

import java.util.Scanner;

public class TipoTarjeta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el precio inicial: ");
        double precioInicial = sc.nextDouble();

        System.out.println("Es tarjeta oro: true/false");
        boolean tarjetaOro = sc.nextBoolean();

        System.out.println("Es tarjeta plata: true/false");
        boolean tarjetaPlata = sc.nextBoolean();

        System.out.println("Es tarjeta bronce: true/false");
        boolean tarjetaBronce = sc.nextBoolean();
 
        System.out.println("Es tipo Star: true/false");
        boolean tarjetaStar = sc.nextBoolean();

        double precioFinal = tipoTarjeta(precioInicial, tarjetaOro, tarjetaPlata, tarjetaBronce, tarjetaStar);

        System.out.println("El precio final es: "+precioFinal);


    }

    public static double tipoTarjeta(double precioInicial, boolean tarjetaOro, boolean tarjetaPlata, boolean tarjetaBronce, boolean tarjetaStar) {

        if (tarjetaOro) {
            precioInicial *= 0.80;
        }

        if (tarjetaPlata) {
            precioInicial *= 0.90;
        }

        if (tarjetaBronce) {
            precioInicial*= 0.95;
        }

        if (tarjetaStar) {
            precioInicial*= 0.95;
        }

        return precioInicial;

    }
    
}
