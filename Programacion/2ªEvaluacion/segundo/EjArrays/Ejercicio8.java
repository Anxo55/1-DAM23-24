package segundo.EjArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
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
		// TODO Auto-generated method stub
		
		int[] num=new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=scanyint("Dame los el numero "+(i+1)+":");
		}
		
		int j=scanyint("¿Cuantas posiciones lo muevo?");
		while(j>=num.length) {
			j=j-num.length;
		}
		
		System.out.println(Arrays.toString(num));
		
		
		int aux;
		for (int i = 0; i < (num.length-j); i++) {
			aux=num[i];
			num[i]=num[i+j];
			num[i+j]=aux;
		}
		
		System.out.println(Arrays.toString(num));

	}

}
