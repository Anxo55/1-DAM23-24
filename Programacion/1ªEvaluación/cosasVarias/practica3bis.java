package cosasVarias;

import java.util.Scanner;

public class practica3bis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("OPERACIONES MATEMATICAS");
        System.out.println("");

        System.out.println("Ingresa el primer numero: ");
        int numero1=sc.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int numero2=sc.nextInt();

        System.out.println("Operacion sumar(1): ");
        System.out.println("");
        System.out.println("Operacion restar(2): ");
        System.out.println("");
        System.out.println("Operacion multiplicar(3): ");
        System.out.println("");
        System.out.println("Operacion dividir(4): ");
        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
                int suma=sumar(numero1, numero2);
                System.out.println("La suma de los numeros es: "+suma);
                break;
            
            case 2:
                int resta=restar(numero1, numero2);
                System.out.println("La resta de los numeros es: "+resta);
                break;
                
            case 3:
                int multiplicacion= multiplciar(numero1, numero2);
                System.out.println("El resultado de la multiplicacion de los numeros es: "+multiplicacion);
                break;
                
            case 4:
                int division=dividir(numero1, numero2);
                System.out.println("EL resultado de la division de los numeros es: "+division);    
                break;
        
            default:
            System.out.println("Lo sentimos, la operacion selecionada no sirve, apangando el sistema.....");
                break;
        }
        
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }

    public static int multiplciar(int a, int b) {
        return a*b;
    }

    public static int dividir(int a, int b) {
        return a/b;
    }
    
}
