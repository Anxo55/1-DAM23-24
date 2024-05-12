import java.util.Scanner;

public class diasDeLaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaDeLaSemana;
        boolean seguir = true;
        
        System.out.println("Dame un dia de la semana: ");
        diaDeLaSemana = sc.nextInt();
        
        switch (diaDeLaSemana) {
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
                System.out.println("Hoy es Sabado");
                break;

            case 7:
                System.out.println("Hoy es Domingo");
                break;
        
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
        
    }
    
}
