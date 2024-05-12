package variasPracticasJava;

import java.util.Scanner;

// Crea un programa que muestre un mensaje diferente dependiendo del mes ingresado por el usuario 
// utilizando una estructura switch.

public class mensajeMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes;

        System.out.println("Dame un mes: ");
        mes = sc.nextLine().toLowerCase();

        switch (mes) {
            case "enero":
                System.out.println("Elegiste el mes de enero.");
                break;

            case "febrero":
                System.out.println("Elegeiste el mes de febrero.");
                break;
                
            case "marzo":
                System.out.println("Elegiste el mes de marzo.");    
                break;

            case "abril": 
                System.out.println("Elegiste el mes de abril.");    
                break;

            case "mayo": 
                System.out.println("Elegiste el mes de mayo");
                break;
                
            case "junio":
                System.out.println("Elegiste el mes de junio.");
                break;
              
            case "julio":    
                System.out.println("Elegiste el mes de julio.");
                break;

            case "agosto":
                System.out.println("Elegiste el mes de agosto.");    
                break;

            case "septiembre":
                System.out.println("Elegiste el mes de septiembre.");    
                break;

            case "octubre":
                System.out.println("Elegiste el mes de octubre.");
                break;
                
            case "noviembre":
                System.out.println("Elegiste el mes de noviembre.");    
                break;

            case "diciembre":
                System.out.println("Elegiste el mes de diciembre.");    
                break;
        
            default:
                System.out.println("Opcion incorrecta, vuelve a ejecutar el programa.");
                break;
        }
        
    }
    
}
