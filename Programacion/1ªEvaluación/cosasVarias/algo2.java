package cosasVarias;

import java.util.Scanner;

public class algo2 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el precio normal: ");
        double precioNormal = sc.nextDouble();
        System.out.print("Introduzca el tipo de tarjeta (ORO, PLATA o BRONCE): ");
        String tipoTarjeta = sc.next();
        System.out.print("¿La tarjeta es de clase STAR? (Sí o No): ");
        String claseTarjeta = sc.next();
        double descuento = calcularDescuento(tipoTarjeta, claseTarjeta);
        double precioFinal = precioNormal * (1 - descuento);
        System.out.printf("Descuento: %.2f%%\n", descuento * 100);
        System.out.printf("Precio final: %.2f", precioFinal);
    }
    
    public static double calcularDescuento(String tipoTarjeta, String claseTarjeta) {
        double descuento = 0;
        if (tipoTarjeta.equals("ORO")) {
            descuento += 0.2;
        } else if (tipoTarjeta.equals("PLATA")) {
            descuento += 0.1;
        } else if (tipoTarjeta.equals("BRONCE")) {
            descuento += 0.05;
        }
        if (claseTarjeta.equalsIgnoreCase("Sí")) {
            descuento += 0.05;
        }
        return descuento;
    }

    
}


    

