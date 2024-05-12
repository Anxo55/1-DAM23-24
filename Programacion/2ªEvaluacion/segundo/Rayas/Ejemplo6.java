package segundo.Rayas;

import java.util.Scanner;

public class Ejemplo6 {

    public static void main(String[] args) {

        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        System.out.println("Generador aleatorio de banderas");

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas franjas quieres para la bandera? ");
        int franjas = Integer.parseInt(sc.nextLine());

        System.out.println("---------");
        for(int i = 0; i < franjas; i++) {
            System.out.println(color[(int) (Math.random() * color.length)]);
            System.out.println("----------");
        }
        
    }
    
}
