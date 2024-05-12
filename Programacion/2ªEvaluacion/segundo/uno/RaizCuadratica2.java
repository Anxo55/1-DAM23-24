package segundo.uno;

import java.util.Scanner;

public class RaizCuadratica2 {

    public static void main(String[] args) {
        double a,b,c = 0;
        double disc = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame una a: ");
        a = sc.nextDouble();

        System.out.println("Dame una b: ");
        b= sc.nextDouble();

        System.out.println("Dame una c: ");
        c = sc.nextDouble();
        
        System.out.println("La ecuacion es: "+
        a+" x2 + "+b+" x + "+c+" = 0 ");

        disc = Math.pow(b, 2)-4*a*c;
        System.out.println("El disc es: "+disc);

        if (disc>0) {
            double sol1=(-b+Math.sqrt(disc)) / (2*a);
            double sol2 = (-b-Math.sqrt(disc)) / (2*a);
            System.out.println("Hay solucion: "+sol1);
            System.out.println("Hay solucion: "+sol2);
        } else if(disc==0){
            double sol =-b /(2*a);
            System.out.println("Hay una solucion: "+sol);
        }else{
            System.out.println("No hay soluciones");
        }

    }
    
}
