// En 1959, el acuerdo internacional sobre la yarda y la libra (entre Estados Unidos y 
// los países de la mancomunidad de naciones Commonwealth) definió una yarda exactamente como equivalente 
// a 0.9144 metros y, a su vez, definió el pie como exactamente 0.3048 metros, la pulgada se ha definido 
// y aceptado internacionalmente como equivalente a 0.0254 metros.
// Construya los métodos que permitan realizar las siguientes conversiones entre medidas:


// de metro a pie, 
// de yarda a metro
// de pie a yarda

import java.util.Scanner;

public class Ejercicio5B {

    public static double metrosAPies(double metros) {
        return metros / 0.3048;
        }

        public static double yardasAMetros(double yardas) {
        return yardas * 0.9144;
    
    }
    
    public static double piesAYardas(double pies) {
        return pies / 3.0;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame los metros: ");
        double metros = sc.nextDouble();

        double pies = metrosAPies(metros);
        System.out.println(metros + " metros son equivalentes a " + pies + " pies.");
        
        System.out.println("Dame las yardas: ");
        double yardas = sc.nextDouble();

        double metros2 = yardasAMetros(yardas);
        System.out.println(yardas + " yardas son equivalentes a " + metros2 + " metros.");
        
        System.out.println("Dame los pies: ");
        double pies2 = sc.nextDouble();
        
        double yardas2 = piesAYardas(pies2);
        System.out.println(pies2 + " pies son equivalentes a " + yardas2 + " yardas.");
    
    }
}
