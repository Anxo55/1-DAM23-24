package segundo.EjerciciosRayas;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
       

        int[] miArray1 = new int[20];
        int[] cuad= new int[20];
        int[] cubo = new int[20];

        for(int i=0; i<miArray1.length; i++) {
            miArray1[i] = (int) (Math.random()*100);
            cuad[i] = (int) (Math.pow(miArray1[i], 2));
            cubo[i] = (int) (Math.pow(miArray1[i], 3));
            // cuad[i] = miArray1[i] * 2;
            // cubo[i] = miArray1[i] * 3;

            // System.out.println(Arrays.toString(miArray1));
            // System.out.println(Arrays.toString(cuad));
            // System.out.println(Arrays.toString(cubo));
            }

            for(int k=0; k<miArray1.length; k++) {
                System.out.println("---numero------cuadrado----cubo----");
                System.out.println(" "+miArray1[k]+ "----"+cuad[k]+"----"+cubo[k]+"----");
            }

        
        
    }
    
}
