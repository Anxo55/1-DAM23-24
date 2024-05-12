package practicaSwitch;

import java.util.Scanner;

// Desarrolla un programa que solicite un número del 1 al 7 y muestre el nombre del día de la semana correspondiente.

public class muestraDiaSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaSemana;
        boolean seguir = true;

        do {
            
       System.out.println("Dame un dia de la semana: ");
        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es lunes.");
                break;
               
            case 2:
                System.out.println("Hoy es martes.");    
                break;

            case 3:
                System.out.println("Hoy es miercoles.");
                break;
                
            case 4:
                System.out.println("Hoy es jueves.");    
                break;

            case 5:
                System.out.println("Hoy es viernes.");
                break;
                
            case 6:
                System.out.println("Hoy es sabado.");    
                break;

            case 7:
                System.out.println("Hoy es domingo.");
                break; 
                
            case 8:
                seguir = false;
                System.out.println("Cerrando el programa ejecutado.");
                break;    
            default:
                System.out.println("Opcion incorrecta, vuelve a intentarlo");
                break;
        }

         } while (seguir);

    }
    
}
