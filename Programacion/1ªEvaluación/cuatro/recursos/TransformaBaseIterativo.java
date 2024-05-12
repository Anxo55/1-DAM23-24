package cuatro.recursos;

import java.util.Scanner;

public class TransformaBaseIterativo {

    public static void muestraCifra(int dat) {
		if (dat < 10) {
			System.out.print(dat);
		} else {
			dat -= 10;
			char c = (char) ('A' + dat);
			System.out.print(c);
		}
	}

	public static int transformaIterCBase(int dato, int base) {
		String res="";
		int d = dato;
		int b = base;
		
		do {
		res = (int) (d % b) + res;
		// para añadir posiciones a la cifra
		System.out.println("res: "+res);
		d = d / b;
		
		if(d<b) {
			res=d + res;
			System.out.println("resul: "+res);
		}
		} while (b<=d);
	return Integer.parseInt(res);
	}
	
	public static int transformaIter(int dato, int base) {
		//solo vale para base 10
		int res=0;
		int d = dato;
		int b = base;
		int i=0;
		do {
			res += (int) ((d % b)*Math.pow(b, i));
			// para añadir posiciones a la cifra
			System.out.println("res: "+res);
			d = d / b;
			i++;
			if(d<b) {
				res+=(d)*Math.pow(b,i);
				System.out.println("resul: "+res);
			}
			} while (b<=d);
		return res;
	}

	public static void main(String[] args) {
		int base, dato;
		Scanner sc = new Scanner(System.in);
		System.out.println("dime base: ");
		base = sc.nextInt();
		System.out.println("dime dato: ");
		dato = sc.nextInt();
		System.out.println("resultado-SOLO BASE 10-----");
		int resultado=transformaIter(dato, base);
		System.out.println(resultado);
		System.out.println("resultado-CUALQUIER  BASE 10-----");
		int resul=transformaIterCBase(dato, base);
		System.out.println(resul);
	}

}
