package uno;

import java.util.Random;
import java.util.Scanner;

public class ejercicioPrevioCIes {

        public static char getLetras(){
            return (char) ( 'a' + Math.random()*26  );
           //  a es -->97
           //  z es -->122
         }

         public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            char prueba = getLetras();

            System.out.println("Dame un caracter: ");
            prueba = sc.next().charAt(0);


            int contador = 0;
            Random random = new Random();

                for (int i = 0; i < 100; i++) {
                    char aleatorio = (char) (random.nextInt(26) + 'a'); // Genera un carácter aleatorio entre la (a-z)
                    if (aleatorio == prueba) {
                        contador++;
                    }
                    System.out.println("caracter: "+getLetras());
                }

                System.out.println("El caracter '" + prueba + "' apareció " + contador + " veces en los 100 caracteres aleatorios.");
            }
            
         }
         
    
    

