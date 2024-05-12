package uno;

import java.util.Scanner;

public class propuesto1c {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        int operacion;
        boolean seguir = true;
        
        
        do { //bucle dowhile, donde repetimos el metodo hasta que sea false.
            
        System.out.println("Dame el primer numero: ");
        numero1=sc.nextInt();

        System.out.println("Dame el segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println("sumar S, restar R, salir Q: ");
        operacion = sc.next().charAt(0);

        switch (operacion) {
            case 'S':
                int suma = sumar(numero1, numero2);
                System.out.println("La suma de los numeros es: "+suma);
                break;

            case 'R':
                int resta = restar(numero1, numero2);
                System.out.println("La resta de los numeros es: "+resta);
                break;

            case 'Q':
                System.out.println("Saliendo del ejercicio...");    
            break;

            default:
            System.out.println("Opcion no valida");
                break;
        }
            } while (seguir);
    }

    public static int sumar(int a, int b) {
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }
    
    
}
