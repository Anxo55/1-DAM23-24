import java.util.Scanner;

public class numAleatorio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        int numeroAleatorio;
        int numero;
        boolean acertar = true;

        numeroAleatorio = (int) (Math.random()*100);

        System.out.println("El numero aleatorio se ha generado, tenemos que adivinarlo.");

        do {
            
        System.out.println("Dame un valor entero entre 1 y 100.");
        numero = sc.nextInt();
        intentos++;

        if(numero > numeroAleatorio) {
            System.out.println("Lo siento, el valor es mas pequeño. ");
        }else if(numero < numeroAleatorio) {
            System.out.println("Lo siento, el valor es mas grande");
        }else{
                System.out.println("Felicidades adivinaste el numero aleatorio " +numeroAleatorio+ " en " +intentos+ " intentos");

        }

        if(intentos < 10) {
            System.out.println("Llevas: "+intentos);
        }else if(intentos == 10) {
            System.out.println("Lo lamento no consigo adivinar el numero " +numeroAleatorio+ " itentelo en otra ocasion.");
        }

         } while (numero != numeroAleatorio && intentos < 10);

         

    }
    
}
