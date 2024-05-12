package cosasVarias;

import java.util.Scanner;

// Clase donde vamos a introducir varios metodos, en el cual escogeremos el que vamos a usar.
// Utilizaremos un metodo switch donde incluiremos los metodos de suma, resta, multiplicacion y division.

public class practica3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("###############");
        System.out.println("##CALCULADORA##");
        System.out.println("###############");

        System.out.println("");

        System.out.println("Ingresa el primer numero: ");
        int numero1=sc.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int numero2=sc.nextInt();
        
        System.out.println("(1:suma)");
        System.out.println("");
        System.out.println("(2:resta)");
        System.out.println("");
        System.out.println("(3:multiplicacion)");
        System.out.println("");
        System.out.println("(4:division)");
        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
            int suma=sumar(numero1,numero2);
            System.out.println("El resultado de la suma es: "+suma);
            break;

            case 2:
            int resta=restar(numero1,numero2);
            System.out.println("El resultado de la resta es: "+resta);
            break;

            case 3:
            int multiplicacion=multiplicar(numero1,numero2);
            System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
            break;

            case 4:
            int division=dividir(numero1, numero2);
            System.out.println("El resultado de la division es>: "+division);
            break;        

            default:
            System.out.println("Opcion no valida....");
                break;
        }
        

    }
    public static int sumar(int a, int b) {
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }

    public static int multiplicar(int a, int b) {
        return a*b;
    }

    public static int dividir(int a, int b) {
        return a/b;
    }
    
    
}
    

