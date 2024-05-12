package uno;

// radio esfera, despues superficie esfera y su volumen

import java.util.Scanner;

public class esfera {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa el radio de la esfuera: ");
        double radio = sc.nextDouble();
        sc.close();

        double volumen = (4*Math.PI*radio*radio);
        double superficie = (4/3)*Math.PI*(radio*radio*radio);

        System.out.println("la superficie de la esfera es: "+volumen);
        System.out.println("EL volumen de la esfera es: "+superficie);

    }
    
}
