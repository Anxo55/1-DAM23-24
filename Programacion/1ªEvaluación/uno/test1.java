package uno;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        byte a=2;
        System.out.println(a);
        short b=-4, c=3;
        System.out.println(b);
        System.out.println(c);
        int d = -30;
         System.out.println(d);
        int e = 0xC125;
        System.out.println(e);

        long f=434123 ;
         System.out.println(f);

        long g=5L ; /* la L en este caso indica Long*/
         System.out.println(g);

        char car1='c';
        System.out.println(car1);

        char car2=99; /*car1 y car2 son lo mismo porque el 99 en decimal es la ‘c’ */
        System.out.println(car2);
    
        float po = (float) 3.3456;
        System.out.println(po);
        float pi=3.1416F; /* la F en este caso indica Float*/
        System.out.println(pi);
        float medio=1/2f; /*0.5*/
        System.out.println(medio);
        double millon=1e6; /* 1x106 */
        System.out.println(millon);

        double medio2 = 1/2D; /*0.5 la D en este caso indica Double*/
        System.out.println(medio2);

        boolean seguir=false;
        System.out.println(seguir);
        // En los metodos booleanos obtenemos unicamente uno de los dos valores, que serian o true p false.

        final double PI = 3.14159;
        
        
    }
    
}
