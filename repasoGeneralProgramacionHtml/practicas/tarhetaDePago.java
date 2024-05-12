import java.util.Scanner;

public class tarhetaDePago {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el tipo de tarjeta que tienes para hacerte el descuento: ");
        String tipoTarjeta = sc.nextLine();

        System.out.println("Dime el importe total con el que vas a pagar: ");
        double importe = sc.nextDouble();

        double descuento = 0;

        if(tipoTarjeta.equalsIgnoreCase("oro")) {
            descuento += 0.15;
        }else if(tipoTarjeta.equalsIgnoreCase("club")) {
            descuento += 0.05;
        }else if(tipoTarjeta.equalsIgnoreCase("joven")) {
            descuento += 0.05;
        }

        double importeFactura = importe - (importe * descuento);
        System.out.println("EL importe final es: " +importeFactura);
        
    }
    
}
