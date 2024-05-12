package tres.propuestos;

import java.util.Scanner;

public class propuesto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Dame el valor de la a: ");
        a = sc.nextInt();

        System.out.println("Dame el valor de la b: ");
        b = sc.nextInt();

        System.out.println("Dame el valor de la c: ");
        c = sc.nextInt();

        // Encontrar el valor menor
        int minValor = Math.min(Math.min(a, b), c);

        // Encontrar el valor mayor
        int maxValor = Math.max(Math.max(a, b), c);

        // Mostrar el valor menor y mayor
        System.out.println("El valor menor es: " + minValor);
        System.out.println("El valor mayor es: " + maxValor);


        //Usandolo con if

        // if (a > b && a > c) {
        //     System.out.println("La A es la mayor");
        //     if(b >c) {
        //         System.out.println("C es el mas pequeño.");
        //     }else{
        //         System.out.println("B es la pequeña");
        //     }
        // } 

        // if(b >a && b>c) {
        //     System.out.println("La B es la mayor");
        //     if(a>c){
        //         System.out.println("C es el mas pequeño");
        //     }else{
        //         System.out.println("A es la mas pequeña");
        //     }
        // }

        // if(c>a && c>b) {
        //     System.out.println("La C es la mayor");
        //     if (a>b) {
        //         System.out.println("B es la mas pequeña");
        //     }else{
        //         System.out.println("A es la mas pequeña");
        //     }
        // }
        // System.out.println("");
        // System.out.println("La a es: "+a+" la b es: "+b+" la c es: "+c);

    }
    
}
