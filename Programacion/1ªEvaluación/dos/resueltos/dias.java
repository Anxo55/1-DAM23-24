package dos.resueltos;

import java.util.Scanner;

public class dias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int mes;

        System.out.println("Dependiendo el numero selecionado te mostraremos los dias del mes ");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
            System.out.println("Enero tiene 31 dias");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias(sin ser bisiesto)");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
        
            default:
            System.out.println("Opcon no valida");
                break;
        }
    }
    
}
