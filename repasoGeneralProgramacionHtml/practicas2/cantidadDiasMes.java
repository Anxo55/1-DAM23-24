package practicas2;

import java.util.Scanner;

// Desarrolla un programa que tome un mes (como un número entero) y muestre la cantidad de días que tiene ese mes. 
// Puedes usar un switch para esto.

public class cantidadDiasMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroEntero;
        boolean seguir = true;

        do {
            
        System.out.println("Dame un numero para determinar el mes y ver cuantos dias tiene ese mes.");
        numeroEntero= sc.nextInt();

        int mesEscoge = numeroEntero;

        switch (mesEscoge) {
            case 1,3,5,7,8,10,12:
                System.out.println("Tiene 31 dias");
                break;

            case 2:
                System.out.println("Tiene 28 o 29 dias");
                break;

            case 4,6,9,11:
                System.out.println("Tiene 30 dias");
                break;   
                
            case 13:
                seguir = false;
                System.out.println("Saliendo del programa...");    
                break;
            default:
            System.out.println("Opcion incorrecta, ejecuta de nuevo el codigo");
            break;
        }

        } while (numeroEntero>=1 && numeroEntero <=12);
        
    }
    
}
