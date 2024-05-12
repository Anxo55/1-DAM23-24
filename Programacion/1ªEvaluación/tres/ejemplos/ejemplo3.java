package tres.ejemplos;

import java.util.Scanner;

public class ejemplo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matematicas , lengua ;

        System.out.println("Dame la nota de matematicas: ");
        matematicas = sc.nextInt();

        System.out.println("Dame la nota de lengua: ");
        lengua = sc.nextInt();

        if (matematicas >= 5) {
            if(lengua >= 5) {
                System.out.println("M aprobado L aprobado");
            }else{
                System.out.println("M aprobado L suspenso");
            }
        }else{
            if(lengua >= 5) {
                System.out.println("M suspenso L aprobado");
            }else{
                System.out.println("M suspenso L suspenso");
            }
        }
        
    }
    
}
