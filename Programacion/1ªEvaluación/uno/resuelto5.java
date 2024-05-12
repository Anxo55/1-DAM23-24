package uno;

import java.util.Scanner;

// Necesitamos almacenar en la variable booleana jasp el valor:
// – Verdadero. Si la edad es menor o igual a 28, el nivel_de_estudios es mayor que tres y los ingresos superan 
//   los 28.000 (euros).
// – Falso. En caso contrario

public class resuelto5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int edad=0;
        int nivelDeEstudios=0;
        int ingresos = 0;

        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();

        System.out.println("Dime tu nivel de estudios: ");
        nivelDeEstudios = sc.nextInt();

        System.out.println("Dime tus ingresos: ");
        ingresos = sc.nextInt();

        // Calculamos el valor de jasp
        boolean jasp = edad <= 28 && nivelDeEstudios > 3 && ingresos > 28000;

        if(jasp) {
            System.out.println("Eres joven aunque sobradamente preparao");
        }else{
            System.out.println("No eres joven");
        }

        
    }

}