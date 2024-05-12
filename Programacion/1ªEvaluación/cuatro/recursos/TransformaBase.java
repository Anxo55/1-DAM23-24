package cuatro.recursos;

import java.util.Scanner;

public class TransformaBase {

    public static void muestraCifras(int dat) {
        if(dat<10) {
            System.out.println(dat);
        }else{
            dat-=10;
            char c = (char) ('A' +dat);
            System.out.println(c);
        }
    }

    public static void transforma(int dato, int base) {
        if (base > dato) {
            muestraCifras(dato);
        }else{
            transforma(dato/base, base);
            muestraCifras(dato%base);//para añadir posiciones a la cifra
        }
    }

    public static void main(String[] args) {
        // transforma(8, 2);
        // System.out.println("");
        // transforma(12, 16);
        // System.out.println("");
        // transforma(13, 8);
        // System.out.println("");
        int base, dato;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base: ");
        base = sc.nextInt();

        System.out.println("Dame el dato: ");
        dato = sc.nextInt();

        System.out.println("resultado-----");
        transforma(dato, base);
        
    }
    
}
