package dos.propuestos;

import java.util.Scanner;

public class testFinanza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double dato;
        
        finanzas prop = new finanzas();
        System.out.println("cambio por defecto " +prop.toString());
        prop.menu();
     
        finanzas prop2 = new finanzas(1.5);
           
        System.out.println("1.5 dol por eur " +prop2.toString());
        prop2.menu();

        System.out.println("dime tu el cambio(dol por eur)");
        dato = sc.nextDouble();

        finanzas pro3 = new finanzas(dato);
        System.out.println("cambio por defecto " +pro3.toString());
        pro3.menu();
    }
    
}
