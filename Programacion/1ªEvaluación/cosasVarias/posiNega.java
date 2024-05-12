package cosasVarias;

import java.util.Random;
import java.util.Scanner;

public class posiNega {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int ceros = 0;
        

        Random random = new Random();      

        for(int i = 0; i<10; i++) {
            int numero = random.nextInt(201)-100;
            System.out.println("El numero es: "+numero);

           if (numero>0) {
            positivo++;
           } else if (numero<0){
            negativo++;
           }else{
            ceros++;
           }
        }
        System.out.println("Han salido: " +positivo+ " numeros positivos");
        System.out.println("Han salido: " +negativo+ " numeros negativos");
        System.out.println("Han salido: " +ceros+ " numeros cero");

    }
    
}
