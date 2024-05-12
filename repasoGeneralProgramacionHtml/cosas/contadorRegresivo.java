import java.util.Scanner;

public class contadorRegresivo {

    // Escribe un programa en Java que solicite al usuario 
    // ingresar un número entero. Luego, el programa debe contar 
    // desde ese número hasta 1 utilizando un bucle do-while y 
    // mostrar cada número en pantalla a medida que se cuenta 
    // hacia atrás. Por ejemplo, si el usuario ingresa 5, el 
    // programa debería mostrar:

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
            
        System.out.println("Dame el numero entero 1 y muestrame la cadena: ");
        numero = sc.nextInt();

        do {
            System.out.println(numero);
            numero--;
        } while (numero > 1);

       
        
    }
    

}