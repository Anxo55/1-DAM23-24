package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BlackJack {
    
    static HashMap<String, Integer> puntos=new HashMap<String, Integer>();
	
	
	static void ponpuntos(int[] punticos) {
		String[] valores=CartaF.darValores();
		if(valores.length!=punticos.length) {
			System.out.println("Error de tamaño");
		}else {
			for (int i = 0; i < valores.length; i++) {
				puntos.put(valores[i], punticos[i]);
			}
		}
		
	}
	
	public static char menu(String pregunta) {
		System.out.println(pregunta);
		Scanner sc= new Scanner(System.in);
		return sc.nextLine().toLowerCase().charAt(0);//Admite tambien mayusculas

	}
	
	
	
	static CartaF cartaAleatoria(ArrayList<CartaF> baraja) {
		int index=(int) (baraja.size()*Math.random());
		CartaF resul=baraja.get(index);
		baraja.remove(index);
		
		return resul;
	}
	
	static int sumapuntosBlackJack(ArrayList<CartaF> mano) {
		int[] punticos= {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int suma=0;
		ponpuntos(punticos);
		for (CartaF c : mano) {
			
			if((c.getValor()!="As")) {//primero suma no ases
				suma+=puntos.get(c.getValor());	
			}		
		}
		
		for (CartaF c : mano) {
			if (c.getValor()=="As") {//Ahora sumo los ases segun toque
				if((suma+puntos.get(c.getValor())>21)) {
					suma+=1;
					//System.out.println(c+" de valor: "+1);
				}else {
					suma+=puntos.get(c.getValor());	
					//System.out.println(c+" de valor "+puntos.get(c.getValor()));
				}
			}

		}
		
		return suma;
	}
	
	static void mostrarmano(ArrayList<CartaF> mano) {

		for (CartaF c : mano) {
				System.out.println(c);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<CartaF> baraja=CartaF.generarBaraja();
		ArrayList<CartaF> mano=new ArrayList<CartaF>();
		
		
		int sumapuntos=sumapuntosBlackJack(mano);
		boolean plantarse=false;
		
		do {
			
			System.out.println(baraja);
			CartaF nuevaC=cartaAleatoria(baraja);
			
			System.out.println("Carta obtenida: "+nuevaC.toString());
			mano.add(nuevaC);
			System.out.println("Tu mano: ");
			Collections.sort(mano);
			mostrarmano(mano);
			
			sumapuntos=sumapuntosBlackJack(mano);
			System.out.println("Tus puntos: "+sumapuntos);
			
			
			
			if(sumapuntos<21) {
				
				boolean respuincorrecta=false;
				char respu;
				
				do {
					
					respu=menu("¿Quieres plantarte? s si si, n si no: ");
					plantarse=switch (respu){
					case 's': {
						respuincorrecta=false;
						yield true;
					}
					case 'n': {
						respuincorrecta=false;
						yield false;
					}
					default:
						respuincorrecta=true;
						yield false;
					};
					
				}while(respuincorrecta);
				
			}
			
			
		}while((!plantarse)&&(sumapuntos<21));
		
		System.out.println();
		System.out.println();
		System.out.println("Resultados: ");
		
		System.out.println("Puntos finales: "+sumapuntos);
		
		if(sumapuntos<21) {
			System.out.println("No llegaste a 21");
		}else if(sumapuntos==21) {
			System.out.println("LLegaste a 21 exactos");
		}else {
			System.out.println("Te pasaste,perdiste");
		}
		

	}

}

