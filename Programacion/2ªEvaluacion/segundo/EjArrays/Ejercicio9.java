package segundo.EjArrays;

import java.util.Iterator;

public class Ejercicio9 {
	
	public static boolean escolor(String[] colores,String palabra) {
		boolean escolor=false;
		for (int i = 0; i < colores.length; i++) {
			if(colores[i]==palabra) {
				escolor=true;
			}
		}
		return escolor; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colores= {"azul","verde","morado","rosa","rojo","amarillo","naranja","negro","blanco"};
		String[] palabras=new String[7];
		
		for (int i = 0; i < palabras.length; i++) {
			if(escolor(colores,palabras[i])) {}
		}
		
		
		
	}

}
