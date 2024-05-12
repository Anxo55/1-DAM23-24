package segundo.ejemplo3_2;

import java.util.Scanner;

public class LeerEntero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = 0;

        System.out.println("Escribe un valor entero: ");
        if(sc.hasNextInt()) {
            valor = sc.nextInt();
            System.out.println("El valor era " + valor + ".");
        }else{
            sc.next();
            System.out.println("El valor no era entero.");
        }
        sc.nextLine();
    }
    
}
