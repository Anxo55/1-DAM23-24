package segundo.EjArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

    public static boolean esColor(String palabra) {
        boolean es=false;
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        for(int j=0; j<colores.length; j++) {
            if(palabra.equals(colores[j]))
                es = true;
        }
                return es;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pal = new String[8];

        for(int j=0; j<pal.length; j++) {
            System.out.println("Introduce PALABRA "+ (j+1) + " :");
            pal[j] = sc.next();
        }

        System.out.println(Arrays.toString(pal));

        int numeroColores = 0;

        for(int i=0; i<pal.length; i++) {

            
                if(esColor(pal[i])) {
                    numeroColores++;
                }//pal

            }

        System.out.println("Numero de colores " + numeroColores);

        String[] co = new String[numeroColores];
        String[] nc = new String[8-numeroColores];

        int indC=0;
        int indNC=0;

        for(int j=0; j<pal.length; j++) {
            if(esColor(pal[j])) {
                co[indC] = pal[j];
                indC++;
            }else{
                nc[indNC] = pal[j];
                indNC++;
            }
        }
        System.out.println(Arrays.toString(co));
        System.out.println(Arrays.toString(nc));

        int contador = 0;
        for(int j=0; j<co.length; j++) {
            pal[j] = co[contador];
            contador++;
        }

        for(int k=0; k<nc.length; k++) {
            pal[contador] = nc[k];
            contador++;
        }

        System.out.println(Arrays.toString(pal));
        
    }
    
}

