// package Arrays;

public class practica1 {

    public static void main(String[] args) {
        
        int[] miArray = {1,2,3,4,5};
        int suma = 0;

        for(int i=0; i < miArray.length; i++) {
            System.out.println(i);
            suma += i;
        }
        
        System.out.println("La suma es: "+suma);
    }
    
}
