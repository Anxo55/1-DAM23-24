package ExamenAnxo2ªEvaluacion;

import java.util.Arrays;

// Genera un array de 60 posiciones DOBLES que tomarán valores entre -200 y 200.
//  Separe en dos matrices los valores positivos y negativos. Ordene ambos arrays por el método de QuickSort.
// Considere el cero positivo. A continuación, separe el array de negativos en dos arrays,
//  uno de pares y otro de impares (use casteo); muestre ambos.

public class Ejercicio1B {

    public static void main(String[] args) {

        double[] array = new double[60];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 400 - 200; 
        }

        int countNegativosPares = 0;
        int countNegativosImpares = 0;

        for (double num : array) {
            if (num < 0) {
                if ((int) num % 2 == 0) {
                    countNegativosPares++;
                } else {
                    countNegativosImpares++;
                }
            }
        }

        double[] negativosPares = new double[countNegativosPares];
        double[] negativosImpares = new double[countNegativosImpares];
       
        int indexPares = 0;
        int indexImpares = 0;

        for (double num : array) {
            if (num < 0) {
                if ((int) num % 2 == 0) {
                    negativosPares[indexPares++] = num;
                } else {
                    negativosImpares[indexImpares++] = num;
                }
            }
        }
     
        Arrays.sort(negativosPares);
        Arrays.sort(negativosImpares);

        System.out.println("Numeros negativos pares: " + Arrays.toString(negativosPares));
        System.out.println();
        System.out.println("Numeros negativos impares: " + Arrays.toString(negativosImpares));
    }

    static void qsort (char items []) {
        qs (items, 0, items.length-1);
        }
    
        
    
        private static void qs (char items [], int left, int right) {
            int i, j;
            char x, y;
            i  = left; j = right;
            x = items [(left+right)/2];
            do {
               while ( (items [i] < x) && (i < right) ) 
                   i++;
              while((x < items [j]) && (j  > left) )
                  j--;
              if (i <= j) {
                 y = items[i];
                 items [i] = items [j];
                 items [j] = y;
                 i++; j--;
               }
             } while (i <= j);
            if (left < j) qs (items, left, j);
            if (i < right) qs (items, i, right);
        }
}


