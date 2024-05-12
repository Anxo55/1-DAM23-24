package dos.propuestos;

import java.util.Scanner;

public class testNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        numero numero1 = new numero(4);

        System.out.println("El valor del numero es: "+numero1);
        
        System.out.println("El doble del numero es: " +numero1.doble());
        System.out.println("El triple del numero es: " +numero1.triple());
        System.out.println("El cuadruple del numero es: " +numero1.cuadruple());

        //para separar los ejemplos con un espacio en la terminal 
        System.out.println("");

        //Al usar el metodo anidado incrementamos 1 al numero de origen 
        numero1.aniado(1);
        System.out.println(numero1.toString());
       
        System.out.println("El doble del numero es: " +numero1.doble());
        System.out.println("El triple del numero es: " +numero1.triple());
        System.out.println("El cuadruple del numero es: " +numero1.cuadruple());

        //separacion del ejemplo anterior.
        System.out.println("");

        //usando el metodo restar, le restamos al valor anterior y mostramos los metodos doble, triple y cuadruple.
        numero1.restar(2);
        System.out.println(numero1.toString());

        System.out.println("El doble del numero es: " +numero1.doble());
        System.out.println("El triple del numero es: " +numero1.triple());
        System.out.println("El cuadruple del numero es: " +numero1.cuadruple());


    }
    
}
