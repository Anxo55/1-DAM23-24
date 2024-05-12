package variasPracticasJava;

import java.util.Scanner;

public class diaSemana {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int diaSemana; 

        System.out.println("Dame un dia de la semana: ");
        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Es lunes.");
                break;

            case 2:
                System.out.println("Es martes.");
                break;
                
            case 3:
                System.out.println("Es miercoles.");
                break;
                
            case 4:
                System.out.println("Es jueves.");
                break;

            case 5:
                System.out.println("Es viernes.");
                break;

            case 6:
                System.out.println("Es sabado.");
                break;
                
            case 7:
                System.out.println("Es domingo.");
                break;
        
            default:
            System.out.println("Opcion incorrecta");
                break;
        }

    }

     public static void main(String[] args) {

        menu();
        
    }
    
}
