package segundo.EjArrays;

import java.util.Arrays;

public class Ejercicio16 {

    public static void main(String[] args) {

        int[] n = new int[20];

        for(int j=0; j<n.length; j++) 
            n[j] = (int) (1+ Math.random()*400);
        
        System.out.println(Arrays.toString(n));

        for(int k=0; k<n.length; k++) {

            if(n[k] % 5 == 0 && n[k] % 7 == 0)
                System.out.println(n[k]+ " m CIN Y SIE ");
            else{
            if(n[k] % 5 == 0)
                System.out.println(n[k]+" mCinco");
            else if(n[k] % 7 == 0)
                System.out.println(n[k]+" mSiete");
            else
                System.out.println(n[k]+"   ");
        }
    }

    }
    
}
