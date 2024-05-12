package practicaJavaVarios;

import java.util.Scanner;

public class numeroNovio {

    public static void main(String[] args) {
		/*
		 * Introducir dos números por teclado y mostrar si son novios o no. Con un
		 * ejemplo es más fácil de entender. 48 y 75 son números novios porque: La suma
		 * de los divisores de cada número por separado es igual a la suma de esos dos
		 * números más uno. Divisores de (m) = Divisores de (n) = m + n + 1. D (48) = 1
		 * + 2 + 3 + 4 + 6 + 8 + 12 + 16 + 24 + 48 = 124, D (75) = 1 + 3 + 5 + 15 + 25 +
		 * 75 = 124, Si hacemos => 48 + 75 + 1 = 124
		 */
		Scanner src= new Scanner(System.in);
        
		System.out.println("Introduce un numero");
		int num1=src.nextInt();
		System.out.println("Introduce otro numero");
		int num2=src.nextInt();
		
		int divisores1=0;  //acumulador de divisores
		int divisores2=0;
		
		//incluido el propio numero
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				divisores1+=i;
			}
		}
		for(int i=1; i<=num2; i++) {
			if(num2%i==0) {
				divisores2+=i;
			}
		}
		
		//OJO AL BUCLE DE DECISION 
		if(divisores1==divisores2) {
			if(divisores1==num1+num2+1) {
				System.out.println("Son novios");
			}else {
				System.out.println("No son novios");
			}
		}else {
			System.out.println("No son novios");
		}
		
		
		
		
	}
    
}
