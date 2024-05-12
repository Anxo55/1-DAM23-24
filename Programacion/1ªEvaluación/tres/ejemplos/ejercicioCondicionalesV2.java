package tres.ejemplos;

import java.util.Scanner;

public class ejercicioCondicionalesV2 {

     public static double calcularPago(double descuento, double descuento2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el precio: ");
        double precio = scanner.nextDouble();
        return precio * (1 - descuento) * (1-descuento2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean joven = false;
        char res = ' ';

        System.out.println("oro(O) club(C) ninguna(N)");
        res = sc.nextLine().charAt(0);
       
        

        if(res == 'O') {
            System.out.println("joven true/false");
            joven = sc.nextBoolean();
            if (joven) {
                System.out.println(calcularPago(0.15, 0.05));
            }else{
                System.out.println(calcularPago(0.15, 0));
            }

        }else if(res == 'C') {
            System.out.println("joven true/false");
            joven = sc.nextBoolean();
            if (joven) {
                System.out.println(calcularPago(0.05, 0.05));
            }else{
                System.out.println(calcularPago(0.05, 0));
                
            }

        }else{
            System.out.println(calcularPago(0, 0));

        }
        
    }
    
}
