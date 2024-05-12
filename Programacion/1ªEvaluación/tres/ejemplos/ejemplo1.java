package tres.ejemplos;

import java.util.Scanner;

public class ejemplo1 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a;

    System.out.println("Dame el valor entero de a: ");
    a = sc.nextInt();

    if (a == 4) {
        System.out.println("La variable es igual a 4");
    }

    if (a > 5) {
        System.out.println("La variable es mayor a 5");
    }else{
        System.out.println ("La variable es menor que 6");
    }

    if (a > 5) {
        System.out.println("La variable es mayor a 5");
    }else if(a == 5){
        System.out.println("La variable es igual a 5");
    }else{
        System.out.println ( "La variable es menor que 5");
    }

        
        
    }
}

