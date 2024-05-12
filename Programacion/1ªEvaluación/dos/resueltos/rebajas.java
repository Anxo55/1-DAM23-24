package dos.resueltos;

import java.util.Scanner;

public class rebajas {

    //Metodo de la clase, que pasandole el precio original y el precio actual, nos devolvera el porcentaje de descuento
    public static double descubrePorcentaje(double original, double actual) {
    
        return ( (original-actual) / original) * 100;

    }

    //Creamos este metodo el cual nos dirá cuanto nos quedará al final
    public static double descubreActual(double original, double porcentaje) {
        
        double actual = (porcentaje / 100) * original;
        return original - actual;

    }

    //Creamos el metodo Original que pidiendo el precio actual y su porcentaje nos devuelva el precio Original.
    public static double descubreoriginal(double actual, double porcentaje) {
        // double original = actual / (1 + porcentaje/100);
        return actual / (1 - (porcentaje / 100));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double original,actual, porcentaje;

        System.out.println("Precio original: ");
        original = sc.nextDouble();

        System.out.println("Precio actual: ");
        actual = sc.nextDouble();

        System.out.println("Porcentaje del descuento " +descubrePorcentaje(original, actual));

        //Este syso lo creo para separar cada uno de los ejemplos para poder verlos y compararlos
        System.out.println("");

        System.out.println("Precio original: ");
        original = sc.nextDouble();

        System.out.println("Total de descuento: ");
        porcentaje = sc.nextDouble();

        System.out.println("Precio actual: "+descubreActual(original, porcentaje));

        //Otra separacion para hacer el ultimo metodo que es el de descubreOriginal
        System.out.println("");

        System.out.println("Dame el precio actual: ");
        actual = sc.nextDouble();

        System.out.println("Dame el porcentaje: ");
        porcentaje = sc.nextDouble();

        System.out.println("El precio original es: "+descubreoriginal(actual, porcentaje));



        // System.out.println(descubrePorcentaje(100,79));
        // System.out.println(descubrePorcentaje(100,50));
        
        }
    
    
}
