package ChatGPT.basicos;

import java.util.Scanner;

//Escribe un programa que imprime los numeros del 1 al 100, pero para los multiplos de 3,
//en lugar de imprimir el numero, imprime "Fizz", y para los multiplos de 5, imprime "Buzz". Para los
//numeros que son multiplos de ambos (3 Y 5), imprime "FizzBuzz".

public class Persona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Numero entre el 1 y el 100: ");
        for(int i=0; i<100; i++) {
            numero = sc.nextInt();
            
            do {
            System.out.println(numero);
            numero++;
        
            if(numero % 3 == 0){
                System.out.println("Fizz");
            }else if(numero % 5 == 0) {
                System.out.println("Buzz");
            }else if(numero % 3 == 0 && numero % 5 == 0){
                System.out.println("FizzBuzz");
            }
            } while (numero <= 100);
        }
         
    }
    
}
