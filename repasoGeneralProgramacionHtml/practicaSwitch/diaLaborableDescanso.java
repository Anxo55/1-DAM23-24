package practicaSwitch;

import java.util.Scanner;

// Crea un programa que tome el nombre de un día de la semana como entrada y muestre si es un día laborable o un día de descanso.

public class diaLaborableDescanso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String diaSemana;
            
        System.out.println("Dame un dia de la semana para saber si es laboral o no laboral: ");
        diaSemana = sc.nextLine().toLowerCase();

        switch (diaSemana) {
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                System.out.println("El "+diaSemana+" es dia laboral");
                break;
        
            case "sabado", "domingo":
            System.out.println("El "+diaSemana+" no es dia laboral");
            break;

            default:
            System.out.println("Opcion incorrecta, vuelve a intentarlo.");
                break;
        }


    }
    
}
