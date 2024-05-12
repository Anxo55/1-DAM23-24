package dos.propuestos;

import java.util.Scanner;

// 7. Crea una clase con un método millasAMetros() que toma como parámetro de entrada un valor en millas marinas 
// y las convierte a metros.
// Una vez tengas este método escribe otro millasAKilometros() que realice la misma conversión, pero esta vez 
// exprese el resultado en kilómetros.
// Nota: 1 milla marina equivale a 1852 metros.

public class propuesto7 {

    public static final double MILIA = 1852;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double dato;
       
        System.out.println("Introduce millas: ");
        dato = sc.nextDouble();

        System.out.println("De millas a metros "+millasAMetros(dato));
        System.out.println("De millas a kilometros: "+millasAKilometros(dato));
        
        double otroDato;
        System.out.println("Dame el otro dato: ");
        otroDato = sc.nextDouble();

        System.out.println("De kilometros a millas: "+kilometrosAMillas(otroDato));
        
    }

    public static double millasAMetros(double metros) {
    return metros*MILIA;

    }

    public static double millasAKilometros(double metros) {
        return millasAMetros(metros) / 1000; //en kilometros

    }

    public static double kilometrosAMillas(double kilometros) {
        return kilometros*1000/MILIA;
        

    }
    
}
