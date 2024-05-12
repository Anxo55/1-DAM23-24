package segundo.uno;

public class MayorMenor {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,4,5,2};
        int n = arr.length;
        System.out.println("Elementos del array");

        System.out.print("[ ");
        for(int i=0; i<n;i++) {
            
            System.out.print(arr[i]+" ");
           
        }
         System.out.print("]");

        int max = arr[0];
        int min = arr[0];
        
        for(int i=1; i<n; i++) {
            if(arr[i]<min)//busqueda de min
                min=arr[i];
            if(arr[i]>max)//busqueda de max
                max=arr[i];
        }
        System.out.println();
        System.out.println("Maximo es: "+max);
        System.out.println("Minimo es: "+min);
        
    }
    
}
