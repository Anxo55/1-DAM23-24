package segundo.Rayas;

import java.util.Scanner;

public class Ejemplo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota = new double[4];

        System.out.println("Para calcular la nota media debes saber la nota de cada uno de tus examenes: ");

        for(int i=0; i<4;i++) {
            System.out.println("Nota del examen nº: "+i);
            nota[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Tus notas son: ");
        double suma = 0;

        for(int i=0; i<nota.length; i++) {
            System.out.println(nota[i]+ " ");
            suma+=nota[i];
        }

        System.out.println("La media es: "+suma / nota.length);
        
    }
    
}
