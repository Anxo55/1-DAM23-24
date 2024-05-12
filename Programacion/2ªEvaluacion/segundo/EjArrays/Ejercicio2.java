package segundo.EjArrays;

import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int[] num=new int[20];
		int[] cuad=new int[20];
		int[] cubo=new int[20];
		
		for (int i = 0; i < cubo.length; i++) {
			num[i]=(int) (Math.random()*100);
			cuad[i]=(int) Math.pow(num[i], 2);
			cubo[i]=(int) Math.pow(num[i], 3);
		}
		
		System.out.println("Array de  numeros");
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(cuad));
		System.out.println(Arrays.toString(cubo));
		
		System.out.println("\tnumero\tcuadrado\tcubo");
		for (int i = 0; i < cubo.length; i++) {
			System.out.println("\t"+num[i]+"\t"+cuad[i]+"\t"+cubo[i]+"\t");
		}
	}

}
