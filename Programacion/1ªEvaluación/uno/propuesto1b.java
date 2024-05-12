package uno;

import java.util.Scanner;

public class propuesto1b {

    public static void main(String[] args) {
        
        char respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un entero: ");
        int numero1 = sc.nextInt();

        System.out.println("Dame otro entero: ");
        int numero2 = sc.nextInt();

        System.out.println("sumar S, restar R, salir Q");
        respuesta=sc.next().charAt(0);



        // int suma = sumar(numero1, numero2);
        //al  tener el metodo constructor de sumar, lo introduimos en el syso y no necesitamos la variable suma del metodo main.
        System.out.println("La suma es: "+sumar(numero1, numero2));
        
        //mostramos tmb el metodo mostrar despues del de sumar usando el mismo metodo
        System.out.println("La resta es: " +restar(numero1, numero2));

    }

    public static int sumar(int a, int b) {
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }
    
}
