package segundo.Ordenamientos;

import java.util.Arrays;

public class EjBurbuja {
    // BubbleSort

    public static void burbuja(int array[]) {
        int aux;
        for(int i=array.length; i>0;i --) {
            for(int j=0; j<i-1; j++) {
                if(array[j]> array[j+1]) {
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = {2,4,5,1,3,5,7,9,4,8};

        System.out.println(Arrays.toString(numeros));
        burbuja(numeros);
        System.out.println(Arrays.toString(numeros));
        
    }
    
}
