package segundo.EjArrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio7 {
	
	public static boolean espar(int n) {
		return (n % 2 == 0);

	}
	
	public static void main(String[] args) {
		
		int[] num=new int[20];
		String[] leyenda=new String[num.length];
		int pares=0;
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(1+Math.random()*100);
			if(espar(num[i])) {
				pares++;
			}
		}
		int[] parejos=new int[pares];
		int[] impares=new int[num.length-pares];
		
		int inP=0,inI=0;
		
		for (int i = 0; i < num.length; i++) {
			if(espar(num[i])) {
				parejos[inP]=num[i];
				inP++;
			}else {
				impares[inI]=num[i];
				inI++;
			}
		}
		
		System.out.println(Arrays.toString(parejos));
		System.out.println(Arrays.toString(impares));
		
		for (int i = 0; i < num.length; i++) {
			if(i<parejos.length) {
				num[i]=parejos[i];
			}else {
				num[i]=impares[i-parejos.length];
			}
		}
		
		System.out.println(Arrays.toString(num));
		
	}

}
