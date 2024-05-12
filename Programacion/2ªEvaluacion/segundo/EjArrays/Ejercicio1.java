package segundo.EjArrays;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static int scanyint(String texto) {
		boolean error;
		int res=0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print(texto);
				res=sc.nextInt();
				error=false;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, dame un entero.");
				error=true;
			}
			
		}while(error);
		
		return res;
		
	}
	public static void main(String[] args) {
		
		int[] num=new int[12];
		
		num[0]=39;num[1]=-2;num[4]=0;num[6]=14;num[8]=5;num[9]=120;
		
		System.out.println("Array de  numeros");
		
		for (int valor : num) {
			System.out.print(valor+" ,");
		}
		
		char[] simbolo=new char[10];
		
		simbolo[0]='a';
		simbolo[1]='x';
		simbolo[4]='@';
		simbolo[6]=' ';
		simbolo[7]='+';
		simbolo[8]='Q';
		
		
		System.out.println("\nArray de caracteres");
		
		for (char c : simbolo) {
			System.out.print(c+" ,");
		}
		
		
		int[] numeros=new int[10];
		
		System.out.println("\nCrear un array a invertir.");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=scanyint("Dame los el numero "+(i+1)+":");
		}
		
		System.out.println("\nInvertido.");
		
		for (int i = numeros.length-1; i >=0 ; i--) {
			System.out.println("El nuevo numero "+(numeros.length-(i))+" es "+numeros[i]);
			
		}
		
	}

}
