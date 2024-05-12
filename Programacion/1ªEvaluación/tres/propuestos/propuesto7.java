package tres.propuestos;

import java.util.Random;

public class propuesto7 {

    //inicial + (final-inicial) +1
public static void main (String[] args) {
    
    Random rnd = new Random();
    for(int i =0; i<1000; i++) {
        // int valor = 300+rnd.nextInt(100+1);
        // System.out.println("El valor random es: "+valor);
        // }

        int otroValor = rnd.nextInt(300,401);
        System.out.println("Otro valor: "+otroValor); 
        }
         
    }
    
}
    

