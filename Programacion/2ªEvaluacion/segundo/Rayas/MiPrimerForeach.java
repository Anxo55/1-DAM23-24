package segundo.Rayas;

import java.util.Scanner;

public class MiPrimerForeach {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
	    Double[] nota = new Double[4];
	 
	    System.out.println("Para calcular la nota media necesito saber la ");
	    System.out.println("nota de cada uno de tus exámenes.");

	    for (int i = 0; i < nota.length; i++) {
	      System.out.print("Nota del examen nº " + (i + 1) + ": ");
	      nota[i] = Double.parseDouble(sc.nextLine());
	    }
	    
	    System.out.println("Tus notas son: ");
	    
	    double suma = 0;
	    //for (Disco d : discos)
			for (Double n : nota) { // for al estilo foreach SOLO MOSTRAR
				System.out.print(n + "  ");
				suma += n;
			}
	    System.out.println("\nLa media es " + suma / nota.length);
		}
	}
