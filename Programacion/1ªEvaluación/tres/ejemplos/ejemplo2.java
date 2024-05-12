package tres.ejemplos;

import java.util.Scanner;

public class ejemplo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matematicas , lengua ;

        System.out.println("Dame la nota de matematicas: ");
        matematicas = sc.nextInt();

        System.out.println("Dame la nota de lengua: ");
        lengua = sc.nextInt();

            if(matematicas >=5 && lengua >= 5) {
                System.out.println("has aprobado matematicas y lengua");
            }else if(matematicas >=5 && lengua <5) {
                System.out.println("Aprobo matematias pero susoendió lengua");
            }else if(lengua >=5 && matematicas <5) {
                System.out.println("Aprobo lengua pero susoendió matematicas");
            }else{
                System.out.println("Suspendio tanto lengua como matematicas");
            }
    
    }
}
