package segundo.Ordenamientos;

public class MetodosOrdenamientos {

// metodo de la burbuja
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


// metodo cocktailSort
    public static int[] cocktailSort(int[] numbers) {

        boolean swapped = true;
        int i = 0;
        int j = numbers.length - 1;
        while(i < j && swapped) 
        {
           swapped = false;
           for(int k = i; k < j; k++) 
           {
              if(numbers[k] > numbers[k + 1]) 
              {
                 int temp = numbers[k];
                 numbers[k] = numbers[k + 1];
                 numbers[k + 1] = temp;
                 swapped = true;
              }
           }
           j--;

           if(swapped) {
              swapped = false;
              for(int k = j; k > i; k--) {

                 if(numbers[k] < numbers[k - 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k - 1];
                    numbers[k - 1] = temp;
                    swapped = true;
                 }
              }
           }
           i++;
        }
        return numbers;    
  }

// metodo insertionSort
  public static void insertionsort(int[] numbers) {
    for(int i=0; i<numbers.length; i++) {
        int copiado = numbers[i];
        int j = i;
        while(j > 0 && copiado < numbers[j-1]) {
            numbers[j] = numbers[j-1];
            j--;
        }
        numbers[j] = copiado;
    }

    
}

// metodo QuickSort
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

    // metodo mergeSort
    public static int[] mergeSort(int array[]){

        if(array.length > 1){
            int elementsInA1 = array.length / 2;
            int elementsInA2 = array.length - elementsInA1;
            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];

            for(int i = 0; i < elementsInA1; i++)
                arr1[i] = array[i];

            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = array[i];
                
                arr1 = mergeSort(arr1);
                arr2 = mergeSort(arr2);
        
            int i = 0, j = 0, k = 0;
            while(arr1.length != j && arr2.length != k){
                if(arr1[j] < arr2[k]){
                    array[i] = arr1[j];
                    i++;
                    j++;
                } else {
                    array[i] = arr2[k];
                    i++;
                    k++;}
            }

            while(arr1.length != j){
                array[i] = arr1[j];
                i++;
                j++;
            }

            while(arr2.length != k){
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }
    
}
