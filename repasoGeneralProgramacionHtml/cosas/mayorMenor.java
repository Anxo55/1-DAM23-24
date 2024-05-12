import java.util.Scanner;

// Escribe un programa en Java que solicite al usuario ingresar dos números y 
// luego muestre en pantalla cuál de los dos números es mayor. 
// Si los números son iguales, el programa debe indicarlo.

public class mayorMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingresa el primer numero entero: ");
        numero1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero entero: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El numero 1 es mayor que el numero 2");
        } else if(numero1<numero2){
            System.out.println("El numero 2 es mayor que el numero 1");
        }else if(numero1 == numero2){
            System.out.println("El numero 1 y el numero 2 son iguales");
        }
        
    }
    
}
