package POO3;

import java.util.Scanner;

// Se quiere determinar el importe a facturar a los clientes de unos grande almacenes segun estos criterios;
// Si pagan con tarjeta oro tendran un 15% descuento
// Si pagan con tarjeta club tendran un 5% descuento
// Si la tarjeta (oro o club) es modalidad joven, tedran un 5% de descuento.
// Los descuentos son acumulables.


public class ejercicioCondicionales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el tipo de tarjeta: oro, club, joven");
        String tipoTarjeta = sc.nextLine();

        System.out.println("Ingresa el importe al que se le hará el desccuento");
        double importe  = sc.nextDouble();

        double descuento = 0;

        if(tipoTarjeta.equalsIgnoreCase("oro")) {
            descuento += 0.15; 
        }else if(tipoTarjeta.equalsIgnoreCase("club")){
            descuento += 0.05;
        }else if(tipoTarjeta.equalsIgnoreCase("joven")) {
            descuento += 0.05;
        }

        double importeFactura = importe - (importe * descuento);
        System.out.println("El importe sería: "+importeFactura);
        
    }
    
}
