package segundo.EjArrays;

import java.util.Scanner;

public class Ejercicio3 {
	
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
		
		int[] num=new int[10];
		String[] leyenda=new String[num.length];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i]=scanyint("Dame los el numero "+(i+1)+":");
		}
		
		
		
		int posmin=0,posmax=0;
		for (int i = 1; i < num.length; i++) {
			if(num[i]<num[posmin]) {
				posmin=i;
			}
			if(num[i]>num[posmax]) {
				posmax=i;
			}
		}
		
		
		
		leyenda[posmin]="minimo";
		
		
		leyenda[posmax]="maximo";
		
		
		System.out.println("Maximo y Minimo");
		for (int i = 0; i < leyenda.length; i++) {
			System.out.println(num[i]+"\t"+leyenda[i]);
		}
		
	}

}
