package segundo.EjArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	
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
		
		
		int[] num=new int[15];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=scanyint("Dame los el numero "+(i+1)+":");
		}
		
		System.out.println(Arrays.toString(num));
		
		
		int aux;
		for (int i = 0; i < (num.length-1); i++) {
			aux=num[i];
			num[i]=num[i+1];
			num[i+1]=aux;
		}
		
		System.out.println(Arrays.toString(num));
		
		int base=num[0];
		for (int i = 0; i < (num.length-1); i++) {
			
				num[i]=num[i+1];

		}
		
		num[(num.length-1)]=base;
		
		System.out.println(Arrays.toString(num));
		
	}

}
