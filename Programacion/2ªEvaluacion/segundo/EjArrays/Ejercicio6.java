package segundo.EjArrays;

import java.util.Scanner;

public class Ejercicio6 {
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
	public static boolean espar(int n) {
		return (n % 2 == 0);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num=new int[8];
		String[] leyenda=new String[num.length];
		for (int i = 0; i < num.length; i++) {
			num[i]=scanyint("Dame un numero:");
			if(espar(num[i])) {
				leyenda[i]="par";
			}
			else {
				leyenda[i]="impar";
			}
			
		}
		
		for (int i = 0; i < leyenda.length; i++) {
			System.out.println("Numero "+num[i]+"\t"+leyenda[i]);
		}

	}

}
