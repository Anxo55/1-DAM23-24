package segundo.Ordenamientos;

import java.util.Arrays;

public class EjQuickSort {

//
    //Project 6-3: A simple version of the Quicksort.

   // Set up a call to the actual Quicksort method.
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


    static void qsort (int items []) {
        qs (items, 0, items.length-1);
        }
    
        
    
        private static void qs (int items [], int left, int right) {
            int i, j;
            int x, y;
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
    

    public static void main(String[] args) {
        
        char[] letras = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(letras));

        EjQuickSort.qsort(letras);

        System.out.println("Ordenado");
        System.out.println(Arrays.toString(letras));

        //Aqui arriba hacemos con caracteres, en el de abajo con numeros

        int[] num = new int[5000];

        for(int i=0; i<num.length; i++) 
            num[i] = (int) (Math.random()*1000);
        
        System.out.println("Desordenado");
        System.out.println(Arrays.toString(num));

        EjQuickSort.qsort(num);

        System.out.println("Ordenado");
        System.out.println(Arrays.toString(num));

        

    }

}