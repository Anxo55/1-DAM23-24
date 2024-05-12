package Perplexity.cosas;

import java.util.Scanner;

public class diasMes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String diasMes;
        boolean seguir = true;

        do {
            
        System.out.println("Escoge el mes para saber cuantos dias tiene.");
        diasMes = sc.nextLine();

        switch (diasMes) {
            case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre":
                System.out.println(diasMes+ " tiene 31 dias.");
                break;

            case "Febrero":
                System.out.println(diasMes+ " tiene 28-29 dias");    
                break;

            case "Abril", "Junio", "Septiembre", "Noviembre":    
                System.out.println(diasMes+ " tiene 30 dias");
                break;
            default:
                seguir = false;
                System.out.println("Opcion incorrecta, ejecuta otra vez el programa");
                break;
        }
        } while (seguir);
        
    }
    
}
