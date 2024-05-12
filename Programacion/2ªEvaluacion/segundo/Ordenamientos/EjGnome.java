package segundo.Ordenamientos;

import java.util.Arrays;

public class EjGnome {

    static void gnomeSort(int[] miArray) {
        for(int index = 1; index < miArray.length; ) {
            if(miArray[index-1] <= miArray[index]) {
                ++index;
            }else{
                int tiempoVal = miArray[index];
                miArray[index] = miArray[index-1];
                miArray[index-1] = tiempoVal;
                --index;
                if( index == 0) {
                    index = 1;
                }
            }
        }
    }

     public static void main(String[] args) {

        int[] numeros = {2,4,5,1,3,5,7,9,4,8};

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(numeros));
        
        System.out.println("Ordenado");
        gnomeSort(numeros);
        System.out.println(Arrays.toString(numeros));
        
    }
    
}
