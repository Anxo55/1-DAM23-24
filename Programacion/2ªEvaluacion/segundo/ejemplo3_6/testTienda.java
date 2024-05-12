package segundo.ejemplo3_6;

import java.util.Scanner;

public class testTienda {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda Cuantica", "Pepito Perez", 123456, 5);
        System.out.println(tienda);

        Computador computador1 = new Computador("Acer", 50, "Intel core 7", "Windows", 18500000);
        System.out.println(computador1);
        Computador computador2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        System.out.println(computador2);
        Computador computador3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);
        System.out.println(computador3);

        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);

        System.out.println(tienda);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce marca: ");
        String marca = sc.next();
        System.out.println("El computador a buscar: " + marca + " se encuentra en la posicion "
        +tienda.buscar(marca));
        System.out.println("eliminado...");
        tienda.eliminar(marca);
        System.out.println(tienda);
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        System.out.println(tienda);

        System.out.println("Introduce marca: ");
        marca = sc.next();
        System.out.println("El computador a buscar: " + marca + " se encuentra en la posicion "
        +tienda.buscar(marca));
        System.out.println("eliminado...");
        tienda.eliminar(marca);
        System.out.println(tienda);
        
    }
    
}
