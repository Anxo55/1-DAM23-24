package Perplexity.cosas;

import java.util.Scanner;

// Escribe un programa que lea un número de día de la semana 
// y muestre el nombre del día de la semana utilizando la 
// sentencia switch.

public class diaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaSemana;
        boolean seguir = true;

        do {
            
        System.out.println("Escoge un dia para saber que dia de la semana es: ");        
        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
        
            case 2:
                System.out.println("Hoy es martes");
                break;
                
            case 3: 
                System.out.println("Hoy es miercoles");    
                break;

            case 4: 
                System.out.println("Hoy es jueves");    
                break;

            case 5: 
                System.out.println("Hoy es viernes");    
                break;

            case 6: 
                System.out.println("Hoy es sabado");    
                break;

            case 7: 
                System.out.println("Hoy es domingo");    
                break;

            case 8:
                seguir = false;
                System.out.println("Cerrando el programa con exito");    
                break;

            default:
            System.out.println("Opcion incorrecta, introduce un digito entre 1 o 7, sino pulsa 8 para salir");
                break;
        }

        } while (seguir);


    }

    
}
