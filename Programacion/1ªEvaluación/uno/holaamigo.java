package uno;

import java.util.Scanner;

public class holaamigo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre = "";

        System.out.println("Dime tu nombre: ");
        
        System.out.println("Me llamo: ");
        nombre = sc.nextLine();

        System.out.println("Encantado "+nombre+ ", bienvenido a DAM");


    }
    
}
