package dos.resueltos;

import java.util.Scanner;

public class diasB {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int diaDelMes;

        System.out.println("Dame un numero para decirte los dias que tiene su mes: ");
        diaDelMes = sc.nextInt();

        switch (diaDelMes) {
            case 1,3,5,7,8,10,12:
                System.out.println("Tiene 31 dias");
                break;
            case 2: 
                System.out.println("Tiene 28/29 dias ");
                break;

            case 4,6,9,11:
                System.out.println("Tiene 30 dias");
                break;
            default:
            System.out.println("Opcion no valida");
                break;
        }


    }
    
}
