import java.util.Scanner;

public class numAleatorio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio;
        int intentos = 0;
        int numero;
        boolean seguir = true;

        numeroAleatorio = (int) (Math.random()*100);

        do {
    
        System.out.println("Adivina el numero a buscar entre 1 y 100: ");
        numero = sc.nextInt();
        intentos++;

        if(numero > numeroAleatorio) {
            System.out.println("El numero es mas pequeño.");
        }else if(numero < numeroAleatorio) {
            System.out.println("El numero es mas grande.");
        }

        } while (numero != numeroAleatorio);

        System.out.println("Felicidades adivinaste el numero a buscar en "+intentos+ " intentos");    
    }
    
    
}
