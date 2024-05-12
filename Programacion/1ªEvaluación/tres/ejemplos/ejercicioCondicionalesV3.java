package tres.ejemplos;

import java.util.Scanner;

// Se quiere determinar el importe a facturar a los clientes de unos grande almacenes segun estos criterios;
// Si pagan con tarjeta oro tendran un 15% descuento
// Si pagan con tarjeta club tendran un 5% descuento
// Si la tarjeta (oro o club) es modalidad joven, tedran un 5% de descuento.
// Los descuentos son acumulables.

public class ejercicioCondicionalesV3 {


    public static double calcularPago(double descuento, double descuento2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el precio: ");
        double precio = scanner.nextDouble();
        return precio * (1 - descuento) * (1-descuento2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean oro = false;
        boolean club = false;
        boolean joven = false;

        System.out.println("oro true/false");
        oro = sc.nextBoolean();
        System.out.println("club true/false");
        club = sc.nextBoolean();
        System.out.println("joven true/false");
        joven = sc.nextBoolean();
        

        if (oro) {

            if (club) {

                if (joven) {
                    System.out.println("oro  club   joven");
                    System.out.println("NO VIABLE");
                }else{
                    System.out.println("oro   club    no joven");
                    System.out.println("NO VIABLE");
                }
                
            } else {
                if (joven) {
                    System.out.println("oro  !club   joven");
                    System.out.println("descuento 15% y 5%");
                    System.out.println(calcularPago(0.15,  0.05));
                }else{
                    System.out.println("oro   !club    !joven");
                    System.out.println("descuento 15%");
                    System.out.println(calcularPago(0.15, 0)); 
                }
                
            }
            
        }else{
            
            if (club) {

                if (joven) {
                    System.out.println("!oro  club   joven");
                    System.out.println("descuento del 15% y 5%");
                    System.out.println(calcularPago(0.05 , 0.05));
                }else{
                    System.out.println("!oro   club    !joven");
                    System.out.println("descuento de 5%");
                    System.out.println(calcularPago(0.05, 0));
                }
                
            } else {
                if (joven) {
                    System.out.println("!oro  !club   joven");
                    System.out.println("NO VIABLE");
                }else{
                    System.out.println("!oro   !club    !joven");
                    System.out.println("no tienes descuentos");
                }
                
            }

        }
        
    }
    
}
