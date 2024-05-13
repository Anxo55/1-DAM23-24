package Cuerpo;

import java.util.Scanner;

public class testCuerpo {
    
    public static String scanystring(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		return sc.nextLine();
		
	}
	
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
	
	public static boolean scanyboolean(String texto) {
		
		boolean error;
		boolean res=false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print(texto);
				res=sc.nextBoolean();
				error=false;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, dame un boolean.");
				error=true;
			}
			
		}while(error);
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		Cuerpo yo=new Cuerpo();
        
		yo.brazoDerecho.setNombre(scanystring("Dame el nombre del brazo drcho: "));
		yo.brazoDerecho.setLongitud(scanyint("Dame la longitud del brazo drcho: "));
		yo.brazoDerecho.setNum_dedos(scanyint("Dame el numero de dedos del brazo drcho: "));
		
		System.out.println(yo.brazoDerecho);
		yo.brazoIzquierdo.setNombre(scanystring("Dame el nombre del brazo izqdo: "));
		yo.brazoIzquierdo.setLongitud(scanyint("Dame la longitud del brazo izqdo: "));
		yo.brazoIzquierdo.setNum_dedos(scanyint("Dame el numero de dedos del brazo izdo: "));
		System.out.println(yo.brazoIzquierdo);
		yo.piernaDerecha.setNombre(scanystring("Dame el nombre de la pierna drcho: "));
		yo.piernaDerecha.setLongitud(scanyint("Dame la longitud de la pierna drcho: "));
		yo.piernaDerecha.setNum_dedos(scanyint("Dame el numero de dedos de la pierna  drcho: "));
		System.out.println(yo.piernaDerecha);
		yo.piernaIzquierda.setNombre(scanystring("Dame el nombre de la pierna  izqdo: "));
		yo.piernaIzquierda.setLongitud(scanyint("Dame la longitud de la pierna  izqdo: "));
		yo.piernaIzquierda.setNum_dedos(scanyint("Dame el numero de dedos de la pierna  izdo: "));
		System.out.println(yo.piernaIzquierda);
		yo.tronco.setNombre(scanystring("Dame el nombre del tronco: "));
		yo.tronco.setAncho(scanyint("Dame el ancho del tronco: "));
		yo.tronco.setLargo(scanyint("Dame el largo del tronco: "));
		System.out.println(yo.tronco);
		yo.cabeza.setNombre(scanystring("Dame el nombre de la cabeza: "));
		yo.cabeza.setNumOjos(scanyint("Dame el numero de ojos de la cabeza: "));
		yo.cabeza.setPeludo(scanyboolean("Dime si el tipo tiene pelo (Boolean):"));
		System.out.println(yo.cabeza);
		
		
		System.out.println(yo);
	}

}

