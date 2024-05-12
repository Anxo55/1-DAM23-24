package practicaJavaVarios;

import java.util.Scanner;

// Utilizar un switch para imprimir el nombre del mes correspondiente a un número ingresado por el usuario.

public class mes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaMes;

        System.out.println("Dame un numero para determinar el mes: ");
        diaMes = sc.nextInt();

        switch (diaMes) {
            case 1:
                System.out.println("Este mes es enero.");
                break;

            case 2:
                System.out.println("Este mes es febrero.");    
                break;

            case 3:
                System.out.println("Este mes es marzo.");    
                break;

            case 4: 
                System.out.println("Este mes es abril.");    
                break;

            case 5:
                System.out.println("Este mes es mayo.");    
                break;

            case 6:
                System.out.println("Este mes es junio.");    
                break;

            case 7:
                System.out.println("Este mes es julio.");    
                break;

            case 8: 
                System.out.println("Este mes es agosto.");    
                break;

            case 9:
                System.out.println("Este mes es septiembre.");    
                break;

            case 10:
                System.out.println("Este mes es octubre.");    
                break;

            case 11:
                System.out.println("Este mes es noviembre.");
                break;
                
            case 12:
                System.out.println("Este mes es diciembre.");    
                break;
        
            default:
            System.out.println("opcion invalida");
                break;
        }
        
    }
    
}
