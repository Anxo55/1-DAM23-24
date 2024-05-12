import java.util.Arrays;

public class practica5 {

    public static void main(String[] args) {
        
        int[] miArray = {1,2,3,4,5};
        int[] miArrayInverso = new int[miArray.length];


        invertirArrat(miArray, miArrayInverso);
        System.out.println(Arrays.toString(miArray));
        System.out.println(Arrays.toString(miArrayInverso));

        int variable = 7;
        variable=incrementar(variable);
        System.out.println(variable);
        

    }

    public static void invertirArrat(int [] array1, int [] array2) {
         for(int i=0; i<array1.length;i++) {
            array2[array1.length-i-1]=array1[i];
        }

    }

    public static int incrementar(int a) {
        return a++;
    }
    
}
