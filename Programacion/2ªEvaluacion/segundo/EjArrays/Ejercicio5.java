package segundo.EjArrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {
	
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
		
		int[] num=new int[100];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=(int) Math.round((Math.random()*20));
		}
		
		System.out.println(Arrays.toString(num));
		
		int nuevo=scanyint("Valor a anhadir");
		int camb=scanyint("Valor a sustituit");
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==camb) {
				num[i]=nuevo;
				System.out.print("\""+num[i]+"\"  ");
			}else
				System.out.print(num[i]+"  ");
		}
		
	}

}
