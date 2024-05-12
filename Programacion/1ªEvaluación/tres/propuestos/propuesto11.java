package tres.propuestos;

// Realiza un programa que muestre por pantalla los 50 primeros números pares

public class propuesto11 {

    public static void main(String[] args) {
        
        for(int i=1; i<=100; i++) {
            if(i% 2 == 0) 
                System.out.println(i+" es par");
        }

        for(int i = 1; i<=50; i++) {
            System.out.println(2*i + " es par");
        }
        
        for(int i=2; i<=100; i=i+2) {
            System.out.println(i + " es par");
        }

    }
    
}
