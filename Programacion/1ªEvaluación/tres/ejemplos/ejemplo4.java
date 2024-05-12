package tres.ejemplos;

import java.util.Scanner;

public class ejemplo4 {

    public static void main(String[] args) {

        String tipoDia = "";
        String diaSemana;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un dia de la semana: ");
        diaSemana = sc.nextLine();

        switch (diaSemana.toLowerCase()) {
            case "lunes":
            tipoDia = "Inicio de semana".toUpperCase();
            break;

            case "martes":
            case "míercoles":
            case "jueves":
                tipoDia = "Mediados de semana";
                break;

            case "viernes":
                tipoDia = "Inicio de fin se semana";
                break;

            case "sábado":
            case "domingo":
                tipoDia = "Fin de seman";
                break;

                default:
                tipoDia = "no existe ese dia";
                break;
        }
   
     System.out.println(diaSemana + " es " + tipoDia);
    }
}